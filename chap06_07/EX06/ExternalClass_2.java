package chap06_07.EX06;

  // import chap06_07.EX05.B;       default �� ��� �Ұ���

import chap06_07.EX05.Bb;



public class ExternalClass_2 {

	public static void main(String[] args) {
		
		// �ٸ� ��Ű���� Ŭ�������� BbŬ������ ���� �ϴ� ��� 
		// 1 . import �� ���� ���
		// 2. Bb Ŭ������ ���� �����ڴ� public
		// 3. �ʵ� , �޼ҵ��� ���� �����ڿ� ���� ������  ����(protected , public ) OR �Ұ���(private , default) 
		
		Bb b = new Bb();
		
		// b.a = 10;    private
		// b.b = 20;    default
		// b.c = 30;     // protected
		 b.d = 40;     // public
		
		// b.print1();    private
		// b.print2();       // default
		// b.print3();	   // protected
		b.print4();       // public

	}

}
