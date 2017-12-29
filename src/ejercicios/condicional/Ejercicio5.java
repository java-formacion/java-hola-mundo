package ejercicios.condicional;

import java.util.Scanner;

/**
 * Programa java que lea dos caracteres por teclado y compruebe si los dos son
 * letras minúsculas
 * 
 * @author eritzinho
 *
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c1, c2;
		System.out.println("Introduce el primer caracter");
		c1 = sc.next().charAt(0);
		System.out.println("Introduce el segundo caracter");
		c2 = sc.next().charAt(0);
		if (Character.isLowerCase(c1) && Character.isLowerCase(c2)) {
			System.out.println("Las letras son minúsculas");
		} else {
			System.out.println("Una de las dos es mayúsculas");
		}

	}

}
