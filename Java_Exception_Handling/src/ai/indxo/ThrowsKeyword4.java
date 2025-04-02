package ai.indxo;

import java.io.IOException;

public class ThrowsKeyword4 {

	void method() throws IOException {
		throw new IOException("device error");
	}
}
class Test{    
	   public static void main(String args[])throws IOException{//declare exception    
		   ThrowsKeyword4 m=new ThrowsKeyword4();    
		   m.method();    
		   System.out.println("normal flow...");    
	  }      
}
