package ai.indxo;

class AccessorMutatorDemo {
	
	private int id;
	private String name;
	
	public void setId(int id) {  // mutator method 
		this.id = id;
	}
	public int getId() { // accessor method
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	void display() {
		System.out.println("id: "+id);
		System.out.println("Name: "+name);
	}
}
class AccessorMutator{
	public static void main(String[] args) {
		
		AccessorMutatorDemo am = new AccessorMutatorDemo();
		am.setId(12);
		am.setName("Cersie");
		am.display();
	}
}