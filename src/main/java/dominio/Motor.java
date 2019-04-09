package dominio;

public class Motor {
	
	public int unaTemperatura;
	public Estado unEstado;
	
	public Motor(int temperatura,Estado estado) {
		this.unaTemperatura = temperatura;
		this.unEstado = estado;
	}
	
	public boolean caliente() {
		return this.unaTemperatura >= 95;
	}
	
	public void enfriarse(int grados ) {
		this.unaTemperatura -= grados;
	}
	
	public void calentarse(int grados ) {
		this.unaTemperatura += grados;
	}
	
	public boolean estaEncendido() {
		return this.unEstado.equals(new Encendido(this));
	}
	
	public boolean estaApagado() {
		return this.unEstado.equals(new Apagado(this));
	}
	
	public void encenderse() {
		if (this.estaEncendido()) {
			throw new YaEncendidoException();
		} else {
			this.unEstado.encender(this);
		}
	}
	
	public void apagarse() {
		if (this.estaApagado()) {
			throw new YaApagadoException();
		} else {
			this.unEstado.apagar(this);
		}
	}


}
