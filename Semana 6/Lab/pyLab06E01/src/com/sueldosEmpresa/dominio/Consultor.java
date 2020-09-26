package com.sueldosEmpresa.dominio;

import java.util.Date;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Consultor extends Empleado {
    /*
    trabajador externo que participa en proyectos diferentes. 
    Las propiedades de este objeto son: 
        - legajo 
        - nombre 
        - fecha de contratación
        - puesto
        - cantidad de horas
        - valor hora
    • debe permitir realizar las siguientes operaciones:
        •   Método calcularPaga(): que retorna el sueldo a percibir en
            función de las horas trabajadas entre todos los proyectos
            en el mes por el valor de la hora pactada.
        •   toString(): que retorna los datos completos de un
            consultor, incluido el valor final de su ingreso mensual.
    */
    
    private int cantHoras;
    private float valorHora;

    public Consultor(int cantHoras, float valorHora, int legajo, 
            String nombre, Date fechaInicio, String puesto) {
        super(legajo, nombre, fechaInicio, puesto);
        this.cantHoras = cantHoras;
        this.valorHora = valorHora;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularPaga() {
        return cantHoras * valorHora;
    }
}
