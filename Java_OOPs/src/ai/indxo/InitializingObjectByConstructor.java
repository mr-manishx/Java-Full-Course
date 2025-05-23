package ai.indxo;


class Stud{
	int id;
	String name;
	
	public Stud(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class InitializingObjectByConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud s = new Stud(1, "john");
		s.display();
	}

}
