package chap12.Ex09;

public class Ex {

	public static void main(String[] args) {
		
		//1. AppleŸ������ ����
		Apple a = new Apple();
		a.sendCall();
		a.receiveCall();
		a.printlogo();       // interface ���� default�޼ҵ尡 ��ӵǾ� ������ ���
		a.flash();
		
		System.out.println("=================");
		
		//2. PhoneInterface�� ��ĳ����
		PhoneInterface a2 = new Apple();
		a2.printlogo();
		a2.receiveCall();
		a2.sendCall();
		Apple a3 = (Apple)a2;    // a2 �� AppleŸ������ �ٿ�ĳ����
		a3.flash();
	
	}

}
