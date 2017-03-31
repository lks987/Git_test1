package test6;

public class First {
	public static void main(String[] args) {
		Thread t1 = new Thread (new Threads("First"));
		Thread t2 = new Thread (new Threads("Second"));
		Thread t3 = new Thread (new Threads("Third"));
		t1.start();
		t2.start();
		t3.start();
	}
	
}
