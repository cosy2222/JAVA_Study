package chap10.Ex;

class Student{
					// �ڹٴ� ���� ����� �Ұ� , �ڹ��� ��� Ŭ������ Object Ŭ������ �ڽ� Ŭ���� �̴� . 
							// Object Ŭ�������� ������ �ʵ峪 �޼ҵ带 ���� �� �� �ִ� 
	String name;      // �л� �̸�
	int studentID ;    //�й�
	int kor ;		   // �������� 
	int eng ; 		   // ��������
	int math ;		   // ��������
	int sum ;		   // ���� ��
	double avg ;       // ���� ���
	
	void hobby() {
		System.out.println("�� �л��� ��̴� �Դϴ�");
	}

	@Override
	public String toString() {  // Object Ŭ������ �޼ҵ� , ��ü ��ü�� ����Ҷ� , [��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�Ƹ� : " + name + " , �й� : " + studentID + " , ���� : " + kor + " , ���� : " +
						eng + " , ���� : " + math + " , �հ� : " +sum + " , ��� : " + avg; 
	}
	
}

class S_ö�� extends Student{
	
	// ������ : 1. Ŭ������� ���� , 2. ����Ÿ���� ����� �Ѵ� 
	S_ö�� (String a, int b , int c , int d , int e){    
		super.name = a;    // super : �θ� Ŭ����    ,     �ڽ��� Ŭ���� 
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double)sum/3;
		
	}

	@Override
	void hobby() {
		System.out.println("ö���� ��̴� ���� �Դϴ�");
	}
	
}

class S_���� extends Student{
	
	S_���� (String a, int b , int c , int d , int e){    
		super.name = a;    // super : �θ� Ŭ����    ,     �ڽ��� Ŭ���� 
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double)sum/3;
	}

	@Override
	void hobby() {
		System.out.println("������ ��̴� ���� �Դϴ�");
	}
	
}


class S_��ö extends Student{
	
	S_��ö (String a, int b , int c , int d , int e){    
		super.name = a;    // super : �θ� Ŭ����    ,     �ڽ��� Ŭ���� 
		super.studentID = b;
		super.kor = c;
		super.eng = d;
		super.math = e;
		super.sum = c+d+e;
		super.avg = (double)sum/3;
	}

	@Override
	void hobby() {
		System.out.println("��ö�� ��̴� ���� �Դϴ�");
	}
	
}

public class Quiz03 {

	public static void main(String[] args) {
		
		Student ö�� = new S_ö�� ("ö��" , 001, 80 , 90 , 100);
		Student ���� = new S_���� ("����" , 002, 85 , 95 , 90);
		Student ��ö = new S_��ö ("��ö" , 003, 93 , 100 , 84);
		
		Student [] arr = { ö�� , ���� , ��ö };
		
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
