package ru.lksi.Swing1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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
	
	static void saveImage (File file, String format) {
		try {
			ImageIO.write(image, format, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
