package test5;

import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class First {
	static Scanner scn;
	static Formatter ftr;
	
	public static void main (String[] args) {
		scn = new Scanner (System.in);
		try {
			ftr = new Formatter ("res\\1.txt");
		} catch (Exception e) {JOptionPane.showMessageDialog(null, "‘айл не найден");}
		System.out.println("¬ведите им€");
		String a = scn.next();
		System.out.println("¬ведите возраст");
		String b = scn.next();
		System.out.println("¬ведите половую ориентацию");
		String c = scn.next();
		ftr.format("ћен€ зовут %s, мне %s лет и € %s", a, b, c);
		ftr.close();
	}
}
