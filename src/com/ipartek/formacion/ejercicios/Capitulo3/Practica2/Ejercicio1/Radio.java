package com.ipartek.formacion.ejercicios.Capitulo3.Practica2.Ejercicio1;

public class Radio extends Aparato implements Hablador{

	private double potencia;
	private boolean casette;
	
	public Radio(double consumo, double precio, double potencia, boolean casette) {
		super(consumo, precio);
		this.potencia = potencia;
		this.casette = casette;
	}
	
	

	public double getPotencia() {
		return potencia;
	}



	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}





	public boolean getCasette() {
		return casette;
	}



	public void setCasette(boolean casette) {
		this.casette = casette;
	}



	@Override
	public void hablar() {
		System.out.println("“Hola, soy una Radio y sé hablar");
		System.out.println("Consumo: "+this.getConsumo()+" precio: "+this.getPrecio());
		System.out.println("Potencia: "+this.getPotencia()+" Casette: "+this.getCasette());
		System.out.println();
		System.out.println();
		
	}

	
	

}
