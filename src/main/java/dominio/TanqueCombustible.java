package dominio;

public class TanqueCombustible {
	
	private int capacidad;
	private int litros;
	
	public boolean estasEnReserva() {
		
		return true;
		
	}
	
	public TanqueCombustible(int c, int l) {
		this.capacidad = c;
		this.litros = l;
	}
	

}
