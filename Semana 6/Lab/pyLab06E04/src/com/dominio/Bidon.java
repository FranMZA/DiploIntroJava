package com.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Bidon extends Carga {

    private float capacidad;
    private float densidad;

    public Bidon(String contenido, float capacidad, float densidad) {
        super(contenido);
        this.capacidad = capacidad;
        this.densidad = densidad;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getDensidad() {
        return densidad;
    }

    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }

    @Override
    public float calcularPeso() {
        return capacidad * densidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacidad: " + capacidad
                + ", densidad: " + densidad + '}';
    }
}
