package ru.lksi.ilt;

import java.util.Scanner;

public class Main {
	static Integers int1;
	static Strings str1;
	static Autorev ar;
	static boolean isRunning;
	static Scanner scn1;
	static Thread tint;
	static Thread tstr;
	static Thread tar;
	
	public static void main(String[] args) {
		int1 = new Integers ();
		str1 = new Strings ();
		ar = new Autorev ();
		isRunning = true;
		scn1 = new Scanner (System.in);
		tint = new Thread (int1);
		tstr = new Thread (str1);
		tint.start ();
		tstr.start ();
		System.out.println("**********************************\n");
		System.out.println("For help input /help\n");
		while (isRunning) {
			System.out.print("Enter command: ");
			processCommand (scn1.next());
		}
		scn1.close();
		int1.end();
		str1.end();
		ar.end();
		System.out.println("\nProgram is closed.");

	}
	
	public static void processCommand (String arg) {
		switch (arg) {
		case "/help":
			System.out.println("\n/help - list of command;");
			System.out.println("/str <String> - process your string value;");
			System.out.println("/int <Integer> - process your integer value;");
			System.out.println("/stat - show alive/dead processes");
			System.out.println("/rev <str, int> - reviving exact process");
			System.out.println("/autorev - switch autorevive on/off");
			System.out.println("/exit - close programm and bye-bye\n");
			break;
		case "/int":
			int1.setNum(scn1.next());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {e.printStackTrace();}
			break;
		case "/str":
			str1.setWord(scn1.next());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {e.printStackTrace();}
			break;
		case "/stat":
			System.out.println("\nInteger processing is alive: " + tint.isAlive());
			System.out.println("String processing is alive: " + tstr.isAlive() + "\n");
			break;
		case "/rev":
			switch (scn1.next()) {
			case "int":
				if (tint.isAlive()) {
					System.out.println("\nProcess Integer is already alive.\n");} 
				else {
				int1.setNum("");
				tint = new Thread (int1);
				tint.start();
				System.out.println("\nProcess Integer is revive.\n");}
				break;
			case "str":
				if (tstr.isAlive()) {
					System.out.println("\nProcess Integer is already alive.\n");} 
				else {
				str1.setWord("");
				tstr = new Thread (str1);
				tstr.start();
				System.out.println("\nProcess String is revive.\n");}
				break;
			default:
				System.out.println("Typed command is invalid\n");
				break;
			}
			break;
		case "/autorev":
			ar.setRunning(!ar.isRunning);
			tar = new Thread (ar);
			tar.start();
			if (ar.isRunning) {System.out.println("\nAutoreviving is ON\n");} 
			else {System.out.println("\nAutoreviving is OFF\n");}
			break;
		case "/exit":
			isRunning = false;
			break;
		default:
			System.out.println("\nTyped command is invalid\n");
			break;
		}
	}
}
