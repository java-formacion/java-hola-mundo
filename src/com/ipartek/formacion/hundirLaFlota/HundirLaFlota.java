package com.ipartek.formacion.hundirLaFlota;

public class HundirLaFlota {

	static String[][] tablero = new String[10][10];
	static int intentos = 0;
	static int aciertos = 0;
	static int fallos = 0;

	public static void main(String[] args) {

		rellenarTablero();
		//rellenarCoordenadas();
		//solicitarCoordenadas();

	}

	/*
	 * Rellena el tablero con A
	 */
	private static void rellenarTablero() {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = "A";
				//System.out.println(tablero[i][j]);
			}
		}

	}

	/*
	 * Añado al tablero los barcos Tres barcos tamaño 1 Dos barcos tamaño 2 Un barco
	 * tamaño 3
	 */
	private static void rellenarCoordenadas() {
		// Añadir tres barcos tamaño 1
		tablero[2][1] = "1";
		tablero[4][5] = "1";
		tablero[7][7] = "1";

		// Añadir dos barcos tamaño 2
		tablero[2][1] = "2";
		tablero[2][1] = "2";

		tablero[1][7] = "2";
		tablero[2][7] = "2";

		// Añadir un barco tamaño 3
		tablero[9][2] = "3";
		tablero[9][3] = "3";
		tablero[9][4] = "3";

	}

	private static void solicitarCoordenadas() {
		// TODO Auto-generated method stub

	}

}
