package com.ipartek.formacion.herencia;

public class Piolin extends Canario {

	public int numPelis;

	public Piolin(char sexo, int edad, double tamano, int numPelis) {
		super(sexo, edad, tamano);
		this.numPelis = numPelis;
	}

	public int getNumPelis() {
		return numPelis;
	}

	public void setNumPelis(int numPelis) {
		this.numPelis = numPelis;
	}

	public static void main(String[] args) {
		
		Piolin pio = new Piolin('M', 20, 16.5, 8);
		Loro lor = new Loro('H', 50, 'S', "Azul");
		
		pio.quienSoy();
		lor.quienSoy();
		
		pio.altura(pio.getTamano());
		
		lor.deDondeEres(lor.getRegion());
		
		pio.setTamano(50.5);
		pio.altura(pio.getTamano());
		
		lor.setRegion('N');
		
		System.out.println("Las aves creadas son: " + lor.avesCreadas());
		
	}

}
