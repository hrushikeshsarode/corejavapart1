package oops;

class Bike{  
	final int speed = 100;
	//speed = 500;
	void run(){
		System.out.println("running");
	}  
}  
	     
class Honda extends Bike{  
	
	void run() {
		System.out.println("running safely with 100kmph: "+ speed);
	}
} 

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda honda= new Honda();  
		honda.run(); 
		//Bike b = new Bike();
		honda.speed= 200;
		honda.run();
	}
}
