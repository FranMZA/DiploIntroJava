/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e03;

import java.util.Scanner;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class EjecutableV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Se necesita desarrollar un programa que permita cargar los tiempos 
        obtenidos por los 20 participantes de una competencia de ciclismo. 
        Con los tiempos registrados en minutos el programa debe: 
               Determinar el tiempo promedio de la carrera 
               Determinar la cantidad de abandonos (se considera abandono
                cuando el tiempo ingresado es 0) 
               Determinar y mostrar el tiempo del ganador 
               Mostrar el listado completo de tiempos ordenado en forma 
                ascendente (Tener presente que los abandonos no debería 
                figurar en el listado). 
         */
        Scanner entrada = new Scanner(System.in);
        // Variables
        int numParticipantes = 20;
        int[] tiemposEntrada = new int[numParticipantes];
        boolean abandono[] = new boolean[numParticipantes];
        int tiempos[];
        int contAbandonos = 0;
        float promedio = 0;

        // Entrada
        for (int i = 0; i < tiemposEntrada.length; i++) {
            do {
                System.out.println("Introduzca el tiempo del participante " + (i + 1) + ":");
                tiemposEntrada[i] = entrada.nextInt();
                if (tiemposEntrada[i] < 0) {
                    System.out.println("Error de carga!");
                }
            } while (tiemposEntrada[i] < 0);

            if (tiemposEntrada[i] != 0) {
                abandono[i] = false;
                promedio += (float) tiemposEntrada[i];
            } else {
                abandono[i] = true;
                contAbandonos++;
            }

        }

        if (contAbandonos != numParticipantes) {
            promedio /= (float) (numParticipantes - contAbandonos);
        } else {
            promedio = 0;
        }

        tiempos = new int[(numParticipantes - contAbandonos)];

        for (int i = 0, j = i; i < tiemposEntrada.length && j < tiempos.length; i++) {
            if (abandono[i] == false) {
                tiempos[j] = tiemposEntrada[i];
                j++;
            }
        }

        // Ordenando lote
        int aux;
        for (int i = 0; i < tiempos.length - 1; i++) {
            for (int j = i + 1; j < tiempos.length; j++) {
                if (tiempos[i] > tiempos[j]) {
                    aux = tiempos[i];
                    tiempos[i] = tiempos[j];
                    tiempos[j] = aux;
                }
            }
        }

        // Salida
        System.out.println("--------------------");
        System.out.println("El promedio de la carrera es de " + String.format("%.2f", promedio) + " minutos.");
        if (contAbandonos == 0) {
            System.out.println("No hubo abandonos.");
        } else {
            System.out.println("Hubieron " + contAbandonos + " abandonos.");
        }
        if (tiempos.length > 0) {
            System.out.println("El tiempo del ganador fue de " + tiempos[0] + " minutos.");
        } else {
            System.out.println("No hubo ganador.");
        }

        System.out.println("--------------------");
        System.out.println("Lista de tiempos:");
        System.out.print("[");
        if (tiempos.length > 0) {
            System.out.print(tiempos[0]);
            for (int i = 1; i < tiempos.length; i++) {
                System.out.print(", ");
                System.out.print(tiempos[i]);
            }
        }
        System.out.println("]");

    }

}
