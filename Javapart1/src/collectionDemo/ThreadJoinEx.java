package collectionDemo;

class Thread1 extends Thread {
	public void run() {
		for(int i = 1; i<=3; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadJoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 ta = new Thread1();
		Thread1 tb = new Thread1();
//		Thread1 tc = new Thread1();
		ta.start();
		ta.join();
		System.out.println("Current Thread: " + Thread.currentThread().getName());
		ta.join();
	}

}
