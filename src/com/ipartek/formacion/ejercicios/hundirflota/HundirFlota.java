package com.ipartek.formacion.ejercicios.hundirflota;

import java.util.Scanner;

public class HundirFlota {

	static String[][] tablero = new String[10][10];
	static String[][] posBarcos = new String[10][10];
	static int intentos, fila, col, dir, tam, aciertos, totalAciertos;
	static String intento;
	static boolean terminado;

	static void nuevaPartida() {
		
		// Estado del juego inicial
		terminado = false;
		
		//Numero de intentos por partida
		intentos = 10;
		
		//Generar barcos aleatoriamente
		
		fila =  (int) (Math.random()* 10);
		col = (int) (Math.random()*10);
		dir = (int) (Math.random()*4)+1;
		tam = (int) (Math.random()*4)+1;
		crearBarco(fila, col, tam, dir);
		
		totalAciertos += tam;
		
		fila =  (int) (Math.random()* 10);
		col = (int) (Math.random()*10);
		dir = (int) (Math.random()*4)+1;
		tam = (int) (Math.random()*3)+1;
		crearBarco(fila, col, tam, dir);
		
		totalAciertos += tam;
		
		//mostrarTableroBarcos();
		
		// Crear el tablero
		crearTablero();
		
		// Empezar partida
		jugar();
		
	}
	
	static void crearBarco(int fila, int col, int tam, int dir) {
		String dirText = "";
		
		posBarcos[fila][col] = "X";
		
		switch(dir) {
			case 1:
				// Derecha
				for(int i = (col + 1); i < (tam + col); i++) {
					posBarcos[fila][i] = "X";
				}
				dirText = "Derecha";
			break;
			case 2:
				// Izquierda
				for(int i = (col - 1); i > (col - tam); i--) {
					System.out.println(i);
					posBarcos[fila][i] = "X";
				}
				dirText = "Izquierda";
			break;
			case 3:
				// Arriba
				for(int i = (fila - 1); i > (fila - tam); i--) {
					posBarcos[i][col] = "X";
				}
				dirText = "Arriba";
			break;
			case 4:
				// Abajo
				for(int i = (fila + 1); i < (tam + fila); i++) {
					posBarcos[i][col] = "X";
				}
				dirText = "Abajo";
			break;
		}
		
		System.out.println("Barco: " + fila + ", " + col + ", Tamaño: " + tam + ", Dir: " + dirText);
		
	}

	static void crearTablero() {
		for (int x = 0; x < tablero.length; x++) {
			for (int y = 0; y < tablero[x].length; y++) {
				tablero[x][y] = " O";
			}
		}
	}

	static void mostrarTablero() {
		
		System.out.print("\n");
		System.out.println("    0    1    2    3    4    5    6    7    8    9  ");
		System.out.print("   ------------------------------------------------");
		System.out.print("\n");
		for (int i = 0; i < tablero.length; i++) { // Filas
			System.out.print(i + " |");
			for (int j = 0; j < tablero[i].length; j++) { // Columnas
				System.out.print(tablero[i][j] + " | ");
			}
			System.out.print("\n");
		}
		System.out.print("   ------------------------------------------------");
	}
	
	static void mostrarTableroBarcos() {
		
		System.out.print("\n");
		System.out.println("    0    1    2    3    4    5    6    7    8    9  ");
		System.out.print("   ------------------------------------------------");
		System.out.print("\n");
		for (int i = 0; i < posBarcos.length; i++) { // Filas
			System.out.print(i + " |");
			for (int j = 0; j < posBarcos[i].length; j++) { // Columnas
				System.out.print(posBarcos[i][j] + " | ");
			}
			System.out.print("\n");
		}
		System.out.print("   ------------------------------------------------");
	}
	
	static void jugar() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nIntroduce una posición: ");
		intento = sc.nextLine();
		
		checkIntento();
		
		checkGameState();
		
		sc.close();
	}
	
	static void checkIntento() {
		String[] coords = intento.split(",");
		int x = Integer.parseInt(coords[0]);
		int y = Integer.parseInt(coords[1]);
		
		System.out.println("\n");
		
		if(posBarcos[x][y] == "X") {
			System.out.println("Tocado!");
			tablero[x][y] = " X";
			aciertos ++;
		}
		else {
			System.out.println("Agua!");
			tablero[x][y] = " A";
		}
		
		intentos --;
		mostrarTablero();
	}
	
	static void checkGameState() {
		if(intentos == 0) {
			terminado = true;
			System.out.println("\n\n¡GAME OVER!");
		}
		else if(totalAciertos == aciertos) {
			terminado = true;
			System.out.println("\n\n¡Felicidades! Has ganado!!!");
		}
		else {
			System.out.println("\nTe quedan: " + intentos + " intentos");
			jugar();
		}
		
		if(terminado) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nJugar otra vez S/N: ");
			String res = sc.nextLine();
			
			if(res.equalsIgnoreCase("S")) {
				nuevaPartida();
			}
			else {
				System.out.println("Una pena... hasta otra!");
			}
			
			sc.close();
		}
	}

	public static void main(String[] args) {
		nuevaPartida();
	}

}
