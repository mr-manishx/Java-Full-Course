package ai.indxo;

import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee_TATA{
	
	int id;
	String name;
	int age;
	double salary;
	String country;
	
	public Employee_TATA(int id, String name, int age, double salary, String country) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}

public class Method_groupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_TATA e1 = new Employee_TATA(1, "Alexa", 23, 1000.00, "JAPAN");
		Employee_TATA e2 = new Employee_TATA(2, "Martin", 20, 2000.00, "INDIA");
		Employee_TATA e3 = new Employee_TATA(3, "Putin", 43, 1500.00, "USA");
		Employee_TATA e4 = new Employee_TATA(4, "Alex", 35, 1100.00, "INDIA");
		Employee_TATA e5 = new Employee_TATA(5, "Charles", 21, 2000.00, "JAPAN");
		Employee_TATA e6 = new Employee_TATA(6, "Smith", 45, 2500.00, "ENGLAND");
		Employee_TATA e7 = new Employee_TATA(7, "Anushka", 32, 4000.00, "USA");
		
		List<Employee_TATA> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
		
		Map<String, List<Employee_TATA>> collect = list.stream().collect(Collectors.groupingBy(e -> e.country));
		
		System.out.println(collect);

	}

}

