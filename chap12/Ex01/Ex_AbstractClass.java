package chap12.Ex01;

abstract class Abc { 
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc{

	@Override
	void cry() {
		System.out.println("야옹");
	}

	@Override
	void fly() {
		System.out.println("뛰어다닌다");
	}
	
}

class Eagle extends Abc{

	@Override
	void cry() {
		System.out.println("eagle");
	}

	@Override
	void fly() {
		System.out.println("날아다닌다");
	}
	
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
			// 1. 자식 클래스 Cat , Eagle 클래스를 생성후 출력
			Abc a = new Cat();
			Abc b = new Eagle();
			a.cry();
			a.fly();
			System.out.println("=============");
			b.cry();
			b.fly();
			System.out.println("===============");
		
		
			// 2. 익명 클래스 생성후 출력
			Abc c = new Abc() {
				void cry() {
					System.out.println("멍");
				}

				@Override
				void fly() {
					System.out.println("빠르게 뛴다");
				}
			};
			
			c.cry();
			c.fly();
			
			
			
	}

}
