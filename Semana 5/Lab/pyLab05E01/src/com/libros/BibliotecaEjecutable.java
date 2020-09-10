package com.libros;

import com.libros.dominio.Biblioteca;
import com.libros.dominio.Libro;
import com.libros.dominio.Publicacion;
import com.libros.dominio.Revista;
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
            System.out.println("Indique el tamaño de la biblioteca (>0)");
            cant = entrada.nextInt();
        } while (cant <= 0);

        // Crear un objeto biblioteca
        Biblioteca miBiblioteca = new Biblioteca(cant);

        // Cargar libros
        int cantPub;
        do {
            System.out.println("Cuantos libros desea cargar? (>0 y <="
                    + cant + "):");
            cantPub = entrada.nextInt();
        } while (cantPub < 1 && cantPub > cant);

        short aux;
        String formato = "%" + (int) (Math.log10(cantPub) + 1) + "d";
        for (int i = 0; i < cantPub; i++) {
            System.out.println("Publicación " + String.format(formato, i + 1) + ":");
            do {
                System.out.println("Qué va a cargar?\n"
                        + "1 - Libro\n"
                        + "2 - Revista");
                aux = entrada.nextShort();
            } while (aux < 1 && aux > 2);

            switch (aux) {
                case 1:
                    miBiblioteca.agregarPublicacion(cargarLibro(entrada, lector));
                    break;
                case 2:
                    miBiblioteca.agregarPublicacion(cargarRevista(entrada, lector));
                    break;
            }
        }

        System.out.println(miBiblioteca);

        System.out.println("Intrese el título a buscar:");
        String tituloBuscado = lector.nextLine();
        System.out.println(miBiblioteca.buscarPublicacion(tituloBuscado));

    }

    public static String calcPaginas(Publicacion pub1, Publicacion pub2) {
        if (pub1.getNumPag() > pub2.getNumPag()) {
            return "'" + pub1.getTitulo() + "' tiene más páginas que '"
                    + pub2.getTitulo() + "'.";
        } else if (pub1.getNumPag() < pub2.getNumPag()) {
            return "'" + pub2.getTitulo() + "' tiene más páginas que '"
                    + pub1.getTitulo() + "'.";
        } else {
            return "Ambas publicaciones tienen la misma cantidad de páginas.";
        }

    }

    public static Revista cargarRevista(Scanner entrada, Scanner lector) {
        System.out.println("Introduzca el título de la revista:");
        String titulo = lector.nextLine();

        System.out.println("Introduzca el código de la revista:");
        int codigo = entrada.nextInt();

        System.out.println("Introduzca el número de páginas de la revista:");
        int numPag = entrada.nextInt();

        return new Revista(codigo, titulo, numPag);
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
