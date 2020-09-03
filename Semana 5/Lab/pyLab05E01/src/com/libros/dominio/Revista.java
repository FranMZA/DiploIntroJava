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
public class Revista extends Publicacion {

    private int codigo;

    public Revista() {
        super();
        this.codigo = 0;
    }

    public Revista(int codigo, String titulo, int numPaginas) {
        super(titulo, numPaginas);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Revista: " + super.toString() + " Código:";
    }
}
