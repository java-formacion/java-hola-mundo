package ejerciciosPrincipiantes;

/**Escribe un programa java que declare una variable A de tipo entero y as�gnale un valor. A continuaci�n muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
Si por ejemplo A = 14 la salida ser�
14 es par
Si fuese por ejemplo A = 15 la salida ser�:
15 es impar
 *
 */


public class ejercicio5 {

	public static void main(String[] args) {
		int a=3;
		System.out.println("El n�mero a = "+ a + " es: "+(a%2==0?"es par":"es impar"));
	}

}
