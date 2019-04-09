package dominio;

public class TanqueCombustible {
	
	private int unaCapacidad;
	private int unaCarga;
	
	public TanqueCombustible(int capacidad, int carga) {
		this.unaCapacidad = capacidad;
		this.unaCarga = carga;
	}

	public boolean enReserva() {
		return this.unaCarga < this.unaCapacidad * 0.1 ;
	}
	
	public boolean proximoAReserva() {
		return this.unaCarga < this.unaCapacidad * 0.15 ;
	}
	
	public boolean lleno() {
		return this.unaCarga == this.unaCapacidad;
	}
	
	public void consumir(int litros) {
		this.unaCarga = this.unaCarga - litros;
	}
	
	public boolean vacio() {
		return this.unaCarga == 0;
	}
	
	

}
