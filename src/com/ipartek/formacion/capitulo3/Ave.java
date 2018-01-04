package com.ipartek.formacion.capitulo3;

public abstract class Ave {

	
	
	public String sexo;
	public int edad;
	public static int numeroAvesCreadas=0;
	
	public DatosPersonales nombres = new DatosPersonales(null, null);
	
	
	
	
	public Ave(String sexo, int edad) {
		super();
		this.sexo = sexo;
		this.edad = edad;
		
		numeroAvesCreadas++;
	}

	public static void numAvesCreadas() {
		
		System.out.println(numeroAvesCreadas);
		
	}
	
	public void quienSoy() {
		 
		 System.out.println(sexo+ " " + edad);
		
	}
	
	public abstract void cantar();
		
		
		
	
	
	
}
