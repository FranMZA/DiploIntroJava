package com.sueldosEmpresa;

import com.sueldosEmpresa.dominio.Empresa;
import com.sueldosEmpresa.gui.JFPrincipal;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Nos han pedido que desarrollemos un pequeño programa para
        liquidar los sueldos de una empresa de software de nuestra ciudad. En
        la empresa trabajan empleados bajo dos modalidades de contratación
        diferentes:
        •   Trabajadores que tienen un sueldo fijo pactado al momento
            de incorporarse a la empresa (generalmente desarrolladores
            y personal técnico)
        •   Consultores que trabajan para ciertos proyectos una cantidad
            variable de horas por mes (generalmente analistas y Project
            Managers).
        Durante la etapa de análisis del sistema se descubrieron las
        siguientes entidades: ·
         Empleado:
        •   Trabajador fijo de la empresa. Las propiedades de este objeto
            son: 
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
         Consultor:
        •   trabajador externo que participa en proyectos diferentes. Las
            propiedades de este objeto son: 
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
         Empresa:
        • Representa la empresa de software. Sus atributos son: 
            cuit (String-13)
            razón social 
            y empleados (colección de trabajadores de la empresa). 
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
        Empresa emp = new Empresa("123-699-420-723", "Vendemos humo");
        new JFPrincipal(emp).setVisible(true);  
    } 
}
