/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "LAB_01_E_03.java."

import java.io.*;

public class lab_01_e_03 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double lado;
		double perimetro;
		// Variables
		// Entrada
		System.out.println("Introducir longitud de los lados del cuadrado");
		lado = Double.parseDouble(bufEntrada.readLine());
		// Proceso 
		perimetro = lado*4;
		// Salida
		System.out.println("El perímetro del cuadrado es:"+perimetro);
	}


}

