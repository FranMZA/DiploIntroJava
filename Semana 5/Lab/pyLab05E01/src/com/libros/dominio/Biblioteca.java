/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libros.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Biblioteca {

    private Libro[] estanteria;

    public Biblioteca() {
        estanteria = new Libro[20];
    }

    public Biblioteca(int cantLibros) {
        estanteria = new Libro[cantLibros];
    }

    public Libro[] getEstanteria() {
        return estanteria;
    }

    public boolean agregarLibro(Libro libro) {
        boolean aux = false;
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] == null) {
                estanteria[i] = libro;
                aux = true;
                break;
            }
        }
        return aux;
    }

    public boolean nuevaEstanteria(int nuevoTamaño, boolean conservarEstanteria) {
        boolean flag = false;
        Libro nuevaEstanteria[] = new Libro[nuevoTamaño];
        if (conservarEstanteria) {
            boolean aux = true;
            for (int i = 0; i < nuevaEstanteria.length && aux; i++) {
                aux = estanteria[i] != null;
                nuevaEstanteria[i] = estanteria[i];
            }
        }

        return flag;
    }

    @Override
    public String toString() {
        String aux = "Estantería:\n";
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                aux += estanteria[i].toString();
            } else {
                aux += "Lugar vacio";
            }
            if (i < (estanteria.length - 1)) {
                aux += "\n";
            }
        }
        return aux;
    }
}
