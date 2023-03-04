package basicprogram;

class Exception1{
	
}
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10, b = 0;
			int c = 10/0;
			System.out.println("Value of c: "+c);
			
//			int[] number = {1,2,3};
//			System.out.println(number[12]);
			
//			int a = Integer.parseInt(null);
//			System.out.println("a = "+a);
			
//			int b = Integer.parseInt("Hi");
//			System.out.println("b = "+b);
			
//			int c = Integer.parseInt("90");
//			System.out.println("c = "+c);
			
//			String s1 = null;
//			System.out.println("Length: "s1.length());

		}
//		catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println(e);
//		}

//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		
		catch(Exception e) {
			System.out.println("Error");
		}
		
		finally {
			System.out.println("Finally Block");
		}
		// throws throw
	}

}
