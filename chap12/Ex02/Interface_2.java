package chap12.Ex02;

// interface ������ Ŭ���� ,
	// Overriding : ������ �޼ҵ带 �ڽ�Ŭ�������� ���� �����ϴ°�
 	// Implements : �̿ϼ� �޼ҵ带 �ϼ���Ű�� �� 
	// extends    : �θ�Ŭ������ ����� ��ӹ޾Ƽ� �ڽ��� ����� �߰��ؼ� Ȯ��

interface Aa{
	
	void fly();
	void run();
	
}

class Bb implements Aa{   // BbŬ������ Aa�������̽��� �̿ϼ��� �޼ҵ带 �����Ѵ� 

	@Override
	public void fly() {
		System.out.println("�߿�");
	}

	@Override
	public void run() {
		System.out.println("������");
	}
	
}




public class Interface_2 {

	public static void main(String[] args) {
		
		Aa a = new Bb();
		a.fly();
		a.run();
		
		
		
		
		
	}

}
