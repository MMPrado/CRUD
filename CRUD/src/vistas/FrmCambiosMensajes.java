/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import datos.ConexionBD;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell Latitude
 */
public class FrmCambiosMensajes extends javax.swing.JFrame {
ConexionBD con = new ConexionBD("crud");
    /**
     * Creates new form FrmCambiosMensajes
     */
    public FrmCambiosMensajes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdMensaje = new javax.swing.JTextField();
        txtNumeroOrigen = new javax.swing.JTextField();
        txtHoraRecepcion = new javax.swing.JTextField();
        txtContenido = new javax.swing.JTextField();
        txtTamaño = new javax.swing.JTextField();
        txtAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cmbLeido = new javax.swing.JComboBox<>();
        btnCancelar1 = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 204), 2));

        jLabel1.setFont(new java.awt.Font("Bell MT", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("** Cambios Mensajes **");

        jLabel2.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Fecha:");

        txtIdMensaje.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        txtIdMensaje.setForeground(new java.awt.Color(153, 0, 153));

        txtNumeroOrigen.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        txtNumeroOrigen.setForeground(new java.awt.Color(255, 0, 255));

        txtHoraRecepcion.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        txtHoraRecepcion.setForeground(new java.awt.Color(255, 0, 255));
        txtHoraRecepcion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoraRecepcion.setText("00:00:00 am");
        txtHoraRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraRecepcionActionPerformed(evt);
            }
        });

        txtContenido.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        txtContenido.setForeground(new java.awt.Color(255, 0, 255));

        txtTamaño.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        txtTamaño.setForeground(new java.awt.Color(255, 0, 255));

        txtAceptar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtAceptar.setForeground(new java.awt.Color(102, 0, 102));
        txtAceptar.setText("Aceptar");
        txtAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 0, 102));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtSalir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtSalir.setForeground(new java.awt.Color(102, 0, 102));
        txtSalir.setText("Salir");
        txtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Número Origen:");

        jLabel10.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("idMensaje:");

        jLabel11.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("Hora Recepción:");

        jLabel12.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 102));
        jLabel12.setText("Leido:");

        jLabel13.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("Contenido:");

        jLabel14.setFont(new java.awt.Font("Perpetua", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("Tamaño:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a.1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(102, 0, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cmbLeido.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        cmbLeido.setForeground(new java.awt.Color(255, 0, 255));
        cmbLeido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        btnCancelar1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(102, 0, 102));
        btnCancelar1.setText("Regresar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        txtFecha.setForeground(new java.awt.Color(255, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10)
                        .addGap(39, 39, 39)
                        .addComponent(txtIdMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAceptar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbLeido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTamaño, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                        .addComponent(txtContenido))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtIdMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtHoraRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cmbLeido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAceptar)
                    .addComponent(btnCancelar)
                    .addComponent(txtSalir)
                    .addComponent(btnCancelar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoraRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraRecepcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraRecepcionActionPerformed

    private void txtAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAceptarActionPerformed
        // TODO add your handling code here:
        int idMensaje;
        String fecha;
        String numeroOrigen;
        String horaRecepcion;
        String contenido;
       char leido;
        int tamaño;
SimpleDateFormat sdf1;
        Date fechaR;//fechaR
        String formato;
        String enunciadoSQL;

        idMensaje=Integer.parseInt(txtIdMensaje.getText().toString());
         formato = txtFecha.getDateFormatString();
        sdf1 = new SimpleDateFormat(formato);
        fechaR = txtFecha.getDate();
        fecha = sdf1.format(fechaR);
        numeroOrigen=txtNumeroOrigen.getText().toUpperCase().trim();
        horaRecepcion=txtHoraRecepcion.getText().toUpperCase().trim();
        contenido=txtContenido.getText().toUpperCase().trim();
        leido=cmbLeido.getSelectedItem().toString().charAt(0);
        tamaño=Integer.parseInt(txtTamaño.getText().toString());
        
        
        enunciadoSQL="UPDATE mensajes SET fecha='"+fecha+"',numeroOrigen='"+numeroOrigen+"',horaRecepcion='"+horaRecepcion+"',contenido='"+contenido+"',leido='"+leido+"',tamaño="+tamaño+" WHERE idMensaje=" + idMensaje + ""; 
                
                
          
          
        con.actualizar(enunciadoSQL);
        limpiarFormulario();

        
    }//GEN-LAST:event_txtAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(this, "¿Desea cancelar la actualización?");
        if (op == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalirActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(this, "¿Desea salir?");
        if (op == JOptionPane.OK_OPTION) {
            con.cerrar();
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_txtSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String idMensaje;
        String enunciadoSQL;
        Date fecha;
        String formato;

        idMensaje=txtIdMensaje.getText();
        enunciadoSQL = "SELECT * FROM mensajes WHERE idMensaje='" + idMensaje + "'";

        con.consultar(enunciadoSQL);
        if (con.irPrimero()) {
            fecha=new Date (con.obtenerCampo("fecha"));
            txtFecha.setDate(fecha);   //como ponerle para date
            txtNumeroOrigen.setText(con.obtenerCampo("numeroOrigen"));
            txtHoraRecepcion.setText(con.obtenerCampo("horaRecepcion")); //para time
            txtContenido.setText(con.obtenerCampo("contenido"));
             if (con.obtenerCampo("leido").equals("S")) {
                cmbLeido.setSelectedItem("Si");
            } else if (con.obtenerCampo("leido").equals("N")) {
                cmbLeido.setSelectedItem("No");
            
            }
            
            txtTamaño.setText(con.obtenerCampo("tamaño")); // para entero
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelar1ActionPerformed
public void limpiarFormulario() {
        txtIdMensaje.setText("");
        txtFecha.setDate(null);
        txtNumeroOrigen.setText("");
        txtHoraRecepcion.setText("");
        txtContenido.setText("");
        cmbLeido.setSelectedIndex(0);
        txtTamaño.setText("");
        
                }
//public static fecha
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCambiosMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCambiosMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCambiosMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCambiosMensajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCambiosMensajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JComboBox<String> cmbLeido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txtAceptar;
    private javax.swing.JTextField txtContenido;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtHoraRecepcion;
    private javax.swing.JTextField txtIdMensaje;
    private javax.swing.JTextField txtNumeroOrigen;
    private javax.swing.JButton txtSalir;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
