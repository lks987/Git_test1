package test4;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class First {
	static String[][] m = new String[4][3];
	static Scanner scn;
	
	public static void main (String[] args) {
		FileReader();
		FillMassive();
		Out();
	}
	private static void FileReader () {
		try{
		scn = new Scanner (new File("res//1.txt"));
		}catch (Exception e) {JOptionPane.showMessageDialog(null, "Файл не найден");};
	}
	private static void FillMassive () {
		while (scn.hasNext()) {
			for (int x = 0; x < m.length; x++) {
				for (int y = 0; y < m[x].length; y++) {
					m[x][y] = scn.next();
				}
			}
		}
	}
	private static void Out () {
		for (int x = 0; x < m.length; x++) {
			for (int y = 0; y < m[x].length; y++) {
				System.out.print(" " + m[x][y] + " ");
			}
		System.out.println();
		}
	}
}
