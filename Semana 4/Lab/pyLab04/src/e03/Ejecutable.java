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
public class Ejecutable {

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
        int numParticipantes = 5;
        int[] tiempos = new int[numParticipantes];
        int contAbandonos = 0;
        float promedio = 0;

        // Entrada
        for (int i = 0; i < tiempos.length; i++) {
            do {
                System.out.println("Introduzca el tiempo del participante " + (i + 1) + ":");
                tiempos[i] = entrada.nextInt();
                if (tiempos[i] < 0) {
                    System.out.println("Error de carga!");
                }
            } while (tiempos[i] < 0);
            
            if (tiempos[i] == 0) {
                contAbandonos++;
            } else {
                promedio += (float) tiempos[i];
            }
        }
        
        promedio /= (float) (numParticipantes - contAbandonos);

        // Salida
        System.out.print("[");
        for (int i = 0; i < tiempos.length; i++) {
            if (i != 1) {
                
            }
            if (tiempos[i] > 0) {
                System.out.print(tiempos[i]);
                if (i < (tiempos.length - 1)) {
                    System.out.print(", ");
                }
            }
            
        }
        System.out.println("]");
    }
    
}
