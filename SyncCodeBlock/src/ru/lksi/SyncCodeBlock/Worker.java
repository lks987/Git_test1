package ru.lksi.SyncCodeBlock;

import java.util.ArrayList;
import java.util.Random;

class Worker {
	ArrayList<Integer> list1 = new ArrayList<Integer> ();
	ArrayList<Integer> list2 = new ArrayList<Integer> ();
	Random r = new Random ();
	long startTime;
	long endTime;
	Object sync1 = new Object ();
	Object sync2 = new Object ();
	
	void partOne () {
		synchronized (sync1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {e.printStackTrace();}
			list1.add(r.nextInt(100));
		}
	}

	void partTwo () {
		synchronized (sync2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {e.printStackTrace();}
			list2.add(r.nextInt(100));
		}
	}
	
	void proceed () {
		System.out.println("proceed() родит.объект: " + this);
		for (int i = 0; i < 2000; i++) {
			partOne ();
			partTwo ();
		}
	}
	
	void start () {
		startTime = System.currentTimeMillis();
		Thread t1 = new Thread (new Runnable () {
			public void run() {
				System.out.println("t1 потока родит.объект: " + this);
				proceed ();
			}
		});
		Thread t2 = new Thread (new Runnable () {
			public void run() {
				System.out.println("t2 потока родит.объект: " + this);
				proceed ();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		endTime = System.currentTimeMillis();
		System.out.println("Затраченное время:" + (endTime - startTime) + "\n"
				+ "Количество записей list1:" + list1.size() + "\n"
				+ "Количество записей list2:" + list2.size());
		
	}
}
