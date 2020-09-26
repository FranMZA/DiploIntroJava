package com.sueldosEmpresa.dominio;

import java.util.Date;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class TrabajadorFijo extends Empleado {

    /*
    Trabajador fijo de la empresa. 
    Las propiedades de este objeto son: 
        - legajo 
        - nombre 
        - fecha de contratación
        - puesto
        - sueldo
        - horas extra.
    • y debe poseer las siguientes operaciones:
        1.  Método calcularPaga(): que retorna el sueldo a percibir en
            función del sueldo base y las horas extra realizadas en el
            mes. El sueldo final se calcula como el sueldo base + 300
            por cada hora extra hasta 20 horas.
        2.  toString(): que retorna los datos completos de un
            empleado, incluido el valor final de su ingreso mensual. 
     */
    private float sueldo;
    private int horasExtra;

    public TrabajadorFijo(float sueldo, int horasExtra, int legajo, String nombre, Date fechaInicio, String puesto) {
        super(legajo, nombre, fechaInicio, puesto);
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void aumentarSueldo(int porcentajeAumento) {
        this.sueldo += (sueldo * porcentajeAumento) / 100 ;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public float calcularPaga() {
        return sueldo + (300 * (horasExtra < 20 ? horasExtra : 20));
    }
}
