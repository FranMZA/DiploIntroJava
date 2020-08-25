/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class e05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar una clase ejecutable Practica05 que tome como dato de
        entrada un número que corresponde a la longitud del radio una esfera,
        y calcula y muestra el volumen de la esfera que se 
        corresponden con dicho radio.
         */

        //Variables
        Scanner entrada = new Scanner(System.in);
        float radio, volumen;
        String unidad;

        //Entrada
        System.out.println("Introduzca el valor del radio de la esfera: ");
        radio = entrada.nextFloat();
        System.out.println("Introducir unidad (ej: m)");
        unidad = entrada.next();

        //Proceso       
        volumen = (float) ((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));

        //Salida
        System.out.println("El volumen de la esfera es " + volumen + " " + unidad + "^3");

    }

}
