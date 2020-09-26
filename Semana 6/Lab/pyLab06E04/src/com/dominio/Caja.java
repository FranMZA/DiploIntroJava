package com.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Caja extends Carga{

    private float peso;

    public Caja(float peso, String contenido) {
        super(contenido);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    @Override
    public float calcularPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return super.toString() + ", peso: " + peso + '}';
    }
}
