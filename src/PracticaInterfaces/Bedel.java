package PracticaInterfaces;

public class Bedel extends Persona implements Hablador{
	public String turno;
	public int antiguedad;

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Bedel(int edad, String nombre, String turno, int antiguedad) {
		super(edad, nombre);
		this.turno = turno;
		this.antiguedad = antiguedad;
	}

	@Override
	public void Hablar() {
		System.out.println("Hola soy un bedel y se hablar "+this.edad+this.nombre+this.turno+this.antiguedad);
		
	}
}
