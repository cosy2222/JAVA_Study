package chap14.Ex08;

// 메소드의 throws 를 전가 ,전가 , 전가main전가
	// main 까지 예외가 전가가 된경우는 예외의 결과 창을 띄우고 프로그램 종료
	// main 메소드는 예외 처리 하지 않는다 . 

class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException {
		int num  = Integer.parseInt("10A");    // NumberFormatException 발생
	}
	
}


public class ExceptionMethod {

	public static void main(String[] args)  {
		
		AA aa = new AA();
		
		try {
			aa.abc();   // 실행예외 (컴파일단계에서는 오류 없음)
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
				

	}

}
