
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author franquito
 */
public class condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer un numero y deteerminar si es par o impar siempre que sea positivo
        //Caso de no serlo mostrar un mensaje

        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca un numero entero:");
        num = input.nextInt();

        if (num >= 0) {
            if (num == 0) {
                System.out.println("El numero es cero.");
            } else {
                if (num % 2 == 0) {
                    System.out.println("El numero es par.");
                } else {
                    System.out.println("El numero es impar.");
                }
            }
        } else {
            System.out.println("El numero es negativo");
        }

    }

}
