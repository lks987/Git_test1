package ru.lksi.threadsync;

public class Run implements Runnable {
	static int number;
	public Run() {
		
	}
	public void run() {
		for (int i=0; i<20000000; i++){
			increase();
		}
	}
	static synchronized void increase () {
		number++;
	}
}
