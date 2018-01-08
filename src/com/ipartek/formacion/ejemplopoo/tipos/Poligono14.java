package com.ipartek.formacion.ejemplopoo.tipos;

import java.util.Vector;

public class Poligono14 {

	@SuppressWarnings("rawtypes")
	private Vector puntos = new Vector();

	@SuppressWarnings("unchecked")
	public void add(Punto p) {
		
		puntos.add(p);
		
	}

	public String toString() {

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < puntos.size(); i++) {
			sb.append(puntos.elementAt(i)).append("\n");
		}

		return sb.toString();
		
	}

	public Punto getPunto(int i) {
		
		return (Punto) puntos.elementAt(i);
		
	}

}
