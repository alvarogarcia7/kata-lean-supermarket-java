package lean01;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class LectorTest {

	@Test
	public void emptyLector_Should_SingleProduct() {
		Lector lector = new Lector();
		assertEquals(Arrays.asList(new String[]{"Manzanas"}), lector.split("Manzanas"));
	}

}
