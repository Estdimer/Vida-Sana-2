/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

/**
 *
 * @author corre
 */
public class MenuUsuario extends javax.swing.JFrame {
    private static Perfil perfil;
    public MenuUsuario(){
        
    }
    /**
     * Creates new form Menu
     */
    public MenuUsuario(Perfil p) {
        initComponents();
        perfil=p;
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarAlimentosButton = new javax.swing.JButton();
        mostrarEjerciciosButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        modButton = new javax.swing.JButton();
        registrarAlimentoButton = new javax.swing.JButton();
        registrarEjerciciosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrarAlimentosButton.setText("Mostrar Registro de alimentacion por fecha");
        mostrarAlimentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAlimentosButtonActionPerformed(evt);
            }
        });

        mostrarEjerciciosButton.setText("Mostrar Registro de Actividad Fisica por Fecha");
        mostrarEjerciciosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarEjerciciosButtonActionPerformed(evt);
            }
        });

        jButton5.setText("Atras");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        modButton.setText("Modificar Registros");
        modButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modButtonActionPerformed(evt);
            }
        });

        registrarAlimentoButton.setText("Registrar Alimentos y Calorias");
        registrarAlimentoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAlimentoButtonActionPerformed(evt);
            }
        });

        registrarEjerciciosButton.setText("Registrar Ejercicios y Repeticiones");
        registrarEjerciciosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEjerciciosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrarEjerciciosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarAlimentosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarEjerciciosButton)
                    .addComponent(modButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarAlimentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(registrarAlimentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(registrarEjerciciosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(mostrarAlimentosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(mostrarEjerciciosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(modButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarAlimentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAlimentosButtonActionPerformed
        MostrarAlimentos mostrar = new MostrarAlimentos();
        mostrar.setVisible(true);
    }//GEN-LAST:event_mostrarAlimentosButtonActionPerformed

    private void mostrarEjerciciosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarEjerciciosButtonActionPerformed
        MostrarEjercicios mostrar =new MostrarEjercicios();
        mostrar.setVisible(true);
    }//GEN-LAST:event_mostrarEjerciciosButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void modButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modButtonActionPerformed
        Modificar mod = new Modificar(perfil);
        mod.setVisible(true);
    }//GEN-LAST:event_modButtonActionPerformed

    private void registrarAlimentoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAlimentoButtonActionPerformed
        RegistroAlimentos registro = new RegistroAlimentos(perfil);
        registro.setVisible(true);
    }//GEN-LAST:event_registrarAlimentoButtonActionPerformed

    private void registrarEjerciciosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEjerciciosButtonActionPerformed
        RegistroEjercicios registro = new RegistroEjercicios(perfil);
        registro.setVisible(true);
    }//GEN-LAST:event_registrarEjerciciosButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton modButton;
    private javax.swing.JButton mostrarAlimentosButton;
    private javax.swing.JButton mostrarEjerciciosButton;
    private javax.swing.JButton registrarAlimentoButton;
    private javax.swing.JButton registrarEjerciciosButton;
    // End of variables declaration//GEN-END:variables
}
