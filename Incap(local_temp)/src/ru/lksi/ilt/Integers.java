package ru.lksi.ilt;

public class Integers implements Runnable {
	private boolean isRunning;
	private String num;
	
	public Integers() {
		isRunning = true;
		num = "";
	}

	@Override
	public void run() {
		
		while (isRunning) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {e.printStackTrace();}
			if (!num.equals("")) {
				System.out.println("\n<Integer> catch it! Your integer value is: " + Integer.parseInt(num) + "\n");
				num = "";
			}
		}
	
	}

	String getNum() {
		return num;
	}

	void setNum(String num) {
		this.num = num;
	}
	
	void end () {
		isRunning = false;
	}

}
