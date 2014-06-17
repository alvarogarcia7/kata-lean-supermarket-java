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
	public void emptyCajero_Should_ReadPommes() {
		Cajero cajero = new Cajero();
		cajero.read("Pommes");
		assertEquals(cajero.total(), 100);
	}
	@Test
	public void emptyCajero_Should_ReadMele() {
		Cajero cajero = new Cajero();
		cajero.read("Mele");
		assertEquals(cajero.total(), 100);
	}

	@Test
	public void emptyCajero_Should_ReadCerezaAs75() {
		Cajero cajero = new Cajero();
		cajero.read("Cerezas");
		assertEquals(cajero.total(), 75);
	}

	@Test
	public void cajeroConUnaManzana_Should_ReadDosCerezaMinusDiscount() {
		Cajero cajero = new Cajero();
		cajero.read("Manzanas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		assertEquals(cajero.total(), 100+2*cajero.CHERRY_PRICE-1*cajero.CHERRY_DISCOUNT);
	}

	@Test
	public void cajeroEmpty_Should_ReadFourCerezaAs300MinusDiscount() {
		Cajero cajero = new Cajero();
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		cajero.read("Cerezas");
		assertEquals(cajero.total(), 4*Cajero.CHERRY_PRICE-2*cajero.CHERRY_DISCOUNT);
	}

	@Test
	public void cajeroEmpty_Should_ReadOneBananaAndCharge150() {
	Cajero cajero = new Cajero();
	cajero.read("Bananas");
	assertEquals(cajero.total(), 150);
	
	}

	@Test
	public void cajeroEmpty_Should_ReadTwoBananaAndOnlyChargesOne() {
		Cajero cajero = new Cajero();
		cajero.read("Bananas");
		cajero.read("Bananas");
		assertEquals(cajero.total(), 150);
	}
	
	@Test
	public void cajeroEmpty_Should_ReadAcceptationTestIteration4() {
		Cajero cajero = new Cajero();
		cajero.read("Cerezas");
		cajero.read("Pommes");
		cajero.read("Cerezas");
		cajero.read("Bananas");
		cajero.read("Bananas");
		cajero.read("Manzanas");
		assertEquals(cajero.total(), 480);
	}

}
