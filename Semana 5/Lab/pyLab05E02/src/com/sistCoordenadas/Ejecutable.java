/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistCoordenadas;

import com.sistCoordenadas.dominio.Punto;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Se nos ha solicitado desarrollar una clase que permita modelar un 
        punto en el plano. Cada punto se representa mediante un par ordenado de 
        coordenadas cartesianas y es posible conocer: 
           cuál es su distancia al eje de coordenadas 
           el cuadrante en el que se encuentra ubicado. Para esto último 
            considerar que si el punto  tiene una de sus coordenadas con valor 
            cero, el punto se considera sobre los ejes. 
           Adicionalmente se necesita mostrar un punto como una cadena con 
            formato “(x;y)”.
           Se necesita realizar una clase Ejecutable para crear un punto, y 
            mostrar: su estado,  el cuadrante donde se ubica  y la 
            distancia al origen.
         */
        Punto miPunto = new Punto(5.6f, -4.9f);
        System.out.println("Coordenadas de mi punto: " + miPunto);

        System.out.println("Distancia al origen: " + miPunto.distAlOrigen());
        System.out.println(imprimirCuadrante(miPunto));

    }

    public static String imprimirCuadrante(Punto punto) {
        if (punto.cuadrante() == 0) {
            return "El punto " + punto + " se encuentra sobre un eje.";
        } else {
            return "El punto " + punto + " se encuentra en el cuadrante "
                    + punto.cuadrante() + ".";
        }
    }

}
