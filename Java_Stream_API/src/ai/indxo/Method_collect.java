package ai.indxo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class PersonDemo{
	
	String name;
	String country;
	
	public PersonDemo(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "PersonDemo [name=" + name + ", country=" + country + "]";
	}
	
	
}
public class Method_collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonDemo p1 = new PersonDemo("Alex", "USA");
		PersonDemo p2 = new PersonDemo("Zain", "INDIA");
		PersonDemo p3 = new PersonDemo("SAJID", "NEPAL");
		PersonDemo p4 = new PersonDemo("Ching", "China");
		PersonDemo p5 = new PersonDemo("Steve", "INDIA");
		
		List<PersonDemo> person = Arrays.asList(p1, p2, p3, p4, p5);
		
//		List<PersonDemo> collect = person.stream().filter(p -> p.country.equals("INDIA")|| p.country.equalsIgnoreCase("japan")).collect(Collectors.toList());
//		
//		collect.forEach(i -> System.out.println(i));
		
		List<String> collect = person.stream().filter(p -> p.country.equals("INDIA")).map(p -> p.name.toUpperCase()).collect(Collectors.toList());
		
		collect.forEach(i -> System.out.println(i));
		
	}

}
