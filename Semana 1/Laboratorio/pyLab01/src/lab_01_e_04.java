
import java.io.*;

public class lab_01_e_04 {
    //clase principal, publica, lleva el nombre del archivo
    // comentario
    /*
    comentario multilinea perri
    */

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double gasto;
		int km;
		int kml;
		double lts;
		double pr;
                
                // Entrada de datos
		System.out.println("Indicar km recorridos");
		km = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Indicar precio de combustible por litro");
		pr = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Indicar eficiencia del vehiculo (km/L)");
		kml = Integer.parseInt(bufEntrada.readLine());
                
                //Proceso
		lts = km/kml;
		gasto = lts*pr;
                
                //Salida
		System.out.println("Litros consumidos:"+lts);
		System.out.println("Gasto en combustible: $ "+gasto);
	}


}



