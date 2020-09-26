package com.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public abstract class Carga implements Comparable<Carga> {

    private final String contenido;

    public Carga(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public abstract float calcularPeso();

    @Override
    public String toString() {
        return "Carga con:{ contenido: " + contenido;
    }

    @Override
    public int compareTo(Carga other) {
        int criterio = 0;

        if (this.calcularPeso() > other.calcularPeso()) {
            criterio = 1;
        } else if (this.calcularPeso() < other.calcularPeso()) {
            criterio = -1;
        }

        return criterio;
        // return (int) (this.calcularPeso() - other.calcularPeso());
    }
}
