package ai.indxo;

import java.util.stream.Stream;

class Employee{
	
	String name;
	int age;
	double salary;
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
//	}
	
}

public class FilterMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Alexa", 23, 1000.00);
		Employee e2 = new Employee("Martin", 20, 2000.00);
		Employee e3 = new Employee("Putin", 43, 1500.00);
		Employee e4 = new Employee("Alex", 35, 1100.00);
		Employee e5 = new Employee("Charles", 21, 2000.00);
		Employee e6 = new Employee("Smith", 45, 2500.00);
		Employee e7 = new Employee("Anushka", 32, 4000.00);
		
		Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5, e6, e7);
		//stream.filter(e -> e.salary >= 1500.00).map(e -> e.name+" - "+e.age).forEach(e -> System.out.println(e));
		
		stream.filter(e -> e.salary >= 1500.00).forEach(e -> System.out.println(e.name+" - "+e.age));

	}

}
