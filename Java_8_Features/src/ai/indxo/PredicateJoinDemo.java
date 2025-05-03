package ai.indxo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	
	String name;
	String location;
	String dept;
	
	Employee(String name, String location, String dept){
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}
public class PredicateJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Alex", "Bangalore", "Networking");
		Employee e2 = new Employee("Abhinash", "Tamilnadu", "HR");
		Employee e3 = new Employee("Rithika", "Hydrabad", "Database");
		Employee e4 = new Employee("Martin", "Pune", "Software");
		Employee e5 = new Employee("Radhika", "Hydrabad", "Database");
		Employee e6 = new Employee("Sanju", "Noida", "IT");
		
		List<Employee> emplist = Arrays.asList(e1, e2, e3, e4, e5, e6);
		
		Predicate<Employee> p1 = e -> e.location.equals("Hydrabad");
		Predicate<Employee> p2 = e -> e.dept.equals("Database");
		
		// Predicate join
		// and() and or() method
		
		Predicate<Employee> p = p1.and(p2);
		
		for(Employee emp : emplist) {
			if(p.test(emp)) {
				System.out.println(emp.name+" "+emp.dept+" "+emp.location);
			}
		}

	}

}
