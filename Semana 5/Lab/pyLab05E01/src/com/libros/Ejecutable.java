/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libros;

import com.libros.dominio.Libro;

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
        Crear una clase Libro que contenga los siguientes atributos:  
             ISBN  
             Titulo  
             Autor  
             Número de páginas  
 
           Crear sus respectivos métodos get y set correspondientes 
            para cada atributo. 
           Crear el método toString() para mostrar la información relativa 
            al libro con el siguiente formato:  
            “El libro con ISBN creado por 'el autor' tiene 'n' páginas”
           En una clase Ejecutable (que contenga main()), crear 2 objetos 
            Libro (los valores que se quieran) y mostrarlos por pantalla. 
            Por último, indicar cuál de los 2 tiene más páginas.  
         */
        Libro miLibro = new Libro("Sueño de una noche de verano", "William Shakespeare", "102987639", 451);
        Libro otroLibro = new Libro("Las mil y una noches", "Anónimo", "297846298", 390);
        Libro ejemplo = new Libro();
        System.out.println(miLibro);
        System.out.println(otroLibro);

        System.out.println(calcPaginas(miLibro, otroLibro));

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

}
