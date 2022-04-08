package chap14.Ex01;

public class CheckedException_1_1 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println( 10 / 0);      // 프로그램이 비정상 종료 되어 버린다
											  // 예외 처리 
			}catch(ArithmeticException e) {   
				//try 블락에서 오류가 발생할 경우에 실행된다 
				//e.printStackTrace();     // 오류에대한 자세한 정보를 출력
				//System.out.println("0을 넣을수 없습니다");
			}finally {
				//try{} 오류가 없어도 작동 , 오류가 있어도 작동
				//try{} 가 작동되면 항상 작동 
				//객체를 사용후 객체의 메모리를 제거 할떄 , sc.close(); 
				System.out.println("finally{}은 항상 호출됨");
			}
				
			
		
		System.out.println("프로그램을 정상 종료합니다");		// 정상 종료 
		
	}
}
