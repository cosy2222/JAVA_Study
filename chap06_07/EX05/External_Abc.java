package chap06_07.EX05;

import chap06_07.EX06.Bcd;

public class External_Abc extends Bcd {    //  External_AbcŬ������ Bcd Ŭ������ ��� ����
					// �θ� Ŭ���� : Bcd , �ڽ� Ŭ���� : External_Abc

	public static void main(String[] args) {
		
		// Abc abc2 = new Abc();    // class ���� �����ڰ� default ���� ���� �Ұ�
		
		Bcd bcd1 = new Bcd();
		External_Abc ext = new External_Abc();
		
		// �ٸ� ��Ű������ �ʵ� ȣ�� : 1. import  
								// 2. ��ü ���� , 3. ���������� Ȯ�� �� ����
		bcd1.a = 1000;
		
		ext.b = 2000;    // �ڽ� Ŭ�������� �θ� Ŭ������ protected ��  �ٸ� ��Ű������ ���� ( ��� ���� ) 

	}

}
