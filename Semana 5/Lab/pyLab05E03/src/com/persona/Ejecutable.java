/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persona;

import com.persona.dominio.Persona;
import java.util.Scanner;

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
        Adicionalmente crear una clase Ejecutable que haga lo siguiente:  
           Pide por teclado el nombre, la edad, sexo, peso y altura.  
           Crea 3 objetos de la clase anterior, el primer objeto obtendrá 
            las anteriores variables pedidas por teclado, el segundo objeto 
            obtendrá todos los anteriores menos el peso y la altura y el último 
            por defecto, para este último utiliza los métodos set para darle a 
            los atributos un valor.  
           Para cada objeto, deberá comprobar si está en su peso ideal, 
            tiene sobrepeso o por debajo de su peso ideal con un mensaje.  
           Indicar para cada objeto si es mayor de edad.
           Por último, mostrar la información de cada objeto.  
 
         */
        Scanner entrada = new Scanner(System.in);
        Scanner lector = new Scanner(System.in);

        System.out.println("Introducir nombre:");
        String nombre = lector.nextLine();
        System.out.println("Introducir la edad:");
        int edad = entrada.nextInt();
        System.out.println("Introducir sexo (M o H):");
        char sexo = lector.next().charAt(0);
        System.out.println("Introduzca el peso");
        float peso = entrada.nextFloat();
        System.out.println("Introduzca la altura:");
        float altura = entrada.nextFloat();

        Persona personaCompleto = new Persona(nombre, edad, sexo, altura, peso);
        Persona personaSemiCompleto = new Persona(nombre, edad, sexo);
        Persona personaPorDefecto = new Persona();
        personaPorDefecto.setNombre("Juan de los Palotes");
        personaPorDefecto.setEdad(84);
        personaPorDefecto.setSexo("Mujer".charAt(0));
        personaPorDefecto.setAltura(2.10f);
        personaPorDefecto.setPeso(420.69f);

        Persona listaPersonas[] = new Persona[3];
        listaPersonas[0] = personaCompleto;
        listaPersonas[1] = personaSemiCompleto;
        listaPersonas[2] = personaPorDefecto;
        
        for (int i = 0; i < listaPersonas.length; i++) {
            mostrarCalculoIMC(listaPersonas[i]);
            mostrarEsMayor(listaPersonas[i]);
            System.out.println(listaPersonas[i]);
        }

    }

    public static void mostrarCalculoIMC(Persona persona) {
        int aux = persona.calcularIMC();
        switch (aux) {
            case -1: {
                System.out.println(persona.getNombre()
                        + " está por debajo de su peso ideal");
                break;
            }
            case 0: {
                System.out.println(persona.getNombre()
                        + " está en su peso ideal.");
                break;
            }
            case 1: {
                System.out.println(persona.getNombre()
                        + " está por encima de su peso ideal.");
                break;
            }
            default:
                throw new AssertionError();
        }
    }

    public static void mostrarEsMayor(Persona persona) {
        if (persona.esMayorEdad()) {
            System.out.println(persona.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona.getNombre() + " NO es mayor de edad.");
        }
    }

}
