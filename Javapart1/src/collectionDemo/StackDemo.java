package collectionDemo;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		System.out.println("Stack: "+s);
		s.pop();
		System.out.println("Popped Stack: "+s);
		System.out.println("Element at top: "+s.peek());
		if(s.isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Stack is not Empty");
		}
	}

}
