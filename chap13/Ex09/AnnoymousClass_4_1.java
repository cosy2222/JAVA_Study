package chap13.Ex09;

interface Aa{
	void cry();
	void fly();
}

class Cc{
	void abc(Aa a) {
		a.cry();
		a.fly();
	}
}


public class AnnoymousClass_4_1 {

	public static void main(String[] args) {
		Cc c = new Cc();
		
		// 1. Ŭ������ ���� x    + �������� o
		
		Aa a = new Aa() {
			@Override
			public void cry() {
				System.out.println("�۸�");
			}
			@Override
			public void fly() {
				System.out.println("�������Ѵ�");
			}
		};
		c.abc(a);
		
		
		// 2. Ŭ������ ���� x + �������� x
		
		c.abc(new Aa (){
			@Override
			public void cry() {
				System.out.println("�۸�");
			}
			@Override
			public void fly() {
				System.out.println("�������Ѵ�");
			}
		});
	
	

	}

}
