package chap06_07.EX06;

class Cde{
	String name;
	int age;
	
	static String mail ;
	static int num;
	
}


public class Static_4 {

	public static void main(String[] args) {
		
		Cde cde = new Cde ();
		
		cde.name = "������" ; 
		cde.age = 25 ;
		
		cde.mail = "asdf";
		cde.num = 123;
		
		Cde.mail = "sdfasdf";
		Cde.num = 1234 ;
		
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		
		cde2.name = "��������";
		cde2.age = 35;
		
		cde3.name = "�ȳ�";
		cde3.age = 45;
				
		cde4.name = "�߰�";
		cde4.age = 55;
		
		// �ν��Ͻ� �ʵ� �� ���
		System.out.println(cde2.name + " , " + cde2.age );
		System.out.println(cde3.name + " , " + cde3.age );
		System.out.println(cde4.name + " , " + cde4.age );
		
		// static �ʵ��� ���� �����ϸ� ��� ��ü���� �����
		cde2.mail = "aaa@aaa.aaa" ;
		cde2.num = 124;
		
		System.out.println(cde2.mail + " , " + cde2.num);
		System.out.println(cde3.mail + " , " + cde3.num);
		System.out.println(cde4.mail + " , " + cde4.num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
