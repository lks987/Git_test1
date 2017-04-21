package ru.lksi.Swing1;

import java.awt.image.BufferedImage;

public class First {
	static BufferedImage image;

	public static void main(String[] args) {
		Window w1 = new Window ();

	}
	
	static BufferedImage getImage() {
		return image;
	}

	static void setImage(BufferedImage image) {
		First.image = image;
	}

}
