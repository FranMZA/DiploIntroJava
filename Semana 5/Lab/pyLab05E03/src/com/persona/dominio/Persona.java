/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persona.dominio;

import java.util.Random;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Persona {

    /*
    Desarrollar una clase java llamada Persona que siga las siguientes 
    condiciones:  
       Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), 
        peso y altura. No queremos que se accedan directamente a ellos. Por 
        defecto, todos los atributos menos el DNI serán valores según su tipo 
        (0 números, cadena vacía para String, etc.). Sexo será hombre por 
        defecto, usa una constante para ello.  
       Se implantaran varios constructores:  
         Un constructor por defecto. 
         Un constructor con el nombre, edad y sexo, el resto por defecto. 
         Un constructor con todos los atributos como parámetro.  
       Los métodos que se implementaran son:  
         calcularIMC(): calculara si la persona está en su peso ideal 
            (peso en kg/(altura^2 en m)), si esta fórmula 
            devuelve un valor menor que 20, la función devuelve un -1, 
            si devuelve un número entre 20 y 25 (incluidos), significa que esta 
            por debajo de su peso ideal la función devuelve un 0 y si devuelve 
            un valor mayor que 25 significa que tiene sobrepeso, la función 
            devuelve un 1. Te recomiendo que uses constantes para 
            devolver estos valores.  
         esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.  
         comprobarSexo(char sexo): comprueba que el sexo introducido es 
            correcto. Si no es correcto, sera H. No sera visible al exterior.  
         toString(): devuelve toda la información del objeto.  
         generaDNI(): genera un número aleatorio de 8 cifras, genera a 
            partir de este su número su letra correspondiente. Este método 
            sera invocado cuando se construya el objeto. Puedes dividir el 
            método para que te sea más fácil. No será visible al exterior.  
         Métodos set de cada parámetro, excepto de DNI.  
 
     */
    // Atributos
    private int DNI;
    private String nombre;
    private int edad;
    private char sexo;
    private float altura;
    private float peso;
    private final char SEXO = 'H';  // constante sexo default

    // Constructores
    public Persona() {
        nombre = "";
        edad = 0;
        sexo = SEXO;
        altura = peso = 0;
        DNI = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        altura = peso = 0;
        DNI = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, float altura, float peso) {
        this.DNI = generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.altura = altura;
        this.peso = peso;
    }

    // getters y setters
    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // Métodos
    public int calcularIMC() {
        int aux = -1;
        float imc = peso / (altura * altura);
        if (imc >= 20 && imc <= 25) {
            aux = 0;
        } else {
            if (imc > 25) {
                aux = 1;
            }
        }
        return aux;
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + "| Edad:" + edad + "años| Sexo:" + sexo
                + "| Altura:" + altura + "| Peso:" + peso;
    }

    // Metodos de clase
    private char comprobarSexo(char sexo) {
        return (sexo == 'M' || sexo == 'm') ? 'M' : SEXO;
    }

    private int generarDNI() {
        return randIntRange(1, 99999999);
    }

    private static int randIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
