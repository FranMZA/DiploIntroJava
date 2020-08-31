/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.password.dominio;

import java.util.Random;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Password {

    /*
    Desarrollar una clase llamada Password que siga las siguientes 
        condiciones:  
           Que tenga los atributos longitud y contraseña. Por defecto, la 
            longitud sera de 8.  
           Los constructores serán los siguiente:  
               Un constructor por defecto.  
               Un constructor con la longitud que nosotros le pasemos. 
                Generará una contraseña aleatoria con esa longitud.  
           Los métodos que implementa serán:  
               esFuerte(): devuelve un booleano si es fuerte o no, para que 
                sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y 
                mas de 5 números.  
               generarPassword(): genera la contraseña del objeto con la 
                longitud que tenga.  
               Método get para contraseña y longitud.  
               Método set para longitud.  
     */
    // Atributos
    private short longitud;
    private String contraseña;

    // Constructores
    public Password() {
        longitud = 8;
        contraseña = generarContraseña();
    }

    public Password(short longitud) {
        this.longitud = longitud;
        contraseña = generarContraseña();
    }

    // getters y setters
    public short getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(short longitud) {
        this.longitud = longitud;
    }

    // Métodos
    public boolean esFuerte() {
        int aux;
        int contMayus, contMinus, contNum;
        contMayus = contMinus = contNum = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            aux = contraseña.charAt(i);
            contMayus += (aux >= 65 && aux <= 90) ? 1 : 0;
            contMinus += (aux >= 97 && aux <= 122) ? 1 : 0;
            contNum += (aux >= 48 && aux <= 57) ? 1 : 0;
        }
        return (contMayus > 2 && contMinus > 1 && contNum > 5);
    }
    
    @Override
    public String toString(){
        return "longitud:" + longitud + "\ncontraseña:" + contraseña;
    }

    // Métodos de clase
    private String generarContraseña() {
        Random rnd = new Random();
        short aux;
        String password = "";
        for (int i = 0; i < longitud; i++) {
            aux = (short) rnd.nextInt(3);
            switch (aux) {
                case 0: {
                    // añadir numero (ASCII [48; 57])
                    password += (char) (48 + rnd.nextInt(10));
                    break;
                }
                case 1: {
                    // añadir letra minuscula (ASCII [97; 122])
                    password += (char) (97 + rnd.nextInt(26));
                    break;
                }
                case 2: {
                    // añadir letra mayuscula (ASCII [65; 90])
                    password += (char) (65 + rnd.nextInt(26));
                    break;
                }
            }
        }
        return password;
    }

}
