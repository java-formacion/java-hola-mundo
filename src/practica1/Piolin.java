package practica1;

public class Piolin extends Canario{
	private int numeroPelis;

	public Piolin(char sexo, int edad, int tamano, int numeroPelis) {
		super(sexo, edad, tamano);
		this.numeroPelis = numeroPelis;
	}
	
	/*
	public static void main(String[] args) {
		Piolin piolin = new Piolin('F', 5, 50 ,150);
		Loro loro = new Loro('M', 8, 's', "verde");
		piolin.quienSoy();
		loro.quienSoy();
		piolin.mostrarAltura();
		loro.deDondeEres();
		piolin.setTamano(20);
		piolin.mostrarAltura();
		loro.setRegion('e');	
		System.out.println("Numero de aves creadas: " +  getNumAves());
	}
	*/
	
	public static void main(String[] args) {
		Piolin[] arrayPiolins = new Piolin[3];
		arrayPiolins[0]= new Piolin('s',5,50,150);
		arrayPiolins[1]= new Piolin('s',6,60,160);
		arrayPiolins[2]= new Piolin('s',7,70,170);
		DatosPersonales nombreLoro1 = new DatosPersonales("pio1","Dueño1");
		arrayPiolins[0].setNombres(nombreLoro1);
		Loro loro = new Loro('m', 5, 's', "Verde");
		System.out.println("Nombre: " + arrayPiolins[0].getNombres().nombreAve + " " + arrayPiolins[0].getNombres().nombreDueño);
	}
	public int getNumeroPelis() {
		return numeroPelis;
	}

	public void setNumeroPelis(int numeroPelis) {
		this.numeroPelis = numeroPelis;
	}

}
