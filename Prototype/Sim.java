package prototype.ejercicios;

public class Sim {
	private String empresa;
	private int numeroDeTelefono;
	
	public Sim (String empresa, int numeroDeTelefono) {
		this.empresa = empresa;
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public void setNumeroDeTelefono(int numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}
}
