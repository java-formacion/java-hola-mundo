package com.ipartek.formacion.ejercicios.undirflota;
/*cambios para hacer un save an push */
import java.io.IOException;
import java.util.Scanner;

public class UndirFlota {
	static int posicion[][] = new int[5][5];
	static int intentos = 7;
	static int posicionY=0;
	static int posicionX =0;
	public static void main(String[] args) {

		inicializar();
		//pintarTerreno();
		while(intentos>0 |  posicion[1][1] == 1 | posicion[1][2] == 1 | posicion[1][3] == 1 | posicion[2][0] == 1 | posicion[3][0] == 1 | posicion[4][0] == 1) {
			pedirPosicion();
		}
		if(intentos==0) {
			System.out.println("Has perdido");
		}
		

	}
	
	

	private static void pedirPosicion() {
		
		posicionY=0;
		posicionX=0;
		
		if (intentos <= 0) {
			System.out.println("GAME OVER");
		} else if (posicion[1][1] == 3 & posicion[1][2] == 3 & posicion[1][3] == 3 & posicion[2][0] == 3
				& posicion[3][0] == 3 & posicion[4][0] == 3) {
			System.out.println("HAS GANADO");
			pintarTerreno();
		} else if(leerPorPantalla()){
			
				switch (posicion[posicionX][posicionY]) {
				case 0:
					LimpiarPantalla();
					intentos = intentos - 1;
					System.out.println("El misil a caido en el AGUA... tienes otros " + intentos + " intentos.");
					posicion[posicionX][posicionY] = 4;
					// pintarTerreno();
					pedirPosicion();
				case 1:
					LimpiarPantalla();
					System.out.println("Has acertado!!!!!!");
					posicion[posicionX][posicionY] = 3;
					pedirPosicion();
					break;
				case 3:
					LimpiarPantalla();
					--intentos;
					System.out.println("Le has dado en la misma posición -BARCO-");
					System.out.println("Tienes " + intentos + "intentos");
					LimpiarPantalla();
					// pintarTerreno();
					pedirPosicion();
					break;
				case 4:
					LimpiarPantalla();
					--intentos;
					System.out.println("Le has dado en la misma posición -AGUA-");
					System.out.println("Tienes " + intentos + "intentos");
					// pintarTerreno();
					pedirPosicion();
					break;
				default:
					System.out.println("error");
					break;
				}
				//pedirPosicion();
		}

	}

	private static boolean leerPorPantalla() {
		boolean error=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la posicion x por favor de 0 a 4");
		try {//Validamos si es un numero
			posicionX = sc.nextInt();
		} catch (Exception e) {
			error=false;//si no es un numero
		}
		
		if (posicionX < 0 | posicionX > 5) {//si no es un numero o no esta entre 0 y 5
			System.out.println("escribe la posicioncorrecta de 0 a 4");
			sc.close();
			error=false;
		}
		
		System.out.println("Dime la posicion y por favor 0 a 4");
		try {
			posicionY = sc.nextInt();
			sc.close();
			
		} catch (Exception e) {
			error=false;
		}
		
		if (posicionY > 5 | posicionY < 0) {
			System.out.println("escribe la posicioncorrecta de 0 a 4");
			error=false;
		}
		
		if(error==false) {
			return false;
		}else {
			return true;
		}
		
		
		
	}



	/*private static boolean ComprobarEntero(Integer posicionX) {
		try {
			
			String a=posicionX.toString();
			System.out.println("has escrito una "+a+" escribe un numero");
			return false;
			
		} catch (Exception e) {
			return true;
		}

		
	}*/

	public static boolean isInt(String str) {
		return (str.lastIndexOf("-") == 0 && !str.equals("-0")) ? str.replace("-", "").matches("[0-9]+")
				: str.matches("[0-9]+");
	}

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
