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
	public void cajeroConUnaManzana_Should_ReadDosCerezaAs250Discount30Equals220() {
		Cajero cajero = new Cajero();
		cajero.read("Manzanas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		assertEquals(cajero.total(), 220);
	}

	@Test
	public void cajeroEmpty_Should_ReadFourCerezaAs300Discount60Equals240() {
		Cajero cajero = new Cajero();
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		assertEquals(cajero.total(), 240);
	}

	@Test
	public void cajeroEmpty_Should_ReadOneBananaAndCharge150() {
	Cajero cajero = new Cajero();
	cajero.read("Banana");
	assertEquals(cajero.total(), 150);
	
	}

	@Test
	public void cajeroEmpty_Should_ReadTwoBananaAndOnlyChargesOne() {
		Cajero cajero = new Cajero();
		cajero.read("Banana");
		cajero.read("Banana");
		assertEquals(cajero.total(), 150);
	}

}
