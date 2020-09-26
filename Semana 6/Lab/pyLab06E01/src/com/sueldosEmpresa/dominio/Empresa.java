package com.sueldosEmpresa.dominio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Empresa {

    /*
     Empresa:
    • Representa la empresa de software. Sus atributos son: 
        - cuit (String-13)
        - razón social 
        - y empleados (colección de trabajadores de la empresa). 
    Se conoce que actualmente la empresa cuenta con 30 trabajadores, entre 
    empleados fijos y consultores.
    • debe poseer las siguientes operaciones:
        •   agregar empleado(): agrega el objeto recibido por
            parámetro a la colección de objetos expuestos
        •   incrementarSueldo(porc): permite incrementar el
            sueldo de los empleados fijos de la empresa en un
            porcentaje ingresado como argumento.
        •   mostrarNomina(): que muestra el listado de los
            empleados ordenados alfabéticamente.
        •   presupuestoMensual(): que retorna el monto total que
            la empresa debe asignar en materia de salarios.
     */
    private final String cuit;
    private String razonSocial;
    private ArrayList<Empleado> empleados;

    public Empresa(String cuit) {
        this.cuit = cuit;
        this.razonSocial = "";
        this.empleados = new ArrayList<>(30);
    }

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>(30);
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void agregarEmpleado(Empleado emp) {
        this.empleados.add(emp);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void incrementarSueldo(int porcentaje) {
        for (Empleado empleado : empleados) {
            if (empleado instanceof TrabajadorFijo) {
                ((TrabajadorFijo) empleado).aumentarSueldo(porcentaje);
            }
        }
    }

    public String mostrarNomina() {
        Collections.sort(empleados);
        StringBuilder nomina = new StringBuilder("");

        for (Empleado empleado : empleados) {
            nomina.append(empleado.getNombre()).append("\n");
        }

        return nomina.toString();
    }

    public float presupuestoMensual() {
        float aux = 0;
        for (Empleado empleado : empleados) {
            aux += empleado.calcularPaga();
        }
        return aux;
    }

}
