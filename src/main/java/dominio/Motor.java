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


}
