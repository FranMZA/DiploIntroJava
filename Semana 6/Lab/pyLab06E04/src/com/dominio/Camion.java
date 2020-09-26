package com.dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Camion {

    private short estado;
    private float cargaMax;
    private ArrayList<Carga> cargas;

    public Camion(float cargaMax) {
        estado = 1;
        cargas = new ArrayList<>();
        this.cargaMax = cargaMax;
    }

    public short getEstado() {
        return estado;
    }

    // getters y setters
    public void setEstado(short estado) {
        this.estado = estado;
    }

    public float getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(float cargaMax) {
        this.cargaMax = cargaMax;
    }

    // métodos
    public boolean subirCarga(Carga carga) {
        boolean aux = false;

        if (carga != null) {
            if (estado == 1) {
                float pesoTotal = this.calcularPeso() + carga.calcularPeso();
                if (pesoTotal <= cargaMax) {
                    cargas.add(carga);
                    aux = true;
                }
            }
        }
        return aux;
    }

    public float calcularPeso() {
        float aux = 0;
        for (Carga carga : cargas) {
            aux += carga.calcularPeso();
        }
        return aux;
    }

    public int calcularCantidadCargas() {
        return cargas.size();
    }

    public String mostrarListado() {
        Collections.sort(cargas);

        StringBuilder listado = new StringBuilder("Listado de cargas:\n");

        for (Carga carga : cargas) {
            listado.append(carga.toString()).append("\n");
        }

        return listado.toString();
    }

    public boolean puedeSalir() {
        return this.estado == 1
                && this.calcularPeso() >= (this.cargaMax * 0.75);
    }
}
