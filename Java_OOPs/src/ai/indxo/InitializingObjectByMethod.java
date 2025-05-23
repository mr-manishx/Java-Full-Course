package ai.indxo;

class Employee{
	int id;
	String name;
	int salary;
	
	void insertRecord(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class InitializingObjectByMethod {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.insertRecord(101, "martin", 1000);
		
		Employee emp2 = new Employee();
		emp2.insertRecord(10, "jufferi", 2000);
		
		emp1.display();
		emp2.display();
	}
}
