/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.password;

import com.password.dominio.Password;
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
        Ahora, crea una clase ejecutable llamada Main:  
           Crea un array de Passwords con el tamaño que tu le indiques por 
            teclado, junto con la longitud de los passwords 
            (todos tendrán la misma).  
           Crea otro array de booleanos donde se almacene si el password del 
            array de Password es o no (supongo que quiso decir fuerte)
 
        Al final, muestra la contraseña y si es o no fuerte 
        (usa el bucle anterior). Usa este simple formato:  
           contraseña1 valor_booleano1  
           contraseña2 valor_bololeano2  
 
         */
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca cuantas contraseñas desea generar:");
        int numContras = entrada.nextInt();
        System.out.println("Introduzca la longitud deseada (por defecto 8):");
        short longContras = entrada.nextShort();
        
        Password contraseñas [] = new Password [numContras];
        boolean sonFuertes [] = new boolean [numContras];
        
        for (int i = 0; i < numContras; i++) {
            contraseñas[i] = new Password(longContras);
            sonFuertes[i] = contraseñas[i].esFuerte();
            
            System.out.println(contraseñas[i].getContraseña() + " " + (sonFuertes[i] ? "Fuerte":"Debil"));
        }
       
        
    }

}
