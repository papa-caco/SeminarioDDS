package dominio;

public class Apagado  extends Estado {

	@Override
	public void encender(Motor motor) {
		motor.unEstado = new Encendido();
		motor.unaTemperatura = 70;
	}

	@Override
	public void apagar(Motor motor) {
		throw new YaApagadoException();
	}

}
