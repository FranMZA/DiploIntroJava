package com.libros.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Revista extends Publicacion {

    private int codigo;

    /**
     * Constructor por defecto de instancias de la clase revista. Valores por
     * defecto: titulo Desconocido, numPag 0, codigo 0
     */
    public Revista() {
        super();
        this.codigo = 0;
    }

    /**
     * Constructor de instancias de la clase revista.
     *
     * @param codigo int, código de la revista
     * @param titulo String, título de la revista
     * @param numPag in, cantidad de páginas de la revista
     */
    public Revista(int codigo, String titulo, int numPag) {
        super(titulo, numPag);
        this.codigo = validarCodigo(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = validarCodigo(codigo);
    }

    @Override
    public String toString() {
        return "Revista: " + super.toString() + " Código:" + codigo;
    }

    private int validarCodigo(int codigo) {
        return codigo > 0 ? codigo : -codigo;
    }
}
