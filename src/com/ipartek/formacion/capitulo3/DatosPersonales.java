package com.ipartek.formacion.capitulo3;

public class DatosPersonales {

	
	private String nombreAve;
	private String nombreDueno;
	
	
	public DatosPersonales(String nombreAve, String nombreDueño) {
		super();
		this.nombreAve = nombreAve;
		this.nombreDueno = nombreDueño;
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


	public void setNombreDueno(String nombreDueño) {
		this.nombreDueno = nombreDueño;
	}
	
	
	
}
