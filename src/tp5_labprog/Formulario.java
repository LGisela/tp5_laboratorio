package tp5_labprog;

import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    Directorio directorio = new Directorio();

    public Formulario(Directorio directorio) {
        // this.directorio = new Directorio();
        initComponents();
        this.directorio = directorio;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTDNI = new javax.swing.JTextField();
        JTNOMBRE = new javax.swing.JTextField();
        JTAPELLIDO = new javax.swing.JTextField();
        JTDIRECCION = new javax.swing.JTextField();
        JTCIUDAD = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        JTTELEFONO = new javax.swing.JTextField();
        JBBUSCAR = new javax.swing.JButton();
        JBNUEVO = new javax.swing.JButton();
        JBGUARDAR = new javax.swing.JButton();
        JBBORRAR = new javax.swing.JButton();
        JBSALIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("FORMULARIO DE CONTACTO");

        jLabel2.setText("DNI");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("APELLIDO");

        jLabel5.setText("DIRECCION");

        jLabel6.setText("CIUDAD");

        JTDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTDNIActionPerformed(evt);
            }
        });

        jLabel7.setText("TELEFONO: ");

        JBBUSCAR.setText("BUSCAR");
        JBBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBUSCARActionPerformed(evt);
            }
        });

        JBNUEVO.setText("NUEVO");
        JBNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNUEVOActionPerformed(evt);
            }
        });

        JBGUARDAR.setText("GUARDAR");
        JBGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGUARDARActionPerformed(evt);
            }
        });

        JBBORRAR.setText("BORRAR");
        JBBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBORRARActionPerformed(evt);
            }
        });

        JBSALIR.setText("SALIR");
        JBSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(69, 69, 69)
                                .addComponent(JTTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTDNI)
                            .addComponent(JTNOMBRE)
                            .addComponent(JTAPELLIDO)
                            .addComponent(JTDIRECCION)
                            .addComponent(JTCIUDAD, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBBUSCAR)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBNUEVO)
                        .addGap(18, 18, 18)
                        .addComponent(JBGUARDAR)
                        .addGap(18, 18, 18)
                        .addComponent(JBBORRAR)
                        .addGap(34, 34, 34)
                        .addComponent(JBSALIR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBUSCAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTAPELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTCIUDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNUEVO)
                    .addComponent(JBGUARDAR)
                    .addComponent(JBBORRAR)
                    .addComponent(JBSALIR))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void JBBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBUSCARActionPerformed

