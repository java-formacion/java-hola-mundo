package com.ipartek.formacion.ejemplopoo.interfaces;

public class Naranja extends Fruto implements Rodable, Comestible {

	@Override
	public void comer() {
		
		System.out.println("Que naranja más rica");
		
	}

	@Override
	public void rodar() {
		
		System.out.println("Naranja rodando");
		
	}

}
