package test6;

import java.util.Random;

public class Threads implements Runnable {
	int time;
	//String name;
	String text1;
	Random r = new Random();
	public Threads (String name) {
		text1=name;
		time = r.nextInt(100);
		
	}
	public void run() {
		System.out.printf("Процесс %s уходит в спячку на %d\n", text1, time);
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {e.printStackTrace();}
		System.out.printf("Процесс %s проснулся и самоубился об стену\n", text1);
	}
	
}
