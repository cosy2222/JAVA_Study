package chap10.Ex;

class Student1 {
	int studentId ;
	String name ;
	int kor ; 
	int eng ; 
	
	Student1(int s , String n , int k , int e){
		this.studentId = s ;
		this.name = n ;
		this.kor = k;
		this.eng = e;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( this.studentId == ((Student1)obj).studentId) {
			
			return true ;
		}
		else {
			return false;
		}
	}
	
}

public class Quiz_04 {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1(1111, "강성민" , 80 , 90);
	//	Student s2 = new Student();
	//	Student s3 = new Student();
		Student1 s4 = new Student1(1111, "민성강" , 90 , 80);
		
		
		// studentId 가 같은경우 같은 학생이다 라고 출력
		/*
		 * 객체의 StudentID 컬럼을 비교 해서 같은 경우 같은 학생이다 라고 출력
		 *    ==  : 기본타입 boolean , byte , shot , long, double , float , char  값을 비교
		 *    
		 *    참조타입인 경우 : 객체의 주소를 비교  배열 , 객체 , String
		 *    		String : toString() , equals()가 재정의 되어있다   
		 *  
		 * 
		 * */
		
		System.out.println(s1.equals(s4));   // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
