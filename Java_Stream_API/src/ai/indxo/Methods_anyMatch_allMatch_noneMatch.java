package ai.indxo;

import java.util.Arrays;
import java.util.List;

class Person{
	
	String name;
	String country;
	
	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}
}
public class Methods_anyMatch_allMatch_noneMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Alex", "USA");
		Person p2 = new Person("Zain", "INDIA");
		Person p3 = new Person("SAJID", "NEPAL");
		Person p4 = new Person("Ching", "China");
		Person p5 = new Person("Steve", "JAPAN");
		
		List<Person> person = Arrays.asList(p1, p2, p3, p4, p5);
		
		boolean isAnyMatch = person.stream().anyMatch(c -> c.country.equals("INDIA"));
		System.out.println("Any INDIAN available ? :: "+isAnyMatch);
		
		boolean anyMatch = person.stream().anyMatch(p -> p.country.equals("ENGLAND"));
		System.out.println("Any ENGLANDI available ? :: "+anyMatch);
		
		System.out.println("----------------------------------------");
		
		boolean allMatch = person.stream().allMatch(p -> p.country.equalsIgnoreCase("india"));
		System.out.println("All person from india ?:: "+allMatch);
		
		System.out.println("----------------------------------------");
		
		boolean noneMatch = person.stream().noneMatch(p -> p.country.equals("MAXICO"));
		System.out.println("No person from maxico ?:: "+noneMatch);
		
	}

}
