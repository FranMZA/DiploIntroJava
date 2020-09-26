package com.convertidor.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Convertidor {
    private final float tasaPesoDolar;
    private final float tasaPesoEuro;

    public Convertidor(float tasaPesoDolar, float tasaPesoEuro) {
        this.tasaPesoDolar = tasaPesoDolar;
        this.tasaPesoEuro = tasaPesoEuro;
    }

    public float getTasaPesoDolar() {
        return tasaPesoDolar;
    }

    public float getTasaPesoEuro() {
        return tasaPesoEuro;
    }
    
    public float convertirPesoDolar(float peso) {
        return Math.round(peso * tasaPesoDolar * 100) / 100;
    }
    
    public float convertirPesoEuro(float peso) {
        return Math.round(peso * tasaPesoEuro * 100) / 100;
    }
}
