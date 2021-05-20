package prototype.ejercicios;

public class Accesorios {
	private boolean cargador;
	private boolean estuche;
	private boolean audifonos;
	
	public Accesorios(boolean cargador, boolean estuche, boolean audifonos) {
		this.cargador = cargador;
		this.estuche = estuche;
		this.audifonos = audifonos;
	}

	public boolean getCargador() {
		return cargador;
	}

	public void setCargador(boolean cargador) {
		this.cargador = cargador;
	}

	public boolean getEstuche() {
		return estuche;
	}

	public void setEstuche(boolean estuche) {
		this.estuche = estuche;
	}

	public boolean getAudifonos() {
		return audifonos;
	}

	public void setAudifonos(boolean audifonos) {
		this.audifonos = audifonos;
	}
}
