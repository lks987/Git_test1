package ru.lksi.ilt;

public class Autorev implements Runnable {
	
	boolean isRunning = false;
	
	public Autorev() {
		
	}

	@Override
	public void run() {
		while (isRunning) {
			if (!Main.tint.isAlive()) {
				Main.int1.setNum("");
				Main.tint = new Thread (Main.int1);
				Main.tint.start();
			}
			if (!Main.tstr.isAlive()) {
				Main.str1.setWord("");
				Main.tstr = new Thread (Main.str1);
				Main.tstr.start();
			}
		}
		

	}

	boolean isRunning() {
		return isRunning;
	}

	void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	void end () {
		isRunning = false;
	}

}