//Buscar por telefono
// Si telefono no esta vacio se busca por telefono.
        if (!JTTELEFONO.getText().isEmpty()) {
            try {
                String telefonoTexto = JTTELEFONO.getText();
                Long telefono = Long.parseLong(telefonoTexto);
                Contacto contactoEncontrado = directorio.BuscarContacto(telefono);

                if (contactoEncontrado != null) {
                    JTDNI.setText(contactoEncontrado.getDni());
                    JTNOMBRE.setText(contactoEncontrado.getNombre());
                    JTAPELLIDO.setText(contactoEncontrado.getApellido());
                    JTDIRECCION.setText(contactoEncontrado.getDireccion());
                    JTCIUDAD.setText(contactoEncontrado.getCiudad());
                } else {
                    JOptionPane.showMessageDialog(null, "Contacto no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Número de teléfono inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } // Buscar por ciudad.
        //Si telefono esta vacio entonces se busca por ciudad.
        else if (!JTCIUDAD.getText().isEmpty()) {
            ArrayList<Contacto> ciudad = directorio.buscarContactos(JTCIUDAD.getText());
            if (ciudad != null && !ciudad.isEmpty()) {
                for (Contacto con : ciudad) {
                    JTTELEFONO.setText(String.valueOf(con.getTelefono()));
                    JTDNI.setText(con.getDni());
                    JTNOMBRE.setText(con.getNombre());
                    JTAPELLIDO.setText(con.getApellido());
                    JTDIRECCION.setText(con.getDireccion());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron contactos en esta ciudad.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } // Buscar por apellido.
        //Si ciudad esta vacio se busca por apellido.
        else if (!JTAPELLIDO.getText().isEmpty()) {
            Set<Long> telefonos = directorio.buscarTelefono(JTAPELLIDO.getText());
            if (telefonos != null && !telefonos.isEmpty()) {
                StringBuilder telefonosPorApellido = new StringBuilder();
                for (Long tel : telefonos) {
                    telefonosPorApellido.append(tel.toString()).append("\n");
                }
                JTTELEFONO.setText(telefonosPorApellido.toString());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron teléfonos con ese apellido.");
            }
            //Si todas las casillas estan vacias se manda un mensaje al usuario.
        } else if (JTTELEFONO.getText().isEmpty() && JTCIUDAD.getText().isEmpty() && JTAPELLIDO.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Las casillas de telefono, ciudad o apellido estan vacias.");
        }
    }//GEN-LAST:event_JBBUSCARActionPerformed


    private void JBNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNUEVOActionPerformed
        nuevoFormulario();
    }//GEN-LAST:event_JBNUEVOActionPerformed

    private void JBBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBORRARActionPerformed
        long tel = Long.parseLong(JTTELEFONO.getText());

        directorio.borrarcontacto(tel);
    }//GEN-LAST:event_JBBORRARActionPerformed

    private void JBSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSALIRActionPerformed
        salir();
    }//GEN-LAST:event_JBSALIRActionPerformed

    private void JTDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTDNIActionPerformed

    }//GEN-LAST:event_JTDNIActionPerformed

    private void JBGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGUARDARActionPerformed
        guardarContacto();
    }//GEN-LAST:event_JBGUARDARActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//      
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//       
//            Directorio directorio = new Directorio();
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Formulario().setVisible(true);
//              
//            }
//        });
//        
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBORRAR;
    private javax.swing.JButton JBBUSCAR;
    private javax.swing.JButton JBGUARDAR;
    private javax.swing.JButton JBNUEVO;
    private javax.swing.JButton JBSALIR;
    private javax.swing.JTextField JTAPELLIDO;
    private javax.swing.JTextField JTCIUDAD;
    private javax.swing.JTextField JTDIRECCION;
    private javax.swing.JTextField JTDNI;
    private javax.swing.JTextField JTNOMBRE;
    private javax.swing.JTextField JTTELEFONO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

//    private void buscarContacto() {
//        try {
//            String telefonoTexto = JTTELEFONO.getText();
//            
//            if (telefonoTexto.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Debe ingresar un número de teléfono.", "Error", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            
//            Long telefono = Long.parseLong(telefonoTexto);
//            
//            Contacto contactoEncontrado = directorio.BuscarContacto(telefono);
//
//            if (contactoEncontrado != null){
//                JTDNI.setText(contactoEncontrado.getDni());
//                JTNOMBRE.setText(contactoEncontrado.getNombre());
//                JTAPELLIDO.setText(contactoEncontrado.getApellido());
//                JTDIRECCION.setText(contactoEncontrado.getDireccion());
//                JTCIUDAD.setText(contactoEncontrado.getCiudad());
//            }
//            else{
//                JOptionPane.showMessageDialog(this, "Contacto no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//
//              
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "Número de teléfono inválido.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    private void nuevoFormulario() {
        JTDNI.setText("");
        JTNOMBRE.setText("");
        JTAPELLIDO.setText("");
        JTDIRECCION.setText("");
        JTCIUDAD.setText("");
        JTTELEFONO.setText("");

    }

    private void guardarContacto() {
        try {
            String dni = JTDNI.getText();
            String nombre = JTNOMBRE.getText();
            String apellido = JTAPELLIDO.getText();
            String direccion = JTDIRECCION.getText();
            String ciudad = JTCIUDAD.getText();
            String telefonoTexto = JTTELEFONO.getText();
            if (telefonoTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un número de teléfono.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            Long telefono = Long.parseLong(telefonoTexto);
            Contacto contacto = new Contacto(telefono, dni, nombre, apellido, ciudad, direccion);
            directorio.AgregarContacto(contacto);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Número de teléfono inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

//    private void borrarContacto() {
//        if (telefonoActual != null) {
//            directorio.borrarcontacto(telefonoActual);
//            JOptionPane.showMessageDialog(this, "Contacto borrado exitosamente.");
//            nuevoFormulario();
//        } else {
//            JOptionPane.showMessageDialog(this, "No hay contacto para borrar.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    private void salir() {
        System.exit(0);
    }

}
