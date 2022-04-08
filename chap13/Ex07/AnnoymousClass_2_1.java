package chap13.Ex07;


interface Aa{
	void cry();
	void fly();
}


class Bb  {
	
	Aa a = new Aa() { //인터페이스는 객체화가 할 수 없다 ,  익명 내부클래스를 생성해서 구현
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
