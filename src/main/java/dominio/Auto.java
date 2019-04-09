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
	
	public boolean utilizaReserva() {
		return this.unTanque.enReserva();
	}
	
	public boolean estaEnMarcha() {
		return this.unMotor.unEstado ==  new Encendido();
	}
	
	public void acelerar(int kms) {
		this.unaVelocidad = this.unaVelocidad + kms;
	}
	
	public void encenderMotor() {
		this.unMotor.unEstado.encender(unMotor);
	}
	
	public int temperaturaMotor() {
		return this.unMotor.unaTemperatura;
	}
}
