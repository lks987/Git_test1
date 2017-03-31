package ru.lksi.s;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class First {
	static ArrayList <Profile> profiles = new ArrayList <Profile> ();
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		profiles = (ArrayList<Profile>) deser ("res//profiles.ser");
		Profile p1 = new Profile ();
		p1.setName((JOptionPane.showInputDialog (null, "¬ведите ваше им€")));
		p1.setSurname((JOptionPane.showInputDialog (null, "¬ведите вашу фамилию")));
		profiles.add (p1);
		
		for (Profile i: profiles) {
			System.out.println(i.getName() + " " + i.getSurname());
		}
		ser ("res//profiles.ser", profiles);

	}
	
	static void ser (String file_name, Object obj) {
		try {
			FileOutputStream fos = new FileOutputStream (file_name);
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(obj);
			fos.close();
			oos.close();
		} catch (IOException e) {e.printStackTrace();}
	}
	static Object deser (String file_name) {
		FileInputStream fos = null;
		Object obj = null;
		try {
			fos = new FileInputStream (file_name);
			ObjectInputStream oos = new ObjectInputStream (fos);
			obj = oos.readObject();
			oos.close();
			fos.close();
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();}
		return obj;
	}
}
