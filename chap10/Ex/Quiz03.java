package chap10.Ex;

class Student{
					// 자바는 다중 상속이 불가 , 자바의 모든 클래스는 Object 클래스의 자식 클래스 이다 . 
							// Object 클래스에서 정의한 필드나 메소드를 재사용 할 수 있다 
	String name;      // 학생 이름
	int studentID ;    //학번
	int kor ;		   // 국어점수 
	int eng ; 		   // 영어점수
	int math ;		   // 수학점수
	int sum ;		   // 점수 합
	double avg ;       // 점수 평균
	
	void hobby() {
		System.out.println("각 학생의 취미는 입니다");
	}

	@Override
	public String toString() {  // Object 클래스의 메소드 , 객체 자체를 출력할때 , [패키지명.클래스명@해쉬코드]
		return "아름 : " + name + " , 학번 : " + studentID + " , 국어 : " + kor + " , 영어 : " +
						eng + " , 수학 : " + math + " , 합계 : " +sum + " , 평균 : " + avg; 
	}
	
}

class S_철수 extends Student{
	
	// 생성자 : 1. 클래스명과 동일 , 2. 리턴타입이 없어야 한다 
	S_철수 (String a, int b , int c , int d , int e){    
		super.name = a;    // super : 부모 클래스    ,     자신의 클래스 
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double)sum/3;
		
	}

	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시 입니다");
	}
	
}

class S_영희 extends Student{
	
	S_영희 (String a, int b , int c , int d , int e){    
		super.name = a;    // super : 부모 클래스    ,     자신의 클래스 
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double)sum/3;
	}

	@Override
	void hobby() {
		System.out.println("영희의 취미는 독서 입니다");
	}
	
}


class S_영철 extends Student{
	
	S_영철 (String a, int b , int c , int d , int e){    
		super.name = a;    // super : 부모 클래스    ,     자신의 클래스 
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double)sum/3;
	}

	@Override
	void hobby() {
		System.out.println("영철의 취미는 게임 입니다");
	}
	
}

public class Quiz03 {

	public static void main(String[] args) {
		
		Student 철수 = new S_철수 ("철수" , 001, 80 , 90 , 100);
		Student 영희 = new S_영희 ("영희" , 002, 85 , 95 , 90);
		Student 영철 = new S_영철 ("영철" , 003, 93 , 100 , 84);
		
		Student [] arr = { 철수 , 영희 , 영철 };
		
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		
		System.out.println("===================");
		for (Student k : arr) {
			System.out.println(k);
			k.hobby();
		}
		
		
		
		
		
		
		
	}


}
