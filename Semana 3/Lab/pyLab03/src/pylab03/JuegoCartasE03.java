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
public class JuegoCartasE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar un programa para implementar un juego de cartas de la 
        baraja española. Es una competencia de 2 rondas entre 2 jugadores.
        En cada ronda, cada jugador recibe una carta 
        (cuyo número y palo el programa deberá generar de forma aleatoria) 
        y se define la ronda de la siguiente manera: 
            - El jugador que tenga la carta de mayor valor, se lleva ambas. 
            - Si las cartas son del mismo valor, se las lleva 
              quien tenga una carta de oro. 
            - Si ninguno tiene oro, cada jugador recupera su carta.
        Los puntos de cada jugador se determinan sumando los valores de todas 
        las cartas que ganó. Será triunfador el que tenga mayor puntaje total, 
        y este es el resultado que deberá arrojar nuestro juego.
        Nota: los palos de las cartas se codifican de la siguiente manera:   
             Copa: 1  
             Basto: 2  
             Espada: 3  
             Oro: 4  
        
        */
        Scanner entrada = new Scanner(System.in);

        // Variables
        short paloCartaA, paloCartaB;
        short valorCartaA, valorCartaB;
        short puntajeA, puntajeB;
        puntajeA = puntajeB = 0;
        String jugadorA, jugadorB;
        jugadorA = "A";
        jugadorB = "B";
        short rondas = 2;
        short resultado;
        short opcion = 2;

        // Juego ppal
        do {
            switch (opcion) {
                case 1: {
                    // Juego
                    System.out.println("Inicio del juego!");
                    for (int i = 1; i <= rondas; i++) {
                        System.out.println("--------------------");
                        System.out.println("Ronda número " + i);
                        valorCartaA = (short) randInt(1, 12);
                        paloCartaA = (short) randInt(1, 4);
                        valorCartaB = (short) randInt(1, 12);
                        paloCartaB = (short) randInt(1, 4);

                        // Mostrar las cartas
                        System.out.println(jugadorA + " tiene un " + valorCartaA + " de " + paloString(paloCartaA) + ".");
                        System.out.println(jugadorB + " tiene un " + valorCartaB + " de " + paloString(paloCartaB) + ".");

                        // Definir resultado
                        if (valorCartaA == valorCartaB) {
                            // mismo valor, define palo
                            System.out.println("Empate, define palo...");
                            if (paloCartaA == 4 || paloCartaB == 4) {
                                // hay por lo menos 1 oro
                                if (paloCartaA == 4 && paloCartaB == 4) {
                                    System.out.println("Ambos tienen oro.");
                                    resultado = 0;
                                } else {
                                    if (paloCartaA == 4) {
                                        System.out.println(jugadorA + " tiene oro.");
                                        resultado = 1;
                                    } else {
                                        System.out.println(jugadorB + " tiene oro.");
                                        resultado = 2;
                                    }

                                }
                            } else {
                                // ninguno tiene oro, empate
                                System.out.println("Ninguno tiene oro.");
                                resultado = 0;
                            }
                        } else {
                            // diferente valor, gana mayor
                            if (valorCartaA > valorCartaB) {
                                resultado = 1;
                            } else {
                                resultado = 2;
                            }

                        }

                        // Asignación de puntos
                        switch (resultado) {
                            case 1: {
                                System.out.println("Gana " + jugadorA + ", se lleva ambas cartas.");
                                puntajeA += (valorCartaA + valorCartaB);
                                break;
                            }
                            case 2: {
                                System.out.println("Gana " + jugadorB + ", se lleva ambas cartas.");
                                puntajeB += (valorCartaA + valorCartaB);
                                break;
                            }
                            case 0: {
                                System.out.println("Empate, ambos mantienen su carta.");
                                puntajeA += valorCartaA;
                                puntajeB += valorCartaB;
                                break;
                            }
                        }
                    }
                    // Resultado de la partida
                    System.out.println("--------------------");
                    System.out.println("Fin de la partida.");
                    System.out.println("Puntaje de " + jugadorA + ": " + puntajeA);
                    System.out.println("Puntaje de " + jugadorB + ": " + puntajeB);
                    if (puntajeA == puntajeB) {
                        System.out.println("Empate");
                    } else {
                        if (puntajeA > puntajeB) {
                            System.out.println("Gana " + jugadorA + " por " + (puntajeA - puntajeB) + " puntos!");
                        } else {
                            System.out.println("Gana " + jugadorB + " por " + (puntajeB - puntajeA) + " puntos!");
                        }
                    }
                    
                    opcion = 4;
                    break;
                }
                case 2: {
                    // Entrada nombres y configuración
                    System.out.println("Introduzca el nombre del jugador 1: ");
                    jugadorA = entrada.next();
                    System.out.println("Introduzca el nombre del jugador 2: ");
                    jugadorB = entrada.next();

                    opcion = 3;
                    break;
                }
                case 3: {
                    // Configuración de rondas
                    System.out.println("Introduzca el número de rondas (por defecto 2)");
                    short input = entrada.nextShort();
                    rondas = input > 2 ? input : 2;

                    opcion = 1;
                    break;
                }
                default: {
                    // Menu
                    System.out.println("--------------------");
                    System.out.println("Menú");
                    System.out.println("1-Volver a jugar\n2-Cambiar nombre\n3-Cambiar número de rondas\n0-Salir");
                    opcion = entrada.nextShort();
                    break;
                }
            }
        } while (opcion != 0);
    }

    public static double randInt(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static String paloString(short palo) {
        switch (palo) {
            case 1: {
                return "copa";
            }
            case 2: {
                return "basto";
            }
            case 3: {
                return "espada";
            }
            case 4: {
                return "oro";
            }
            default: {
                return null;
            }
        }
    }
}
