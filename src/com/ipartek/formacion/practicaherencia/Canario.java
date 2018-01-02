package com.ipartek.formacion.practicaherencia;

public class Canario extends Ave {
	private int tamano;

	protected Canario(char sexo, int edad) {
		super(sexo, edad);
	}
	
	protected Canario(char sexo, int edad, int tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}
	
	protected void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	protected void altura() {
		if(this.tamano > 30) {
			System.out.println("Alto");
		}
		else if (this.tamano >= 15 || this.tamano <= 30) {
			System.out.println("Mediano");
		}
		else if(this.tamano < 15) {
			System.out.println("Bajo");
		}
	}

}
