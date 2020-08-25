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
public class e07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar un programa que permita ingresar las coordenadas x e y  
        de n puntos (validando que sea > 0) en el plano, e informe:   
            • cuántos puntos se encuentran en el primero o tercer cuadrante 
            • cuál de todos los puntos cargados se encuentra a mayor 
              distancia del origen de coordenadas.  
        Ayuda: para realizar el cálculo de la distancia 
        puede utilizar los siguientes métodos: 
            - Math.sqrt(n): retorna la raíz cuadrada de n.  
            - Math.pow(x,y): retorna la potencia y del valor x. 
         */

        Scanner entrada = new Scanner(System.in);
        // Variables
        short numPuntos;
        float x, y;
        float memoriaX, memoriaY;
        float distancia, memoriaDistancia;
        int conPrimerCuad, conTercerCuad;
        conPrimerCuad = conTercerCuad = 0;
        memoriaX = memoriaY = memoriaDistancia = 0;

        // Entrada
        do {
            System.out.println("Introduzca la cantidad de puntos a cargar:");
            numPuntos = entrada.nextShort();

        } while (numPuntos <= 0);

        // codigo
        for (int i = 0; i < numPuntos; i++) {
            // Entrada
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("Ingrese la coordenada x:");
            x = entrada.nextFloat();
            System.out.println("Ingrese la coordenada y:");
            y = entrada.nextFloat();

            // Proceso
            //  - Chequear cuadrante
            if (x > 0 && y > 0) {
                conPrimerCuad++;
            } else {
                if (x < 0 && y < 0) {
                    conTercerCuad++;
                }
            }

            //  - Calcular distancia
            distancia = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println("La distancia al origen es: " + distancia);

            //  - Guardar mayor distancia
            if (distancia > memoriaDistancia) {
                memoriaDistancia = distancia;
                memoriaX = x;
                memoriaY = y;
            }

        }

        // Salida
        System.out.println("--------------------");
        System.out.println("Se encontraron " + conPrimerCuad + " puntos en el primer cuadrante");
        System.out.println("Se encontraron " + conTercerCuad + " puntos en el tercer cuadrante");
        System.out.println("El punto (" + memoriaX + ", " + memoriaY + ") es el más alejado.");
        System.out.println("Su distancia al origen es de " + memoriaDistancia);

    }

}
