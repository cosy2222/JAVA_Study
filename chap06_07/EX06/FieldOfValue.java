package chap06_07.EX06;

// ��ü�� �ʵ忡 ���� �Ҵ� �ϴ� ��� : 3����
// 1 . �ʵ忡 ���� ���� �ο� �ϴ� ���						<== ��ü�� ������
// 2. setter �� ���ؼ� ��ü�� �ʵ� ���� �ο�  (��Ʈ�� ����)   <== ��ü�� ������  
// 3.  �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο�    (��Ʈ�� ����)	<== ��ü�� �����ҋ� �ʱⰪ���� �ʵ忡 ���� �Ҵ�


class Aa{   // 1. ��ü ������ ���� �ʵ忡 �� �Ҵ�
	String name ;
	int age ;
	String mail;
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("mail : " + mail);
		
	}
}

class Bb{   // 2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ�
	
	String name ;
	int age ;
	String mail;
	
	void setname(String a) {
		name = a;
	}
	
	void setage(int a) {
		age = a;
	}
	void setmail(String a) {
		mail = a;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("mail : " + mail);
		
	}
}

class Cc{   //  3. �����ڸ� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ�
	
	String name ;
	int age ;
	String mail;
	
	Cc (String a , int b , String c){
		name = a;
		age = b;
		mail = c;
	}
	
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("mail : " + mail);
		
	}
}


public class FieldOfValue {

	public static void main(String[] args) {
		
		// 1 .�ʵ忡 ���� �� 
		
		Aa aa = new Aa();
		
		aa.name = "������";
		aa.age = 25;
		aa.mail = "cosy2222@naver.com";
		
		aa.print();
		System.out.println("=======================");
		
		
		
		// 2.  setter ���
		Bb bb = new Bb();
		
		bb.setname("���̸�");
		bb.setage(15);
		bb.setmail("bbb@bbb.com");
		
		bb.print();
		System.out.println("=======================");
		
		
		// 3 . �����縦 ����ؼ� �ʵ��� �� 
		Cc cc = new Cc("�����̸�" , 35 , "ccc@ccc.com");
		
		cc.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
