package ejercicios.principiantes;

/**
 * 
 * @author java
 *
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		int c=55;
		System.out.println(c+" "+(c>=0 ? "es positivo" : "es negativo"));
		System.out.println(c+" "+(c%2==0 ? "es par" : "es impar"));
		System.out.println(c+" "+(c%5==0 ? "es multiplo de 5" : "no es multiplo de 5"));
		System.out.println(c+" "+(c%10==0 ? "es multiplo de 10" : "no es multiplo de 10"));
		System.out.println(c+" "+(c>=100 ? "es mayor q 100" : "es menor q 100"));
	}
}
