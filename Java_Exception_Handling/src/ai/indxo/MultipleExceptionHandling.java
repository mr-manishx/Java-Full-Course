package ai.indxo;

import java.io.File;
import java.io.IOException;

public class MultipleExceptionHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("c:/indxo/demo.txt");
		try {
			@SuppressWarnings("unused")
			int a = 23/0;
		}
		catch(ArithmeticException e) {
			// handle the arithmetic exception
		}
		catch(Exception ee) {
			// handle the all exception
		}
		finally {
			if(f != null) {
				// close the connection
			}
		}
	}

}
