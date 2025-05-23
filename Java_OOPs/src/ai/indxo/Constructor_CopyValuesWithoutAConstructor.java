package ai.indxo;

class Student_CopyValue {
	int id;
	String name;

	Student_CopyValue(int i, String n) {
		id = i;
		name = n;
	}

	Student_CopyValue() {
	}

	void display() {
		System.out.println(id + " " + name);
	}
}

public class Constructor_CopyValuesWithoutAConstructor {
	public static void main(String args[]) {
		Student_CopyValue s1 = new Student_CopyValue(111, "Karan");
		Student_CopyValue s2 = new Student_CopyValue();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}
}
