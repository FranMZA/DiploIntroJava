package com.sueldosEmpresa.gui;

import com.sueldosEmpresa.dominio.Consultor;
import com.sueldosEmpresa.dominio.Empleado;
import com.sueldosEmpresa.dominio.Empresa;
import com.sueldosEmpresa.dominio.TrabajadorFijo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class JFPrincipal extends javax.swing.JFrame {

    private final Empresa emp;

    /**
     * Creates new form JFPrincipal
     * @param emp
     */
    public JFPrincipal(Empresa emp) {
        initComponents();
        this.setLocationRelativeTo(null);
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

        jbCargarEmpleado = new javax.swing.JButton();
        jbMostrarNomina = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtNomina = new javax.swing.JTable();
        jbAumentarSueldos = new javax.swing.JButton();
        jbPresupuestoMensual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nómina de la empresa");
        setMinimumSize(new java.awt.Dimension(450, 330));
        setResizable(false);

        jbCargarEmpleado.setText("Cargar Empleado");
        jbCargarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarEmpleadoActionPerformed(evt);
            }
        });

        jbMostrarNomina.setText("Mostrar nomina");
        jbMostrarNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarNominaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo empleado", "Legajo", "Fecha contratación", "Puesto", "Paga", "Sueldo", "Horas extra", "Valor hora", "Cantidad horas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtNomina);

        jbAumentarSueldos.setText("Aumentar sueldos");
        jbAumentarSueldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAumentarSueldosActionPerformed(evt);
            }
        });

        jbPresupuestoMensual.setText("Presupuesto mensual");
        jbPresupuestoMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPresupuestoMensualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbCargarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMostrarNomina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAumentarSueldos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPresupuestoMensual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCargarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(jbMostrarNomina)
                        .addGap(18, 18, 18)
                        .addComponent(jbAumentarSueldos)
                        .addGap(18, 18, 18)
                        .addComponent(jbPresupuestoMensual)
                        .addGap(79, 79, 79)
                        .addComponent(jbSalir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbCargarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarEmpleadoActionPerformed
        new JDCargarEmpleado(this, true, emp).setVisible(true);
    }//GEN-LAST:event_jbCargarEmpleadoActionPerformed

    private void jbMostrarNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarNominaActionPerformed
        String nomina = emp.mostrarNomina();

        DefaultTableModel datos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        datos.setColumnIdentifiers(new String[]{
            "Nombre", "Tipo empleado", "Legajo", "Fecha contratación", "Puesto",
            "Paga", "Sueldo", "Horas extra", "Valor hora", "Cantidad horas"
        });
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Empleado> empleados = emp.getEmpleados();
        for (Empleado empleado : empleados) {
            int tipo = empleado instanceof Consultor ? 1 : 2;
            switch (tipo) {
                case 1:
                    datos.addRow(new Object[]{empleado.getNombre(),
                        "Consultor",
                        empleado.getLegajo(),
                        sdf.format(empleado.getFechaInicio().getTime()),
                        empleado.getPuesto(),
                        empleado.calcularPaga(),
                        "",
                        "",
                        ((Consultor) empleado).getValorHora(),
                        ((Consultor) empleado).getCantHoras()
                    });
                    break;
                case 2:
                    datos.addRow(new Object[]{empleado.getNombre(),
                        "Trabajador fijo",
                        empleado.getLegajo(),
                        sdf.format(empleado.getFechaInicio().getTime()),
                        empleado.getPuesto(),
                        empleado.calcularPaga(),
                        ((TrabajadorFijo) empleado).getSueldo(),
                        ((TrabajadorFijo) empleado).getHorasExtra(),
                        "",
                        ""
                    });
                    break;
            }
        }

        jtNomina.setModel(datos);

        /*
        if (nomina.equals("")) {
            jtaNomina.setText("No hay empleados en la nómina.");
        } else {
            jtaNomina.setText(nomina);
        }
         */
    }//GEN-LAST:event_jbMostrarNominaActionPerformed

    private void jbAumentarSueldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAumentarSueldosActionPerformed
        new JDAumentarSueldos(this, true, emp).setVisible(true);
    }//GEN-LAST:event_jbAumentarSueldosActionPerformed

    private void jbPresupuestoMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPresupuestoMensualActionPerformed
        JOptionPane.showMessageDialog(this, "El presupuesto mensual es de: $ " 
                + String.format("%.2f", emp.presupuestoMensual()), "Presupuesto", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jbPresupuestoMensualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAumentarSueldos;
    private javax.swing.JButton jbCargarEmpleado;
    private javax.swing.JButton jbMostrarNomina;
    private javax.swing.JButton jbPresupuestoMensual;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtNomina;
    // End of variables declaration//GEN-END:variables
}
