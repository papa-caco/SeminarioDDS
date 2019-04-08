package dominio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dominio.Auto;
import dominio.TanqueCombustible;

public class TestAuto {
	
	private Auto auto;
	
	@Before
	public void init() {
		TanqueCombustible tanque = new TanqueCombustible(100, 50);
		this.auto = new Auto(tanque);
				
	}
	
	@Test
	public void autoEstaEnReservaOk() {
		
		Assert.assertTrue(this.auto.estasEnReserva());
	}

}
