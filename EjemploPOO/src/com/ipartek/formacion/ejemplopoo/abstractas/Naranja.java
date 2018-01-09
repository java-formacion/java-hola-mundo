package com.ipartek.formacion.ejemplopoo.abstractas;

public class Naranja extends Fruto implements Rodable, Comestible {

	@Override
	public void comer() {
		System.out.println("¡Qué naranja más rica!");		
	}

	@Override
	public void rodar() {
		System.out.println("Naranja rodando");
	}

}
