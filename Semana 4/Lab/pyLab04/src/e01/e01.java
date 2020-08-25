/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e01;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */
public class e01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar un programa Java que genere por teclado 100 números enteros
        y los guarde en un arreglo unidimensional. A continuación calcula y 
        muestra por separado la media de los valores positivos y la de los 
        valores negativos. 
         */

        Scanner entrada = new Scanner(System.in);

        // Variables
        int loteNum[] = new int[10];
        int sumaPos, sumaNeg;
        int contPos, contNeg;
        sumaPos = sumaNeg = contPos = contNeg = 0;
        float mediaPos, mediaNeg;

        // Entrada
        System.out.println("Ingrese el lote de numeros a cargar (se deben cargar " + loteNum.length + " números)");
        for (int i = 0; i < loteNum.length; i++) {
            System.out.println("Indice: " + i);
            loteNum[i] = entrada.nextInt();
        }

        // Proceso
        for (int i = 0; i < loteNum.length; i++) {
            if (loteNum[i] == 0) {
                continue;
            }

            if (loteNum[i] > 0) {
                sumaPos += loteNum[i];
                contPos++;
            } else {
                sumaNeg += loteNum[i];
                contNeg++;
            }
        }
        if (contPos > 0) {
            mediaPos = (float) sumaPos / contPos;
        } else {
            mediaPos = 0;
        }

        if (contNeg > 0) {
            mediaNeg = (float) sumaNeg / contNeg;
        } else {
            mediaNeg = 0;
        }

        System.out.println("La media de los valores positivos es: " + mediaPos);
        System.out.println("Se encontraron " + contPos + " números positivos.");
        System.out.println("La media de los valores negativos es: " + mediaNeg);
        System.out.println("Se encontraron " + contNeg + " números negativos.");

    }

//    public static void vector_lector(int[] myVector) {
//        for (int i = 0; i < myVector.length; i++) {
//            if (i == (myVector.length - 1)) {
//                System.out.print(myVector[i]);
//            } else {
//                System.out.print(myVector[i] + ", ");
//            }
//        }
}
