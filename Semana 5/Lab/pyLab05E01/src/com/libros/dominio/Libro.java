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
public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int numPag;

    // Constructores
    /**
     * Constructor de objeto Libro Parámetros por defecto: titulo: "Desconocido"
     * autor: "Desconocido" isbn: "Sin ISBN" numPag: 0
     */
    public Libro() {
        titulo = autor = "Desconocido";
        isbn = "Sin ISBN";
        numPag = 0;
    }

    /**
     * Constructor de objeto Libro
     *
     * @param titulo String, título del libro
     * @param autor String, autor del libro
     * @param ISBN String, isbn del libro
     * @param numPag int, número de paginas del libro
     */
    public Libro(String titulo, String autor, String ISBN, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = ISBN;
        this.numPag = numPag > 0 ? numPag : 0;
    }

    // getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    // Métodos
    @Override
    public String toString() {
        // return "El libro con" + isbn + "creado por '"+ autor + "' tiene 'n' páginas";
        return "El libro '" + titulo
                + "' con ISBN " + isbn
                + " creado por '" + autor
                + "' tiene " + numPag + " páginas.";
    }

}
