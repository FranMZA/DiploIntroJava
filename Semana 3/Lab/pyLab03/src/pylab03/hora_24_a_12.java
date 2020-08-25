/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."
import java.io.*;

public class hora_24_a_12 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String am_pm;
        int hora;
        int minuto;
        // Entrada
        System.out.println("Ingrese hora");
        hora = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Ingrese minutos");
        minuto = Integer.parseInt(bufEntrada.readLine());
        // Proceso
        if ((hora < 0) || (hora >= 24)) {
            System.out.println("Valor incorrecto de hora");
        } else {
            if ((minuto < 0) || (minuto > 59)) {
                System.out.println("Valor incorrecto de minuto");
            } else {
                if (hora > 12) {
                    hora = hora - 12;
                    am_pm = "PM";
                } else {
                    am_pm = "AM";
                }
                System.out.println("La hora es " + hora + ":" + minuto + " " + am_pm);
            }
        }
    }

}
