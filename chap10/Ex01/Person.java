package chap10.Ex01;

class Student_sub extends Student {
	// Student_sub �� Student �� ��� �ް� �ִ� 
	// Student �� Person�� ��� �ް��ֱ� ������  Student_sub�� Person �� Student �� �ʵ�� �޼ҵ带 ��� ��ӹ޴´�  
	
	String sub1;
	
	void sub1() {
		System.out.println("Student_subŬ���� �Դϴ� , Person�� Student �� �ʵ�� �޼ҵ带 ���� ��ӹ޴´�  ");
	}
	
}


class Student extends Person {     // ���л� Ŭ����        person : �θ�    student : �ڽ�
	// �ڽ�Ŭ������ �θ� Ŭ������ �ʵ� , �޼ҵ� , �γ�Ŭ������ �״�� ��� �޴´�. 
	
	int studentId ;
	void goToScool() {
		System.out.println("�ڽ� Ŭ������ student �޼ҵ� goToSchool ȣ�� ");
	}
}


class Worker extends Person{       // ������ Ŭ����
	int workerID; 
	void goToWork(){
		System.out.println("������ Ŭ������ �޼ҵ� ȣ�� ");
	}
}


public class Person {    // ��� : �θ� Ŭ������ (�ʵ�, �޼ҵ� , ����Ŭ���� ) ��  �ڽ�Ŭ�������� ���
						 // ����� ���� : 1. �ߺ��� �ڵ��� ���� ( �ڵ��� ����)
						 //            2.  �ڵ尡 �������� 
	
	String name ;
	int age ; 
	
	void eat() {
		
		System.out.println("�θ�Ŭ������ eat() �޼ҵ�");
	}
	
	void sleep() {
		
		System.out.println("�θ�Ŭ������ sleep() �޼ҵ�");
	}
	
	

	
	
	
	

	public static void main(String[] args) {
		
		// Person ��ü ����
		Person p = new Person();
		p.name = "������";
		p.age = 25 ;
		p.sleep();
		p.eat();
		System.out.println("=======================");
		
		
		// Student ��ü ����
		Student s = new Student();
		// Person Ŭ���� �ʵ�
		s.name = "��������";
		s.age = 22;
		// Student Ŭ������ �ʵ�
		s.studentId = 111;
		// Person Ŭ���� �޼ҵ�
		s.sleep();
		s.eat();
		// Student Ŭ���� �޼ҵ� 
		s.goToScool();

		System.out.println("==================");
		
		// Worker ��ü ���� 
		Worker w = new Worker();
		// Person Ŭ���� �ʵ�
		w.name = "��������";
		w.age = 22;
		//Worker Ŭ���� �ʵ�
		w. workerID = 12 ;
		// Person Ŭ���� �޼ҵ�
		w.sleep();
		w.eat();
		//Worker Ŭ���� �޼ҵ�
		w.goToWork();
		
		System.out.println("==========��ü ������ Ÿ�� ��ȯ ===========");
		
		Person p1 = new Person();     // Person()�� Person �̴�.   
		Person ps = new Student();    // ��ĳ���� , Student�� Person �̴�     
	//	Student sp = new Person();     // Person �� Student �̴�  = �Ұ���   
		Person pw = new Worker();      // ��ĳ���� ,  Worker�� Person �̴�
	//  Worker wp = new Person ();     //   �Ұ���     
	
		
		System.out.println("=======================");
	
		Student_sub sub1 = new Student_sub();
 //       Ŭ����Ÿ��  ��ü��          �ڽ�Ŭ����
		
		
			// Person Ŭ������ �ʵ�� �޼ҵ� ��� ����
			sub1.name = "��������";
			sub1.age = 12;
			sub1.eat();
			sub1.sleep();
			//Student Ŭ������ �ʵ�� �޼ҵ�
			sub1.studentId = 1145;
			sub1.goToScool();
			//Student_sub1 �� �ʵ�� �޼ҵ�
			sub1.sub1 = "�ڽ��� �ڽ� Ŭ���� ";
			sub1.sub1();
			
		Person ps1 = new Student_sub();    // ��ĳ����; Student_sub ��ü�� ������ �θ� ������ Ÿ������ ����ȯ 
					// Student_sub �� Person Ÿ������ ��ĳ���� , PersonŬ������ ����� ��� ����
			ps1.name = "ddd";
			ps1.age = 12;
			ps1.eat();
			ps1.sleep();
		
		Student ss1 = new Student_sub();   // ��ĳ����
			// person �� Student �� �ʵ�� �޼ҵ� ��밡��
		//Person
		ss1.name = " ttt";
		ss1.age = 11 ;
		ss1.eat();
		ss1.sleep();
		// Student
		ss1.studentId = 11567;
		ss1.goToScool();
		
		Student_sub ss2 = new Student_sub();  // Person , Student , Student_sub �� �ʵ�� �޼ҵ� ��� ���
		//Person
		ss2.name = "ghh";
		ss2.age = 57;
		ss2.eat();
		ss2.sleep();
		// Student
		ss2.studentId = 612512;
		ss2.goToScool();
		// Student_sub
		ss2.sub1 = "ddf";
		ss2.sub1();
		
	// ��� ���迡�� ��ü ������ �θ� ������ Ÿ������ ��ĳ���� ����
		// �θ� ������ Ÿ������ ��ĳ���� �� ��� �θ��� �ʵ�� �޼ҵ常 ��밡��
		
		// Person <==  Student <== Student_sub
		
		Person ps4  = new Student_sub();
			// Student_sub ��ü ������ Person Ÿ������ ��ĳ����
		    // Student_sub �� Person�� Student �� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�
			// ���߿��� Person Ŭ������ �ʵ�� �޼ҵ常 ���� ���� 
		Student ss4  = new Student_sub();
		// Student_sub ��ü ������ Student Ÿ������ ��ĳ����
	    // Student_sub �� Person�� Student �� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�
		// ���߿��� Person , Student Ŭ������ �ʵ�� �޼ҵ常 ���� ���� 
		Student_sub ss5  = new Student_sub();
		// Student_sub ��ü ������ Student_sub Ÿ������ ��ĳ����
	    // Student_sub �� Person�� Student �� Student_sub�� ��� �ʵ�� �޼ҵ带 �����ϰ� �ִ�
		// ���߿��� Person , Student , Student_sub Ŭ������ �ʵ�� �޼ҵ常 ���� ����
	
		
		// �ٿ� ĳ���� : �θ� ������ Ÿ������ ��ĳ���õȰ��� �ڽ� ������ Ÿ������ ��ȯ ( �������� ��ȯ )
		
		Student ps5 = (Student) ps4 ;    // ps4( Person , Student , Student_sub ) �� ������ Ÿ���� Person
					 // ps5 �� Person , Student �� �ʵ�� �޼ҵ� ���� ����
		ps5.name = " �ٿ� ĳ����";
		ps5.age = 33;
		ps5.studentId = 2214;
		ps5.goToScool();
		
		Student_sub ps6 = (Student_sub) ps4 ;     // ps4�� Person ������ Ÿ�Կ��� Student_sub�� �ٿ�ĳ����
		ps6.name = "eeee";
		ps6.age = 11;
		ps6.studentId = 75623;
		ps6.goToScool();
		ps6.sub1 = " hhhh";
		ps6.sub1();
		
		
	
	
	
	
	
	
	}

}
