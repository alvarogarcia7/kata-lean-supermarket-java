package lean01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CajeroTest {

	@Test
	public void emptyCajero_Should_ReadManzanasAs100() {
		Cajero cajero = new Cajero();
		cajero.read("Manzanas");
		assertEquals(cajero.total(), 100);
	}

	@Test
	public void emptyCajero_Should_ReadCerezaAs75() {
		Cajero cajero = new Cajero();
		cajero.read("Cerezas");
		assertEquals(cajero.total(), 75);
	}

	@Test
	public void cajeroConUnaManzana_Should_ReadCerezaAs175() {
		Cajero cajero = new Cajero();
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		cajero.read("Manzanas");
		assertEquals(cajero.total(), 250);
	}

}
