package ai.indxo;

class StudentDemo{
	
	int id;
	String name;
	
	// method to display the value of id and name
	public void display() {
		System.out.println(id+" "+name);
	}
}

public class ConstructorDefaultValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDemo sd = new StudentDemo();
		sd.display();
		
		StudentDemo sd2 = new StudentDemo();
		sd2.display();
	}

}
