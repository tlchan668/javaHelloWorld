
public class HelloWorldJava {
	
	private static String name;
	
	//getters and setters
	//how other classes read name
	public static String getName() {
		return name;//getter method store and retrieve data  to read
	}
	
	//to set data
	public static void setName(String _name) {
		name= _name;
	}
	

	public static void main(String[] args) {
		System.out.println("Hello World Java");
		setName("Traci");
		System.out.println(getName());
		

	}

}
