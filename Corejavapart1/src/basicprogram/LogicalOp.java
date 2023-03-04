package basicprogram;

public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println("(a<b)&&(b<a): " +((a<b)&&(b<a)));
		System.out.println("(a<b)||(b>a): " +((a<b)||(b>a)));
		System.out.println("!(a>b): " +(!(a>b)));
	}
}
