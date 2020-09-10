/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.multas.gui;

import javax.swing.JFrame;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Ventana extends JFrame {

    public Ventana(String titulo, int alto, int ancho) {
        setTitle(titulo);
        setSize(alto, ancho);
    }
}
