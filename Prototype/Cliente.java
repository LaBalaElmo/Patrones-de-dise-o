package prototype.ejercicios;

public class Cliente {
	public static void main(String[] args) {
		Celular celular = new Celular();
		celular.setAccesorios(new Accesorios(true, false, true));
		celular.setBluetooth(true);
		celular.setCamara(12);
		celular.setCantidadDeMemoriaExterna(0);
		celular.setCpu("Snapdragon 855 / Exynos 9820");
		celular.setMemoria(64);
		celular.setSim(new Sim("Entel", 0));
		celular.setTamaño(6.4);
		celular.setTipoDeBateria(4100);
		celular.setVersionDeAndroid(11);
		
		Celular celular1 = (Celular) celular.clone();
		celular1.setAccesorios(new Accesorios(true, true, true));
		celular1.setCantidadDeMemoriaExterna(64);
		celular1.setSim(new Sim("Entel", 79856321));
		
		Celular celular2 = (Celular) celular.clone();
		celular2.setAccesorios(new Accesorios(true, true, false));
		celular2.setCantidadDeMemoriaExterna(128);
		celular2.setSim(new Sim("Tigo", 71536985));
		celular2.setVersionDeAndroid(10);
		
		Celular celular3 = (Celular) celular.clone();
		celular3.setCantidadDeMemoriaExterna(32);
		celular3.setSim(new Sim("Viva", 69856321));
		celular3.setVersionDeAndroid(9);
		
		celular1.mostrarInformacion();
		celular2.mostrarInformacion();
		celular3.mostrarInformacion();
	}
}
