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
public class e02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String opcion;
        
        float calc;
        int a,b;
        a = 5;
        b= 4;
        calc = a / b;
        System.out.println(calc);
        calc = (float) a / b;
        System.out.println(calc);

        System.out.println("Introducir parte: \n- A\n- B\n- C\n- D\n- E");
        opcion = entrada.next();

        switch (opcion) {
            case "A": {
                short t = 5;
                int p = 10;
                System.out.println(t + p);
                float i = t + p;
                System.out.println(i + p);
                
                break;
            }
            case "B": {
                int i;
                i = (int) (12);
                int j = 13;
                System.out.println(++i);
                System.out.println(i + j);
                
                break;
            }
            case "C": {
                int num1 = 143;
                int num2 = 57;
                byte num3 = (byte) (num1 + num2);
                System.out.println("Suma num1 + num2 como byte: " + num3);
                
                break;
            }
            case "D": {
                int x = 11, y = 5;
                int z = x * y - x++ + --x / y;
                System.out.println("Resultado: " + z);
                
                break;
            }
            case "E": {
                int x, y;
                x = 30;
                y = 20;
                System.out.println("Porcentaje: " + (y / x) * 100);
                
                break;
            }
            default: {
                System.out.println("Introduzca opción válida");
            }
        }

//        //Parte A
//        short t = 5;
//        int p = 10;
//        System.out.println(t + p);
//        float i = t + p;
//        System.out.println(i + p);
//
//        //Parte B
//        i = (int) (12);
//        int j = 13;
//        System.out.print(++i);
//        System.out.print(i + j);
//
//        //Parte C
//        int num1 = 143;
//        int num2 = 57;
//        byte num3 = (byte) (num1 + num2);
//        System.out.println("Suma num1 + num2 como byte: " + num3);
//
//        //Parte D
//        int x = 11, y = 5;
//        int z = x * y - x++ + --x / y;
//        System.out.println("Resultado: " + z);
//
//        //Parte E
//        x = 30;
//        y = 20;
//        System.out.println("Porcentaje: " + y / x * 100);

    }

}
