package chap12.Ex09;

public class Apple implements PhoneInterface {

	//인터페이스에서 정의한 메소드를 구현함
	@Override
	public void sendCall() {
		System.out.println("띠링");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화옴");
	}
	
	// 추가적인 Apple 만의 기능을 추가
	public void flash() {
		System.out.println("불 켜짐");
	}

}
