package chap12.Ex01;

class AA{				// �Ϲ�Ŭ���� : ��ü ������ �ʵ�� �޼ҵ�� Heap �޸� ������ ����
	int a;
	double b;
	char c; 
	boolean d; 
	byte e;
	float f;
	String g;
	
	void crt() {}

	@Override
	public String toString() {
		return a+ " , " + b+ " , " + c+ " , " + d+ " , " + e+ " , " + f+ " , " +g;
	}
	
	
}

//1. �߻�Ŭ������ ��üȭ �ؼ� ����ϴ� ��� 1 
		// ����� ���ؼ� �ڽ�Ŭ������ �����ϰ�, �ڽ�Ŭ�������� �߻� �޼ҵ带 ������ �ϰ� , �ڽ�Ŭ������ ��ü�� ������ ���
		// ���� ��ü�� �����ؼ� ����ҋ� ���� ���

// 2. �߻�Ŭ������ ��üȭ �ؼ� ����ϴ� ��� 2
		//�ڽ� Ŭ���� ���� ���� , main �޼ҵ忡�� �͸� ��ü�� �����ؼ� ����ϴ� ���
		// �ӽ÷� �ѹ��� ����ҋ��� �ڽ� ��ü�� ������ �ʿ� ���� �ӽ÷� ��� �� ���
		// �̺�Ʈ ó���ҋ� (�ӽ�)

abstract class A{
	
	abstract void abc();
}

class B extends A{    // �߻� �޼ҵ带 ������ ��ü : ���� ����� ���

	@Override
	void abc() {
		System.out.println("���1 : �ڽ� Ŭ���� ���� �߻� �޼ҵ� ����");
	}
	
}



public class AbstractClass_1 {

	public static void main(String[] args) {
		
		// 1 . AAŬ������ ��üȭ ����
		AA aa = new AA();			// �ʵ� : �ʱ�ȭ , �Ϲݸ޼ҵ� (�����ΰ� �����ϴ� �޼ҵ�)
		System.out.println(aa);		// ��ü�� ���� �ҷ��� Heap������ ���� �ݵ�� �� �־�� �Ѵ�
		
		
		//2. �߻�޼ҵ�� ��ü���� �Ұ�    :  �޼ҵ尡 �̿ϼ� �޼ҵ� �̱� ������ ��ü���� �Ұ�
	//	A a = new A();    //��ü ���� �Ұ� 
		
		
		//3. �߻� Ŭ������ ������ �ڽ� Ŭ���� ��ü ����
		A a1 = new B();       
		A a2 = new B();
		A a3 = new B();
		
		// 4. �޼ҵ� ȣ��
		a1.abc();
		a2.abc();
		a3.abc();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
