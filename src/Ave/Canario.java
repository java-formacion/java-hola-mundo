package Ave;

public abstract class Canario extends Ave{


	private double tama�o;
	
	public double getTama�o() {
		return tama�o;
	}
	
	public void setTama�o(double t) {
		tama�o=t;
	}
	
	public Canario (char sexo, int edad, String nAve, String nDue�o) {
		super(sexo, edad,nAve,nDue�o);
	}
	
	public Canario (char sexo, int edad, double tama�o, String nAve, String nDue�o) {
		super(sexo, edad, nAve,nDue�o);
		this.tama�o=tama�o;
	}

	public void altura(double tama�o) {
		if(tama�o>30) {
			System.out.println("grande");
		}
		if(tama�o==15.3) {
			System.out.println("mediano");
		}
		if(tama�o<15) {
			System.out.println("peque�o");
		}
	}
}

