package com.login;

import com.login.gui.JFVentanaLogin;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Ejecutable {

    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            new JFVentanaLogin().setVisible(true);
        } catch (Exception e) {
            System.out.println("No se pudo conectar a derby.");
        }
        
    }
    
}
