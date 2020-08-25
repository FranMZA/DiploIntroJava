/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pylab03;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class e02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribir un programa que determine si un año es bisiesto. Un año es 
        bisiesto si es múltiplo de 4 (por ejemplo 1984). Sin embargo, los años 
        múltiplos de 100 solo son bisiestos cuando a la vez son múltiplos de 
        400 (por ejemplo, 1800 no es bisiesto pero 2000 si lo fue). 
         */
        Scanner entrada = new Scanner(System.in);
        //Variables
        int anio;
        boolean bisiesto;

        //Entrada
        System.out.println("Introduzca el año que desea analizar: ");
        anio = entrada.nextShort();

        //Proceso
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                bisiesto = (anio % 400 == 0);
            } else {
                bisiesto = true;
            }
        } else {
            bisiesto = false;
        }

        if (bisiesto) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }

}
