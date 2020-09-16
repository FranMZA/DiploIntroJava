package com.multas;

import com.multas.dominio.Libreta;
import com.multas.dominio.Multa;
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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;

        // validar número de multas a cargar
        do {
            System.out.println("Cuántas multas desea cargar?");
            num = entrada.nextInt();
        } while (num <= 0);

        Libreta misMultas = new Libreta();

        // cargar multas
        int cod, acta;
        float monto;
        Multa multa;
        for (int i = 0; i < num; i++) {
            System.out.println("Multa número " + (i + 1) + ":");
            do {
                System.out.println("Ingrese el código de la multa:");
                cod = entrada.nextInt();
            } while (cod < 1 || cod > 20);

            System.out.println("Ingrese el monto de la multa:");
            monto = entrada.nextFloat();
            monto = monto > 0 ? monto : -monto;

            System.out.println("Ingrese el número de acta:");
            acta = entrada.nextInt();

            multa = new Multa(cod, monto, acta);
            misMultas.cargarMulta(multa);
            System.out.println("--------------------");
        }

        // salida
        System.out.println("SALIDA");
        
        // calcular recaudación
        System.out.println("--------------------");
        System.out.println("La recaudación fue de: "
                + misMultas.calcularRecaudacion() + " $");

        // código más labrado
        System.out.println("--------------------");
        System.out.println(misMultas.codigoMasComun());
        
        // conteo por coódigo
        System.out.println("--------------------");
        int conteo[] = misMultas.contarCodigos();
        
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                System.out.println("Código número " + (i+1) 
                        + ": " + conteo[i] + " multas labradas.");
            }
        }
    }

}
