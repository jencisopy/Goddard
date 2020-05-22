/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.oym.formularios;

import com.digitalpersona.Capture;
import com.digitalpersona.MessageBox;
import goddard.Goddard;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import py.com.oym.clases.conexion_maker;

/**
 *
 * @author Cesar
 */
public class Verificacion extends javax.swing.JFrame {

    conexion_maker cone = new conexion_maker();
    private static final long serialVersionUID = 1;
    public static String usuci = "";

    private static final String ACT_SELECTION = "selection";
    private static final String ACT_CAPTURE = "capture";
    private static final String ACT_VERIFICATION = "verification";
    private static final String ACT_EXIT = "exit";

    /**
     * Creates new form opción1
     */
    public Verificacion() {
        initComponents();
        txtcedula.setEditable(true);
        txtcedula.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnverificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verificación");

        txtcedula.setEditable(false);
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcedulaKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Identificador Empleado");

        btnverificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnverificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/py/com/oym/imagenes/botones/Symbol-Check.png"))); // NOI18N
        btnverificar.setText("Verificar");
        btnverificar.setEnabled(false);
        btnverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtcedula.getText().matches("")) {
                verificar();
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar su dato, no puede quedar vacio");
            }
        }
    }//GEN-LAST:event_txtcedulaKeyPressed

    private void btnverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverificarActionPerformed
        if (null == Goddard.m_reader) {
            MessageBox.Warning("Reader is not selected");
        } else {
            Capture.Run(Goddard.m_reader, false, null, "verification", txtcedula.getText());
        }
        guardarVerificar();
    }//GEN-LAST:event_btnverificarActionPerformed

    private void verificar() {
        try {
            conexion_maker cone = new conexion_maker();
            cone.stm = cone.con.createStatement();
            cone.rs = cone.stm.executeQuery("SELECT codigo as id ,LTRIM(RTRIM(REPLACE(REPLACE(REPLACE(codigo,CHAR(32),'()'),')(',''),'()',CHAR(32)))) AS codigo from datos.dig_captura where codigo = " + txtcedula.getText() + "");
            while (cone.rs.next()) {
                usuci = cone.rs.getString("codigo");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Verificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (txtcedula.getText().equalsIgnoreCase(usuci)) {
            btnverificar.setEnabled(true);
            btnverificar.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "No existe este identificador");
            btnverificar.setEnabled(false);
            txtcedula.setText("");
        }
    }

    private void guardarVerificar() {
        try {
            conexion_maker cone = new conexion_maker();
            cone.stm = cone.con.createStatement();
            cone.stm.executeUpdate("INSERT INTO datos.dig_verification(codigo,fecha) VALUES "
                    + "('" + txtcedula.getText() + "',SYSDATETIME ( ))");
            JOptionPane.showMessageDialog(this, "Datos Guardados con Exito!!");
            limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(Verificacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al Intentar Guardar", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        txtcedula.setText("");
        txtcedula.requestFocus();
        btnverificar.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnverificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtcedula;
    // End of variables declaration//GEN-END:variables
}
