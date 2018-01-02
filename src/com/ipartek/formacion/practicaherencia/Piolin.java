package com.ipartek.formacion.practicaherencia;

public class Piolin extends Canario {
	
	private int numPelis;

	protected Piolin(char sexo, int edad, int tamano, int numPelis) {
		super(sexo, edad, tamano);
		this.setNumPelis(numPelis);
	}
	
	protected int getNumPelis() {
		return numPelis;
	}

	protected void setNumPelis(int numPelis) {
		this.numPelis = numPelis;
	}

	public static void main(String[] args) {
		
		Piolin piolin = new Piolin('M', 15, 20, 5);
		Loro loro = new Loro('H', 30, 'S', "Rojo");
		
		piolin.quienSoy();
		loro.quienSoy();
		
		piolin.altura();
		
		loro.deDondEres();
		
		piolin.setTamano(35);
		piolin.altura();
		
		loro.setRegion('S');
		
		Ave.getNumAves();
		
	}

}
