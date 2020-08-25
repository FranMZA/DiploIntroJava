
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franco J. Mule
 */
public class ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definir VARIABLES
        int dato, cuadrado;
        Scanner entrada = new Scanner(System.in);
        
        //Entrada: num entero
        System.out.println("Ingrese un numero entero:");
        dato = entrada.nextInt();
        
        //Proceso
        /*
        analizar si es par o impar
        */
        cuadrado = dato * dato;
        
        //Salida
        System.out.println("El cuadrado del numero es " + cuadrado);
        
    }
    
}
