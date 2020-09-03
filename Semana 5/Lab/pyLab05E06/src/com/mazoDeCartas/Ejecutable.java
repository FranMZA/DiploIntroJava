package com.mazoDeCartas;

import com.mazoDeCartas.dominio.Carta;
import com.mazoDeCartas.dominio.Mazo;
import java.util.Scanner;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Ejecutable {

    public static void main(String[] args) {
        /*
        Vamos a desarrollar una baraja de cartas españolas orientado a objetos.
        Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) 
        y un palo (espadas, bastos, oros y copas)  La baraja estará compuesta 
        por un conjunto de cartas, 40 exactamente.  
        
        Las operaciones que podrá realizar la baraja son:  
           barajar: cambia de posición todas las cartas aleatoriamente  
           siguienteCarta: devuelve la siguiente carta que está en la baraja, 
            cuando no haya más o se haya llegado al final, se indica al usuario 
            que no hay más cartas.  
           cartasDisponibles: indica el número de cartas que aún puede repartir  
           darCartas: dado un número de cartas que nos pidan, le devolveremos 
            ese número de cartas (piensa que puedes devolver). En caso de que 
            haya menos cartas que las pedidas, no devolveremos nada pero debemos 
            indicárselo al usuario.  
           cartasMonton: mostramos aquellas cartas que ya han salido, si no 
            ha salido ninguna indicárselo al usuario  
           mostrarBaraja: muestra todas las cartas hasta el final. Es decir, 
            si se saca una carta y luego se llama al método, este no mostrara 
            esa primera carta.
         */
        // TODO : refactorear para crear múltiples mazos y mazos de 40/48/50
        Scanner entrada = new Scanner(System.in);
        Scanner lector = new Scanner(System.in);

        Mazo mazoAzul = new Mazo("Mazo azul", true);
        int aux;
        short opcion;

        do {
            System.out.println("--------------------");
            System.out.println("1 - Siguiente carta(1 carta)\n"
                    + "2 - Dar cartas(múltiples cartas)\n"
                    + "3 - Cartas disponibles (las cartas que quedan en el mazo)\n"
                    + "4 - Cartas montón (en el pozo)\n"
                    + "5 - Mostrar baraja (lo que queda por repartir)\n"
                    + "6 - Barajar mazo\n"
                    + "0 - Salir");
            opcion = entrada.nextShort();
            switch (opcion) {
                case 1: {
                    System.out.println("Sacando carta...");
                    validador(mazoAzul.siguienteCarta());
                    break;
                }
                case 2: {
                    do {
                        System.out.println("Cuántas cartas desea?");
                        aux = entrada.nextInt();
                        if (aux < 1) {
                            System.out.println("Debe sacar por lo menos 1 carta!");
                        }
                    } while (aux < 1);
                    System.out.println("Sacando cartas...");
                    validador(mazoAzul.darCartas(aux));
                    break;
                }
                case 3: {
                    aux = mazoAzul.cartasDisponibles();

                    if (aux > 0) {
                        System.out.println("Quedan "
                                + aux
                                + " cartas en el mazo.");
                    } else {
                        System.out.println("No quedan cartas en el mazo.");
                    }
                    break;
                }
                case 4: {
                    System.out.println(mazoAzul.cartasMonton());

                    break;
                }
                case 5: {
                    System.out.println(mazoAzul.mostrarBaraja());

                    break;
                }
                case 6: {
                    System.out.println("Barajando mazo...");
                    mazoAzul.barajarMazo();
                    System.out.println("Listo!");
                    break;
                }
                case 0: {

                    break;
                }
                default: {
                    System.out.println("Introduzca una opción válida!");
                }
            }
            if (opcion != 0) {
                System.out.println("\nPresione 'Enter'");
                lector.nextLine();
            }
        } while (opcion != 0);

        System.out.println("Adios!");
    }

    private static void desempacarMano(Carta[] mano) {
        for (Carta carta : mano) {
            System.out.println(carta);
        }
        System.out.println("Listo!");
    }

    private static void validador(Carta[] mano) {
        if (mano == null) {
            System.out.println("No quedan las suficientes cartas en el mazo!");
        } else {
            desempacarMano(mano);
        }
    }

}
