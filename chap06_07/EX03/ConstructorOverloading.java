package chap06_07.EX03;

// ������ �����ε� : �ϳ��� �����ڸ� ������Ÿ�� , ������ ���� �ٸ� �����ڰ� ȣ�� 
     // ���� ) ������Ÿ�԰� ������ ���� �����ڰ� ������ ����
class Abc {
	
	int a , b , c ;
	String d;
	
	Abc () {      // �⺻ ������ 
		System.out.println(a + " " + b + " " + c);
	}   
	
	Abc (int a){                 // �Ű������� 1��
		this.a = a;
		System.out.println(a);
	}
	
	Abc (String d){
		this.d = d;
		System.out.println(d);
	}
	
	Abc (int a , int b){         // �Ű������� 2�� 
		this.a = a;
		this.b = b;
		System.out.println(a + " , " + b);
		System.out.println();
	}
	
	Abc (int a , int b , int c){
		this.a = a ;  this.b = b;  this.c=c ;
		System.out.println(a+" , " + b + " , " + c) ;
	}
	
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc();     // �⺻ ������ ȣ��
		
		Abc abc1 = new Abc(1);
		
		Abc abc2 = new Abc(1,2);
		
		Abc abc3 = new Abc(1,2,3);
		
		Abc abc4 = new Abc("�ȳ�");
	}

}
