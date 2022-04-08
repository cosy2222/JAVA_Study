package chap14.Ex05;

// 자동 리소스(객체) 제거
	// AutoCloseable 인터페이스를 구현해야한다

// 필드에 값 할당   생성자 호출시 필드에 값을 부여
class Abc implements AutoCloseable{
	String name ;
	int studentId ;
	int kor ;
	int eng ;
	int math ;
	double avg ;     // 평균계산
	
	Abc (String a , int b, int c , int d , int e){
		name = a;
		studentId = b;
		kor = c;
		eng = d;
		math = e;
		avg = (double)(c+d+e)/3;
				
		
	}

	@Override
	public void close() throws Exception {
		if (name != null | studentId != 0 | kor != 0 | eng != 0 | math !=0) {
			name = null;
			studentId = 0;
			kor = 0;
			eng = 0;
			math = 0;
			avg = 0.0;
			System.out.println("초기화 했습니다");
			System.out.println(name + " " + studentId + " " + kor + " " + eng + " " + math +" " + avg);
			
					
		}
	}
	
}

public class Ex_TryWithResource_3 {

	public static void main(String[] args) {
		//1. 객체의 모든 필드를 초기화 하고 자동으로 close();
		
		try(Abc a1 = new Abc("강성민" , 20220323 , 55 , 65 ,75);){
			System.out.print("이름:" + a1.name + " ");
			System.out.print("학번:" + a1.studentId + " ");
			System.out.print("국어:" + a1.kor + " ");
			System.out.print("영어:" + a1.eng + " ");
			System.out.print("수학:" + a1.math + " ");
			System.out.println("평균값 :" + a1.avg);
		}catch (Exception a) {
			System.out.println("예외처리");
		}
		
		System.out.println("========================");
		//2. 수동 close(),   finally 블락에서 close() 호출
		
		Abc a2 = null;
		
		try {
			a2 = new Abc("민성강" , 12345678 , 65 , 76 ,85);
			System.out.print("이름:" + a2.name + " ");
			System.out.print("학번:" + a2.studentId + " ");
			System.out.print("국어:" + a2.kor + " ");
			System.out.print("영어:" + a2.eng + " ");
			System.out.print("수학:" + a2.math + " ");
			System.out.println("평균값 :" + a2.avg);
		}catch(Exception a) {
			System.out.println("예외처리");
		}finally {
			try {
				a2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
