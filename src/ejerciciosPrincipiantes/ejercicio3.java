package ejerciciosPrincipiantes;
/**Escribe un programa Java que declare una variable entera N y asígnale un valor. A continuación escribe las instrucciones que realicen los siguientes:
Incrementar N en 77.
Decrementarla en 3.
Duplicar su valor.
Si por ejemplo N = 1 la salida del programa será:
Valor inicial de N = 1
N + 77 = 78
N - 3 = 75
N * 2 = 150
 */
public class ejercicio3 {
	public static void main(String[] args) {
	int n = 2;
	System.out.println("valor inicial de n =" + n);
	n = n + 77;
	System.out.println("valor de n + 77 =" + n);
	n= n-3;
	System.out.println("valor de n - 3 =" + n);
	n= n*2 ;
	System.out.println("valor de n * 2  =" + n);

	}
}
