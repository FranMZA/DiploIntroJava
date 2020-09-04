package com.libros.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Publicacion {

    private String titulo;
    private int numPag;

    public Publicacion() {
        titulo = "Desconocido";
        numPag = 0;
    }

    public Publicacion(String titulo, int numPaginas) {
        this.titulo = titulo;
        this.numPag = validarPaginas(numPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    

    @Override
    public String toString() {
        return "Título: " + titulo + " con " + numPag + " páginas.";
    }

    private int validarPaginas(int numPag) {
        return numPag > 0 ? numPag : 1;
    }

}
