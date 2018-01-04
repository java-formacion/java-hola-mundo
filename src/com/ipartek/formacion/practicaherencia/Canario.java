package com.ipartek.formacion.practicaherencia;

public class Canario extends Ave {
	private int tamano;

	protected Canario(char sexo, int edad, String nombreAve, String nombreDueno) {
		super(sexo, edad, nombreAve, nombreDueno);
	}
	
	protected Canario(char sexo, int edad, int tamano, String nombreAve, String nombreDueno) {
		super(sexo, edad, nombreAve, nombreDueno);
		this.tamano = tamano;
	}
	
	protected int getTamano() {
		return tamano;
	}

	protected void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	protected void altura() {
		if(this.tamano < 15) {
			System.out.println("Alto");
		}
		else if (this.tamano > 30) {
			System.out.println("Mediano");
		}
		else {
			System.out.println("Bajo");
		}
	}

	@Override
	void cantar() {
		System.out.println("Pio-pio soy un Piolín");
	}

}
