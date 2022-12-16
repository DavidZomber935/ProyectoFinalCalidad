/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itsqmet.vista;

import com.itsqmet.controlador.ContactosControlador;
import com.itsqmet.modelo.ContactosModelo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ContactosVista extends javax.swing.JFrame {

    private ContactosModelo cm;
    private ContactosControlador cc;    
    public ContactosVista() {
        cm = new ContactosModelo();
        cc = new ContactosControlador();
        initComponents();
        readContactos("");
    }
    
    public void limpiarFormulario(){
        IDjTextField.setText("");
        NombresjTextField.setText("");
        ApellidosjTextField.setText("");
        Telefono1jTextField.setText("");
        Telefono2jTextField.setText("");
        DireccionjTextArea.setText("");
        CorreojTextField.setText("");
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscarContactojButton = new javax.swing.JButton();
        buscarContactojTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactosJtable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        insertarjButton = new javax.swing.JButton();
        actualizarjButton = new javax.swing.JButton();
        eliminarjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IDjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NombresjTextField = new javax.swing.JTextField();
        ApellidosjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DireccionjTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        CorreojTextField = new javax.swing.JTextField();
        Telefono1jTextField = new javax.swing.JTextField();
        Telefono2jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Contacto"));

        jLabel1.setText("Contacto:");

        buscarContactojButton.setText("Buscar");
        buscarContactojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarContactojButtonActionPerformed(evt);
            }
        });

        buscarContactojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarContactojTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarContactojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarContactojButton)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buscarContactojButton)
                    .addComponent(buscarContactojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("contactos"));

        contactosJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
  
        contactosJtable.addMouseListener(new java.awt.event.MouseAdapter() {
        	@Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactosJtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contactosJtable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestionar Contacto"));

        insertarjButton.setText("Insertar");
        insertarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarjButtonActionPerformed(evt);
            }
        });

        actualizarjButton.setText("Actualizar");
        actualizarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarjButtonActionPerformed(evt);
            }
        });

        eliminarjButton.setText("Eliminar");
        eliminarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarjButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        IDjTextField.setEditable(false);

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Telefono 1:");

        jLabel6.setText("Telefono 2:");

        jLabel7.setText("Direccion");

        DireccionjTextArea.setColumns(20);
        DireccionjTextArea.setRows(5);
        jScrollPane2.setViewportView(DireccionjTextArea);

        jLabel8.setText("Correo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertarjButton)
                            .addComponent(actualizarjButton)
                            .addComponent(eliminarjButton))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(56, 56, 56)
                                        .addComponent(IDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(201, 201, 201)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(NombresjTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(ApellidosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(CorreojTextField)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Telefono1jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(Telefono2jTextField))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertarjButton)
                            .addComponent(jLabel2)
                            .addComponent(IDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarjButton)
                            .addComponent(jLabel3)
                            .addComponent(NombresjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarjButton)
                            .addComponent(jLabel4)
                            .addComponent(ApellidosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(CorreojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Telefono2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarContactojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarContactojButtonActionPerformed

        String  buscarContactos = buscarContactojTextField.getText().trim();
        readContactos(buscarContactos);
        
    }//GEN-LAST:event_buscarContactojButtonActionPerformed

    private void buscarContactojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarContactojTextFieldActionPerformed

        String  buscarContactos = buscarContactojTextField.getText().trim();
        readContactos(buscarContactos);
    }//GEN-LAST:event_buscarContactojTextFieldActionPerformed

    private void insertarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarjButtonActionPerformed

        String nombres=NombresjTextField.getText().trim();
        String apellidos=ApellidosjTextField.getText().trim();
        String tel1=Telefono1jTextField.getText().trim();
        String tel2=Telefono2jTextField.getText().trim();
        String dir=DireccionjTextArea.getText().trim();
        String correo=CorreojTextField.getText().trim();
        
        if (nombres.length() == 0 || apellidos.length() == 0 || tel1.length() == 0 || tel2.length() == 0 || dir.length() == 0 || correo.length() == 0) {
            JOptionPane.showMessageDialog(null,"Formulario vacio","error", JOptionPane.ERROR_MESSAGE);
        }else{
            cc.setNombres(nombres);
            cc.setApellidos(apellidos);
            cc.setTel1(tel1);
            cc.setTel2(tel2);
            cc.setDir(dir);
            cc.setMail(correo);
            boolean bandera=cm.insertContactos(cc);
            if (bandera) {
                JOptionPane.showMessageDialog(null,"Contacto insertado","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Contacto no insertado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            readContactos("");
            limpiarFormulario();
        }
    }//GEN-LAST:event_insertarjButtonActionPerformed

    private void contactosJtableMouseClicked(java.awt.event.MouseEvent evt) {
        int fila = contactosJtable.getSelectedRow();
        
        String id = contactosJtable.getValueAt(fila, 0).toString();
        String nombres = contactosJtable.getValueAt(fila, 1).toString();
        String apellidos = contactosJtable.getValueAt(fila, 2).toString();
        String tel1 = contactosJtable.getValueAt(fila, 3).toString();
        String tel2 = contactosJtable.getValueAt(fila, 4).toString();
        String dir = contactosJtable.getValueAt(fila, 5).toString();
        String correo = contactosJtable.getValueAt(fila, 6).toString();
        IDjTextField.setText(id);
        NombresjTextField.setText(nombres);
        ApellidosjTextField.setText(apellidos);
        Telefono1jTextField.setText(tel1);
        Telefono2jTextField.setText(tel2);
        DireccionjTextArea.setText(dir);
        CorreojTextField.setText(correo);
    }//GEN-LAST:event_contactosJtableMouseClicked

    private void actualizarjButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String nombres=NombresjTextField.getText().trim();
        String apellidos=ApellidosjTextField.getText().trim();
        String tel1=Telefono1jTextField.getText().trim();
        String tel2=Telefono2jTextField.getText().trim();
        String dir=DireccionjTextArea.getText().trim();
        String correo=CorreojTextField.getText().trim();
        String id = IDjTextField.getText().trim();
        
        if (id.length() == 0 || nombres.length() == 0 || apellidos.length() == 0 || tel1.length() == 0 || tel2.length() == 0 || dir.length() == 0 || correo.length() == 0) {
            JOptionPane.showMessageDialog(null,"Formulario vacio","error", JOptionPane.ERROR_MESSAGE);
        }else{
            cc.setNombres(nombres);
            cc.setApellidos(apellidos);
            cc.setTel1(tel1);
            cc.setTel2(tel2);
            cc.setDir(dir);
            cc.setMail(correo);
            cc.setIdcontacto(Integer.parseInt(id));
            boolean bandera=cm.updateContactos(cc);
            if (bandera) {
                JOptionPane.showMessageDialog(null,"Contacto actualizado","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Contacto no actualizado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            readContactos("");
            limpiarFormulario();
        }
    }//GEN-LAST:event_actualizarjButtonActionPerformed

    private void eliminarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarjButtonActionPerformed
        String id = IDjTextField.getText().trim();
        if (id.length() == 0) {
            JOptionPane.showMessageDialog(null,"formulario vacio","error",JOptionPane.ERROR_MESSAGE);  
        }else{
            cc.setIdcontacto(Integer.parseInt(id));
            boolean bandera =cm.deleteContactos(cc);
            if (bandera) {
                JOptionPane.showMessageDialog(null,"Contacto eliminado","Informacion",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Contacto no eliminado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            readContactos("");
            limpiarFormulario();
        }
    }//GEN-LAST:event_eliminarjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public void readContactos(String buscarContacto){
        cc.setBuscarContacto(buscarContacto);
        DefaultTableModel dtm = cm.readContactos(cc);
        contactosJtable.setModel(dtm);
        
    }
    
    
    public static void main(String []args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContactosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactosVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidosjTextField;
    private javax.swing.JTextField CorreojTextField;
    private javax.swing.JTextArea DireccionjTextArea;
    private javax.swing.JTextField IDjTextField;
    private javax.swing.JTextField NombresjTextField;
    private javax.swing.JTextField Telefono1jTextField;
    private javax.swing.JTextField Telefono2jTextField;
    private javax.swing.JButton actualizarjButton;
    private javax.swing.JButton buscarContactojButton;
    private javax.swing.JTextField buscarContactojTextField;
    private javax.swing.JTable contactosJtable;
    private javax.swing.JButton eliminarjButton;
    private javax.swing.JButton insertarjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
