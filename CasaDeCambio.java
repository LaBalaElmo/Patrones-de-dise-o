package singleton.ejercicios;

public class CasaDeCambio {
	public CasaDeCambio() {
		
	}
	/*
	 * Imprime el cambio que hay entre dos monedas, donde:
	 * monto: es la cantidad de dinero que se desea cambiar, se requiere un valor de tipo double.
	 * cambioDe: es la divisa de nuestro monto, es un string que puede ser boliviano, euro o dolar.
	 * cambioDe: es la divisa a la que se desea cambiar, es un string que puede ser boliviano, euro o dolar.
	 */
	public void cambio(double monto, String cambioDe, String cambioA) {
		EmpresaDeCambioDeMoneda.getInstance().cambio(monto, cambioDe, cambioA);
	}
}
