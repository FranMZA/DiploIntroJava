/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libros;

import com.libros.dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner lector = new Scanner(System.in);
        int cantLibros;
        
        System.out.println("Ingrese la cantidad de libros de la biblioteca:");
        do {            
            cantLibros = entrada.nextInt();
        } while (cantLibros <= 0);
        
        
        
        Libro biblioteca []= new Libro[cantLibros];
        
        for (int i = 0; i < biblioteca.length; i++) {
            biblioteca[i] = cargarLibro(entrada, lector);
        }
        
        mostrarBiblioteca(biblioteca);
        
    }
    
    public static Libro cargarLibro(Scanner entrada, Scanner lector){
        System.out.println("Introduzca el título del libro:");
        String titulo = lector.nextLine();
        
        System.out.println("Introduzca el autor del libro:");
        String autor = lector.nextLine();
        
        System.out.println("Introduzca el ISBN del libro:");
        String ISBN = lector.nextLine();
        
        System.out.println("Introduzca la cantidad de páginas:");
        int numPag = entrada.nextInt();
        
        return new Libro(titulo, autor, ISBN, numPag);
    }
    
    public static void mostrarBiblioteca(Libro biblio[]){
        String aux = "%" + (int) (Math.log10(biblio.length) + 1) + "d";
        for (int i = 0; i < biblio.length; i++) {
            System.out.println("Libro " + String.format(aux, (i + 1)) + ":" + biblio[i]);
        }
    }
}
