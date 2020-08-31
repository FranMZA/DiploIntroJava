/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libros;

import com.libros.dominio.Biblioteca;
import com.libros.dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class BibliotecaEjecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner lector = new Scanner(System.in);

        // Definir tamaño biblioteca
        int cant;
        do {
            System.out.println("Indique el tamaño de la biblioteca (>1)");
            cant = entrada.nextInt();
        } while (cant <= 1);

        // Crear un objeto biblioteca
        Biblioteca miBiblioteca = new Biblioteca(cant);

        // Cargar libros
        int cantLibros;
        do {
            System.out.println("Cuantos libros desea cargar? (>0 y <="
                    + cant + "):");
            cantLibros = entrada.nextInt();
        } while (cantLibros < 1 && cantLibros > cant);

        String aux = "%" + (int) (Math.log10(cantLibros) + 1) + "d";
        for (int i = 0; i < cantLibros; i++) {
            System.out.println("Libro " + String.format(aux, i) + ":");
            miBiblioteca.agregarLibro(cargarLibro(entrada, lector));
        }

        System.out.println(miBiblioteca);

//        Libro miLibro = new Libro("Sueño de una noche de verano", "William Shakespeare", "102987639", 451);
//        Libro otroLibro = new Libro("Las mil y una noches", "Anónimo", "297846298", 390);
//        Libro ejemplo = new Libro();
//        System.out.println(miLibro);
//        System.out.println(otroLibro);
//
//        System.out.println(calcPaginas(miLibro, otroLibro));
    }

    public static String calcPaginas(Libro libro1, Libro libro2) {
        if (libro1.getNumPag() > libro2.getNumPag()) {
            return "'" + libro1.getTitulo() + "' tiene más páginas que '"
                    + libro2.getTitulo() + "'.";
        } else if (libro1.getNumPag() < libro2.getNumPag()) {
            return "'" + libro2.getTitulo() + "' tiene más páginas que '"
                    + libro1.getTitulo() + "'.";
        } else {
            return "Ambos libros tienen la misma cantidad de páginas.";
        }

    }

    public static Libro cargarLibro(Scanner entrada, Scanner lector) {
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

    public static void mostrarBiblioteca(Libro biblio[]) {
        String aux = "%" + (int) (Math.log10(biblio.length) + 1) + "d";
        for (int i = 0; i < biblio.length; i++) {
            System.out.println("Libro " + String.format(aux, (i + 1)) + ":" + biblio[i]);
        }
    }
}
