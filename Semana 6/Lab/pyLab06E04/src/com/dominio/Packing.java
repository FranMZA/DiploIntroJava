package com.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Packing extends Carga {

    private final float pesoCaja;
    private final int cantCajas;
    private final float pesoEstructura;

    public Packing(float pesoCaja, int cantCajas, float pesoEstructura,
            String contenido) {
        super(contenido);
        this.pesoCaja = pesoCaja;
        this.cantCajas = cantCajas;
        this.pesoEstructura = pesoEstructura;
    }

    @Override
    public float calcularPeso() {
        float aux = pesoCaja * cantCajas + pesoEstructura;
        return aux;
    }

    @Override
    public String toString() {
        return super.toString() + ", peso caja: " + pesoCaja
                + ", cantidad cajas: " + cantCajas
                + ", peso estructura: " + pesoEstructura + '}';
    }

}
