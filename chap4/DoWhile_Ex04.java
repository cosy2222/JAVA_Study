package chap4;

public class DoWhile_Ex04 {

	public static void main(String[] args) {
		
		//2. While 문과 Do-While문의 비교 : 실행이 0 인 경우
		System.out.println("==========반복횟수가 0 인 경우===============");
		int a = 0;
		while(a < 0){
			System.out.print(a + " ");
			a++;
		}            //While 문은 조건이 true 일떄만 작동
		System.out.println("==============================");
		
		a = 0;
		do {
			System.out.print(a + " ");            // Do-While 에서는 true, false 상관없이 무조건 한번은 실행 
			a++;
			
		} while( a < 0);      // 조건이 false
		
		System.out.println();

		System.out.println("===========반복 횟수가 1인 경우=============");
		// 반복횟수가 1 인 경우
		
		a = 0;
		while( a < 1) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 1);
		
		System.out.println();
		System.out.println("==============반복 횟수가 10 인 경우");
		// 반복횟수가 10 인 경우
		a = 0;
		while(a < 10) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while ( a < 10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
