package ejercicios.principiantes;
/**
 * 
 * @author java
 *
 */
public class Ejercicio4 {
	
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int d=4;
		
		System.out.println("el valor incial de a es: "+a);
		System.out.println("el valor incial de b es: "+b);
		System.out.println("el valor incial de c es: "+c);
		System.out.println("el valor incial de d es: "+d);
		
		int x=b;
		b=c;
		c=a;
		a=d;
		d=x;
		
		System.out.println("el valor final de a es: "+a);
		System.out.println("el valor final de b es: "+b);
		System.out.println("el valor final de c es: "+c);
		System.out.println("el valor final de d es: "+d);
	}
	
}
