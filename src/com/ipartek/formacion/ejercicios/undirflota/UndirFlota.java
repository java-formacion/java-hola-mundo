package com.ipartek.formacion.ejercicios.undirflota;

/*cambios para hacer un save an push */
import java.util.Scanner;

public class UndirFlota {
	static int posicion[][] = new int[5][5];
	static int intentos = 7;
	static int posicionY = 0;
	static int posicionX = 0;
	static String SposicionY;
	static String SposicionX;
	static boolean validacion = true;
	public static Scanner sc;

	public static void main(String[] args) {

		inicializar();
		// pintarTerreno();
		while (intentos > 0 & (posicion[1][1] == 1 | posicion[1][2] == 1 | posicion[1][3] == 1 | posicion[2][0] == 1
				| posicion[3][0] == 1 | posicion[4][0] == 1)) {
			leerPorPantalla();
			
		}
		sc.close();
		if (intentos == 0) {
			System.out.println("Has perdido");
			pintarTerreno();
		} else if (posicion[1][1] == 3 & posicion[1][2] == 3 & posicion[1][3] == 3 & posicion[2][0] == 3
				& posicion[3][0] == 3 & posicion[4][0] == 3) {
			System.out.println("Has ganado!!!");
			pintarTerreno();
		}
	}

	private static void pedirPosicion(int posicicionX, int posicionY) {

		switch (posicion[posicionX][posicionY]) {
		case 0:
			LimpiarPantalla();
			intentos = intentos - 1;
			System.out.println("El misil a caido en el AGUA... tienes otros " + intentos + " intentos.");
			posicion[posicionX][posicionY] = 4;
			break;
		case 1:
			LimpiarPantalla();
			System.out.println("Has acertado!!!!!!");
			posicion[posicionX][posicionY] = 3;
			break;
		case 3:
			LimpiarPantalla();
			--intentos;
			System.out.println("Le has dado en la misma posición -BARCO-");
			System.out.println("Tienes " + intentos + " intentos");
			break;
		case 4:
			LimpiarPantalla();
			--intentos;
			System.out.println("Le has dado en la misma posición -AGUA-");
			System.out.println("Tienes " + intentos + " intentos");
			break;
		default:
			System.out.println("error");
			break;
		}

	}

	private static void leerPorPantalla() {
		validacion = true;
		posicionX = 0;
		posicionY = 0;
		
		sc = new Scanner(System.in);

		System.out.println("Dime la posicion x por favor de 0 a 4");
		
		SposicionX = sc.nextLine();
		
		

		if (verificarInt(SposicionX)) {
			posicionX = Integer.parseInt(SposicionX);
		} else {
			System.out.println("DIME LA POSICION CORRECTA (X) ENTRE 0 y 4");
			posicionX = 0;
			validacion = false;
		}

		if (posicionX < 0 | posicionX > 5) {// si no es un numero o no esta entre 0 y 5
			System.out.println("escribe la posicion correcta de 0 a 4");
			validacion = false;
		}

		System.out.println("Dime la posicion y por favor 0 a 4");

		
			SposicionY = sc.nextLine();
		
		

		if (verificarInt(SposicionY)) {
			posicionY = Integer.parseInt(SposicionY);
		} else {
			System.out.println("DIME LA POSICION CORRECTA (Y) ENTRE 0 y 4");
			posicionY = 0;
			validacion = false;
		}

		if (posicionY > 5 | posicionY < 0) {
			System.out.println("escribe la posicion correcta de 0 a 4");
			validacion = false;
		}


		if (validacion) {
			pedirPosicion(posicionX, posicionY);
		}

	}

	private static boolean verificarInt(String s) {

		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}

	/*
	 * private static boolean ComprobarEntero(Integer posicionX) { try {
	 * 
	 * String a=posicionX.toString();
	 * System.out.println("has escrito una "+a+" escribe un numero"); return false;
	 * 
	 * } catch (Exception e) { return true; }
	 * 
	 * 
	 * }
	 */

	private static void LimpiarPantalla() {
		for (int i = 0; i < 50; ++i)
			System.out.println();// para limpiar la consola
	}

	private static void pintarTerreno() {
		for (int i = 0; i < posicion.length; i++) {
			for (int j = 0; j < posicion.length; j++) {
				System.out.print("  " + posicion[i][j] + "  ");
			}
			System.out.println("");
		}
	}

	private static void inicializar() {
		for (int i = 0; i < posicion.length; i++) {
			for (int j = 0; j < posicion.length; j++) {
				posicion[i][j] = 0;
			}
		}
		posicion[1][1] = 1;
		posicion[1][2] = 1;
		posicion[1][3] = 1;
		posicion[2][0] = 1;
		posicion[3][0] = 1;
		posicion[4][0] = 1;
	}
}
