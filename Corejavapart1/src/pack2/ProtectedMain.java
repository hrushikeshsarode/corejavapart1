package pack2;
import pack1.*;
public class ProtectedMain extends ProtectDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedDemo pd = new ProtectedDemo();
		//pd.display();		// protected so can't be accessed
	}

}
