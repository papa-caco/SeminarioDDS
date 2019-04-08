package dominio;

public class Auto {
	
	private int Velocidad;

	private Estado estado;
	
	private TanqueCombustible tanqueCombustible;

	public Auto(TanqueCombustible t) {
		this.tanqueCombustible = t;
	}
	
	public boolean estasEnReserva() {
		
		return this.tanqueCombustible.estasEnReserva();
		
	}
}
