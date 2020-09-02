/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automovil.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Tanque {

    // Atributos
    private float carga;
    private final float capacidadTotal;
    private final float reserva;
    private final float CAPACIDAD_TANQUE = 49;
    private final float RESERVA_TANQUE = 5;

    // Constructores
    public Tanque() {
        carga = 0;
        reserva = RESERVA_TANQUE;
        capacidadTotal = CAPACIDAD_TANQUE + reserva;
    }

    public Tanque(float capacidad) {
        carga = 0;
        reserva = RESERVA_TANQUE;
        this.capacidadTotal = capacidad + reserva;
    }

    public Tanque(float carga, float capacidad) {
        this.carga = carga;
        this.reserva = RESERVA_TANQUE;
        this.capacidadTotal = capacidad + reserva;
    }

    public Tanque(float carga, float capacidad, float reserva) {
        this.carga = carga;
        this.reserva = reserva;
        this.capacidadTotal = capacidad + reserva;
    }

    // getters
    public float getCarga() {
        return carga;
    }

    public float getCapacidadTotal() {
        return capacidadTotal;
    }

    public float getReserva() {
        return reserva;
    }

    // metodos
    public float cargarCombustible(float combustible) {
        if ((carga + combustible) > capacidadTotal) {
            float aux = carga;
            carga = capacidadTotal;
            return (aux + combustible) - capacidadTotal;
        } else {
            carga += combustible;
            return 0;
        }
    }

    public void consumirCombustible(float combustible) {
        this.carga -= combustible <= carga ? combustible : carga;
    }
    
}
