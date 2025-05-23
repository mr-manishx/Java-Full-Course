package ai.indxo;

class Vahicle{
	
	String model;
	int price;
	String color;
	
	public Vahicle(String model, int price, String color) {
		this.model = model;
		this.price = price;
		this.color = color;
	}
	public void display(){
		System.out.println(model+" "+price+" "+color);
	}
}

public class ConstructorVahicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vahicle v = new Vahicle("RXYZ10D", 20000, "Black");
		v.display();
	}

}
