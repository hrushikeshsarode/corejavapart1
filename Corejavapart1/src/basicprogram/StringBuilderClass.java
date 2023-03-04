package basicprogram;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str2 = new StringBuilder("Cooking ");
		str2.append("Emerging ");
		System.out.println(str2);
		System.out.println("Insert: "+str2.insert(17, "Technology"));
		System.out.println("Replace: "+str2.replace(8, 16, "IoT"));
		System.out.println(str2.reverse());
		System.out.println( str2.capacity() );
	}

}
