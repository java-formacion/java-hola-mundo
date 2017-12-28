package practica1;

public class Canario extends Ave{
	int tamaño;
	
	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}

	public Canario(char sexo, int edad, int tamaño) {
		super(sexo, edad);
		this.tamaño = tamaño;
	}
	
	void mostrarAltura() {
		if (tamaño>30) {
			System.out.println("Alto");
		}else if(tamaño>=15) {
			System.out.println("Mediano");
		}else {
			System.out.println("Bajo");
		}
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
}
