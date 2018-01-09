package Ave;

public class DatosPersonales {
	private String nAve;
	private String nDueño;
	
	public String getNave() {
		return nAve;
	}
	
	public void setNave(String nAve) {
		this.nAve=nAve;
	}
	
	public String getNdueño() {
		return nDueño;
	}
	
	public void setNdueño (String nDueño) {
		this.nDueño=nDueño;
	}
	
	public DatosPersonales (String nAve, String nDueño) {
		this.nAve=nAve;
		this.nDueño=nDueño;
	}
	
}
