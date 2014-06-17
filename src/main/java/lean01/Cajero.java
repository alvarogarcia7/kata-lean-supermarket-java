package lean01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cajero {

	public static final int CHERRY_PRICE = 75;
	public static final int CHERRY_DISCOUNT = 20;
	public static final int BANANA_PRICE = 150;
	public static final int BANANA_DISCOUNT = BANANA_PRICE;
	private int total = 0;
	private int cerezas;
	private int bananas;
	private static final List<String> appleLocalizations = Arrays.asList(new String[] { "Manzanas","Pommes", "Mele"});

	public void read(String string) {
		calculatePrice(string);
	}

	private void calculatePrice(String string) {
		if(isApple(string)){
			this.total+=100;
		} else if("Bananas".equals(string)) {
			this.total+=BANANA_PRICE;
			this.bananas ++;
			if(this.bananas % 2 == 0){
				this.total -=BANANA_DISCOUNT;
			}
			
		}else {
			//TODO rename as "aplicaDescuento"
			this.cerezas++;
			if(this.cerezas % 2 == 0){
				this.total -=CHERRY_DISCOUNT;
			}
			this.total+=CHERRY_PRICE;
		}
	}

	private boolean isApple(String string) {
		return appleLocalizations.contains(string);
	}

	public int total() {
		return total;
	}

}
