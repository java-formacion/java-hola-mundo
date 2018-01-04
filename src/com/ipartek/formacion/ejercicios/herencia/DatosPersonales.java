package com.ipartek.formacion.ejercicios.herencia;

public class DatosPersonales {
	public String nombreAve;
	public String nombreDuenio;
	
	
	public DatosPersonales(String nombreAve, String nombreDuenio) {
		super();
		this.nombreAve = nombreAve;
		this.nombreDuenio = nombreDuenio;
	}


	public String getNombreAve() {
		return nombreAve;
	}


	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}


	public String getNombreDuenio() {
		return nombreDuenio;
	}


	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}
	
	
	
	

}
