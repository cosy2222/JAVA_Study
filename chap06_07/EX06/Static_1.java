package chap06_07.EX06;

class Aaa{
	int m = 3;            // �ʵ� (�ν��Ͻ� �ʵ�)   ��ü �����Ŀ� ��밡��
	static int n = 4;	  //�ʵ� ( static �ʵ� )  ��ü �������� ��밡�� , ��ü �����Ŀ��� ��밡��
	   					  // ��� ��ü�� �����ϴ� ���� 

	void print1(){          // �޼ҵ� (�ν��Ͻ� �޼ҵ�)   ��ü �����Ŀ� ��밡��
							// �ν��Ͻ� �޼ҵ� ������ �ν��Ͻ� �ʵ�  static �ʵ� ��밡�� 
		System.out.println("�ν��Ͻ� �޼ҵ� ��� ");
	}
	
	static void print2() {	//�޼ҵ� ( static �޼ҵ� )  ��ü �������� ��밡�� , ��ü �����Ŀ��� ��밡��
							// static �޼ҵ� ������ �ν��Ͻ� �ʵ尡 �ü� ����  static �ʵ常 �;��Ѵ� 
		
		System.out.println("static �޼ҵ� ���");
	}

}




public class Static_1 {
	

	public static void main(String[] args) {
		
		Aaa a = new Aaa();

		//    �ν��Ͻ�     ��ü������ ȣ��   Ŭ���������� ȣ�� �Ұ���
		System.out.println(a.m);
		a.print1();
		System.out.println("======================");
		
		
		//     static         ��ü�� �� Ŭ������ �Ѵ� ȣ�Ⱑ��
		
		
		System.out.println(Aaa.n);
		Aaa.print2();
		System.out.println(a.n);
		a.print2();
		System.out.println("=====================");
		
		// static �ʵ尡 ����� �ʵ�� ��� ��ü���� �������� �ٶ󺸴� ���� 
		Aaa.n = 100;
		
		System.out.println(a.n);

		Aaa aa = new Aaa();
		System.out.println(aa.n);
		
		Aaa aaa = new Aaa();
		System.out.println(aaa.n);
		
		
		
		
		
	}

}
