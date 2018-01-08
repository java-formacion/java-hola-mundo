package com.ipartek.formacion.repaso;

public abstract class Juego {

	private int numVidas;
	private int vidasIniciales;
	private static int recordVidas = 0;

	public Juego(int numVidas) {
		this.numVidas = numVidas;
		this.vidasIniciales = numVidas;
	}

	public void mostrarVidasRestantes() {

		System.out.println("Te quedan " + numVidas + " vidas");

	}

	public boolean quitarVida() {

		this.numVidas--;

		if (this.numVidas == 0) {
			System.out.println("Juego Terminado");
			return false;
		} else {
			return true;
		}

	}

	public void reiniciarPartida() {

		this.numVidas = vidasIniciales;

	}

	public void actualizarRecord() {

		if (this.numVidas == this.recordVidas) {
			System.out.println("Record alcanzado!!!");
		} else if (this.numVidas > this.recordVidas) {
			this.recordVidas = this.numVidas;
			System.out.println("Nuevo record alcanzado!!!. El record es de " + recordVidas + " vidas");
		}
	}
	
	public abstract void juega();

}
