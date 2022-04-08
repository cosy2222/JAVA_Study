package chap14.Ex06;


/*
 * 
 * 		���� ó�� 2���� ��� 
 * 			1. ���� ó�� : try catch
 * 			2. ���� ���� (�̷��)  : throws , �޼ҵ带 �����ϴ� �ʿ��� ���ܸ� ó���ϵ��� ���� (�̷��)
 * 			 	throw : ������ ���ܸ� �߻� ��Ų��.
*/

class A{		// �޼ҵ� ���ο��� ���� �۸��� ���� ����
	void abc() {
		bcd();
	}
	
	void bcd() {		
		try {		
			Thread.sleep(1000);    // �Ϲ� ���� : InterruptedException
		} catch (InterruptedException e) {
			// e.printStackTrace();
			System.out.println("���ܹ߻� 1");
		}       
	}
}

class B{
	void abc() {     // bcd() �� ���ܸ� ó���� �ǹ��� ������
		try {
			bcd();
		} catch (InterruptedException e) {
			//e.printStackTrace();
			System.out.println("���ܹ߻� 2");
		}
	}
	void bcd() throws InterruptedException { //bcd() �޼ҵ带 ȣ���ϴ� ������ ���ܸ� ó���ϵ��� �̷� 
		Thread.sleep(1000);
	}
}




public class ThrowsException_1 {

	public static void main(String[] args) {

		A a1 = new A();
		a1.abc();
		
		B b1 = new B();
		b1.abc();
	
	
	}

}








