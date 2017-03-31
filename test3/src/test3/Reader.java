package test3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reader extends JFrame {
	int i,k;
	String n1,n2;
	JLabel l1,l2,l3,l4;
	JButton b1,b2;
	JTextField t1,t2;
	ActionListener eH = new eHandler ();
	
	public Reader (String s) {
		super (s);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		b1 = new JButton("Очистить");
		b2 = new JButton("Посчитать");
		l1 = new JLabel("Введите Ваше число i");
		l2 = new JLabel("Введите Ваше число k");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add(l3);
		add(l4);
		add(t1);
		add(l1);
		add(t2);
		add(l2);
		add(b2);
		add(b1);
		b2.addActionListener(eH);
		b1.addActionListener(eH);
	}
	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) { try{
			if (e.getSource()==b2) {
				n1 = t1.getText();
				n2 = t2.getText();
				i = Integer.parseInt(n1);
				k = Integer.parseInt(n2);
				i++;
				k++;
				l3.setText("Теперь ваше число i равно " + i);
				l4.setText("Теперь ваше число k равно " + k);
			}
			if (e.getSource()==b1) {
				t1.setText("");
				t2.setText("");
				l3.setText(null);
				l4.setText(null);}
			}catch (Exception ee) {JOptionPane.showMessageDialog(null, "Не вводите, пожалуйста, хуйню. Вводите цифры.");}
		}
				
	}
		
}
