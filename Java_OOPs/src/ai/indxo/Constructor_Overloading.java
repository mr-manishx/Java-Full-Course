package ai.indxo;

class Student_Overloading {
	int id;
	String name;
	int age;

	// creating two arg constructor
	Student_Overloading(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	Student_Overloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	// creating method to display values
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
}

//creating a Main class to create instance and call methods  
public class Constructor_Overloading {
	public static void main(String args[]) {
		Student_Overloading s1 = new Student_Overloading(111, "Karan");
		Student_Overloading s2 = new Student_Overloading(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}
