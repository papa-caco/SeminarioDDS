package dominio;

public class Encendido extends Estado {
	
	@Override
	public void Encender(Auto auto) {
		
		throw new YaEncendidoException(); 
		
	}

	@Override
	public void Apagar(Auto auto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Acelerar(Auto auto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Frenar(Auto auto) {
		// TODO Auto-generated method stub
		
	}
	
	
}
