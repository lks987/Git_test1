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
		//��������� ����� ��������� ���������� ������������ synchronized ��� ������ Run.increase() 
		//� ������ �������, �� ���������� � ��� ������
		t2.start();
		//��������� ����� ��������� ���������� ������������ synchronized ��� ������ Run.increase() 
		//� ������ �������, �� ���������� � ��� ������
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		endTime = System.currentTimeMillis();
		n1 = Run.number;
		System.out.println("����� ����������:" + (endTime - startTime) + "\n" + n1);
	}
	

}
