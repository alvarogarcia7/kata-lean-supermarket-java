package lean01;

public class Cajero {

	private int total = 0;

	public void read(String string) {
		if("Manzanas".equals(string)){
			this.total+=100;
		} else {
			this.total+=75;
		}
		
	}

	public int total() {
		return total;
	}

}
