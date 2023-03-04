package oops;

abstract class Parent {
	abstract void show();
}
class Child extends Parent {
	void show() {
		System.out.println("Show method in Child Class ");
	}
}
public class AbstractPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Parent p2 = new Child();	// will give error because it is defined as abstract
		
		Parent p2 = new Child();
		p2.show();
		
		Child c1 = new Child();
		c1.show();
	}

}
