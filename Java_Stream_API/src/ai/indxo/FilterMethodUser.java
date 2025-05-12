package ai.indxo;

import java.util.stream.Stream;

class User{
	
	String name;
	int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
public class FilterMethodUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User("Anushka", 23);
		User u2 = new User("Rithika", 21);
		User u3 = new User("Rani", 16);
		User u4 = new User("Anamika", 34);
		User u5 = new User("Anjali", 26);
		User u6 = new User("Alex", 15);
		
		Stream<User> user = Stream.of(u1, u2, u3, u4, u5, u6);
		user.filter(u -> u.age >= 18 && u.name.startsWith("A")).forEach(i -> System.out.println(i));
		
		Stream<User> users = Stream.of(u1, u2, u3, u4, u5, u6);
		users.filter(u -> u.age >= 19)
		.filter(u -> u.name.startsWith("R"))
		.forEach(idx -> System.out.println(idx));

	}

}
