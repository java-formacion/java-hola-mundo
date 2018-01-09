package Ave;

public abstract class Canario extends Ave{


	private double tamaño;
	
	public double getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(double t) {
		tamaño=t;
	}
	
	public Canario (char sexo, int edad, String nAve, String nDueño) {
		super(sexo, edad,nAve,nDueño);
	}
	
	public Canario (char sexo, int edad, double tamaño, String nAve, String nDueño) {
		super(sexo, edad, nAve,nDueño);
		this.tamaño=tamaño;
	}

	public void altura(double tamaño) {
		if(tamaño>30) {
			System.out.println("grande");
		}
		if(tamaño==15.3) {
			System.out.println("mediano");
		}
		if(tamaño<15) {
			System.out.println("pequeño");
		}
	}
}

