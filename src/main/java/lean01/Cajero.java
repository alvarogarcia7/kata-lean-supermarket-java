package lean01;

public class Cajero {

	private int total = 0;
	private int cerezas;

	public void read(String string) {
		if("Manzanas".equals(string)){
			this.total+=100;
		} else {
			this.cerezas++;
			if(this.cerezas % 2 == 0){
				this.total -=20;
			}
			this.total+=75;
		}
		
	}

	public int total() {
		return total;
	}

}
