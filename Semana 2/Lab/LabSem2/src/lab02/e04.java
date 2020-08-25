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
public class e04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Desarrollar un programa que determine el menor número de billetes de: 
        -1000 $
        - 500 $
        - 200 $
        - 100 $ 
        
        que deberá entregar un cajero automático en una extracción de cierta 
        cantidad de dinero 
        (siempre múltiplo de 100, tal como sucede en la actualidad).
         */

        //Variables
        Scanner entrada = new Scanner(System.in);
        int extraccion, num_1000, num_500, num_200, num_100;
        // num_1000 = num_500 = num_200 = num_100 = 0;
        //Evita que se acarree memoria de una extracción anterior

        //Entrada
        System.out.println("Introduzca el monto a extraer (en múltiplos de 100 $):");
        extraccion = entrada.nextInt();

        //Proceso
        if (extraccion >= 100) {
            if (extraccion % 100 == 0) {
                //proceso guita
                num_1000 = extraccion / 1000;
                num_500 = (extraccion % 1000) / 500;
                num_200 = ((extraccion % 1000) % 500) / 200;
                num_100 = (((extraccion % 1000) % 500) % 200) / 100;

                System.out.println("Se deberán entregar:");
                System.out.println(num_1000 + " billetes de 1000 $");
                System.out.println(num_500 + " billetes de 500 $");
                System.out.println(num_200 + " billetes de 200 $");
                System.out.println(num_100 + " billetes de 100 $");

            } else {
                System.out.println("Introduzca un monto múltiplo de 100 $.");
            }
        } else {
            System.out.println("Introduzca un monto de al menos 100 $.");
        }

        //Salida
    }

}
