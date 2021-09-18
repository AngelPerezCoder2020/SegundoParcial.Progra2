package org.formacion.factorymethod;

import static org.junit.Assert.*;
import org.junit.Test;
import AngelPerez.FactoryMethos.*;

public class TestLavadora {
	protected AbstractFactory Factoria;
	@Test
	public void test_carga_frontal() {
		Factoria = new CargaFrontalFactory();
		Lavadora lavadora = Factoria.getLavadora();
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		Factoria = new CargaSuperiorFactory();
		Lavadora lavadora = Factoria.getLavadora();
		lavadora.ponerMandos();
		lavadora.ponerTambor();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
