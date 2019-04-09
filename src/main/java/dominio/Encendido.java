package dominio;

public class Encendido extends Estado {
	
	@Override
	public void encender(Motor motor) {
		throw new YaEncendidoException(); 
		
	}

	@Override
	public void apagar(Motor motor) {
		motor.unEstado = new Apagado();
		motor.unaTemperatura = 0;
	}

		
}
