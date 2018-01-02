package com.ipartek.formacion.capitulo3;

public class Piolin extends Canario {

	
	public int numeroDePeliculas;

	
	
	
	public Piolin(String sexo, int edad, float tamaño, int numeroDePeliculas) {
		super(sexo, edad, tamaño);
		this.numeroDePeliculas = numeroDePeliculas;
		
		
	}
	
	public  void cantar() {
		
		System.out.println("Pio - Pio soy un Piolin");
	}




	public static void main(String[] args) {
	
		
		
		
		
		
		Piolin p1 = new Piolin("H", 10, 16, 5);
		Piolin p2 = new Piolin("M", 5, 13, 2);
		Piolin p3 = new Piolin("H", 6, 34, 3);
		Piolin[] piolines = {p1,p2,p3};
		
		p1.nombres.setNombreAve("Pakirrin");
		p1.nombres.setNombreDueño("Borja");
		
		Loro l = new Loro("M", 35, "S", "rojo");
		
		l.cantar();
		p1.cantar();
		p2.cantar();
		p3.cantar();
		System.out.println("Nombre del ave : " + p1.nombres.getNombreAve() + " nombre del dueño: " + p1.nombres.getNombreDueño());
		
		
		
	}
	
}
