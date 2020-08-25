/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Problema: dada una calificación de una tienda de aplicaciones, 
        - mostrar la calificacion correspondiente segun:
            1-Regular
            2-Muy buena
            3-Recomendable
        Si es otra, 
        - mostrar valor no permitido
         */

        Scanner entrada = new Scanner(System.in);

        short calificacion;
        String valoracion;

        /*
        Entrada de datos
        */
        System.out.println("Ingrese calificación asignada:");
        calificacion = entrada.nextShort();

        //Condicional multiple: switch
        /*
        El switch únicamente funciona con valores enteros,
        es decir, sólo funciona con
        - int
        - byte
        - short
        
        A partir de las últimas versiones, es posible comparar 
        con el switch cadenas de tipo "string"
        */
        switch (calificacion) {
            case 1: {
                valoracion = "Calificación: regular";
                break;
            }
            case 2: {
                valoracion = "Calificación: muy buena";
                break;
            }
            case 3: {
                valoracion = "Calificación: recomendable";
                break;
            }
            case 4:{
                valoracion = "Calificación: uma delicia";
                break;
            }
            case 5:{
                valoracion = "Calificación: il papu di papu";
                break;
            }
            default: {
                valoracion = "Valor de calificación no permitido";
            }

        }
        //final del switch
        
        System.out.println(valoracion);

//        if (calificacion == 1) {
//            System.out.println("Regular");
//        } else if (calificacion == 2) {
//            System.out.println("Muy buena");
//        } else if (calificacion == 3) {
//            System.out.println("Recomendable");
//        } else {
//            System.out.println("Valor no permitido");
//        }
    }
}
