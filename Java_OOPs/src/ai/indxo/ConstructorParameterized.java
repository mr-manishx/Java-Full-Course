package ai.indxo;

//Java Program to demonstrate the use of the parameterized constructor.    
class Student_Constructor {
	int id;
	String name;

	// creating a parameterized constructor
	Student_Constructor(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}
}

//Main class to create objects and class methods  
public class ConstructorParameterized {
	public static void main(String args[]) {
		// creating objects and passing values
		Student_Constructor s1 = new Student_Constructor(111, "Joseph");
		Student_Constructor s2 = new Student_Constructor(222, "Sonoo");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}
