package ai.indxo;

import java.io.IOException;

class ThrowsKeywordx {

	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class ThrowsKeyword2 {
	public static void main(String args[]) {
		try {
			ThrowsKeywordx m = new ThrowsKeywordx();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
		System.out.println("normal flow...");
	}
}
