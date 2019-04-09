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
		TanqueCombustible tanque = new TanqueCombustible(100, 9);
		Motor motor = new Motor(0,new Apagado());
		this.auto = new Auto(tanque, motor, 0);
				
	}
	
	@Test
	public void temperturaRecienArranco() {
		Assert.assertTrue(this.auto.temperaturaMotor() == 0);
		this.auto.encenderMotor();		
		Assert.assertTrue(this.auto.temperaturaMotor() == 70);
	}

}
