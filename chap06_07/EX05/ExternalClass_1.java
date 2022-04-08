package chap06_07.EX05;


class B{    // �ܺ� Ŭ���� : public �� �ü� ����    default �� �����Ǿ�����
			// �ٸ� ��Ű���� Ŭ���������� ������ �Ұ� , ���� ��Ű�� �������� ���ٰ��� 
	
	private int a = 1;      // private : ���� Ŭ������������ ��밡�� 
	int b = 2;				// default : ���� ��Ű���������� ��밡��
	protected int c = 3 ; 	// protected : default ���� + �ٸ���Ű������ ���� ���� ( ��ӵ� ��츸 ����) 
	public int d = 4 ;      // public : �ٸ� ��Ű������ ��밡��
	
		// private < default < protected < public 
	
	private void print1() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
}





public class ExternalClass_1 {
	
	public static void main(String[] args) {
		
		B b = new B();    // ���� Ŭ������ �����ϹǷ� class B �� ��밡��
		
		Bb bb = new Bb();
		
		
		// bb.a = 10 ;  private 
		bb.b = 20 ;		// default
		bb.c = 30;      // protected
		bb.d = 40;      // public
		
		// bb.print1();    private
		bb.print2();       // default
		bb.print3();	   // protected
		bb.print4();       // public
		
		
		
	}
	
	

}
