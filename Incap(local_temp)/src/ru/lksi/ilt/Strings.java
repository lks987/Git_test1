package ru.lksi.ilt;

public class Strings implements Runnable {
	private boolean isRunning;
	private String word;
	
	public Strings() {
		isRunning = true;
		word = "";
	}

	@Override
	public void run() {
		
		while (isRunning) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {e.printStackTrace();}
			if (!word.equals("")) {
				System.out.println("\n<String> catch it! Your integer value is: " + word + "\n");
				word = "";
			}
		}
	
	}

	String getWord() {
		return word;
	}

	void setWord(String word) {
		this.word = word;
	}
	
	void end () {
		isRunning = false;
	}

}
