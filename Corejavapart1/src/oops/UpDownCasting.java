package oops;

class Bike2  
{
	String bname;
	//abstract void speed();
	void display()
	{
		System.out.println("bike1 class--parent class");  
	}
	
}

 
class MotorBike2 extends Bike2
{
    int speed;
    @Override
    void display()
	{
		System.out.println("motorbike1 class--chlid class");  
	}
	
    void speed1()
	{
		System.out.println("motor bike speed");
	}
}


public class UpDownCasting {

	public static void main(String[] args) 
	{
		Bike2 b = new MotorBike2(); //upcasting-----done implicitly---Chlid to parent
		b.bname="BMW";
		System.out.println("bike name"+b.bname);
		b.display();
		MotorBike2 m = (MotorBike2) b;  //downcasting---done explicitly---parent to chlid
		m.speed = 100;
		System.out.println("bike name--->"+ m.bname);
		System.out.println("bike speed--->"+ m.speed);
		m.display();

	}

}
