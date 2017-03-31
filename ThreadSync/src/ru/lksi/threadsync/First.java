package ru.lksi.threadsync;

public class First {
	static int n1;
	public static void main(String[] args) {
		Thread t1 = new Thread (new Run());
		Thread t2 = new Thread (new Run());
		t1.start();
		//��������� ����� ��������� ���������� ������������ synchronized ��� ������ Run.increase() 
		//� ������ �������, �� ���������� � ��� ������
		try {
			t1.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
		//��������� ����� ��������� ���������� ������������ synchronized ��� ������ Run.increase() 
		//� ������ �������, �� ���������� � ��� ������
		try {
			t2.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		n1 = Run.number;
		System.out.println(n1);
	}
	

}
