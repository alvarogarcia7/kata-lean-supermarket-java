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
	private int pommes;
	private int mele;
	private int manzanas;
	private int fruits;
	private static final List<String> appleLocalizations = Arrays.asList(new String[] { "Manzanas","Pommes", "Mele"});
	public static final int DISCOUNT_FIVE_FRUITS = 200;

	public void read(String string) {
		Lector lector = new Lector();
		for (String iterable_element : lector.split(string)) {
			calculatePrice(iterable_element);
		}
	}

	private void calculatePrice(String string) {
		this.fruits++;
		if(isApple(string)){
			if("Mele".equals(string)){
				this.total+=100;
				this.mele++;
				if(this.mele % 2 ==0){
					this.total -= 2*100;
					this.total += 150;
				}
			} else if ("Pommes".equals(string)){
				this.total+=100;
				this.pommes++;
				if(this.pommes % 3 ==0){
					this.total -= 3*100;
					this.total += 200;
				}
			} else {
				this.total+=100;
				this.manzanas++;
				if(this.manzanas % 4 ==0){
					this.total -= 4*100;
					this.total += 300;
				}
			}
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
		
		if(this.fruits % 5 == 0){
			this.total -= DISCOUNT_FIVE_FRUITS;
		}
	}

	private boolean isApple(String string) {
		return appleLocalizations.contains(string);
	}

	public int total() {
		return total;
	}

}
