package chap14.Ex08;

// 사용자 정의 예외
//  1. Exception 을 상속하는 예외 : Checked Exception - 컴파일 단계에서 예외처리 필요.  
//  2. RuntimeException 을 상속하는 예외 : UncheckedException - 실행시에 예외 

class MyException extends Exception{     // 일반예외
	
	public MyException() {   // 기본생성자
		super();
	}
	
	public MyException(String message) {	// 예외 메세지 출력시 사용 
		super(message);
	}
	
}



class MyRTException extends RuntimeException{	// 실행예외
	
	public MyRTException () {		//기본생성자
		super();
	}
	
	public MyRTException(String message) {	// 예외 발생시 메세지를 출력해주는 생성자
		super(message);
	}
}


class A {
	// 사용자 정의 예외 객체생성
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메세지 : MyException");
			// 예외가 발생시 예외 메세지를 출력 하는 생성자
	
	//2. 런타임 예외 객체
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메세지 : MyRTException");
	
	//예외를 강제로 발생시키기 (throw) :
	void abc_1(int num) {
		
		try {
			
			if (num > 70) {		// abc_1()
				System.out.println("정상작동");
			}else {
				throw me1;       // 예외를 강제로 발생시킴
			}
		}catch (MyException e) {
			System.out.println("70이하값을 넣었습니다.  70이상 값을 넣어주세요");
			System.out.println(e.getMessage());
		}
	}
	
	// 예외의 전가 (throws) 
	void abc_2(int num) throws MyException {
		if (num > 70) {
			System.out.println("정상작동");
		}else {
			throw me2;       // throw는 예외 강제발생
		}
	}
	
	
	void bcd_1() {
		abc_1(65);   // 예외가 발생
	}
	
	void bcd_2() {
		
		try {
			abc_2(65);
		}catch (MyException e) {
			System.out.println("70이하값을 넣었습니다.  70이상 값을 넣어주세요");
			System.out.println(e.getMessage());
		}
		
	}
	
		
}



public class CreateUserException_1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.bcd_1();		// 예외를 직접 구현
		a.bcd_2();		// throws 예외전가 , 호출하는쪽에서 예외처리

	}

}
