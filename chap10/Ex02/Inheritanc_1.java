package chap10.Ex02;


class Aa{
	int m  ;
	void abc() {
		System.out.println("�θ� �޼ҵ� ");
	}
}

class Bb extends Aa{
	int n ;
	void bcd() {
		System.out.println("�ڽ� �޼ҵ�");
	}
	
}



public class Inheritanc_1 {

	public static void main(String[] args) {
		// Ÿ��ĳ������ ���� ���� ��� 
		Bb b = new Bb();    // b�� Aa, Bb ���� �Ѵ� .  Aa, Bb�� �ʵ�� �޼ҵ� ��� ��� ���� 
		b.m = 10;   // �θ� �ʵ�
		b.n = 20;	// �ڽ� �ʵ�
		b.abc();    // �θ� �޼ҵ�
		b.bcd();    // �ڽ� �޼ҵ�
		
		// ��ĳ���� 
		Aa a = new Bb();
		a.m = 100;
		a.abc();
		
		// �ٿ� ĳ���� 
		Bb bb = (Bb) a;
		bb.m = 1000;
		bb.n = 2000;
		bb.abc();
		bb.bcd();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
