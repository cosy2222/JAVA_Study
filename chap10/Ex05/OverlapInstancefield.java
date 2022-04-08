package chap10.Ex05;

class Aa {
	int m = 3;    // �ν��Ͻ� �ʵ�
	void print() {
		System.out.println("class Aa");
	}
}

class Bb extends Aa{
	int m = 4;	  // �ν��Ͻ� �ʵ�
	@Override
	void print() {
		System.out.println("class Bb");
	}
}

class Cc extends Aa{
	int m = 5;	  // �ν��Ͻ� �ʵ�
	@Override
	void print() {
		System.out.println("class Cc");
	}
}


public class OverlapInstancefield {

	public static void main(String[] args) {
		//1. ��ü ����
		Aa aa = new Aa();
		Bb bb = new Bb();
		Cc cc = new Cc();
		
		Aa ab = new Bb();
		Aa ac = new Cc();
		
		//2. �ν��Ͻ� �ʵ� ���  : �ν��Ͻ� �ʵ�� �������̵� �ȵ�
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(cc.m);
		System.out.println("====================");
		
		System.out.println(ab.m);
		ab.print();
		System.out.println(ac.m);
		ac.print();
		
		

	}

}
