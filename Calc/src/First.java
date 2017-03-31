import javax.swing.JFrame;

public class First {
	public static void main (String[] args) {
		Listener l = new Listener ("Calculator");
		l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setSize(150, 230);
		l.setResizable(false);
		
		}
	}