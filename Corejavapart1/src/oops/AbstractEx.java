package oops;

abstract class Bike1 {
	abstract void speed();
	void display() {
		System.out.println("Bike class. ");
	}
}

class MotorBike extends Bike1{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("MotorBike. ");
	}
	
}

class SportsBike extends Bike1{	//	if the subclass is declared abstract, it's not mandatory to override abstract methods


	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("SportsBike. ");
	}
	
}

public class AbstractEx extends Bike1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx a = new AbstractEx();
	//	Bike a = new AbstractEx(); 
	//	Bike b = new Bike		// we cannot create object of abstract class
		a.display();
		a.speed();
		MotorBike m = new MotorBike();
		m.speed();
	}

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("Nice Bike. ");
	}

}
