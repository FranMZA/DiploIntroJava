package com.multas.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Multa {

    private final int codigo;
    private final float monto;
    private final int acta;

    public Multa() {
        codigo = acta = 0;
        monto = 0;
    }

    public Multa(int codigo, float monto, int acta) {
        this.codigo = codigo;
        this.monto = monto;
        this.acta = acta;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getMonto() {
        return monto;
    }

    public int getActa() {
        return acta;
    }
    
    public float calcularMonto(){
        return monto;
    }

    @Override
    public String toString(){
        return "Acta: " + String.format("%03d", acta) + "\t| Código:" 
                + String.format("%02d", codigo) + "\t| Monto:" + monto;
    }
}
