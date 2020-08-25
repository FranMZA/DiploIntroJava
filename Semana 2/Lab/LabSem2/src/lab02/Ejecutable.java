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
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Leer una hora en formato 24 y generar una salida en formato 12
        El usuario debe introducir la hora en dos entradas
        - horas
        - minutos
         */
        Scanner entrada = new Scanner(System.in);
        //Definición variables
        int hora;
        int minuto;
        String am_pm;

        //Entrada
        System.out.println("Ingrese la hora (sólo hora en formato 24 hs):");
        hora = entrada.nextShort();

        System.out.println("Ingrese los minutos");
        minuto = entrada.nextInt();

        //Proceso
        if (hora > 12) {
            hora = hora - 12;
            am_pm = "PM";
        } else {
            am_pm = "AM";
        }

        //Salida
        System.out.println("La hora es " + hora + ":" + minuto + " " + am_pm);

    }

}
