package com.ipartek.formacion.ejercicios.Capitulo3.Practica3.Ejercicio12;

public class Juego {

	private int numVidas;
	private int gNumVidas;
	public Record r;

	
	
	public int getNumVidas() {
		return numVidas;
	}

	public void setNumVidas(int numVidas) {
		this.numVidas = numVidas;
	}

	public int getgNumVidas() {
		return gNumVidas;
	}

	public void setgNumVidas(int gNumVidas) {
		this.gNumVidas = gNumVidas;
	}

	public Record getR() {
		return r;
	}

	public void setR(Record r) {
		this.r = r;
	}

	public Juego(int numVidas, int gNumVidas, Record r) {
		super();
		this.numVidas = numVidas;
		this.gNumVidas = gNumVidas;
		this.r = r;
	}

	public void MuestraVidasRestantes() {
		// System.out.println("Numero de vidas: " + getNumVidas());
		System.out.println();
	}

	public boolean QuitarVida() {
		setNumVidas(numVidas - 1);
		if (getNumVidas() > 0) 
			return true;
		
		return false;
		
	}

	public void reiniciarVidas(Juego j) {
		j.numVidas = j.gNumVidas;
	}

	public void main(String[] args) {
		Record r = new Record(0);
		Juego j = new Juego(5, 5, r);

		if (!j.QuitarVida()) {
			System.out.println("Juego terminado!!");
		}
		reiniciarVidas(j);
	}
	
	
	

}
