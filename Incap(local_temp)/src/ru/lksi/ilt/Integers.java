package ru.lksi.ilt;

public class Integers implements Runnable {
	private boolean isRunning;
	private String num;
	
	public Integers() {
		
	}

	@Override
	public void run() {
		while (isRunning) {
			if (!num.equals("")) {
				System.out.println("<Integer> catch it! Your integer value is: " + Integer.parseInt(num));
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
