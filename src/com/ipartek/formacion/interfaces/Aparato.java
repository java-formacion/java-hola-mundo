package com.ipartek.formacion.interfaces;

public abstract class Aparato {

	private int consumo;
	private float precio;

	public Aparato(int consumo, float precio) {
		this.consumo = consumo;
		this.precio = precio;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
