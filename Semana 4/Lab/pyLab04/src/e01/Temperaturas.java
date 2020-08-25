/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e01;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Como parte de un estudio climatológico, se desea un programa que permita 
        obtener una serie de estadísticas a partir de un conjunto de muestras de 
        temperatura. Se pide un programa que:
        •   Ingrese n muestras de temperatura, donde cada muestra contiene la 
            temperatura registrada 
        •   Determinar promedio general detemperaturas 
        •   Informar si en alguno de los días se registro una temperatura 
            de -10 º. 
        •   Mostrar todas las temperaturas en forma ordenada demayor a menor
         */

        Scanner entrada = new Scanner(System.in);
        // Variables
        int n;
        float[] tempLote;
        float acumulador = 0, promedio;
        boolean tempBaja = false;

        // Entrada
        do {
            System.out.println("Ingrese la cantidad de temperaturas a procesar: ");
            n = entrada.nextInt();
        } while (n <= 0);

        // Declarar y dimensionar un arreglo de longitud 'n'
        /*
        para declarar se utiliza:
            float temperaturas[];
        fue declarado en el inicio
         */
        tempLote = new float[n];

        // Entrada del lote de temperaturas y Proceso
        for (int i = 0; i < tempLote.length; i++) {
            System.out.println("Ingrese la temperatura " + (i + 1) + " en °C:");
            tempLote[i] = entrada.nextFloat();
            acumulador += tempLote[i];

            if (tempLote[i] <= -10) {
                tempBaja = true;
            }
        }

        // Calculo promedio        
        promedio = acumulador / tempLote.length;

        // Ordenar lote (utilizando algoritmo de ordenamiento por selección directa
        float aux;
        for (int i = 0; i < tempLote.length - 1; i++) {
            for (int j = i + 1; j < tempLote.length; j++) {
                if (tempLote[i] < tempLote[j]) {  //ordenando de mayor a menor
                    aux = tempLote[i];
                    tempLote[i] = tempLote[j];
                    tempLote[j] = aux;
                }
            }
        }

        // Salida
        System.out.println("--------------------");
        System.out.println("Temperaturas cargadas: " + tempLote.length);
        System.out.println("Promedio temperaturas: " + promedio);
        if (tempBaja) {
            System.out.println("Se detectó una temperatura menor a -10° C");
        }

        // Prueba ordenamiento mayor a menor
        System.out.println("--------------------");
        System.out.println("Imprimir el lote ordenado");
        for (int i = 0; i < tempLote.length; i++) {
            System.out.println("Temperatura n° " + (i + 1) + ": " + tempLote[i] + "° C");
        }
    }

}
