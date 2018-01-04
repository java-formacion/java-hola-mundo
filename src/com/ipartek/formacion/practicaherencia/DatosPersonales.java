package com.ipartek.formacion.practicaherencia;

public class DatosPersonales {
	
	private String nombreAve, nombreDueno;

	public DatosPersonales(String nombreAve, String nombreDueno) {
		this.nombreAve = nombreAve;
		this.nombreDueno = nombreDueno;
	}
	
	public String getNombreAve() {
		return this.nombreAve;
	}
	
	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}
	
	public String getNombreDueno() {
		return this.nombreDueno;
	}
	
	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

}
