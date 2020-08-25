/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Para realizar una prueba estadística, se lanzan simultáneamente 
        2 dados y se anotan los resultados obtenidos. 
        Al cabo de n lanzamientos, se necesita determinar:  
               Mostrar los resultados de los lanzamientos 
               Cuántas veces se obtuvo el mismo valor en ambos dados y 
                qué porcentaje representa sobre el total de lanzamientos.  
               En qué lanzamiento se dio por primera vez una suma 
                impar entre ambos dados 
         */
        Scanner entrada = new Scanner(System.in);
        // Variables
        short dado1[];
        short dado2[];
        int numLanzamientos;
        int contDobles = 0;
        boolean sumaImpar = false;
        short primerSumaImpar = 0;
        String formatoNumLanzamientos;
        

        // Entrada
        do {
            System.out.println("Introduzca el número de lanzamientos a realizar:");
            numLanzamientos = entrada.nextInt();
            if (numLanzamientos <= 0) {
                System.out.println("Introduzca una cantidad de lanzamienstos válida!");
            }
        } while (numLanzamientos <= 0);
        dado1 = new short[numLanzamientos];
        dado2 = new short[numLanzamientos];
        formatoNumLanzamientos = "%-" + ((int) Math.log10(numLanzamientos) + 1) + "d";
        System.out.println(formatoNumLanzamientos);
        
        // Proceso
        System.out.println("Lanzando dados...");
        for (int i = 0; i < numLanzamientos; i++) {
            dado1[i] = (short) randInt(1, 6);
            dado2[i] = (short) randInt(1, 6);
                      
            if (dado1[i] == dado2[i]) {
                contDobles++;
            }
            
            if (sumaImpar == false) {
                if ((dado1[i] + dado2[i]) % 2 != 0) {
                    sumaImpar = true;
                    primerSumaImpar =(short) i;
                }
            }
            // Mostrar lanzamientos
            System.out.print("Lanzamiento n° " + String.format(formatoNumLanzamientos, (i + 1)) + ": ");
            System.out.print(dado1[i] + " & ");
            System.out.println(dado2[i]);
            
        }
        System.out.println("Listo! Mostrando resultados...");
        
        // Salida
        System.out.println("--------------------");
        System.out.println("Se realizaron " + numLanzamientos + " lanzamientos de dados.");
        System.out.println("Se obtuvieron " + contDobles + " lanzamientos dobles.");
        System.out.println("El " + ((float) contDobles / numLanzamientos) * 100 + "% de los lanzamientos fueron dobles.");
        if (sumaImpar) {
            System.out.println("La primer suma impar se dió en el lanzamiendo " + (primerSumaImpar + 1) + ".");
        }

    }
    public static int randInt(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
}

}
