/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "LAB_01_E_04.java."

import java.io.*;

public class lab_01_e_04 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double gasto;
		int km;
		int kml;
		double lts;
		double pr;
		System.out.println("Indicar km recorridos");
		km = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Indicar precio de combustible por litro");
		pr = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Indicar eficiencia del vehiculo (km/L)");
		kml = Integer.parseInt(bufEntrada.readLine());
		lts = km/kml;
		gasto = lts*pr;
		System.out.println("Litros consumidos:"+lts);
		System.out.println("Gasto en combustible: $ "+gasto);
	}


}

