package ru.lksi.ilt;

public class Strings implements Runnable {
	private boolean isRunning;
	private String word;
	
	public Strings() {
		
	}

	@Override
	public void run() {
		while (isRunning) {
			if (!word.equals("")) {
				System.out.println("<Integer> catch it! Your integer value is: " + word);
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
