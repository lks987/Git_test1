package test2;

import javax.swing.JOptionPane;

public class Reader {
	int i, k;
	String n1, n2;
	public void Scan() {
		n1 = JOptionPane.showInputDialog ("������� ����� i");
		n2 = JOptionPane.showInputDialog ("������� ����� k");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
	}
	public void Show(int a, int b) {
		JOptionPane.showMessageDialog(null, "���� ����� i ������ �����" + a);
		JOptionPane.showMessageDialog(null, "���� ����� k ������ �����" + b);
	}
}
