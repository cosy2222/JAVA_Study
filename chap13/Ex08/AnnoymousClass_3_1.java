package chap13.Ex08;

//  �޼ҵ��� �Ű� ������ ����
//    1 : ��ü ������ �Ű������� ����  (Ŭ������ o , + �������� o )
//    2 : ��ä ������ �Ű������� ����  (Ŭ������ o  +  �������� x )


interface Aa{
	void cry();
	void fly();
}


class Bb implements Aa{

	@Override
	public void cry() {
		System.out.println("�۸� : �Ű����� ����");
	}

	@Override
	public void fly() {
		System.out.println("�������մϴ� : �Ű����� ����");
	}
}

class Cc{    // Cc ��ü�� abc�޼ҵ� ȣ��� AaŸ���� �Ű������� �޴´�
	void abc(Aa a) {	// ���� �ڽ� Ŭ������ �Ű������� ���� ��� Aa Ÿ������ �ڵ����� ��ĳ���� �ȴ�
		a.cry();
		a.fly();
	}
}


public class AnnoymousClass_3_1 {

	public static void main(String[] args) {
		// 1  (Ŭ������ o , + �������� o )
		Cc c = new Cc();
		Aa a = new Bb();
		
		c.abc(a);
		
		
		// 2  (Ŭ������ o , + �������� x )
		
		c.abc(new Bb());

	}

}
