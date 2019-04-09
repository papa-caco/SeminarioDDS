package dominio;

public class Encendido extends Estado {
	
	public Encendido(Motor motor) {
		motor.unEstado = new Encendido(motor);
		motor.unaTemperatura =70;
		
	}
	
	@Override
	public void encender(Motor motor) {
		throw new YaEncendidoException(); 
		
	}

	@Override
	public void apagar(Motor motor) {
		motor.unEstado = new Apagado(motor);
		motor.unaTemperatura = 0;
	}

		
}
