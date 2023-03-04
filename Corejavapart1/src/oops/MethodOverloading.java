package oops;

public class MethodOverloading {

	float add(float a, float b) 
	{
		float sum = a + b;
		return sum;
	}
	int add(int a) 
	{
		return a++;
	}
	int add(int a, int b, int c) 
	{
		return (a+b+c);
	}
	void subtract(int a, int b)
	{
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading m = new MethodOverloading();
		float a = m.add(5.5f,5);
		System.out.println(a);
		
		System.out.println(m.add(5, 5));
		m.subtract(5, 2);
		
		System.out.println("one para: "+m.add(5));
		System.out.println("two para: "+m.add(5.5f,6));
		System.out.println("three para: "+m.add(5,6,7));
	}

}
