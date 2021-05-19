package singleton.ejercicios;

public class Cliente {
	public static void main(String[] args) {
		Banco banco = new Banco();
		CasaDeCambio casaDeCambio = new CasaDeCambio();
		LibreCambista libreCambista = new LibreCambista();
		banco.cambio(100, "boliviano", "dolar");
		casaDeCambio.cambio(200, "euro", "boliviano");
		libreCambista.cambio(12.5, "dolar", "euro");
		
	}
}
