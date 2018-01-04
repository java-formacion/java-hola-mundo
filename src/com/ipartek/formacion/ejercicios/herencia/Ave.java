package com.ipartek.formacion.ejercicios.herencia;



public abstract class Ave {
	private String sexo;
	public int edad;
	public static int numAves=0;
	public DatosPersonales nombres;
	
	//constructor
	public Ave(String sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		numAves++;
		
	}
	
	public static void numeroAvesCreadas() {
		System.out.println("Se han creado " + numAves + " aves");
	}
	
	
	//Getters y Setters
	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		if(sexo!="M" && sexo!="H") {
			System.out.println("El sexo es erroneo");
		}else {
			this.sexo = sexo;
		}
		
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public static int getNumAves() {
		return numAves;
	}

	
	
	//metodos
	public static void setNumAves(int numAves) {
		Ave.numAves = numAves;
	}
	
	
	public void quienSoy(String sexo) {
				
		if (sexo == "H") {
			System.out.println("soy HEMBRA");
		}else {
			System.out.println("soy MACHO");
		}
				
	}
	
	//metodo abstracto
	protected abstract void cantar();

}
