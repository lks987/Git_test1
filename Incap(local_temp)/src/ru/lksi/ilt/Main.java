package ru.lksi.ilt;

import java.util.Scanner;

public class Main {
	static Integers int1;
	static Strings str1;
	static boolean isRunning;
	static Scanner scn1;
	static String command;
	static Thread tint;
	static Thread tstr;
	
	public static void main(String[] args) {
		int1 = new Integers ();
		str1 = new Strings ();
		isRunning = true;
		scn1 = new Scanner (System.in);
		tint = new Thread (int1);
		tstr = new Thread (str1);
		tint.start ();
		tstr.start ();
		System.out.println("**********************************\n");
		System.out.println("For help input /help\n");
		System.out.println("Enter command: ");
		command = scn1.next();
		processCommand (command);
		

	}
	
	public static void processCommand (String arg) {
		switch (arg) {
		case "/help":
			System.out.println("/help - list of command;");
			System.out.println("/str <String> - process your string value;");
			System.out.println("/int <Integer> - process your integer value;");
			System.out.println("/stat - show alive/dead processes");
			System.out.println("/revive <String, Integer> - reviving exact process");
			System.out.println("/autorevive - switch autorevive on/off");
			break;
		case "/int":
			int1.setNum(scn1.next());
			break;
		case "/str":
			str1.setWord(scn1.next());
			break;
		case "/stat":
			System.out.println("Integer processing is alive: " + tint.isAlive());
			System.out.println("String processing is alive: " + tstr.isAlive());
			break;
		case "/revive":
			switch (scn1.next()) {
			case "Integer":
				int1.end();
				tint.start();
				break;
			case "String":
				str1.end();
				tstr.start();
				break;
			default:
				System.out.println("Typed command is invalid");
				break;
			}
		case "/autorevive":
			
		}
	}
	
	
	
}
