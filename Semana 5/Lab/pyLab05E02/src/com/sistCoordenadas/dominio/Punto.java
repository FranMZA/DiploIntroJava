/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistCoordenadas.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Punto {

    // Atributos
    private float x;
    private float y;

    // Constructores
    /**
     * Crea un punto en el plano en coordenadas cartesianas. Por defecto, se
     * genera el punto (0;0)
     */
    public Punto() {
        x = 0;
        y = 0;
    }

    /**
     * Crea un punto en el plano en coordenadas cartesianas.
     *
     * @param x float, coordenada en el eje x
     * @param y float, coordenada en el eje y
     */
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // getters y setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Métodos
    /**
     * Calcula la distancia del punto (x;y) al origen de coordenadas. Utiliza el
     * módulo Math.
     *
     * @return float, distancia al origen de coordenadas.
     */
    public float distAlOrigen() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Devuelve el cuadrante en el que se encuentra el punto.
     *
     * @return short, entre [0; 4]. Devuelte el número del cuadrante al que
     * pertenece el punto. Si se encuentra sobre un eje devuelve 0.
     */
    public short cuadrante() {
        if (x == 0 || y == 0) {
            return 0;
        } else {
            if (x > 0) {
                if (y > 0) {
                    return 1;
                } else {
                    return 4;
                }
            } else {
                if (y > 0) {
                    return 2;
                } else {
                    return 3;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

}
