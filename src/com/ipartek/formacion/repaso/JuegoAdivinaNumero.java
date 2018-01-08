package com.ipartek.formacion.repaso;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

	private int numAdivinar;

	public JuegoAdivinaNumero(int numVidas, int numAdivinar) {
		super(numVidas);
		this.numAdivinar = numAdivinar;
	}

	public void juega() {

		reiniciarPartida();

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entre en 0 y el 10: ");
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num == numAdivinar) {
			
		}

	}

}
