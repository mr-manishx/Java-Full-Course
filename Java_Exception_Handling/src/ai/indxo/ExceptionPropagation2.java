package ai.indxo;

import java.io.IOException;

public class ExceptionPropagation2 {

	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropagation2 obj = new ExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
	}
}
