package ru.lksi.ArrayBlockingQueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class First {
	static ArrayBlockingQueue<Integer> list1 = new ArrayBlockingQueue<Integer>(1000);
	static Random r1 = new Random();
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			list1.add(r1.nextInt(100));
		}
		System.out.println("started list1 size:" + list1.size());
		
		for (Object obj: list1) {
			list1.remove(obj);
		}
		System.out.println("final list1 size:" + list1.size());
	}

}
