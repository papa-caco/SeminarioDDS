package dominio;

public class Auto {
	
	private int Velocidad;

	private Motor unMotor;
	
	private TanqueCombustible unTanque;

	public Auto(TanqueCombustible tanque,Motor motor) {
		this.unTanque = tanque;
		this.unMotor = motor;
	}
	
	public boolean estasEnReserva() {
		
		return this.unTanque.estasEnReserva();
		
	}
	
	public boolean estasEncendido() {
		
		return this.unMotor.estasEnMarcha();
		
	}
}
