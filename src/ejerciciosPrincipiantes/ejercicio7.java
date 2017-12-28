package ejerciciosPrincipiantes;

/**Escribe un programa java que declare una variable C de tipo entero y asígnale un valor. 
 * A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, 
 * si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) 
 * dentro del println para resolverlo.
Si por ejemplo C = 55 la salida será
55 es positivo
55 es impar
55 es múltiplo de 5
55 no es múltiplo de 10
55 es menor que 100
 * 
 */

public class ejercicio7 {

	public static void main(String[] args) {
		int a = 55;
		System.out.println(a + (a>=0?" positivo ":" negativo ")+(a%2==0?",es par ":",es impar ")+ (a%5==0?",es multiplo de 5":",no es multiplo de 5")+(a%10==0?",es multiplo de 10":"no es multiplo de 10")+(a<100?"es menor que 100":"no es menor que 100"));

	}

}
