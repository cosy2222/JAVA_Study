package chap11.Ex05;

// 추상 클래스를 사용해서 기능 구현 하는 경우
abstract class Animal{
	abstract void cry() ;              // 추상 메소드 : 선언만 되어있고 구현부가 없는 메소드
}


class Cat extends Animal{

	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{

	@Override
	void cry() {
		System.out.println("멍");
	}
	
}





public class AbstractModifier_3 {

	public static void main(String[] args) {
		
		Animal c = new Cat();     // 추상 클래스는 타입으로는 지정 될 수 있다.
		Animal d = new Dog();
		
		c.cry();
		d.cry();
		
		//추상클래스는 객체화 할 수 없다
	//	Animal a = new Animal();
		
	}

}
