package chap13.Ex07;


interface Aa{
	void cry();
	void fly();
}


class Bb  {
	
	Aa a = new Aa() { //�������̽��� ��üȭ�� �� �� ���� ,  �͸� ����Ŭ������ �����ؼ� ����
		public void cry() {
			System.out.println("dddd");
		}
		public void fly() {
			System.out.println("fffff");
		}
	};
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	
	
}

public class AnnoymousClass_2_1 {

	public static void main(String[] args) {
		
		Bb b = new Bb();
		b.abc();

	}

}
