package lean01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TPVReader {
	
	public static void main(String[] args) throws IOException{
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		String input;
		Cajero cajero = new Cajero();
		while(true){
		input = bis.readLine();
		cajero.read(input);
		System.out.println(cajero.total());
		}
	}

}
