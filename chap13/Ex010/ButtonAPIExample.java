package chap13.Ex010;

class Button{
	OnClicklistener ocl ;      // OnClicklistener : 객체 타입,    ocl : 참조 변수   
								// ocl 기본값 : null
	
	// setter 을 통해서 OnClicklistener 의 참조변수 ocl에 객체 주소를 담는다
	void setOnClicklistener(OnClicklistener ocl) {
		this.ocl = ocl ;
	}
	
	
	// 인터페이스만 존재하고 구현한 자식클래스가 존재하지 않는다
	// 호출하는 곳에서 onClick() 메소드를 재정의 해서 호출
	interface OnClicklistener{    
		void onClick();		// 메소드 선언안됨,  하위에서 오버라이딩 해서 재정의
	}
	
	void click() {			// 실행했을떄 ocl.onClick() 실행
		ocl.onClick();		// ocl : 참조변수 : null ==> setOnClicklistener(onclickListener ocl)
		System.out.println(ocl);
	}
	
}


public class ButtonAPIExample {

	public static void main(String[] args) {
		
		// 개발자1 : 클릭시 음악 재생
		Button button1 = new Button();
		
		// A.B = new A.B() { 이너인터페이스B의 메소드를 구현한 코드 };
		// onClickListener 객체타입으로 객체 생성 매개변수로 전달
		
		button1.setOnClicklistener(new Button.OnClicklistener() {
			@Override
			public void onClick() {
				System.out.println("개발자1 음악 재생");
			}
		});
		
		button1.click();
		System.out.println("========================");
		
		// 개발자 2 : 클릭시 네이버 접속
		Button button2 = new Button();
		// setOnClicklistener 메소드에 매개변수로 OnClicklistener의 하위 익명객체를 생성후 
		button2.setOnClicklistener(new Button.OnClicklistener() {
			@Override
			public void onClick() {
				System.out.println("개발자 2 클릭시 네이버 접속");
			}
		});
		
		button2.click();
		

	}

}
