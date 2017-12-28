package capitulo2;

import java.util.Scanner;

public class HundirFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("BIENVENIDO AL JUEGO DE HUNDIR LA FLOTA");
		System.out.println("");
		System.out.println("");
		System.out.println("TIenes que destruir 2 barcos de 2 posiciones en 15 intentos");
		System.out.println("¿Seras capaz?");
		System.out.println("");
		System.out.println("");
		
		comenzarPartida();
		
	}

	/**
	 * crear 2 matrizez para el mapa. 1 con los alores dnd estara el agua y los barcos
	 * con el que comprobaremos los datos introducidos por el usuario<br>
	 * y otra para ir mostrando al usuario donde ha disparado y si ha acertado o no
	 */
	static String[][] mapa = new String[5][5];
	static String[][] mapaCerrado= new String[5][5];
	
	
	
	
	
	
	
	
	/**
	 * Metodo para empezar el juego
	 * hace llamadas al meto ponerBarcos(), mostrarTablero(),disparo().
	 */
	
	static void comenzarPartida() {
		
		iniciarMapaCerrado();
		mostrarTableroCerrado();
		ponerBarcos();
		disparo();
	}

	
	
	/**
	 * Funcion para jugar, pide al usuario 2 valores para ver donde dispara<br>
	 * y comprueba si has acertado o no.
	 * tenemos 2 variables tambien que son el numero de disparos restantes y
	 * el numero de golpes que hemos dado al barco<br>
	 * Estas 2 variables van aumentando y disminuyendo segun acertamos disparos y fallamos
	 * el juego se ejecuta hasta que te quedes sin disparos o aciertes todos los barcos<br>
	 * Pedimos por teclado al usuario 2 numeros que son las coordenadas x e y (su disparo)
	 * comprobamos que los numeros esten dentro del rango con la funcion correcto()<br>
	 * 
	 */

	static void disparo() {

		int disparosRestantes = 15; // disparos que tienes
		int golpesBarco = 0;

		while (disparosRestantes > 0 && golpesBarco < 4) {

			try {
				Scanner scposicionx = new Scanner(System.in);
				System.out.println("Dime la coordenada x (entre 0 y 4), por favor"); // pide por pantalla la coordenada x
				int x = scposicionx.nextInt();

				Scanner scposiciony = new Scanner(System.in);
				System.out.println("Dime la coordenada y (entre 0 y 4), por favor");// pide por pantalla la coordenada y
				int y = scposiciony.nextInt();

				if (correcto(x, y)) {
					if (mapa[x][y].equalsIgnoreCase("b")) {

						System.out.println("HAS DADO AL BARCO!!!"); // comprueba si la posicion [x][y] es true o falso
						System.out.println("");
						System.out.println("");
						mapaCerrado[x][y] = "O";
						golpesBarco++;
						System.out.println("Has golpeado " + golpesBarco + " veces.");

					}

					else {
						System.out.println("AGUA, prueba otra vez!!"); // si es true le ha dado si el falso AGUA!!
						System.out.println("");
						System.out.println("");
						mapaCerrado[x][y] = "X";
						System.out.println("Has golpeado " + golpesBarco + " veces.");

					}
					disparosRestantes--;

					mostrarTableroCerrado();
					System.out.println("Te quedan " + disparosRestantes + " disparos");

				}

			
			} catch (Exception e) {
				System.out.println("TIENES QUE INTRODUCIR UN NUMERO DEL 0 AL 4");
				// TODO: handle exception
			}
			
		}
		if (golpesBarco < 4) {
			
			System.out.println("FIN DEL JUEGO, HAS PERDIDO!!");
			mostrarTablero();
		}
			
			
		else {
			System.out.println("FELICIDADES!! HAS DERRIBADO TODOS LOS BARCOS");
			mostrarTablero();
		}
			

	
	}

	/**
	 * Funcion para ver si los numeros introducidos por el usuario son correctos
	 * (Que no se salgan de los parametros de la matriz) devuelve verdadero si es
	 * correcto y falso si no lo es.
	 * 
	 * @param a
	 * @param b
	 * @return boolean
	 */
	static boolean correcto(int a, int b) {

		if (a < 0 || a > 4 || b < 0 || b > 4) {
			System.out.println("ERROR!!! El numero tiene que ser entre 0 y 4 incluidos");
			return false;
		}

		else
			return true;

	}

	/**
	 * funcion para mostrar en pantalla la matriz
	 * 
	 */

	static void mostrarTablero() {

		for (int x = 0; x < mapa.length; x++) {

			for (int y = 0; y < mapa[x].length; y++) {

				if (y==0) {
					System.out.print(x+"     " + mapa[x][y] + " ");
				}
				else System.out.print("     " + mapa[x][y] + " ");
			
			}
			System.out.println("");
			System.out.println("   ----------------------------------");
		}

	}

	/**
	 * Metodo para resetear el tablero del juego<br>
	 * Recorre toda la matriz para Poner todos los valores de la matriz en A de agua
	 * 
	 * @return String[][]
	 */

	static String[][] resetearAgua() {

		for (int x = 0; x < mapa.length; x++) {

			for (int y = 0; y < mapa[x].length; y++) {

				mapa[x][y] = "A";
			}

		}

		return mapa;

	}
	
	/**
	 * Metodo para colocar los barcos en el tablero primero llamamos a la funcion
	 * resetearAgua() para que nos coloque todos los valores en A y despues
	 * colocamos los barcos Devuelve matriz con el agua y los barcos colocados
	 * 
	 * @return String[][]
	 */
	static String[][] ponerBarcos() {

		resetearAgua();
		mapa[0][4] = "B";
		mapa[0][3] = "B";
		mapa[2][1] = "B";
		mapa[2][0] = "B";

		return mapa;

	}
	
	
	/**
	 * funcion para mostrar en pantalla la matriz
	 * 
	 */
	static void mostrarTableroCerrado() {

		for (int x = 0; x < mapaCerrado.length; x++) {

			for (int y = 0; y < mapaCerrado[x].length; y++) {

				if (y==0) {
					System.out.print(x+"     " + mapaCerrado[x][y] + " ");
				}
				else System.out.print("     " + mapaCerrado[x][y] + " ");
			}
			System.out.println("");
			System.out.println("   ----------------------------------");
		}

	}
	
	/**
	 * Metodo para resetear el tablero del juego<br>
	 * Recorre toda la matriz para Poner todos los valores de la matriz en ?
	 * 
	 * @return String[][]
	 */
	
	static String[][] iniciarMapaCerrado() {

		for (int x = 0; x < mapaCerrado.length; x++) {

			for (int y = 0; y < mapaCerrado[x].length; y++) {

				mapaCerrado[x][y] = "?";
			}

		}

		return mapaCerrado;

	}
	
	

}
