package chap14.Ex02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

// CheckedException (�Ϲ� ����) : ������ �ܰ迡�� ���ܰ� �߻�. 
// �������ϱ�(����) *.java ==> *.class  ���� ���� ó��

// unCheckedException (���� ����), Runtime Exception : ����ÿ� ���ܰ� �߻��� �� �ִ� . 
	// ���� �ʼ��� �ƴ����� ���� ó�� 


class A{
	B b ;     // b = null 
	A (){}    // �⺻������
	A(B b ){
		this.b = b;
	}
	
	interface B{	// �������̽� ����
		void cry();
	}
	
	void abc () {
		System.out.println(b);
		b.cry();
	}
	
	
}


public class CheckedException {

	public static void main(String[] args) {
		
		// 1. �Ϲݿ��� 
		
		// InterruptedException  : ������ �߰��� �����Ⱑ �߻��ϸ� ���ܰ� �߻�
	//	Thread.sleep(1000);
	
		//  ClassNotFoundException : Ŭ������ ã�� ���ϴ� ����
	//	Class cls = Class.forName("Java.lang.Object");
		
		// IOException : ��Ʈ��ũ���� ����(����) ���о�ü� �ִ� ����
		// System.in : �ܼ��� ����.
		InputStreamReader in = new InputStreamReader(System.in);
	//	in.read();
		
		
		// FileNotFoundException : ������ ã�� ���ϴ� ���ܰ� �߻��� �� �ִ� 
	//	FileInputStream fis = new FileInputStream("text.file");
		
		
		//���࿹�� (unChecked Exception ): ����ÿ� �߻��Ǵ� ����
		
		//NullPointException : ��ü�� null�� ���¿��� ��ü�� �ʵ峪 �޼ҵ� ȣ��
		A a1 = new A();
		a1.abc();			// ������ �ܰ迡�� ���ܰ� �߻����� �ʰ� ����ÿ� �߻�
		

	}

}
