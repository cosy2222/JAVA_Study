package chap12.Ex02;

// ���� ���̽� ( interface) : �ܺο� ���θ� ���� �����ִ� ����
		// ��ü ���� �Ұ� ,  Ÿ���� ���� ���� 
		// ��� �ʵ�� �ݵ�� : public static final ���� 
		// ��� �޼ҵ�� : public abstract ���� (�ڹ� 1.8���� ����)


interface A{		// ���� ���� 
	public static final int a = 3;     // Interface �ʵ��� ���� ǥ��
	public abstract void abc() ;		// Interface �޼ҵ��� ���� ǥ��
}

interface B{       // ������ ���� 
	int a = 3;
	void abc();		// interface ������ abstract ���� ����
}

abstract class C {        // �߻�Ŭ���� �ϋ��� abstract ���� �Ұ� 
	abstract void abc();                   
}





public class Interface_1 {

	public static void main(String[] args) {
		
		// interface�� ��ü ���� �Ұ�. �������� �ʴ� �޼ҵ尡 ���ԵǾ� ����
//		A a = new A();   // A�� interface �̹Ƿ� ��ü���� �Ұ�
		
		// interface�� �ʵ� ��� 
		System.out.println(A.a);
		System.out.println(B.a);
		
		
		// final�� ����Ǿ� �ֱ� ������ ���� ���� �� �� ���� 
//		A.a=5;      
//		B.a=6;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
