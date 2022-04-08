package chap12.Ex09;

public class Ex {

	public static void main(String[] args) {
		
		//1. Apple타입으로 지정
		Apple a = new Apple();
		a.sendCall();
		a.receiveCall();
		a.printlogo();       // interface 에서 default메소드가 상속되어 내려온 기능
		a.flash();
		
		System.out.println("=================");
		
		//2. PhoneInterface로 업캐스팅
		PhoneInterface a2 = new Apple();
		a2.printlogo();
		a2.receiveCall();
		a2.sendCall();
		Apple a3 = (Apple)a2;    // a2 를 Apple타입으로 다운캐스팅
		a3.flash();
	
	}

}
