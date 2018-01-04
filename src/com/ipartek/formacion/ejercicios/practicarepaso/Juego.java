package com.ipartek.formacion.ejercicios.practicarepaso;

public class Juego {
	public int numVidas;

	public Juego(int numVidas) {
		super();
		this.numVidas = numVidas;
	}
	
	public void MuestraVidasRestantes(int numVidas){
		
	}
	
	
	public static void main(String[] args) {
		Juego j = new Juego(5);
		j.MuestraVidasRestantes(0);
	}

}
