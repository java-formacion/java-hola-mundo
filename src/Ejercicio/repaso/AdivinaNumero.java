package Ejercicio.repaso;

import java.util.Scanner;

public class AdivinaNumero extends Juego{

	public int aleatorio;

	public AdivinaNumero(int vidas, int aleatorio) {
		super(vidas);
		this.aleatorio = aleatorio;
	}

	
	public void juega() {
		
		reiniciarPartida();
		
		while( vidas >0) {
		Scanner snum = new Scanner(System.in);
		System.out.println("Dime un numero (entre 0 y 10), por favor");
		int num = snum.nextInt();
		
		if(num == aleatorio) {
			
			System.out.println("Acertaste!!!1");
			actualizaRecord();
			return;
		}
		else {
			if(quitarVida()) {
				if(num > aleatorio) System.out.println("El numero es menor");
				else System.out.println("El numero es mayor");
			}
			else return;
			
		}
		}
		
	}

	
	
}
