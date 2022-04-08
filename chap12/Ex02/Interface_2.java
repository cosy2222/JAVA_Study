package chap12.Ex02;

// interface 구현한 클래스 ,
	// Overriding : 완전한 메소드를 자식클래스에서 새로 정의하는것
 	// Implements : 미완성 메소드를 완성시키는 것 
	// extends    : 부모클래스의 기능을 상속받아서 자신의 기능을 추가해서 확장

interface Aa{
	
	void fly();
	void run();
	
}

class Bb implements Aa{   // Bb클래스는 Aa인터페이스의 미완성된 메소드를 구현한다 

	@Override
	public void fly() {
		System.out.println("야옹");
	}

	@Override
	public void run() {
		System.out.println("ㅇㅅㅇ");
	}
	
}




public class Interface_2 {

	public static void main(String[] args) {
		
		Aa a = new Bb();
		a.fly();
		a.run();
		
		
		
		
		
	}

}
