package ejerciciosPrincipiantes;
/**Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación realiza las instrucciones necesarias para que:
B tome el valor de C
C tome el valor de A
A tome el valor de D
D tome el valor de B
Si por ejemplo A = 1, B = 2, C = 3 y D = 4 el programa debe mostrar:
Valores iniciales
A = 1
B = 2
C = 3
D = 4
Valores finales
B toma el valor de C -> B = 3
C toma el valor de A -> C = 1
A toma el valor de D -> A = 4
D toma el valor de B -> D = 2

 */
public class ejercicio4 {

	public static void main(String[] args) {
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	
	System.out.println("a="+ a + ", b= "+b+ ", c="+c + "d="+d);
	int e=a;
	int f=b;
	int g=c;
	int h=d;
	
	b=g;
	c=e;
	a=h;
	d=f;
	System.out.println("B toma el valor de C -> B ="+ b + ", C toma el valor de A -> C = "+c+ ", A toma el valor de D -> A ="+a + "D toma el valor de B -> D"+d);		
	
	//la solucion que dan ellos
	// int A = 1, B = 2, C = 3, D = 4, AUX;
    // System.out.println("Valores iniciales");
     //System.out.println("A = " + A);
    // System.out.println("B = " + B);
    // System.out.println("C = " + C);
    // System.out.println("D = " + D);
     //AUX = B;
    // B = C;
    // C = A;
    // A = D;
   //  D = AUX;
    // System.out.println("Valores finales");
    // System.out.println("B toma el valor de C -> B = " + B);
    // System.out.println("C toma el valor de A -> C = " + C);
   //  System.out.println("A toma el valor de D -> A = " + A);
    // System.out.println("D toma el valor de B -> D = " + D);
	
	}

}
