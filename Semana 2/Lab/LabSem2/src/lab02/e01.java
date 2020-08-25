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
public class e01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El programa debe recibir un número entero en segundos y devolver el valor en horas, minutos y segundos
        Entradas:
        - tiempo total en segundos
        Salidas:
        -Hora
        -Min
        -Seg
         */
        //Declaración de variables
        Scanner entrada = new Scanner(System.in);
        int tiempo_input, hora, min, seg;

        //Entrada de datos
        System.out.println("Introduzca el tiempo transcurrido en segundos:");
        tiempo_input = entrada.nextInt();

        //Proceso
        hora = tiempo_input / (60 * 60);
        min = (tiempo_input / 60) - (hora * 60);
        seg = tiempo_input % 60;

        //Salida
        //System.out.println("Transcurrieron " + hora + " hora/s, " + min + " minuto/s y " + seg + " segundo/s.");
        System.out.print("Transcurrieton ");

        if (seg >= 0) {
            if (min >= 0) {
                if (hora >= 0) {
                    System.out.print(hora);
                    if (hora == 1) {
                        System.out.print(" hora, ");
                    } else {
                        System.out.print(" horas, ");
                    }
                }
                System.out.print(min);
                if (min == 1) {
                    System.out.println(" minuto y ");
                } else {
                    System.out.print(" minutos y ");
                }
            }
            System.out.print(seg);
            if (seg == 1) {
                System.out.print(" segundo.");
            } else {
                System.out.println(" segundos.");
            }

        }

    }

}
