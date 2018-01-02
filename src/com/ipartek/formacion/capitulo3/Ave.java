package com.ipartek.formacion.capitulo3;

public class Ave {

	
	
	String sexo;
	int edad;
	static int numeroAvesCreadas=0;
	
	
	
	public Ave(String sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		
		numeroAvesCreadas++;
	}

	static void numAvesCreadas() {
		
		System.out.println(numeroAvesCreadas);
		
	}
	
	 void quienSoy() {
		 
		 System.out.println(sexo+ " " + edad);
		
	}
	
	
}
