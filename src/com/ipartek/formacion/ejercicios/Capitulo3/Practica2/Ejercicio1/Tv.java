package com.ipartek.formacion.ejercicios.Capitulo3.Practica2.Ejercicio1;

public class Tv extends Aparato implements Hablador{

	
	private boolean teletexto;
	private int antiguedad;
	
	public Tv(double consumo, double precio, boolean teletexto, int antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}
	

	public boolean getTeletexto() {
		return teletexto;
	}


	public void setTeletexto(boolean teletexto) {
		this.teletexto = teletexto;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	@Override
	public void hablar() {
		System.out.println("“Hola, soy un tv y sé hablar");
		System.out.println("Consumo: "+this.getConsumo()+"Precio: "+this.getPrecio());
		System.out.println("Antiguedad: "+this.getAntiguedad()+" Teletexto: "+this.getTeletexto());
		System.out.println();
		System.out.println();
	}
	
	
	
	
	
}
