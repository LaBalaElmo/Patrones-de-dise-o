package singleton.ejercicios;

import java.text.DecimalFormat;

public class EmpresaDeCambioDeMoneda {
	private static EmpresaDeCambioDeMoneda instance = null;

	private EmpresaDeCambioDeMoneda() {

	}

	public static EmpresaDeCambioDeMoneda getInstance() {
		if (instance == null)
			instance = new EmpresaDeCambioDeMoneda();
		return instance;
	}

	public void cambio(double monto, String cambioDe, String cambioA) {
		DecimalFormat df = new DecimalFormat("#.00");
		cambioDe = cambioDe.toLowerCase();
		cambioA = cambioA.toLowerCase();
		double nuevoMonto = 0;
		if (cambioDe.equals("boliviano") && cambioA.equals("dolar")) {
			nuevoMonto = monto / 6.89;
			cambioDe = "bs";
			cambioA = "$";
		} else if (cambioDe.equals("boliviano") && cambioA.equals("euro")) {
			nuevoMonto = monto / 8.42;
			cambioDe = "bs";
			cambioA = "E";
		} else if (cambioDe.equals("euro") && cambioA.equals("dolar")) {
			nuevoMonto = monto * 1.22;
			cambioDe = "E";
			cambioA = "$";
		} else if (cambioDe.equals("euro") && cambioA.equals("boliviano")) {
			nuevoMonto = monto * 8.42;
			cambioDe = "E";
			cambioA = "bs";
		} else if (cambioDe.equals("dolar") && cambioA.equals("boliviano")) {
			nuevoMonto = monto * 6.89;
			cambioDe = "$";
			cambioA = "bs";
		} else if (cambioDe.equals("dolar") && cambioA.equals("euro")) {
			nuevoMonto = monto / 1.22;
			cambioDe = "$";
			cambioA = "E";
		} else {
			System.out.println("Ese cambio no esta disponible");
			return;
		}
		System.out.println(
				df.format(monto) + " " + cambioDe + " es quivalente a " + df.format(nuevoMonto) + " " + cambioA);
	}
}
