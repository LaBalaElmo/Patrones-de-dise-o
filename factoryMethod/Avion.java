package factoryMethod.ejercicios;

public class Avion {
	private String marca;
	private int capacidad;
	private String modelo;
	private int numeroDeAsientos;

	public Avion() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroDeAsientos() {
		return numeroDeAsientos;
	}

	public void setNumeroDeAsientos(int numeroDeAsientos) {
		this.numeroDeAsientos = numeroDeAsientos;
	}

	public void showInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Capacidad: " + capacidad);
		System.out.println("Modelo: " + modelo);
		System.out.println("Numero de asientos: " + numeroDeAsientos);
	}
}
