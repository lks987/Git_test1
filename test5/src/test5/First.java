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
		} catch (Exception e) {JOptionPane.showMessageDialog(null, "���� �� ������");}
		System.out.println("������� ���");
		String a = scn.next();
		System.out.println("������� �������");
		String b = scn.next();
		System.out.println("������� ������� ����������");
		String c = scn.next();
		ftr.format("���� ����� %s, ��� %s ��� � � %s", a, b, c);
		ftr.close();
	}
}
