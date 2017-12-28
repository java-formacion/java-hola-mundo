package ejerciciosEstructuraSecuencial;

/**Programa Java que lea un número entero por teclado y calcule si es par o impar.
 * Podemos saber si un número es par si el resto (%)de dividir el número entre 2 es igual a cero. 
 * En caso contrario el número es impar
 */

public class ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("introduce un número");
		
		int a;
		System.out.println("El número introducido = "+ a + " es: "+(a%2==0?"es par":"es impar"));

	}

}
