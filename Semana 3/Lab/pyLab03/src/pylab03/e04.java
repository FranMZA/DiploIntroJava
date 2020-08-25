/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pylab03;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class e04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseñar y programar un algoritmo que imprima el nombre de un artículo, 
        su clave, precio original y su precio con descuento. El descuento lo 
        hace en base a la clave, si la clave es 01 el descuento es del 10% y si 
        la clave es 02 el descuento en del 20%. En caso de ingresar otro valor 
        de clave deberá informar un error de carga. 
         */
        // Variables
        Scanner entrada = new Scanner(System.in);
        String nombreProducto, clave;
        float precio, descuento = 0;
        boolean cargaCorrecta = true;

        // Entrada
        System.out.println("Introduzca el nombre del producto:");
        nombreProducto = entrada.next();

        System.out.println("Introduzca el precio de " + nombreProducto + ":");
        precio = entrada.nextFloat();

        System.out.println("Introduzca la clave de descuento:");
        clave = entrada.next();

        // Proceso
        switch (clave) {
            default: {
                cargaCorrecta = false;
                break;
            }
            case "01": {
                descuento = (float) 0.10;
                break;
            }
            case "02": {
                descuento = (float) 0.20;
                break;
            }
        }

        if (precio < 0) {
            cargaCorrecta = false;
        }

        if (cargaCorrecta) {
            System.out.println("--------------------");
            System.out.println("Artículo: " + nombreProducto);
            System.out.println("Clave: " + clave);
            System.out.println("Descuento: " + descuento * 100 + " %");
            System.out.println("Precio original: AR$ " + precio);
            System.out.println("Precio final: AR$ " + (precio - (precio * descuento)));
        } else {
            System.out.println("Error de carga.");
        }

    }

}
