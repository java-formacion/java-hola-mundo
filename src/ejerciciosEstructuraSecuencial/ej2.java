package ejerciciosEstructuraSecuencial;

import java.util.Scanner;

/**
 * Programa Java que lea un nombre y muestre por pantalla:
“Buenos dias nombre_introducido”
 * @author java
 *
 */

public class ej2 {

	public static void main(String[] args) {
		String nombre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nomre");
		nombre = sc.nextLine();
		System.out.println("el nombre introducido es: "+ nombre);
	}

}
