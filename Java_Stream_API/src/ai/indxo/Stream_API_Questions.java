package ai.indxo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class IndxoEmployee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public IndxoEmployee(int id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "IndxoEmployee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
}

public class Stream_API_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<IndxoEmployee> employees = new ArrayList<>();

		employees.add(new IndxoEmployee(1, "Alice", 28, "Female", "HR", 2017, 55000));
		employees.add(new IndxoEmployee(2, "Bob", 34, "Male", "IT", 2015, 72000));
		employees.add(new IndxoEmployee(3, "Charlie", 30, "Male", "Finance", 2018, 61000));
		employees.add(new IndxoEmployee(4, "Diana", 25, "Female", "Marketing", 2020, 50000));
		employees.add(new IndxoEmployee(5, "Ethan", 29, "Male", "IT", 2019, 69000));
		employees.add(new IndxoEmployee(6, "Fiona", 31, "Female", "HR", 2016, 58000));
		employees.add(new IndxoEmployee(7, "George", 38, "Male", "Finance", 2012, 80000));
		employees.add(new IndxoEmployee(8, "Hannah", 27, "Female", "Marketing", 2021, 48000));
		employees.add(new IndxoEmployee(9, "Ivan", 33, "Male", "IT", 2014, 75000));
		employees.add(new IndxoEmployee(10, "Jane", 26, "Female", "HR", 2022, 47000));
		employees.add(new IndxoEmployee(11, "Kevin", 35, "Male", "Finance", 2013, 77000));
		employees.add(new IndxoEmployee(12, "Laura", 32, "Female", "Marketing", 2015, 53000));
		employees.add(new IndxoEmployee(13, "Mike", 29, "Male", "IT", 2019, 70000));
		employees.add(new IndxoEmployee(14, "Nina", 28, "Female", "HR", 2020, 56000));
		employees.add(new IndxoEmployee(15, "Oscar", 36, "Male", "Finance", 2011, 82000));
		
//		for(IndxoEmployee emp : employees) {
//			System.out.println(emp);
//		}
		
		// Q1. How many male and female employees are there in the organization ?
		
		Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(IndxoEmployee :: getGender, Collectors.counting()));

		System.out.println(collect);
		
		System.out.println("---------------------");
		
		// Q2. Print the name of all departments in the organization ?
		
		employees.stream().map(IndxoEmployee :: getDepartment).distinct().forEach(dept -> System.out.println(dept));
		
		System.out.println("----------------------");
		
		// Q3. What is the average age of male and female employees ?
		
		Map<String, Double> collect2 = employees.stream().collect(Collectors.groupingBy(IndxoEmployee :: getGender, Collectors.averagingInt(IndxoEmployee :: getAge)));
		System.out.println(collect2);
		


	}

}
