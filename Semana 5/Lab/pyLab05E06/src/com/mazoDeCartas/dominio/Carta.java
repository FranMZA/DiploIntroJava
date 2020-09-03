package com.mazoDeCartas.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Carta {

    // TODO: Refactorear para crear carta comodín
    private final int valor;
    private final String palo;

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;

    }

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return this.valor + " de " + this.palo + ".";
    }
}
