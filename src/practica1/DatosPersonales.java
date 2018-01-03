package practica1;

public class DatosPersonales {
	String nombreAve;
	String nombreDueño;
	public DatosPersonales(String nombreAve, String nombreDueño) {
		super();
		this.nombreAve = nombreAve;
		this.nombreDueño = nombreDueño;
	}
	public String getNombreAve() {
		return nombreAve;
	}
	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}
	public String getNombreDueño() {
		return nombreDueño;
	}
	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	
}
