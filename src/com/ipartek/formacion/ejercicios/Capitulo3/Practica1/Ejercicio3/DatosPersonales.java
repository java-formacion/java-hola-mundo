package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio3;

/**
 * Se creará una nueva clase llamada DatosPersonales, que tendrá como atributos
 * el nombre del ave (String) y el nombre del dueño (String). Tendrá un
 * constructor de clase en el que se inicialicen estos atributos y los métodos
 * get/set para cada uno de los atributos, por separado
 * 
 * @author java
 *
 */
public class DatosPersonales{
	private String nombreAve;
	private String nombreDueno;

	public DatosPersonales(String nombreAve, String nombreDueno) {
		this.nombreAve = nombreAve;
		this.nombreDueno = nombreDueno;
	}

	public String getNombreAve() {
		return nombreAve;
	}

	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}
	
	

}
