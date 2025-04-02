package ai.indxo;

import java.io.IOException;

public class ThrowsKeyword3 {

	void method() throws IOException {
		System.out.println("Device operation performed");
	}
}

class Main {
	public static void main(String args[]) throws IOException {// declare exception
		ThrowsKeyword3 m = new ThrowsKeyword3();
		m.method();
		System.out.println("normal flow...");
	}

}
