package chap06_07.EX04;

// ����� this Ű���� �߰�
class Aa {                    //  this Ű�� ������� �ʴ� ��� : ���������� �ν�
	int m ;
	int n ; 
	void init (int m , int n ) {			// �������� m , n
		m = m;                         // this Ű�� ������� �ʴ� ��� m <== �������� m
		n = n;						   // this Ű�� ������� �ʴ� ��� n <== �������� n
	}
	
	
}


class Bb{                     // this Ű�� ����ϴ� ���
	
	int m ;
	int n ;
	void init ( int m , int n ) {
		this.m = m;                  // this Ű�� ����ϴ� ��� m <==  �ʵ� m
		this.n = n;					 // this Ű�� ����ϴ� ��� n <==  �ʵ� n
	}
	
}



public class ThisKeyword_2 {

	public static void main(String[] args) {
		//1. �ʵ��� ��� ���������� ���� ���� ���  (thisŰ���带 ������� �ʴ� ��� : ���������� ���� )
		
		Aa aa = new Aa();
		aa.init(2,3);
		System.out.println(aa.m);
		System.out.println(aa.n);
		
		//2. �ʵ��� ��� ���������� ���� ���� ���  (thisŰ���带 ����ϴ� ��� : �ʵ忡 ���� )
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);
		System.out.println(bb.n);

	}

}
