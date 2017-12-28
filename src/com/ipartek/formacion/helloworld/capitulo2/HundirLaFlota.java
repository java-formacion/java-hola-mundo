package com.ipartek.formacion.helloworld.capitulo2;

import java.util.Scanner;

/**
 * Hundir la flota
 * @author java
 *
 */
public class HundirLaFlota {
	static String[][] tablero = new String[10][10];
	static boolean victoria;
	static int aciertos = 0;
	static int intentos = 0;
	static String valorAtaque = "";
	public static void main(String[] args) {
		arranque();
		while (victoria == false) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("Posicion a atacar: ");
			String posAtacar = sc.nextLine();
			try {
				if (comprobarTocado(posAtacar)) {
					tablero[Integer.parseInt("" + posAtacar.charAt(0), 10)][Integer.parseInt("" + posAtacar.charAt(1),
							10)] = "xx";
				} else {
					if (Integer.parseInt(posAtacar) > 99) {
					} else {
						tablero[Integer.parseInt("" + posAtacar.charAt(0), 10)][Integer
								.parseInt("" + posAtacar.charAt(1), 10)] = "oo";
					}
				}
				intentos++;
			} catch (Exception e) {
				System.out.println("Posicion no valida!");
			}
			for (int i = 0; i < 11; i++) {
				System.out.println();
			}
			System.out.println(valorAtaque);
			System.out.println("Ataques: " + intentos);
			pintarTablero();
		}
		System.out.println("=========");
		System.out.println("VICTORIA!");
		System.out.println("=========");

	}

	private static void arranque() {
		System.out.println("Numero de barcos: 3");
		System.out.println("Barca (1)");
		System.out.println("Lancha (2)");
		System.out.println("Submarino (3)");
		rellenarArray();
		pintarTablero();
	}

	private static boolean comprobarTocado(String posAtacar) {
		if (tablero[Integer.parseInt("" + posAtacar.charAt(0), 10)][Integer.parseInt("" + posAtacar.charAt(1), 10)]
				.equals("##") && Integer.parseInt(posAtacar) < 99) {
			valorAtaque = "TOCADO!";
			aciertos++;
			if (aciertos == 6)
				victoria = true;
			return true;
		}
		if (tablero[Integer.parseInt("" + posAtacar.charAt(0), 10)][Integer.parseInt("" + posAtacar.charAt(1), 10)]
				.equals("xx") && Integer.parseInt(posAtacar) < 99) {
			valorAtaque = ".. Repetido!";
			return true;

		} else {
			if (Integer.parseInt(posAtacar) > 99) {
				valorAtaque = "No valido";
				return false;
			}
			valorAtaque = "AGUA!";
		}
		return false;

	}

	private static void rellenarArray() {
		// Rellenamos array con espacios
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = "  ";
			}
		}
		// Metemos barcos
		// b1
		tablero[2][6] = "##";
		// b2
		tablero[1][1] = "##";
		tablero[1][2] = "##";
		// b3
		tablero[5][2] = "##";
		tablero[5][3] = "##";
		tablero[5][4] = "##";
	}

	private static void pintarTablero() {
		String ejeXNumeros = "  ";
		for (int i = 0; i < tablero.length; i++) {
			ejeXNumeros += "  " + i;
		}

		System.out.println("\n" + ejeXNumeros);
		for (int i = 0; i < tablero.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < tablero[0].length; j++) {
				if (tablero[i][j].equals("##")) {
					System.out.print("|  ");
				} else {
					System.out.print("|" + tablero[i][j]);
				}
				if (j == 9) {
					System.out.print("|");
				}
			}
			System.out.println();
		}

	}
}
