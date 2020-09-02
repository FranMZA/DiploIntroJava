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
public class Automovil {

    /*
        Realizar un programa que permita modelar el funcionamiento básico de un 
        automóvil, tal como se indica a continuación:  
           conducir: esta opción debe recibir la cantidad de kilómetros a 
            recorrer e informar si pueden ser recorridos y en tal caso 
            descontar el combustible utilizado del tanque (se conoce que, 
            por especificaciones técnicas del vehículo, con un litro recorre 
            11 km). Caso contrario informar que no hay combustible suficiente 
            para el recorrido indicado. 
           cargar combustible: está opción debe reponer combustible en el 
            tanque tantos litros como se reciban como argumento pero teniendo 
            en cuenta que el tanque tiene una capacidad de 49 lts más una 
            reserva de 5 lts., en el caso de que los litros informados superen 
            la capacidad del tanque, devolver la cantidad de lts de combustible 
            derramados. 
           chequear nivel de combustible: informar si el tanque está al 25%, 
            50%, 75% o lleno y dar una alerta en el caso que el tanque se 
            encuentre en reserva, indicando que hay que reponer combustible de 
            inmediato. El mensaje debe devolver una cadena con 25% ... o el 
            alerta. 
        Ayuda: para una resolución más sencilla, pensar en la existencia de dos 
        clases: Automovil y Tanque. 
     */
    // Atributos
    private final float kmPorLitro;
    private Tanque tanque;
    private float kilometraje;

    // Constructores
    public Automovil() {
        this.kmPorLitro = 11;
        this.tanque = new Tanque();
        this.kilometraje = 0;
    }

    public Automovil(float kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
        this.tanque = new Tanque();
        this.kilometraje = 0;
    }

    public Automovil(float kmPorLitro, float capacidad) {
        this.kmPorLitro = kmPorLitro;
        this.tanque = new Tanque(capacidad);
    }

    // Métodos
    public void cambiarTanque(float capacidad, float reserva) {
        this.tanque = new Tanque(0, capacidad, reserva);
    }

    public String chequearCombustible() {
        float aux = tanque.getCarga() / tanque.getCapacidadTotal();
        aux *= 100;
        float reserva = (tanque.getReserva() / tanque.getCapacidadTotal()) * 100;
        if (aux > 95) {
            return "Tanque lleno!";
        } else if (aux > 75) {
            return "Tanque al 75% de capacidad";
        } else if (aux > 50) {
            return "Tanque al 50% de capacidad";
        } else if (aux > 25) {
            return "Tanque al 25% de capacidad";
        } else {
            String mensaje = "Precaución: bajo nivel de carburante!";

            if (aux <= reserva) {
                mensaje += "\nSe está utilizando la reserva."
                        + "\nCargar combustible!"
                        + "\n";
            } else {
                mensaje += "\nCarga: " + String.format("%5.2f", aux) + "%";
            }
            return mensaje;
        }
        // return "Carga: " + String.format("%5.2f", aux) + "%";
    }

    public String cargarCombustible(float combustible) {
        float aux = tanque.cargarCombustible(validarEntrada(combustible));
        if (aux == (float) 0) {
            return "Se cargo combustible exitosamente.";
        } else {
            return "Se cargó combustible de más. Se derramaron "
                    + numToString(aux) + " litros!";
        }
    }

    public boolean conducir(float distancia) {
        distancia = validarEntrada(distancia);
        float distanciaPosible = kmPorLitro * tanque.getCarga();
        if (distancia <= distanciaPosible) {
            tanque.consumirCombustible(distancia / kmPorLitro);
            kilometraje += distancia;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Información del automóvil.\n"
                + "Combustible disponible: "
                + numToString(tanque.getCarga()) + " L\n"
                + "Capacidad total del tanque: "
                + numToString(tanque.getCapacidadTotal()) + " L\n"
                + "Reserva: " + numToString(tanque.getReserva()) + " L\n"
                + "Eficiencia del automómivl: "
                + numToString(kmPorLitro) + " km/L\n"
                + "Kilometraje: " + numToString(kilometraje) + " km";
    }

    // Métodos privados de clase
    private float validarEntrada(float entrada) {
        return entrada >= 0 ? entrada : -entrada;
    }

    private String numToString(float num) {
        return String.format("%.2f", num);
    }

}
