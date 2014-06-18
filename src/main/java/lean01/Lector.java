package lean01;

import java.util.Arrays;
import java.util.List;

public class Lector {

	public List<String> split(String string) {
		return Arrays.asList(string.split(", "));
	}

}
