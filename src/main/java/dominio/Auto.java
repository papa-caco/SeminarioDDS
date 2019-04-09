package dominio;

public class Auto {
	
	private int unaVelocidad;
	private Motor unMotor;
	private TanqueCombustible unTanque;
	public Auto(TanqueCombustible tanque,Motor motor, int velocidad) {
		this.unTanque = tanque;
		this.unMotor = motor;
		this.unaVelocidad = velocidad;
	}
	
	public void verificoEncendido() {
		if (this.unMotor.estaApagado()) {
			throw new YaApagadoException();}	
	}
	
	public boolean utilizaReserva() {
		this.verificoEncendido();
		return this.unTanque.enReserva();
	}
	
	public boolean estaEnMarcha() {
		return this.unMotor.estaEncendido();
	}
	
	public void acelerar(int kms) {
		this.verificoEncendido();
		this.unaVelocidad = this.unaVelocidad + kms;
	}
	
	public void encenderMotor() {
		this.unMotor.unEstado.encender(unMotor);
	}
	
	public int temperaturaMotor() {
		this.verificoEncendido();
		return this.unMotor.unaTemperatura;
	}
}
