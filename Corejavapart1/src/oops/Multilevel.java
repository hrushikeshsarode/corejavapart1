package oops;

class Vehicle{
	String type = "Car";
	void display() {
		System.out.println("Type of Vehicle: "+ type);
	}
}
class Brand extends Vehicle{
	String name = "Tata";
	void displayName() {
		System.out.println("Brand Name: "+name);
	}
}
class Model extends Brand{
	String model = "Nano";
	void displayModel() {
		System.out.println("Model Name: "+model);
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Model m = new Model();
		m.display();
		m.displayName();
		m.displayModel();
	}

}
