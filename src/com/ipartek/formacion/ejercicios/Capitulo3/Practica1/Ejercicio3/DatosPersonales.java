package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio3;

/**
 * Se crear� una nueva clase llamada DatosPersonales, 
 * que tendr� como atributos el nombre del ave (String) 
 * y el nombre del due�o (String). 
 * Tendr� un constructor de clase en el que se inicialicen estos atributos 
 * y los m�todos get/set para cada uno de los atributos, por separado
 * @author java
 *
 */
public class DatosPersonales {
	private String nombreAve;

	
	public DatosPersonales(String nombreAve) {
		super();
		this.nombreAve = nombreAve;
	}


	public String getNombreAve() {
		return nombreAve;
	}


	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}
	
	
	
}
