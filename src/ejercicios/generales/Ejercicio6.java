package ejercicios.generales;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, suma = 0;
		System.out.println("Introduce un n�mero");
		n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				suma = suma + i;
			}
		}
		if (suma == n) {
			System.out.println("Es un n�mero perfecto");
		} else {
			System.out.println("No es n�mero perfecto");
		}
	}
}
