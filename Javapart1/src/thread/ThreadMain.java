package thread;
import java.util.Scanner;
class ThreadsMul implements Runnable {
	int a;

	public ThreadsMul(int a) {
		super();
		this.a = a;
	}

	public void run() {
		try {
			ThreadMain.mul(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class ThreadEvenOdd implements Runnable {

	int a;

	public ThreadEvenOdd(int a) {
		super();
		this.a = a;
	}

	public void run() {
		try {
			ThreadMain.even(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class ThreadMain {

	static synchronized void mul(int t) throws InterruptedException {
		int a = t;
		System.out.println("Table of" + t + ":");
		for (int i = 1; i <= 10; i++) {

			System.out.println(a + "*" + i + "= " + (a * i));
			Thread.sleep(1000);
		}
	}

	static synchronized void even(int a) throws InterruptedException {
		System.out.println("Thread Even odd.....");
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0)
				System.out.println("Even No." + i);

			else
				System.out.println("Odd no." + i);
		}
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a no.");
		int s=ob.nextInt();
//		int r=ob.nextInt();
		ThreadEvenOdd e = new ThreadEvenOdd(10);
		Thread w1 = new Thread(e);
		w1.start();
		
		
		ThreadsMul t = new ThreadsMul(s);
		Thread t1 = new Thread(t);
		t1.start();
	}
}