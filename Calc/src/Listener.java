import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class Listener extends JFrame{
	JLabel l1;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	double i,j,k,s,f,p,q;
	ActionListener eH1 = new eHandler1 ();
	
	public Listener (String s) {
		super (s);
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		l1 = new JLabel ("0");
		b0 = new JButton ("C");
		b1 = new JButton ("+");
		b2 = new JButton ("-");
		b3 = new JButton ("/");
		b4 = new JButton ("*");
		b5 = new JButton ("1");
		b6 = new JButton ("2");
		b7 = new JButton ("3");
		b8 = new JButton ("4");
		b9 = new JButton ("5");
		b10 = new JButton ("6");
		b11 = new JButton ("7");
		b12 = new JButton ("8");
		b13 = new JButton ("9");
		b14 = new JButton ("=");
		b15 = new JButton ("0");
		b16 = new JButton (".");
		add(l1);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b15);
		add(b14);
		add(b16);
		b5.addActionListener(eH1);
		b6.addActionListener(eH1);
		b7.addActionListener(eH1);
		b8.addActionListener(eH1);
		b9.addActionListener(eH1);
		b10.addActionListener(eH1);
		b11.addActionListener(eH1);
		b12.addActionListener(eH1);
		b13.addActionListener(eH1);
		b0.addActionListener(eH1);
		b1.addActionListener(eH1);
		b2.addActionListener(eH1);
		b3.addActionListener(eH1);
		b4.addActionListener(eH1);
		b14.addActionListener(eH1);
		b15.addActionListener(eH1);
		b16.addActionListener(eH1);
	}
	public class eHandler1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b0) {
				i = 0;
				j = 0;
				k = 0;
				p = 0;
				q = 1;
				f = 0;
				s = 0;
				l1.setText("0");
			}
			if (e.getSource() == b5) {
				if (f != 0) {
					q = q / 10;
					p = q * 1;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 1;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b6) {
				if (f != 0) {
					q = q / 10;
					p = q * 2;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 2;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b7) {
				if (f != 0) {
					q = q / 10;
					p = q * 3;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 3;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b8) {
				if (f != 0) {
					q = q / 10;
					p = q * 4;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 4;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b9) {
				if (f != 0) {
					q = q / 10;
					p = q * 5;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 5;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b10) {
				if (f != 0) {
					q = q / 10;
					p = q * 6;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 6;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b11) {
				if (f != 0) {
					q = q / 10;
					p = q * 7;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 7;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b12) {
				if (f != 0) {
					q = q / 10;
					p = q * 8;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 8;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b13) {
				if (f != 0) {
					q = q / 10;
					p = q * 9;
					i = i + p;
					l1.setText("" + i);
				}else {
					i = i*10 + 9;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b15) {
				if (f != 0) {
					q = q / 10;
					l1.setText("" + i);
				}else {
					i = i*10;
					l1.setText("" + i);
				}
			}
			if (e.getSource() == b16) {
				f = 1;
				q = 1;
				l1.setText("" + i);
			}
			if (e.getSource() == b1) {
					j = i;
					s = 1;
					i = 0;
					f = 0;
					q = 1;
					p = 0;
			}
			if (e.getSource() == b2) {
					j = i;
					s = 2;
					i = 0;
					f = 0;
					p = 0;
			}
			if (e.getSource() == b3) {
					j = i;
					s = 3;
					i = 0;
					f = 0;
					p = 0;
			}
			if (e.getSource() == b4) {
					j = i;
					s = 4;
					i = 0;
					f = 0;
					p = 0;
			}
			if (e.getSource() == b14) {
				if (s == 1) {
					k = j + i;
				}
				if (s == 2) {
					k = j - i;
				}
				if (s == 3) {
					k = j / i;
				}
				if (s == 4) {
					k = j * i;
				}
				l1.setText("" + k);
			}
		}
	}
}
