package com.ipartek.formacion.ejemplo.poo.tipos;

import java.util.ArrayList;
import java.util.List;

public class Poligono {
	private List<Punto> puntos = new ArrayList<Punto>();
	
	public void add (Punto p) {
		
		puntos.add(p);
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		for(Punto p : puntos) {
			sb.append(p).append("\n");
		}
		return sb.toString();
	}
	
	/*public Punto getPunto(int i) {
		return (Punto) puntos.elementAt(i);
	}*/

	
}
