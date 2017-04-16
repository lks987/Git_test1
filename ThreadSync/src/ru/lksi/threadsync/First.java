package ru.lksi.threadsync;

public class First {
	static long startTime;
	static long endTime;
	static Run r1 = new Run ();
	public static void main(String[] args) {
		Thread t1 = new Thread (r1);
		Thread t2 = new Thread (r1);
		startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		endTime = System.currentTimeMillis();
		System.out.println("Время выполнения:" + (endTime - startTime) + "\n" + Run.number);
	}
	

}
