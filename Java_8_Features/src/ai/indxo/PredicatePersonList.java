package ai.indxo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class PredicatePersonList {

	public static void main(String[] args) {
		
		Person p1 = new Person("Smith", 34);
		Person p2 = new Person("Alexa", 16);
		Person p3 = new Person("Rithika", 19);
		Person p4 = new Person("Raaz", 17);
		Person p5 = new Person("Anjali", 22);
		Person p6 = new Person("Sanju", 20);
		
		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Person> predicate = person -> person.age >= 18;
		
		for(Person personx : personList) {
			if(predicate.test(personx)) {
				System.out.println(personx.name);
			}
		}
		
		
	}
}
