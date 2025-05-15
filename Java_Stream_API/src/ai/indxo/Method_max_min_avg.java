package ai.indxo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee_{
	
	String name;
	int age;
	double salary;
	
	public Employee_(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}

public class Method_max_min_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_ e1 = new Employee_("Alexa", 23, 1000.00);
		Employee_ e2 = new Employee_("Martin", 20, 2000.00);
		Employee_ e3 = new Employee_("Putin", 43, 1500.00);
		Employee_ e4 = new Employee_("Alex", 35, 1100.00);
		Employee_ e5 = new Employee_("Charles", 21, 2000.00);
		Employee_ e6 = new Employee_("Smith", 45, 2500.00);
		Employee_ e7 = new Employee_("Anushka", 32, 4000.00);
		
		List<Employee_> list = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
		Optional<Employee_> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		
		System.out.println("Maximum salary: "+max.get());
		
		Optional<Employee_> collect = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("Minimum Salary: "+collect.get());
		
		Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Average salary: "+avg);
		
		

	}

}
