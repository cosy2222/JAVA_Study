package chap06_07.EX04;

// Aaa Ŭ������ �������� �����ڸ� this()���� ����� ��� 
class Aaa {
	int m1 , m2 , m3 , m4 ;          // �ʵ� 4�� ����
	
	Aaa () {       // ������ : �Ű� ������ ���� ������ 
		m1 = 1;   m2 = 2;   m3 = 3;   m4 = 4;
	}
	
	Aaa (int a){
		m1 = a;   m2 = 2;   m3 = 3;   m4 = 4;
	}
	
	Aaa ( int a , int b){
		m1 = a;   m2 = b;   m3 = 3;   m4 = 4;
	}
	
	void print() {
		System.out.print( m1 + " ");
		System.out.print( m2 + " ");
		System.out.print( m3 + " ");
		System.out.print( m4 + " ");
		System.out.println();
		
	}	
}


class Bbb{
	int m1 , m2 , m3 , m4 ;
	
	Bbb () {       // ������ : �Ű� ������ ���� ������ 
		m1 = 1;   m2 = 2;   m3 = 3;   m4 = 4;
	}
	
	Bbb (int a){
		this();
		m1 = a;
	}
	
	Bbb (int a , int b){
		this();
		m1 = a;
		m2 = b;
	}
	
	void print() {
		System.out.print( m1 + " ");
		System.out.print( m2 + " ");
		System.out.print( m3 + " ");
		System.out.print( m4 + " ");
		System.out.println();
		
	}	
	
}





public class ThisMethod_2 {

	public static void main(String[] args) {
		Aaa a = new Aaa();
		Aaa aa = new Aaa(5);
		Aaa aaa = new Aaa(5,6);
		
		a.print();
		aa.print();
		aaa.print();	
		
		System.out.println("=====================");
		
		Bbb b= new Bbb();
		Bbb bb = new Bbb(5);
		Bbb bbb = new Bbb(5,6);
		
		b.print();
		bb.print();
		bbb.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
