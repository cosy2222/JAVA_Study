package chap16.Ex07;

// ���ʸ� Ŭ���� : Ŭ������ ���� �ҋ� Ÿ�Ժ����� ����  <T>  <<����>> , ��ü�� ������ T�� ������ Ÿ���� ����

// ���ʸ� �޼ҵ� : �Ϲ�Ŭ���� ���ο� �޼ҵ� ����� ���ʸ� Ÿ�Ժ����� ���.

class GenericMethod1{   // �Ϲ�Ŭ����
	
	public <T> T method1 (T t) {   // ���ʸ� �޼ҵ� : 1�� 
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) { 
		return t1.equals(t2);		// �ΰ��� �� true , flase ����
									// �⺻ �ڷ����ϋ��� ���� ��,   �����ڷ����ϋ��� ��ü�� �ּҸ� ��
									// String �� ��� , ���� �� 
	}
	
	public <K , V> void method3(K k , V v) {  // ���ʸ� �޼ҵ� : 2��
		System.out.println(k + " : " + v);
	}
	
	
	
}




public class GenericMethod {

	public static void main(String[] args) {
		
		//1. �Ϲ� Ŭ���� ��ü ������ ���ʸ��޼ҵ� ȣ�� 
		GenericMethod1 gm = new GenericMethod1();
		String str1 = gm.<String>method1("�ȳ�");
		String str2 = gm.method1("�ȳ�");     // Ÿ���� �˼� �ִ� ��� ���� ���� (�Ű������� ���� ���� ��������)
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("=======================");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.<Integer>method1(200);
		System.out.println(i);
		System.out.println(i2);
		
		System.out.println("======================");
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("====================");
		
		Boolean d1 = gm.<Double>method2(0.0 , 0.0);   //���Ϲ��� Ÿ���� Boolean
		Boolean d2 = gm.<Double>method2(0.0 , 0.1);   //���Ϲ��� Ÿ���� Boolean
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("=====================");
		
		gm.<String, Integer>method3("gg" , 12);
		gm.method3("dd", 55);				// �Ű������� ��ǲ �Ǵ� ������ Ÿ���� ������ �� �ִ� ��� ���� ����
		
		gm.<Integer , String> method3 (500, "���� ���� �Դϴ�");
		gm.method3(404, "������ ã�� �� �����ϴ�");
		
		System.out.println("===============================");
		
		
		

	}

}
