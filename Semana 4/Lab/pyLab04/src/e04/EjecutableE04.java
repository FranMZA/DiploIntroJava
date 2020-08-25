/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class EjecutableE04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Se necesita desarrollar un programa Java que permita procesar las n 
        multas de tránsito labradas el último fin de semana en las rutas de la 
        provincia. Para ello se pide cargar un arreglo con los n códigos de 
        infracción, valores comprendidos en [1:20], junto con los n importes 
        en pesos en otro arreglo. 
        Con los datos cargados en los arreglos se pide:  
               Determinar el monto total recaudado el último fin de semana 
               Determinar para cada código de infracción la cantidad de actas 
                labradas (mostrar solo aquellos códigos que fueron labrados, 
                es decir que aparecieron en al menos un acta) 
               Informar el código de infracción que más se presentó durante 
                el fin de semana. 
         */
        Scanner entrada = new Scanner(System.in);
        // Variables
        int numMultas;
        short codigoInfraccion[];
        float valorInfraccion[];
        float montoTotal = 0;
        int conteoCodigos[] = new int[20];
        short codigoMasLabrado = -1;
        int memoriaMasLabrado = -1;

        // Entrada
        do {
            System.out.println("Cuántas multas desea cargar?");
            numMultas = entrada.nextInt();
        } while (numMultas <= 0);
        codigoInfraccion = new short[numMultas];
        valorInfraccion = new float[numMultas];

        for (int i = 0; i < numMultas; i++) {
//            do {
//                System.out.println("Ingrese el código de la infracción " + (i + 1) + ":");
//                codigoInfraccion[i] = entrada.nextShort();
//            } while (codigoInfraccion[i] <= 0 || codigoInfraccion[i] > 20);

            System.out.println("Ingrese el código de la infracción " + (i + 1) + ":");
            codigoInfraccion[i] = (short) randInt(1, 20);
            System.out.println(codigoInfraccion[i]);

            System.out.println("Ingrese el monto de la infracción " + (i + 1) + ":");
            valorInfraccion[i] = entrada.nextFloat();
            valorInfraccion[i] = valorInfraccion[i] > 0 ? valorInfraccion[i] : -valorInfraccion[i];

            montoTotal += valorInfraccion[i];
        }

        // Proceso
        /*
        CODIGO PROFE
        //Declarar vector auxiliar de conteo
        int conteo[] = new int[20]; // 20 componentes, 1 por cada código de infracción
        
        //Recorrer el vector de códigos y contar cantidad de ocurrencias de cada
        //código de infracción labrado:
        for (int i = 0; i < n; i++) {
            //Para contar utilizar la técnica de acceso directo:
            conteo[codigos[i]-1]++; // Si codigo[i] es igual 4 contamos 1 unidad
                                    // en la posición 4-1=3 del vector de conteo.
        }
         */
        for (int i = 0; i < conteoCodigos.length; i++) {
            conteoCodigos[i] = 0;
            for (int j = 0; j < codigoInfraccion.length; j++) {
                if (codigoInfraccion[j] == (i + 1)) {
                    conteoCodigos[i]++;
                }
            }
            if (conteoCodigos[i] > memoriaMasLabrado) {
                memoriaMasLabrado = conteoCodigos[i];
                codigoMasLabrado = (short) (i + 1);
            }
        }

        // Salida   
        System.out.println("--------------------");
        System.out.println("RESULTADOS");
        System.out.println("Se recaudaron $ " + montoTotal + " en multas el último fin de semana.");
        System.out.println("");
        System.out.println("Se realizaron " + numMultas + " en total:");
        for (int i = 0; i < conteoCodigos.length; i++) {
            if (conteoCodigos[i] > 0) {
                System.out.print("Multas con código ");
                System.out.print(String.format("%2d", (i + 1)) + ":  ");
                System.out.println(conteoCodigos[i]);
            }
        }
        System.out.println("");
        System.out.println("El código de infracción más común fue: " + codigoMasLabrado);

    }

    public static int randInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

    }
}
