package lean01;

public class Cajero {

	private static final int BANANA_PRICE = 150;
	private int total = 0;
	private int cerezas;
	private int bananas;

	public void read(String string) {
		calculatePrice(string);
		
	}

	private void calculatePrice(String string) {
		if("Manzanas".equals(string)){
			this.total+=100;
		} else if("Banana".equals(string)) {
			this.total+=BANANA_PRICE;
			this.bananas ++;
			if(this.bananas % 2 == 0){
				this.total -=150;
			}
			
		}else {
			//TODO rename as "aplicaDescuento"
			this.cerezas++;
			if(this.cerezas % 2 == 0){
				this.total -=30;
			}
			this.total+=75;
		}
	}

	public int total() {
		return total;
	}

}
