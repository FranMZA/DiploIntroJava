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
public class e06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar una clase ejecutable Practica06 que calcule el área de 
        un triángulo en función de las longitudes de sus lados (a, b, c), 
        según la siguiente fórmula:
          
        Area = RaizCuadrada(sp*(p-a)*(p-b)*(p-c)) 
        
        donde 
        
        sp =  (a+b+c)/2 (Semi-perímetro)
        
        Para calcular la raíz cuadrada se utiliza el método Math.sqrt() 
         */
        //Variables
        float a, b, c, sp, area;
        Scanner entrada = new Scanner(System.in);

        //Entrada
        System.out.println("Introduzca lado A del triángulo:");
        a = entrada.nextFloat();
        System.out.println("Introduzca lado B del triángulo:");
        b = entrada.nextFloat();
        System.out.println("Introduzca lado C del triángulo:");
        c = entrada.nextFloat();

        //Proceso
        sp = (a + b + c) / 2;
        area = (float) Math.sqrt(sp * ((sp * 2) - a) * ((sp * 2) - b) * ((sp * 2) - c));

        //Salida
        System.out.println("Área del triángulo en base a las longitudes de sus lados: " + area);

    }

}
