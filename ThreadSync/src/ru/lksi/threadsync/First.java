package ru.lksi.threadsync;

public class First {
	static int n1;
	static long startTime;
	static long endTime;
	public static void main(String[] args) {
		Thread t1 = new Thread (new Run());
		Thread t2 = new Thread (new Run());
		startTime = System.currentTimeMillis();
		t1.start();
		//следующий метод дублирует функционал модификатора synchronized для метода Run.increase() 
		//в данном проекте, но назначение у них разное
		t2.start();
		//следующий метод дублирует функционал модификатора synchronized для метода Run.increase() 
		//в данном проекте, но назначение у них разное
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		endTime = System.currentTimeMillis();
		n1 = Run.number;
		System.out.println("Время выполнения:" + (endTime - startTime) + "\n" + n1);
	}
	

}
