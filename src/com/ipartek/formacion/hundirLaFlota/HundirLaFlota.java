package com.ipartek.formacion.hundirLaFlota;

import java.util.Scanner;

public class HundirLaFlota {

	static String[][] tablero = new String[10][10];
	static int intentos = 0;
	static int aciertos = 0;

	public static void main(String[] args) {

		rellenarTablero();
		rellenarCoordenadas();
		mostrarTablero();
		solicitarCoordenadas();

	}

	/*
	 * Rellena el tablero con A
	 */
	private static void rellenarTablero() {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = "A";
			}
		}

	}

	/*
	 * Muestra el estado actual del tablero
	 */
	private static void mostrarTablero() {

		System.out.println("Tablero actual: ");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	/*
	 * Añado al tablero los barcos: Tres barcos tamaño 1, Dos barcos tamaño 2, Un
	 * barco tamaño 3
	 */
	private static void rellenarCoordenadas() {
		// Añadir tres barcos tamaño 1
		tablero[1][2] = "1";
		tablero[4][5] = "1";
		tablero[7][7] = "1";

		// Añadir dos barcos tamaño 2
		tablero[5][2] = "2";
		tablero[6][2] = "2";

		tablero[1][7] = "2";
		tablero[2][7] = "2";

		// Añadir un barco tamaño 3
		tablero[9][2] = "3";
		tablero[9][3] = "3";
		tablero[9][4] = "3";

	}

	private static void solicitarCoordenadas() {

		while ((intentos < 20) && (aciertos < 9)) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Dame una coordenada \"i\": ");
			sc = new Scanner(System.in);
			int coordenadaI = sc.nextInt();

			System.out.println("Dame una coordenada \"j\": ");
			sc = new Scanner(System.in);
			int coordenadaJ = sc.nextInt();

			comprobarCoordenadas(coordenadaI, coordenadaJ);
		}

		if (aciertos == 9) {
			System.out.println("Enhorabuena! Has hundido la flota");
		} else {
			System.out.println("Oooh! Otra vez será");
		}

	}

	private static void comprobarCoordenadas(int coordenadaI, int coordenadaJ) {

		if ((tablero[coordenadaI][coordenadaJ] == "1") || (tablero[coordenadaI][coordenadaJ] == "2")
				|| (tablero[coordenadaI][coordenadaJ] == "3")) {
			aciertos++;
			tablero[coordenadaI][coordenadaJ] = "0"; // 0 indica barco tocado
			System.out.println("Tocado!!!!");
		} else if (tablero[coordenadaI][coordenadaJ] == "A") {
			intentos++;
			System.out.println("Agua!!!!!");
		} else {
			intentos++;
			System.out.println("Coordenada repetida!!!!!");
		}
		System.out.println();
	}

}
