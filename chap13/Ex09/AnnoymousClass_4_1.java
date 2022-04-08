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
		
		// 1. 클래스가 존재 x    + 참조변수 o
		
		Aa a = new Aa() {
			@Override
			public void cry() {
				System.out.println("멍멍");
			}
			@Override
			public void fly() {
				System.out.println("날지못한다");
			}
		};
		c.abc(a);
		
		
		// 2. 클래스가 존재 x + 참조변수 x
		
		c.abc(new Aa (){
			@Override
			public void cry() {
				System.out.println("멍멍");
			}
			@Override
			public void fly() {
				System.out.println("날지못한다");
			}
		});
	
	

	}

}
