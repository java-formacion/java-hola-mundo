package com.ipartek.formacion.practicaherencia;

public class Piolin extends Canario {
	
	private int numPelis;

	protected Piolin(char sexo, int edad, int tamano, int numPelis, String nombreAve, String nombreDueno) {
		super(sexo, edad, tamano, nombreAve, nombreDueno);
		this.numPelis = numPelis;
	}
	
	protected int getNumPelis() {
		return this.numPelis;
	}

	protected void setNumPelis(int numPelis) {
		this.numPelis = numPelis;
	}

	public static void main(String[] args) {

		Piolin[] arrPiolines = { 
			new Piolin('M', 5, 5, 2, "Piolin1", "Dueno1"), 
			new Piolin('H', 16, 16, 5, "Piolin2", "Dueno2"),
			new Piolin('M', 31, 32, 60, "Piolin3", "Dueno3")
		};
		
		arrPiolines[0].getNombres().setNombreAve("PiolinModif");
		arrPiolines[0].getNombres().setNombreDueno("DuenoModif");
		
		Loro loro = new Loro('M', 12, 'N', "azul", "Loro1", "DuenoLoro1");
		
		loro.cantar();
		
		arrPiolines[0].cantar();
		arrPiolines[1].cantar();
		arrPiolines[2].cantar();
		
		System.out.println(arrPiolines[0].getNombres().getNombreAve());
		System.out.println( arrPiolines[0].getNombres().getNombreDueno());
		
		Ave.getNumAves();
		
//		Piolin piolin = new Piolin('M', 15, 20, 5);
//		Loro loro = new Loro('H', 30, 'S', "Rojo");
//		
//		piolin.quienSoy();
//		loro.quienSoy();
//		
//		piolin.altura();
//		
//		loro.deDondEres();
//		
//		piolin.setTamano(35);
//		piolin.altura();
//		
//		loro.setRegion('S');
//		
//		Ave.getNumAves();
		
	}

}
