package com.convertidor.gui;

import com.convertidor.dominio.Convertidor;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class JFPrincipal extends javax.swing.JFrame {

    private Convertidor cnvt;
    private boolean convertirDolar;
    private boolean convertirEuro;

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal(Convertidor cnvt) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cnvt = cnvt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jtfValorPesos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpDolar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbPanelDolar = new javax.swing.JCheckBox();
        jtfValorDolar = new javax.swing.JTextField();
        jtfTasaDolar = new javax.swing.JTextField();
        jpDolar1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbPanelEuro = new javax.swing.JCheckBox();
        jtfValorEuro = new javax.swing.JTextField();
        jtfTasaEuro = new javax.swing.JTextField();
        jbConvertir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cotizador ");
        setResizable(false);

        jtfValorPesos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfValorPesos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfValorPesosKeyTyped(evt);
            }
        });

        jLabel1.setText("Valor en A$R:");

        jpDolar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpDolar.setPreferredSize(new java.awt.Dimension(300, 250));
        jpDolar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jpDolarPropertyChange(evt);
            }
        });

        jLabel2.setText("Tasa de cambio:");

        jLabel3.setText("Valor en U$D:");

        jcbPanelDolar.setText("Convertir a dolar");
        jcbPanelDolar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPanelDolarItemStateChanged(evt);
            }
        });

        jtfValorDolar.setEditable(false);
        jtfValorDolar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jtfTasaDolar.setEditable(false);
        jtfTasaDolar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jpDolarLayout = new javax.swing.GroupLayout(jpDolar);
        jpDolar.setLayout(jpDolarLayout);
        jpDolarLayout.setHorizontalGroup(
            jpDolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDolarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpDolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbPanelDolar)
                    .addGroup(jpDolarLayout.createSequentialGroup()
                        .addGroup(jpDolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jpDolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfValorDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTasaDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jpDolarLayout.setVerticalGroup(
            jpDolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDolarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jcbPanelDolar)
                .addGap(18, 18, 18)
                .addGroup(jpDolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfTasaDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpDolar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpDolar1.setPreferredSize(new java.awt.Dimension(300, 250));

        jLabel4.setText("Tasa de cambio:");

        jLabel5.setText("Valor en euros:");

        jcbPanelEuro.setText("Convertir a euro");
        jcbPanelEuro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPanelEuroItemStateChanged(evt);
            }
        });

        jtfValorEuro.setEditable(false);
        jtfValorEuro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jtfTasaEuro.setEditable(false);
        jtfTasaEuro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jpDolar1Layout = new javax.swing.GroupLayout(jpDolar1);
        jpDolar1.setLayout(jpDolar1Layout);
        jpDolar1Layout.setHorizontalGroup(
            jpDolar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDolar1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpDolar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbPanelEuro)
                    .addGroup(jpDolar1Layout.createSequentialGroup()
                        .addGroup(jpDolar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jpDolar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfValorEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTasaEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jpDolar1Layout.setVerticalGroup(
            jpDolar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDolar1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jcbPanelEuro)
                .addGap(18, 18, 18)
                .addGroup(jpDolar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfTasaEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDolar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jbConvertir.setText("Convertir");
        jbConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConvertirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtfValorPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpDolar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorPesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jbConvertir)
                    .addComponent(jbSalir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpDolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfValorPesosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorPesosKeyTyped
        char key = evt.getKeyChar();
        String entrada = jtfValorPesos.getText();

        if (!Character.isDigit(key)) {
            if (key == '.') {
                // boolean hayComa = false;

                for (int i = 0; i < entrada.length(); i++) {
                    if (entrada.charAt(i) == '.') {
                        evt.consume();
                        break;
                    }
                }
                /*
                if (hayComa) {
                    evt.consume();
                }
                 */
            } else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jtfValorPesosKeyTyped

    private void jbConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConvertirActionPerformed
        String entrada = jtfValorPesos.getText();
        if (entrada.equals("")) {
            JOptionPane.showMessageDialog(this, "No introdujo ningún valor",
                    "Cotizador", JOptionPane.ERROR_MESSAGE);
        } else if (!convertirDolar && !convertirEuro) {
            JOptionPane.showMessageDialog(this, "Ninguna conversión seleccionada",
                    "Cotizador", JOptionPane.ERROR_MESSAGE);
        } else {
            float valorPeso = Float.parseFloat(entrada);
            if (convertirDolar) {
                jtfTasaDolar.setText(String.format("%.3f", cnvt.getTasaPesoDolar()));
                jtfValorDolar.setText(String.format("%.2f", cnvt.convertirPesoDolar(valorPeso)));
            } else {
                jtfTasaDolar.setText("");
                jtfValorDolar.setText("");
            }

            if (convertirEuro) {
                jtfTasaEuro.setText(String.format("%.3f", cnvt.getTasaPesoEuro()));
                jtfValorEuro.setText(String.format("%.2f", cnvt.convertirPesoEuro(valorPeso)));
            } else {
                jtfTasaEuro.setText("");
                jtfValorEuro.setText("");
            }
        }
    }//GEN-LAST:event_jbConvertirActionPerformed

    private void jpDolarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jpDolarPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jpDolarPropertyChange

    private void jcbPanelDolarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPanelDolarItemStateChanged
        convertirDolar = evt.getStateChange() == 1;
    }//GEN-LAST:event_jcbPanelDolarItemStateChanged

    private void jcbPanelEuroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPanelEuroItemStateChanged
        convertirEuro = evt.getStateChange() == 1;
    }//GEN-LAST:event_jcbPanelEuroItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbConvertir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbPanelDolar;
    private javax.swing.JCheckBox jcbPanelEuro;
    private javax.swing.JPanel jpDolar;
    private javax.swing.JPanel jpDolar1;
    private javax.swing.JTextField jtfTasaDolar;
    private javax.swing.JTextField jtfTasaEuro;
    private javax.swing.JTextField jtfValorDolar;
    private javax.swing.JTextField jtfValorEuro;
    private javax.swing.JTextField jtfValorPesos;
    // End of variables declaration//GEN-END:variables
}
