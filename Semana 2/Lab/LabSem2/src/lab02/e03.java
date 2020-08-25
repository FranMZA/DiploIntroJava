/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class e03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        int anio_actual;
        int anio_nacimiento;
        Scanner entrada = new Scanner(System.in);

        //Inicialización de variables                
        anio_actual = Calendar.getInstance().get(Calendar.YEAR);

        //Entrada
        System.out.println("Introduzca su año de nacimiento:");
        anio_nacimiento = entrada.nextInt();

        //Salida
        System.out.println("Su edad a finales del año actual será de " + (anio_actual - anio_nacimiento) + " años.");

    }

}
