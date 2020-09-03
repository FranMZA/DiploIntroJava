package com.mazoDeCartas.dominio;

import java.util.Random;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Mazo {
    // TODO: crear javadocs de los métodos

    /*
     Las operaciones que podrá realizar la baraja son:  
         xx   barajar: cambia de posición todas las cartas aleatoriamente  
         xx  siguienteCarta: devuelve la siguiente carta que está en la baraja, 
            cuando no haya más o se haya llegado al final, se indica al usuario 
            que no hay más cartas.  
         xx  cartasDisponibles: indica el número de cartas que aún puede repartir  
         xx  darCartas: dado un número de cartas que nos pidan, le devolveremos 
            ese número de cartas (piensa que puedes devolver). En caso de que 
            haya menos cartas que las pedidas, no devolveremos nada pero debemos 
            indicárselo al usuario.  
         xx  cartasMonton: mostramos aquellas cartas que ya han salido, si no 
            ha salido ninguna indicárselo al usuario  
         xx mostrarBaraja: muestra todas las cartas hasta el final. Es decir, 
            si se saca una carta y luego se llama al método, este no mostrara 
            esa primera carta.
         
     */
    // Atributos
    private String nombreMazo;
    private Carta cartas[];
    private final int[] valoresPosibles;
    private final String palos[] = {"oro", "copa", "basto", "espada"};
    private final Random rdm = new Random();
    private int cartasRepartidas;

    // Constructores
    public Mazo(String nombreMazo, boolean mazoCompleto) {
        this.nombreMazo = nombreMazo;
        int numCartas = mazoCompleto ? 48 : 40;
        this.valoresPosibles = valoresPosibles(mazoCompleto);
        this.cartas = generarMazo(numCartas);
        this.cartasRepartidas = 0;
    }

    // getters y setters
    public void setNombreMazo(String nombreMazo) {
        this.nombreMazo = nombreMazo;
    }

    public String getNombreMazo() {
        return nombreMazo;
    }

    public Carta[] getMazo() {
        return cartas;
    }

    // Métodos públicos
    public void barajarMazo() {
        Carta barajar[] = new Carta[cartas.length];
        int i;
        boolean aux;
        for (Carta carta : cartas) {
            aux = false;
            do {
                i = rdm.nextInt(cartas.length);
                if (barajar[i] == null) {
                    barajar[i] = carta;
                    aux = true;
                }
            } while (aux == false);
        }
        cartas = barajar;
        cartasRepartidas = 0;
    }

    public Carta[] siguienteCarta() {
        return darCartas(1);
    }

    public Carta[] darCartas(int num) {
        if (num <= cartasDisponibles()) {
            Carta[] mano = new Carta[num];
            for (int i = 0; i < mano.length; i++) {
                mano[i] = sacarCarta();
            }
            return mano;
        } else {
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.length - cartasRepartidas;
    }

    public String mostrarBaraja() {
        String mensaje = "";
        if (cartasRepartidas == cartas.length) {
            mensaje += "No quedan cartas en el mazo.";
        } else if (cartasRepartidas > 0) {
            for (int i = cartasRepartidas; i < cartas.length; i++) {
                mensaje += cartas[i] + "\n";
            }
        } else {
            mensaje = "El mazo está completo.";
        }

        return mensaje;
    }

    public String cartasMonton() {
        String mensaje = "";
        if (cartasRepartidas == 0) {
            mensaje = "No hay cartas en el pozo";
        } else if (cartasRepartidas < cartas.length) {
            for (int i = 0; i < cartasRepartidas; i++) {
                mensaje += cartas[i] + "\n";
            }
        } else {
            mensaje = "Todo el mazo está en el pozo.";
        }

        return mensaje;
    }

    @Override
    public String toString() {
        String mensaje = "Nombre del mazo: " + nombreMazo
                + "\nCartas:\n"
                + '[';
        for (Carta carta : cartas) {
            mensaje += carta.toString() + "\n";
        }

        mensaje += ']';

        return mensaje;
    }

    // Métodos privados
    private Carta sacarCarta() {
        cartasRepartidas++;
        return cartas[cartasRepartidas - 1];
    }

    private int[] valoresPosibles(boolean mazoCompleto) {
        int val[] = new int[mazoCompleto ? 12 : 10];
        int valor = 1;
        for (int i = 0; i < val.length; i++) {
            val[i] = valor;
            if (!mazoCompleto) {
                if (valor == 7) {
                    valor += 3;
                    continue;
                }
            }
            valor++;
        }
        return val;
    }

    private Carta[] generarMazo(int numCartas) {
        int i = 0;
        Carta mazoNuevo[] = new Carta[numCartas];
        for (String palo : palos) {
            for (int valor : valoresPosibles) {
                mazoNuevo[i] = new Carta(valor, palo);
                i++;
            }
        }
        return mazoNuevo;
    }

}
