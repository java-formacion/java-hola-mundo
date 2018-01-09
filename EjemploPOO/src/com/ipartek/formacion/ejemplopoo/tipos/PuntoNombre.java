package com.ipartek.formacion.ejemplopoo.tipos;

public class PuntoNombre extends Punto {
	private String nombre;

	public PuntoNombre(String nombre, int x, int y) {
		super(x,y); setNombre(nombre);
	}
	
	public PuntoNombre(String nombre) {
		//super(); setNombre(nombre);
		this(nombre, X_POR_DEFECTO, Y_POR_DEFECTO);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return super.toString() + " [nombre=" + getNombre() + "]";
	}
	
	
}
