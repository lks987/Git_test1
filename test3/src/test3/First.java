package test3;

import javax.swing.JFrame;

public class First {
	public static void main (String [] args) {
		Reader r = new Reader("G - Гурда");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 200);
		r.setResizable(false);
	}	
	private static int count (int x) {
		x = x + 1;
		return x;
	}
}
