package chap06_07.EX05;

	// ���� ������(ĸ��ȭ : �����͸� �ܺη� ���� ��ȣ�ϴ� ��Ȱ ) : 
		// public , protected , default(�����ؼ� ���) , private
		// Ŭ���� �̸�, �ʵ�� , �޼ҵ��, �����ڸ�  << ���������ڰ� �ݵ�� �Ҵ��� �Ǿ��ִ� 
		// Ŭ���� �̸� : public , default

public class A {
	
	 int m = 3 ;      // �ʵ��� �⺻ ���� �����ڴ� default : ������,
	 int n = 4;       // default : �ٸ� ��Ű���� Ŭ���������� ���� �Ұ�
	 
	 				  // private : �ܺ� Ŭ�������� ���� �Ұ� 
	 
	 public int k = 10 ;   // public : �ٸ���Ű������ ���� ���� 
	
	void print() {    // default ������   : ���� ��Ű������ Ŭ���������� ��� ���� 
		System.out.println("����Ʈ ���� " + m + " , " + n);
	}
	
	public void print1() {
		System.out.println("�ܺ� ��Ű������ ���� ���� " + k);
	}

	public static void main(String[] args) {
		

	}

}
