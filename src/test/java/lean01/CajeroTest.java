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
	public void cajeroConUnaManzana_Should_ReadDosCerezaAs250Discount20Equals230() {
		Cajero cajero = new Cajero();
		cajero.read("Manzanas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		assertEquals(cajero.total(), 230);
	}

	@Test
	public void cajeroEmpty_Should_ReadFourCerezaAs300Discount40Equals260() {
		Cajero cajero = new Cajero();
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		assertEquals(cajero.total(), 260);
	}

}
