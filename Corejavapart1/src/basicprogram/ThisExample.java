package basicprogram;

public class ThisExample {

	String name;
	
//	public ThisExample(String name) {
//		super();
//		this.name = name;
//		System.out.println("Name = "+name);
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisExample t = new ThisExample();
		t.setName("ABC");
		System.out.println("Object t = "+ t.name);
	}


}
