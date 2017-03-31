package ru.lksi.s;

import java.io.Serializable;

class Profile implements Serializable {
	
	private static final long serialVersionUID = -2964602006518214121L;
	String name;
	String surname;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getSurname() {
		return surname;
	}
	void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
