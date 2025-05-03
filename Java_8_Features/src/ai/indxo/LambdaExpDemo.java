package ai.indxo;

@FunctionalInterface
interface MyInterface{
	public void m2();
}
public class LambdaExpDemo {
	
	public static void main(String[] args) {
		MyInterface mit = ()-> System.out.println("m2() method called..");
		mit.m2();
	}
}
