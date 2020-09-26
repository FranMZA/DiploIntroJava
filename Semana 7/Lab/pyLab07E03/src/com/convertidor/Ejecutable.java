package com.convertidor;

import com.convertidor.dominio.Convertidor;
import com.convertidor.gui.JFPrincipal;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float TASA_DOLAR = (float) 0.013;
        float TASA_EURO = (float) 0.011;
        Convertidor con = new Convertidor(TASA_DOLAR, TASA_EURO);
        
        new JFPrincipal(con).setVisible(true);
    }
    
}
