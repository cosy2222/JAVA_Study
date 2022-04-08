package chap12.Ex01;

abstract class Abc { 
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc{

	@Override
	void cry() {
		System.out.println("�߿�");
	}

	@Override
	void fly() {
		System.out.println("�پ�ٴѴ�");
	}
	
}

class Eagle extends Abc{

	@Override
	void cry() {
		System.out.println("eagle");
	}

	@Override
	void fly() {
		System.out.println("���ƴٴѴ�");
	}
	
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
			// 1. �ڽ� Ŭ���� Cat , Eagle Ŭ������ ������ ���
			Abc a = new Cat();
			Abc b = new Eagle();
			a.cry();
			a.fly();
			System.out.println("=============");
			b.cry();
			b.fly();
			System.out.println("===============");
		
		
			// 2. �͸� Ŭ���� ������ ���
			Abc c = new Abc() {
				void cry() {
					System.out.println("��");
				}

				@Override
				void fly() {
					System.out.println("������ �ڴ�");
				}
			};
			
			c.cry();
			c.fly();
			
			
			
	}

}
