package com.digitalpersona;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import com.digitalpersona.uareu.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Capture
        extends JPanel
        implements ActionListener {

    private static final long serialVersionUID = 2;
    private static final String ACT_BACK = "back";

    private JDialog m_dlgParent;
    private CaptureThread m_capture;
    private Reader m_reader;
    private ImagePanel m_image;
    private boolean m_bStreaming;
    private String path = "c:/oym/imagenes/";
    private String empleadoIdentificador = "1282873";
    private String action = "verification";

    private Capture(Reader reader, boolean bStreaming, String path, String action, String empleadoIdentificador) {
        if (path != null){
            this.path = path;
        }
        this.empleadoIdentificador = empleadoIdentificador;
        this.action = action;
        
        m_reader = reader;
        m_bStreaming = bStreaming;

        m_capture = new CaptureThread(m_reader, m_bStreaming, Fid.Format.ANSI_381_2004, Reader.ImageProcessing.IMG_PROC_DEFAULT);

        final int vgap = 5;
        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);

        m_image = new ImagePanel();
        Dimension dm = new Dimension(380, 380);
        m_image.setPreferredSize(dm);
        add(m_image);
        add(Box.createVerticalStrut(vgap));

        JButton btnBack = new JButton("Back");
        btnBack.setActionCommand(ACT_BACK);
        btnBack.addActionListener(this);
        add(btnBack);
        add(Box.createVerticalStrut(vgap));
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setEmpleadoIdentificador(String empleado) {
        this.empleadoIdentificador = empleado;
    }

    private void StartCaptureThread() {
        m_capture = new CaptureThread(m_reader, m_bStreaming, Fid.Format.ANSI_381_2004, Reader.ImageProcessing.IMG_PROC_DEFAULT);
        m_capture.start(this);
    }

    private void StopCaptureThread() {
        if (null != m_capture) {
            m_capture.cancel();
        }
    }

    private void WaitForCaptureThread() {
        if (null != m_capture) {
            m_capture.join(1000);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(ACT_BACK)) {
            //event from "back" button
            //cancel capture
            StopCaptureThread();
        } else if (e.getActionCommand().equals(CaptureThread.ACT_CAPTURE)) {
            //event from capture thread
            CaptureThread.CaptureEvent evt = (CaptureThread.CaptureEvent) e;
            boolean bCanceled = false;

            if (null != evt.capture_result) {
                if (null != evt.capture_result.image && Reader.CaptureQuality.GOOD == evt.capture_result.quality) {
                    //display image
                    m_image.showImage(evt.capture_result.image);
                    if (action.equals("capture")) {
                        saveImage(evt.capture_result.image);
                    }
                    if (action.equals("verification")) {
                        verification(evt.capture_result.image);
                    }
                } else if (Reader.CaptureQuality.CANCELED == evt.capture_result.quality) {
                    //capture or streaming was canceled, just quit
                    bCanceled = true;
                } else {
                    //bad quality
                    MessageBox.BadQuality(evt.capture_result.quality);
                }
            } else if (null != evt.exception) {
                //exception during capture
                MessageBox.DpError("Capture", evt.exception);
                bCanceled = true;
            } else if (null != evt.reader_status) {
                MessageBox.BadStatus(evt.reader_status);
                bCanceled = true;
            }

            if (!bCanceled) {
                if (!m_bStreaming) {
                    //restart capture thread
                    WaitForCaptureThread();
                    StartCaptureThread();
                }
            } else {
                //destroy dialog
                m_dlgParent.setVisible(false);
            }
        }
    }

    private void doModal(JDialog dlgParent) {
        //open reader
        try {
            m_reader.Open(Reader.Priority.COOPERATIVE);
        } catch (UareUException e) {
            MessageBox.DpError("Reader.Open()", e);
        }

        boolean bOk = true;
        if (m_bStreaming) {
            //check if streaming supported
            Reader.Capabilities rc = m_reader.GetCapabilities();
            if (!rc.can_stream) {
                MessageBox.Warning("This reader does not support streaming");
                bOk = false;
            }
        }

        if (bOk) {
            //start capture thread
            StartCaptureThread();

            //bring up modal dialog
            m_dlgParent = dlgParent;
            m_dlgParent.setContentPane(this);
            m_dlgParent.pack();
            m_dlgParent.setLocationRelativeTo(null);
            m_dlgParent.toFront();
            m_dlgParent.setVisible(true);
            m_dlgParent.dispose();

            //cancel capture
            StopCaptureThread();

            //wait for capture thread to finish
            WaitForCaptureThread();
        }

        //close reader
        try {
            m_reader.Close();
        } catch (UareUException e) {
            MessageBox.DpError("Reader.Close()", e);
        }
    }

    public static void Run(Reader reader, boolean bStreaming, String path, String action, String empleado) {
        JDialog dlg = new JDialog((JDialog) null, "Put your finger on the reader", true);
        Capture capture = new Capture(reader, bStreaming, path, action, empleado);
        capture.doModal(dlg);
    }

    private void saveImage(Fid image) {
        String file = path + "emp_" + empleadoIdentificador;
        Path path = Paths.get(file);
        try {
            Engine engine = UareUGlobal.GetEngine();
            Fmd fmd = engine.CreateFmd(image, Fmd.Format.ANSI_378_2004);
            Files.write(path, fmd.getData());
        } catch (UareUException e) {
            MessageBox.DpError("Engine.CreateFmd()", e);
        } catch (IOException ex) {
            Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void verification(Fid image) {
        Engine engine = UareUGlobal.GetEngine();
        try {
            byte[] img = getData();
            if (img == null){
                MessageBox.Warning("NO EXISTE EL REGISTRO");
                return;
            }
            Fmd fmd0 = UareUGlobal.GetImporter().ImportFmd(img, Fmd.Format.ANSI_378_2004, Fmd.Format.ANSI_378_2004);
            Fmd fmd1 = engine.CreateFmd(image, Fmd.Format.ANSI_378_2004);

            //perform comparison
            try {
                int falsematch_rate = engine.Compare(fmd1, 0, fmd0, 0);
                int target_falsematch_rate = Engine.PROBABILITY_ONE; //target rate is 0.0001
                if (falsematch_rate < target_falsematch_rate) {
                    MessageBox.Warning("Coincide la lectura");
                } else {
                    MessageBox.Warning("NO COINCIDE");
                }
            } catch (UareUException e) {
                MessageBox.DpError("Engine.CreateFmd()", e);
            }

        } catch (UareUException e) {
            MessageBox.DpError("Engine.CreateFmd()", e);
        }
    }

    private byte[] getData() {
        byte[] bFile = null;
        String file = path + "emp_" + empleadoIdentificador;
        Path path = Paths.get(file);
        if (!path.toFile().exists()){
            return null;
        }
        try {
            bFile = Files.readAllBytes(Paths.get(file));
        } catch (IOException ex) {
            Logger.getLogger(Capture.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bFile;
    }
}
