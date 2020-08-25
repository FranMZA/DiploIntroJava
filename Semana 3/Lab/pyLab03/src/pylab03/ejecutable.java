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
public class ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Se pide desarrollar un programa que permita leer una serie de números. 
        La finalización de la carga de datos se presenta cuando el usuario ingrese un número negativo. 
        Los requerimientosfuncionales del programa son:

        - Cantidad de valores pares e impares procesados
        - Informar si al menos un cero fue procesado durante la carga
        - Informar si la serie contiene solo números pares e impares alternados
         */
        Scanner entrada = new Scanner(System.in);

        int con_par, con_impar, num, num_anterior;
        boolean alternancia, entrada_cero;

        //Inicializar variables auxiliares
        con_par = con_impar = num_anterior = 0;
        alternancia = true;
        entrada_cero = false;

        //Entrada inicial - loop 0
        System.out.println("Ingrese un número");
        num = entrada.nextInt();

        //Proceso
        while (num >= 0) {
            if (num == 0) {
                entrada_cero = true;
            } else {
                if (num % 2 == 0) {
                    con_par++;
                } else {
                    con_impar++;
                }
                num_anterior = num;
            }

            System.out.println("Ingrese un número");
            num = entrada.nextInt();

            if (num > 0 && num_anterior > 0) {
                if (num % 2 == 0) {
                    if (num_anterior % 2 == 0) {
                        alternancia = false;
                    }
                } else {
                    if (num_anterior % 2 != 0) {
                        alternancia = false;
                    }
                }
            }

        }

        //Salida
        System.out.println("Se procesaron " + con_par + " numeros pares.");
        System.out.println("Se procesaron " + con_impar + " numeros impares.");

        if (entrada_cero) {
            System.out.println("Se procesó al menos un cero.");
        } else {
            System.out.println("No se procesó ningun cero.");
        }

        if (alternancia) {
            System.out.println("La secuencia de números fue alternante par-impar.");
        } else {
            System.out.println("La secuencia de números no fue alternante.");
        }

    }

}
