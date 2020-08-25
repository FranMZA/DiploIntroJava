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
public class e07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar una clase ejecutable Practica07 que lea un número entero de
        3 cifras y muestre por separado las cifras del número. 
        (Suponer que el usuario ingresa un número entero de 3 cifras) 
         */
        //Variables
        int unidad, decena, centena, numero;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Introduzca un número entero de 3 cifras:");
        numero = entrada.nextInt();
        numero = numero > 0 ? numero: -numero;
        
        //Proceso
        centena = numero / 100;
        decena = (numero % 100) / 10;
        unidad = (numero % 100) % 10;
        
        
        //Salida
        System.out.print("El número es: ");
        System.out.print(centena + " ");
        System.out.print(decena + " ");
        System.out.println(unidad);
        
    }

}
