/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multas.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Libreta {

    private Multa multas[];
    private int ultimo;

    public Libreta() {
        multas = new Multa[20];
        ultimo = 0;
    }

    public Libreta(int cantMultas) {
        cantMultas = cantMultas > 1 ? cantMultas : -cantMultas;
        multas = new Multa[cantMultas];
        ultimo = 0;
    }

    public boolean cargarMulta(Multa multa) {
        boolean aux = false;
        if (ultimo <= multas.length) {
            multas[ultimo] = multa;
            ultimo++;
            aux = true;
        }
        return aux;
    }

    public float calcularRecaudacion() {
        float aux = 0;

        for (Multa multa : multas) {
            if (multa != null) {
                aux += multa.calcularMonto();
            }
        }

        return aux;
    }

    public int[] contarCodigos() {
        int[] codigos = new int[20];
        int aux;
        for (Multa multa : multas) {
            aux = multa.getCodigo() - 1;
            codigos[aux]++;
        }
        return codigos;
    }

    public String codigoMasComun() {
        int may, cod;
        int conteo[] = this.contarCodigos();
        may = conteo[0];
        cod = 1;
        for (int i = 1; i < conteo.length; i++) {
            if (conteo[i] > may) {
                may = conteo[i];
                cod = i + 1;
            }

        }
        return "Código más frecuente: " + cod
                + ", con: " + may + " actas labradas.";

    }

}
