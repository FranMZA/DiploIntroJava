package com.libros.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Libro extends Publicacion {

    // Atributos
    private String autor;
    private String isbn;

    // Constructores
    /**
     * Constructor de objeto Libro Parámetros por defecto: titulo: "Desconocido"
     * autor: "Desconocido" isbn: "Sin ISBN" numPag: 0
     */
    public Libro() {
        super();
        autor = "Desconocido";
        isbn = "Sin ISBN";
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
        super(titulo, numPag);
        this.autor = autor;
        this.isbn = ISBN;
    }

    // getters y setters
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

    // Métodos
    @Override
    public String toString() {
        // return "El libro con" + isbn + "creado por '"+ autor + "' tiene 'n' páginas";
        return "El libro '" + this.getTitulo()
                + "' con ISBN " + isbn
                + " creado por '" + autor
                + "' tiene " + this.getNumPag() + " páginas.";
    }
}
