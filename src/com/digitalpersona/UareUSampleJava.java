package com.digitalpersona;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.digitalpersona.uareu.*;

public class UareUSampleJava 
	extends JPanel
	implements ActionListener
{
	private static final long serialVersionUID=1;
	
	private static final String ACT_SELECTION = "selection";
	private static final String ACT_CAPTURE = "capture";
	private static final String ACT_VERIFICATION = "verification";
	private static final String ACT_EXIT = "exit";
	
	private JDialog   m_dlgParent;
	private JTextArea m_textReader;
	
	private ReaderCollection m_collection;
	private Reader           m_reader;
	
	private UareUSampleJava(){
		final int vgap = 5;
		final int width = 380;
		
		BoxLayout layout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
		setLayout(layout);
		
		add(Box.createVerticalStrut(vgap));
		JLabel lblReader = new JLabel("Selected reader:");
		add(lblReader);
		add(Box.createVerticalStrut(vgap));
		Dimension dm = lblReader.getPreferredSize();
		dm.width = width;
		lblReader.setPreferredSize(dm);
		
		
		m_textReader = new JTextArea(3, 1);
		m_textReader.setEditable(false);
		JScrollPane paneReader = new JScrollPane(m_textReader);
		add(paneReader);
		add(Box.createVerticalStrut(vgap));
		
		JButton btnSelect = new JButton("Select new reader");
		btnSelect.setActionCommand(ACT_SELECTION);
		btnSelect.addActionListener(this);
		add(btnSelect);
		add(Box.createVerticalStrut(vgap));

		JButton btnCapture = new JButton("Run capture");
		btnCapture.setActionCommand(ACT_CAPTURE);
		btnCapture.addActionListener(this);
		add(btnCapture);
		add(Box.createVerticalStrut(vgap));
		
		JButton btnStreaming = new JButton("Run Verification");
		btnStreaming.setActionCommand(ACT_VERIFICATION);
		btnStreaming.addActionListener(this);
		add(btnStreaming);
		add(Box.createVerticalStrut(vgap));
		
		add(Box.createVerticalStrut(vgap));
		JButton btnExit = new JButton("Exit");
		btnExit.setActionCommand(ACT_EXIT);
		btnExit.addActionListener(this);
		add(btnExit);
		add(Box.createVerticalStrut(vgap));

		setOpaque(true);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals(ACT_SELECTION)){
			m_reader = Selection.Select(m_collection);
			if(null != m_reader){
				m_textReader.setText(m_reader.GetDescription().name);
			}
			else{
				m_textReader.setText("");
			}
		}
		else if(e.getActionCommand().equals(ACT_CAPTURE)){
			if(null == m_reader){
				MessageBox.Warning("Reader is not selected");
			}
			else{
				Capture.Run(m_reader, false, null, "capture", "1282873");
			}
		}
		else if(e.getActionCommand().equals(ACT_VERIFICATION)){
			if(null == m_reader){
				MessageBox.Warning("Reader is not selected");
			}
			else{
				Capture.Run(m_reader, false, null, "verification", "1282873");
			}
		}
		else if(e.getActionCommand().equals(ACT_EXIT)){
			m_dlgParent.setVisible(false);
		}
	}
	
	private void doModal(JDialog dlgParent){
		m_dlgParent = dlgParent;
		m_dlgParent.setContentPane(this);
		m_dlgParent.pack();
		m_dlgParent.setLocationRelativeTo(null);
		m_dlgParent.setVisible(true);
		m_dlgParent.dispose();
	}

	private static void createAndShowGUI() {
		UareUSampleJava paneContent = new UareUSampleJava();
		
		//initialize capture library by acquiring reader collection
		try{
			paneContent.m_collection = UareUGlobal.GetReaderCollection();
		}
		catch(UareUException e) {
			MessageBox.DpError("UareUGlobal.getReaderCollection()", e);
			return;
		}

		//run dialog
		JDialog dlg = new JDialog((JDialog)null, "UareU SDK 2.x Java sample application", true);
		paneContent.doModal(dlg);
		
		//release capture library by destroying reader collection
		try{
			UareUGlobal.DestroyReaderCollection();
		}
		catch(UareUException e) {
			MessageBox.DpError("UareUGlobal.destroyReaderCollection()", e);
		}
    }


	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

}
