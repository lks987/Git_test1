package ru.lksi.al;

import java.util.ArrayList;
import java.util.Random;

public class First {
	public static ArrayList<Second> contacts = new ArrayList<Second> ();  
	public static Random r = new Random ();
	
	public static void main(String[] args) {
		for (int i=0;i<300;i++) {
			contacts.add(new Second ("Abonent", r.nextInt(999999)));
		}
		// “оже самое, что и код ниже (там упрощенна€ вариаци€)
		// for (int i=0;i<300;i++) {
		//	System.out.println(contacts.get(i).getName() + " " + contacts.get(i).getNumber());;
		// }
		for (Second i: contacts) {
			System.out.println(i.getName() + " " + i.getNumber());
		}
	}

}
