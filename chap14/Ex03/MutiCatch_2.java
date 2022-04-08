package chap14.Ex03;

public class MutiCatch_2 {

	public static void main(String[] args) {
		
		
		// 1. Exception에서 모든 예외를 처리 할 수 있다.
			// 모든 예외는 Exception을 상속 받는다 
		
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch(Exception a) {
			
			// try{} 블락에서 발생하는 모든 에외는 Exception 클래스가 모두 처리
			System.out.println("예외 처리(Exception)");
			
		}
		
		//2. catch 블락의 순서가 잘못된 경우 : Exception은 catch의 마지막에 와야한다 
		
		/*
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch(Exception a) {
			// try{} 블락에서 발생하는 모든 에외는 Exception 클래스가 모두 처리
			System.out.println("예외 처리");
		}catch(ArithmeticException a) {
			
		}catch(NumberFormatException a) {
			
		}
		*/
		
		// 3. catch 블락의 올바른 순서 : 최상위 Exception은 catch블락의 마지막에 위치
		
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch(ArithmeticException a) {
			
		}catch(NumberFormatException a) {
			
		}catch(Exception a) {   // Excepion 은 마지막에 위치
		}
		
		//4. 여러개의 Exception을 통합해서 적용.
		
		try {
			System.out.println( 10 / 0);
			int num = Integer.parseInt("10A");
		}catch(ArithmeticException | NumberFormatException  a) {
			// 여러개의 Exception을 통합
		}catch(Exception a ) {
			
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		

	}

}
