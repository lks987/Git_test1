package ru.lksi.Swing_JList;

import java.util.ArrayList;

import javax.swing.event.ListDataListener;

public class ListModel implements javax.swing.ListModel<String> {
	ArrayList<String> data = new ArrayList<String> ();
	
	public ListModel() {
		
	}

	
	public void addListDataListener(ListDataListener arg0) {
		
		
	}

	
	public String getElementAt(int arg0) {
		return data.get(arg0);
	}

	
	public int getSize() {
		
		return data.size();
	}

	public void addItem (String e) {
		data.add(e);
	}
	
	public void delItem (int i) {
		data.remove(i);
	}
	
	public void delItem (String s) {
		data.remove(s);
	}
	
	public void removeListDataListener(ListDataListener arg0) {
		
		
	}

}
