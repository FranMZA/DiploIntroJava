/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multas.dominio;

import java.util.ArrayList;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Libreta {

    private ArrayList<Multa> multas;
    // private Multa multas[];

    public Libreta() {
        multas = new ArrayList<Multa>();  // lista vacía de obj Multa
    }

    public boolean cargarMulta(Multa multa) {
//        boolean aux = false;
//        if (ultimo <= multas.length) {
//            multas[ultimo] = multa;
//            ultimo++;
//            aux = true;
//        }
//        return aux;
        if (multas.contains(multa)) {
            return false;
        }  // no funciona!!!

        return multas.add(multa);
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

    public String mostrarMultas() {
        StringBuilder aux = new StringBuilder("");
        for (Multa multa : multas) {
            if (multa != null) {
                aux.append(multa.toString()).append("\n");
            }
        }

        if (aux.toString().equals("")) {
            aux.append("No hay multas cargadas.");
        }

        return aux.toString();
    }

}
