package thread;
class Threads implements Runnable {
	int a;

	public Threads(int a) {
		super();
		this.a = a;
	}

	public void run() {
		try {
			ThreadMul.mul(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Threads1 implements Runnable {
	int b;

	public Threads1(int b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {

		try {
			ThreadMul.mul(b);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class ThreadMul {

	static synchronized void mul(int t) throws InterruptedException {
		int a = t;
		System.out.println("Table of" + t + ":");
		for (int i = 1; i <= 10; i++) {

			System.out.println(a + "*" + i + "= " + (a * i));
			Thread.sleep(1000);

		}
	}

	public static void main(String[] args) {
		Threads t = new Threads(19);
		Thread t1 = new Thread(t);
		t1.start();

		Threads1 t2 = new Threads1(15);
		Thread t3 = new Thread(t2);
		t3.start();
	}

}