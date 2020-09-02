/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automovil;

import com.automovil.dominio.Automovil;
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
        Scanner entrada = new Scanner(System.in);
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        float memoria;

        // Crear auto
        Automovil miAuto = crearAuto(entrada, opcion);

        // Menú
        System.out.println("--------------------");
        System.out.println("MENU");
        do {
            System.out.println("1 - Conducir \n"
                    + "2 - Cargar combustible\n"
                    + "3 - Chequear nivel de combustible\n"
                    + "4 - Información del vehículo\n"
                    + "\n0 - Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Cuántos km desea recorrer?");
                    memoria = validarEntrada(entrada.nextFloat());
                    if (miAuto.conducir(memoria)) {
                        System.out.println("Es posible recorrer esa distancia."
                                + "\nSe recorrieron "
                                + numToString(memoria) + " km");
                    } else {
                        System.out.println("No es posible recorrer esa distancia.");
                    }
                    System.out.println(miAuto.chequearCombustible());
                    break;
                }
                case 2: {
                    System.out.println("Cuánto combustible desea cargar? (L):");
                    memoria = validarEntrada(entrada.nextFloat());
                    System.out.println(miAuto.cargarCombustible(memoria));
                    break;
                }
                case 3: {
                    System.out.println(miAuto.chequearCombustible());
                    break;
                }
                case 4: {
                    System.out.println(miAuto);
                    break;
                }
                case 0: {
                    System.out.println("Adiós!");
                    break;
                }
                default: {
                    System.out.println("Opción no válida!");
                }
            }
            System.out.println("Presione 'Enter' para continuar.");
            lector.nextLine();
        } while (opcion != 0);

    }

    public static Automovil crearAuto(Scanner entrada, int opcion) {
        System.out.println("--------------------");
        System.out.println("CREAR AUTO");
        Automovil miAuto = null;
        do {
            System.out.println("1 - Auto por defecto\n"
                    + "2 - Modificar eficiencia\n"
                    + "3 - Modificar eficiencia y capacidad del tanque\n");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    miAuto = new Automovil();
                    break;
                case 2:
                    System.out.println("Introduzca eficiencia (km/L):");
                    miAuto = new Automovil(entrada.nextFloat());
                    break;
                case 3:
                    System.out.println("Introduzca eficiencia (km/L) "
                            + "y capacidad del tanque (L):");
                    miAuto = new Automovil(entrada.nextFloat(), entrada.nextFloat());
                    break;
                default:
                    System.out.println("Opción no válida!");
            }
        } while (opcion < 1 || opcion > 3);
        return miAuto;
    }

    public static float validarEntrada(float numero) {
        return numero > 0 ? numero : 0;
    }

    private static String numToString(float num) {
        return String.format("%.2f", num);
    }
}
