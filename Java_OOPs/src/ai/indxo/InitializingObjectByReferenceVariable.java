package ai.indxo;


class Student{
	int id;
	String name;
}
public class InitializingObjectByReferenceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		// assigning values through reference variable
		s1.id = 100;
		s1.name = "Sonoo";
		
		System.out.println(s1.id+" "+s1.name);

	}

}
