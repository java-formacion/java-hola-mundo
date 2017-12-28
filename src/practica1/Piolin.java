package practica1;

public class Piolin extends Canario{
	int numeroPelis;

	public Piolin(char sexo, int edad, int tama�o, int numeroPelis) {
		super(sexo, edad, tama�o);
		this.numeroPelis = numeroPelis;
	}
	
	public static void main(String[] args) {
		Piolin piolin = new Piolin('F', 5, 50 ,150);
		Loro loro = new Loro('M', 8, 's', "verde");
		piolin.quienSoy();
		loro.quienSoy();
		piolin.mostrarAltura();
		loro.deDondeEres();
		piolin.setTama�o(20);
		piolin.mostrarAltura();
		loro.setRegion('e');
		System.out.println("Numero de aves creadas: " +  numeroDeAves);
	}

	public int getNumeroPelis() {
		return numeroPelis;
	}

	public void setNumeroPelis(int numeroPelis) {
		this.numeroPelis = numeroPelis;
	}

}
