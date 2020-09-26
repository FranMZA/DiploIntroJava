package com.sueldosEmpresa.dominio;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public abstract class Empleado implements Comparable<Empleado>{
    
    private final int legajo;
    private String nombre;
    private final Calendar fechaInicio = Calendar.getInstance();
    private String puesto;

    public Empleado(int legajo, String nombre,Date fechaInicio, String puesto) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.fechaInicio.setTime(fechaInicio);
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getLegajo() {
        return legajo;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }
    
    public abstract float calcularPaga();
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\t|\t" 
                + "Legajo: " + String.format("%d", legajo) + "\t|\t" 
                + "Fecha de contratación: " + fechaInicio.toString() + "\t|\t" 
                + "Puesto: " + puesto + "\t|\t"
                + "Sueldo final: $" + String.format("%.2f", calcularPaga());
    }

    @Override
    public int compareTo(Empleado t) {
        return this.getNombre().compareTo(t.getNombre());
    }
}
