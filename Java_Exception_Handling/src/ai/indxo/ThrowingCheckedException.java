package ai.indxo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowingCheckedException {

	@SuppressWarnings("resource")
	public static void method() throws FileNotFoundException {
		
		FileReader fr = new FileReader("c:\\user\\desktop\\demo.txt");
		@SuppressWarnings("unused")
		BufferedReader bfr = new BufferedReader(fr);
		
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try  
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");  
	}
}
