package ai.indxo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Personx{
	
	String name;
	String country;
	
	public Personx(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Personx [name=" + name + ", country=" + country + "]";
	}
	
}
public class Method_findFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personx p1 = new Personx("Alex", "USA");
		Personx p2 = new Personx("Zain", "INDIA");
		Personx p3 = new Personx("SAJID", "NEPAL");
		Personx p4 = new Personx("Ching", "China");
		Personx p5 = new Personx("Steve", "JAPAN");
		
		List<Personx> person = Arrays.asList(p1, p2, p3, p4, p5);
		
		Optional<Personx> findFirst = person.stream().filter(p -> p.country.equals("INDIA")).findFirst();
		
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		
		
	}

}
