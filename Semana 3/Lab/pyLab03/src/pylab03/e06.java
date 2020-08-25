/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pylab03;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class e06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un club náutico de la costa del lago San Roque necesita calcular 
        estadísticas acerca de los barcos que tiene en la guardería. 
        Se pretende un programa que cargue uno por uno los datos de cada barco. 
        De ellos se sabe el nombre, el tipo (1 si es velero, 2 si es lancha) y
        el monto que pagan por mes de guardería. 
        
        El programa debe cargar datos de los barcos de acuerdo a una cantidad n 
        que se carga al comienzo y una vez completada la carga informar: 
        • El total anual aportado por los veleros y el total anual aportado 
            por las lanchas (2 totales). 
        • El nombre del velero que mayor cuota mensual paga de guardería y 
            el valor de su cuota mensual. 
        • El valor promedio de cuota pagada por las embarcaciones de la 
            guardería teniendo en cuenta todas las embarcaciones 
            independientemente del tipo que tengan. 
 
         */
        Scanner lectorNumerico = new Scanner(System.in);
        Scanner lectorCadena = new Scanner(System.in);
        // Variables
        int numBarcos, tipoBarco;
        float montoMensual, memoriaMontoMensual;
        float totalLanchas, totalVeleros;
        float promedioGeneral;
        totalLanchas = totalVeleros = 0;
        promedioGeneral = 0;
        String nombreBarco, memoriaBarco;
        boolean hayVelero = false;

        memoriaBarco = "-";
        memoriaMontoMensual = -1;

        // Entrada y proceso
        do {
            System.out.println("Ingrese la cantidad de barcos a cargar:");
            numBarcos = lectorNumerico.nextInt();
            if (numBarcos < 1) {
                System.out.println("No es una cantidad válida!");
            }
        } while (numBarcos <= 0);

        for (int i = 0; i < numBarcos; i++) {
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("Ingrese nombre del barco:");
            nombreBarco = lectorCadena.nextLine();

            // Validación de entrada de tipo
            do {
                System.out.println("Ingrese el tipo (1 si es velero, 2 si es lancha)");
                tipoBarco = lectorNumerico.nextInt();

                if (tipoBarco != 1 && tipoBarco != 2) {
                    System.out.println("Tipo ingresado no es válido!");
                }
            } while (tipoBarco != 1 && tipoBarco != 2);

            System.out.println("Ingrese monto mensual a pagar: ");
            montoMensual = lectorNumerico.nextFloat();
            montoMensual = montoMensual > 0 ? montoMensual : -montoMensual;

            switch (tipoBarco) {
                default: {
                }
                case 1: {  // velero
                    if (hayVelero == false) {
                        hayVelero = true;
                    }
                    totalVeleros += montoMensual;

                    if (montoMensual > memoriaMontoMensual) {
                        memoriaBarco = nombreBarco;
                        memoriaMontoMensual = montoMensual;
                    }

                    break;
                }
                case 2: {  // lancha
                    totalLanchas += montoMensual;
                }
            }

        }

        promedioGeneral += totalLanchas;
        promedioGeneral += totalVeleros;
        promedioGeneral /= (float) numBarcos;

        totalLanchas *= 12;
        totalVeleros *= 12;

        // Salida
        System.out.println("--------------------");
        System.out.println("Total anual aportado por los veleros: $ " + totalVeleros);
        System.out.println("Total anual aportado por los lanchas: $ " + totalLanchas);
        System.out.println("");
        if (hayVelero) {
            System.out.println("Velero con mayor cuota mensual: " + memoriaBarco);
            System.out.println("Monto de la cuota: $ " + memoriaMontoMensual);
            System.out.println("");
        }
        System.out.println("Monto promedio de cuota mensual general: $ " + promedioGeneral);

    }

}
