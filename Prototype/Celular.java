package prototype.ejercicios;

public class Celular implements ICelular {
	private double tamaño;
	private String cpu;
	private int memoria;
	private Sim sim;
	private int versionDeAndroid;
	private int camara;
	private boolean bluetooth;
	private int cantidadDeMemoriaExterna;
	private int tipoDeBateria;
	private Accesorios accesorios;
	private String modelo;

	public Celular() {
		this.modelo = "SamsungR10";
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public int getVersionDeAndroid() {
		return versionDeAndroid;
	}

	public void setVersionDeAndroid(int versionDeAndroid) {
		this.versionDeAndroid = versionDeAndroid;
	}

	public int getCamara() {
		return camara;
	}

	public void setCamara(int camara) {
		this.camara = camara;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public int getCantidadDeMemoriaExterna() {
		return cantidadDeMemoriaExterna;
	}

	public void setCantidadDeMemoriaExterna(int cantidadDeMemoriaExterna) {
		this.cantidadDeMemoriaExterna = cantidadDeMemoriaExterna;
	}

	public int getTipoDeBateria() {
		return tipoDeBateria;
	}

	public void setTipoDeBateria(int tipoDeBateria) {
		this.tipoDeBateria = tipoDeBateria;
	}

	public Accesorios getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Accesorios accesorios) {
		this.accesorios = accesorios;
	}

	@Override
	public Object clone() {
		Celular objClone = new Celular();
		objClone.setTamaño(this.tamaño);
		objClone.setCpu(this.cpu);
		objClone.setMemoria(this.memoria);
		objClone.setSim(this.sim);
		objClone.setVersionDeAndroid(this.versionDeAndroid);
		objClone.setCamara(this.camara);
		objClone.setBluetooth(this.bluetooth);
		objClone.setCantidadDeMemoriaExterna(this.cantidadDeMemoriaExterna);
		objClone.setTipoDeBateria(this.tipoDeBateria);
		objClone.setAccesorios(this.accesorios);
		return objClone;
	}

	public void mostrarInformacion() {
		System.out.println("********************************");
		System.out.println("Modelo: " + modelo);
		System.out.println("Tamaño: " + tamaño + " pulgadas");
		System.out.println("CPU: " + cpu);
		System.out.println("Memoria: " + memoria + " GB");
		System.out.println("Numero de telefono: " + sim.getNumeroDeTelefono());
		System.out.println("Empresa telefonica: " + sim.getEmpresa());
		System.out.println("Version de Android: " + versionDeAndroid);
		System.out.println("Camara: " + camara + " Megapixeles");
		if (bluetooth) {
			System.out.println("Viene con Bluetooth");
		} else {
			System.out.println("No viene con Bluetooth");
		}
		System.out.println("Memoria externa: " + cantidadDeMemoriaExterna + " GB");
		System.out.println("Tipo de bateria: " + tipoDeBateria + " mAh");

		if (accesorios.getAudifonos()) {
			System.out.println("Tiene audifonos");
		} else {
			System.out.println("No tiene audifonos");
		}

		if (accesorios.getCargador()) {
			System.out.println("Tiene cargador");
		} else {
			System.out.println("No tiene cargador");
		}

		if (accesorios.getEstuche()) {
			System.out.println("Tiene estuche");
		} else {
			System.out.println("No tiene estuche");
		}

	}

}
