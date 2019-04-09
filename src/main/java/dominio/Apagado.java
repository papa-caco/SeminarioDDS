package dominio;

public class Apagado  extends Estado {
	
	public Apagado(Motor motor) {
		motor.unEstado = new Apagado(motor);
		motor.unaTemperatura = 0;
		
	}

	@Override
	public void encender(Motor motor) {
		motor.unEstado = new Encendido(motor);
		motor.unaTemperatura = 70;
	}

	@Override
	public void apagar(Motor motor) {
		throw new YaApagadoException();
	}

}
