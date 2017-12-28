package com.ipartek.formacion.helloworld.capitulo2;
import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {

		// introducirNombre();
		//seleccionarIdioma();
		// seleccionarSexo();
		//seleccionarMayoriaEdad();
		seleccionarAltura();

	}

	private static void introducirNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre por favor");
		String nombre = sc.nextLine();
		System.out.println("Dime tu apellido por favor");
		String apellido = sc.nextLine();
		System.out.println("Bienvenido " + nombre + " " + apellido);

	}

	private static void seleccionarIdioma() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona el idioma por favor:" + "\n 0- Castellano." + "\n 1- Euskera." + "\n 2- Gallego."
				+ "\n 3- Catalan.");
		int opcion = -1;
		try {

			opcion = sc.nextInt();

			switch (opcion) {
			case 0:
				System.out.println("El idioma es Castellano.");
				break;
			case 1:
				System.out.println("El idiomna es Euskera.");
				break;
			case 2:
				System.out.println("El idioma es Gallego.");
				break;
			case 3:
				System.out.println("El idioma es Catalan.");
				break;
			default:
				System.out.println("El numero introducido es incorrecto.");
				break;
			}

		} catch (java.util.InputMismatchException e) {
			System.out.println("Debes introducir un numero.");
		}

	}

	private static void seleccionarSexo() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Selecciona tu sexo por favor:" + "\n 1)- Hombre." + "\n 2)- Mujer." + "\n 3)- Indeterminado.");
		try {
			char opcion = sc.next().charAt(0);
			switch (opcion) {
			case '1':
				System.out.println("Tu sexo es: Hombre");
				break;
			case '2':
				System.out.println("Tu sexo es: Mujer");
				break;
			case '3':
				System.out.println("Tu sexo es: Indeterminado");
				break;
			default:
				System.out.println("El sexo introducido es incorrecto.");
				break;

			}
		} catch (java.util.InputMismatchException e) {
			 System.out.println("Debes introducir un numero.");
		}
	}

	private static void seleccionarMayoriaEdad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Es usted mayor de edad?" + "\n True - Si." + "\n False - No.");
		try {
			boolean opcion = sc.nextBoolean();
			if (opcion == true) {
				System.out.println("Usted es mayor de edad.");
			} else {
				System.out.println("Usted es menor de edad.");
			}
		}catch (java.util.InputMismatchException e) {
			System.out.println("Debes introducir true o false.");
		}
	
	}
	
	private static void seleccionarAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su altura (cm)");
		try {
			float opcion = sc.nextFloat();
			System.out.println("Su altura es: "+opcion);
		}catch (java.util.InputMismatchException e) {
			System.out.println("Debes introducir numeros y separarlos por una ','");
		}

	}
}
