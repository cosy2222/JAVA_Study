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
		
		Student1 s1 = new Student1(1111, "������" , 80 , 90);
	//	Student s2 = new Student();
	//	Student s3 = new Student();
		Student1 s4 = new Student1(1111, "�μ���" , 90 , 80);
		
		
		// studentId �� ������� ���� �л��̴� ��� ���
		/*
		 * ��ü�� StudentID �÷��� �� �ؼ� ���� ��� ���� �л��̴� ��� ���
		 *    ==  : �⺻Ÿ�� boolean , byte , shot , long, double , float , char  ���� ��
		 *    
		 *    ����Ÿ���� ��� : ��ü�� �ּҸ� ��  �迭 , ��ü , String
		 *    		String : toString() , equals()�� ������ �Ǿ��ִ�   
		 *  
		 * 
		 * */
		
		System.out.println(s1.equals(s4));   // true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
