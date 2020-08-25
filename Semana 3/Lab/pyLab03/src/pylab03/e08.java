/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pylab03;

import java.util.Scanner;

/**
 *
 * @author Frankito
 */
public class e08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar un programa Java controlado por menú de opciones, 
        que permita simular el desplazamiento de un robot sobre el plano. 
        Inicialmente se genera la posición aleatoria del robot en forma de 
        punto (x, y). Luego se presenta un menú de opciones que permita los 
        siguientes  movimientos: 
        - Girar norte y avanzar 10 pasos 
        - Girar al sur y avanzar  20 pasos 
        - Girar al este y avanzar 10 pasos 
        - Girar al oeste  y avanzar  20 pasos 
        - Salir
         */

        //Variables
        int x, y;
        int opcion;
        boolean cortar;
        cortar = true;
        x = (int) (Math.random() * 101);
        y = (int) (Math.random() * 101);
        Scanner entrada = new Scanner(System.in);

        //Proceso
        do {
            System.out.println("T1T0 está en las coordenadas (" + x + ", " + y + ")");
            System.out.println("Cómo desea moverlo?");
            System.out.println("1 - Al Norte \n2 - Al Sur \n3 - Al Este \n4 - Al Oeste\n5 - Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                default: {
                    System.out.println("Opción incorrecta");

                    break;
                }
                case 1: {
                    System.out.println("Eligió NORTE.");
                    System.out.println("Cuánto desea moverlo?");
                    y += Math.abs(entrada.nextInt());

                    break;
                }
                case 2: {
                    System.out.println("Eligió SUR.");
                    System.out.println("Cuánto desea moverlo?");
                    y -= Math.abs(entrada.nextInt());

                    break;
                }
                case 3: {
                    System.out.println("Eligió ESTE.");
                    System.out.println("Cuánto desea moverlo?");
                    x += Math.abs(entrada.nextInt());

                    break;
                }
                case 4: {
                    System.out.println("Eligió OESTE.");
                    System.out.println("Cuánto desea moverlo?");
                    x -= Math.abs(entrada.nextInt());

                    break;
                }
                case 5: {
                    System.out.println("Adiós T1T0!");
                    cortar = false;
                }
            }

        } while (cortar);
    }

}
