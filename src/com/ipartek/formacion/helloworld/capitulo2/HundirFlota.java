package com.ipartek.formacion.helloworld.capitulo2;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HundirFlota  extends JFrame {

	static Scanner consola = new Scanner(System.in);
	static int[][] matriz;
	static int puntoX = 0, puntoY = 0, disparos = 10;

	public static void main(String[] args) {
		crearMapa();
		crearBarcos();
		//pintarCampo();
		try {
			while (true) {
				System.out.println("\n\nIntroduce las coordenadas de los barcos [" + 0 + " " + 0 + "]");
				puntoX = consola.nextInt();
				puntoY = consola.nextInt();
				if (matriz[puntoX][puntoY] == 1) {
					System.out.println("Hundido");
					disparos --;
					int aux = matriz[puntoX][puntoY];
					matriz[puntoX][puntoY] = 0;
					System.out.println("\nNumero de disparos = > " + disparos);
					if (disparos == 0) {
						System.out.println("Te quedaste sin balas. Se acabo");
						break;
					}
					if (barcosVivos() == false) {
						System.out.println("¡¡¡HAS DESTRUIDO TODOS LOS BARCOS!!!");
						break;
					}

				} else {
					System.out.println("Agua");
					disparos--;
					System.out.println("Numero de disparos = > " + disparos);
					if (disparos == 0) {
						System.out.println("Te quedaste sin balas. GAME OVER");
						break;
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("El mar no es tan grande");
		} catch (InputMismatchException e) {
			System.out.println("No se admiten ni letras, ni ',' ni '.'. Solo espacios");
		}
	}

	/**
	 * Metodo que crea el mapa a partir de los datos introducidos por teclado
	 */
	static void crearMapa() {
		int filas, columnas;
		System.out.println("Introduce el numero de filas: ");
		filas = consola.nextInt();
		System.out.println("Introduce el numero de columnas: ");
		columnas = consola.nextInt();
		matriz = new int[filas][columnas];

	}

	/**
	 * Metodo que puede generar los barcos en el mapa de forma fija o aleatoria
	 */
	static void crearBarcos() {
		try {
			 matriz[3][1] = 1;
			 matriz[3][2] = 1;

			 
			 
			// PINTAR BARCOS DE FORMA RANDOM
			/*int primerBarcoColumna = (int) (Math.random() * matriz.length);
			int primerBarcoFila = (int) (Math.random() * matriz.length);
			int segundoBarcoColumna = (int) (Math.random() * matriz.length);
			int segundoBarcoFila = (int) (Math.random() * matriz.length);
			matriz[primerBarcoColumna][primerBarcoFila] = 1;
			matriz[segundoBarcoColumna][segundoBarcoFila] = 1;*/
			 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("El mapa es demasiado pequeño");
		}

	}

	/**
	 * Metodo que saca por pantalla el mapa
	 */
	static void pintarCampo() {
		  for (int x = 0; x < matriz.length; x++) {
	            for (int y = 0; y < matriz[x].length; y++) {
	                System.out.print("| " + matriz[x][y] + " |");

	            }
	            System.out.print("\n");

	        }
	}

	/**
	 * Metodo que comprueba si quedan barcos o no
	 * @return false si han sido destruidos todos los barcos y true si sigue alguno en pie
	 */
	static boolean barcosVivos() {
		int num = 1;
		String coordenadas = "";
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				if (matriz[x][y] == num) {
					coordenadas += "[" + x + "," + y + "]" + "\n";
				}
			}
		}
		if (coordenadas.equals("")) {
			return false;
		} else {
			return true;
		}
	}

}
