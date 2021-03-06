package com.sueldosEmpresa.gui;

import com.sueldosEmpresa.dominio.Empresa;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class JDAumentarSueldos extends javax.swing.JDialog {

    private final Empresa emp;
    /**
     * Creates new form JDAumentarSueldos
     * @param parent
     * @param modal
     * @param emp
     */
    public JDAumentarSueldos(java.awt.Frame parent, boolean modal, Empresa emp) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.emp = emp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAceptar = new javax.swing.JButton();
        jtfPorcentaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aumentar Sueldos");
        setResizable(false);

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jtfPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPorcentajeKeyTyped(evt);
            }
        });

        jLabel1.setText("Porcentaje de aumento :");

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel2.setText("e.j.: 15 (15%)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jbAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtfPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAceptar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPorcentajeKeyTyped
        char key = evt.getKeyChar();
        if (!Character.isDigit(key)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfPorcentajeKeyTyped

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        if (jtfPorcentaje.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ningun valor ingresado", "Aumentar sueldo", JOptionPane.ERROR_MESSAGE);
        } else {
            int porcentaje = Integer.parseInt(jtfPorcentaje.getText());
            emp.incrementarSueldo(porcentaje);
            this.dispose();
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JTextField jtfPorcentaje;
    // End of variables declaration//GEN-END:variables
}
