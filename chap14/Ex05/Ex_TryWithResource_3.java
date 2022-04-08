package chap14.Ex05;

// �ڵ� ���ҽ�(��ü) ����
	// AutoCloseable �������̽��� �����ؾ��Ѵ�

// �ʵ忡 �� �Ҵ�   ������ ȣ��� �ʵ忡 ���� �ο�
class Abc implements AutoCloseable{
	String name ;
	int studentId ;
	int kor ;
	int eng ;
	int math ;
	double avg ;     // ��հ��
	
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
			System.out.println("�ʱ�ȭ �߽��ϴ�");
			System.out.println(name + " " + studentId + " " + kor + " " + eng + " " + math +" " + avg);
			
					
		}
	}
	
}

public class Ex_TryWithResource_3 {

	public static void main(String[] args) {
		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ �ϰ� �ڵ����� close();
		
		try(Abc a1 = new Abc("������" , 20220323 , 55 , 65 ,75);){
			System.out.print("�̸�:" + a1.name + " ");
			System.out.print("�й�:" + a1.studentId + " ");
			System.out.print("����:" + a1.kor + " ");
			System.out.print("����:" + a1.eng + " ");
			System.out.print("����:" + a1.math + " ");
			System.out.println("��հ� :" + a1.avg);
		}catch (Exception a) {
			System.out.println("����ó��");
		}
		
		System.out.println("========================");
		//2. ���� close(),   finally ������� close() ȣ��
		
		Abc a2 = null;
		
		try {
			a2 = new Abc("�μ���" , 12345678 , 65 , 76 ,85);
			System.out.print("�̸�:" + a2.name + " ");
			System.out.print("�й�:" + a2.studentId + " ");
			System.out.print("����:" + a2.kor + " ");
			System.out.print("����:" + a2.eng + " ");
			System.out.print("����:" + a2.math + " ");
			System.out.println("��հ� :" + a2.avg);
		}catch(Exception a) {
			System.out.println("����ó��");
		}finally {
			try {
				a2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
