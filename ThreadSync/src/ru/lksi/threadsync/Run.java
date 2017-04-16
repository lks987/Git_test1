package ru.lksi.threadsync;

public class Run implements Runnable {
	static int number;
	public Run() {
		
	}
	public synchronized void run() {
		for (int i=0; i<20000000; i++){
			increase();
		}
	}
	void increase () {
		number++;
	}
}
