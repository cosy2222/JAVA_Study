package chap10.Ex06;
// super Ű���� : �θ�Ŭ������ ��Ī , �޼ҵ� ���� ���� ���  , ������ ���ο��� ���
// super ()  :   ������ ���ο����� ���.  �θ�����ڸ� ȣ���ҋ� ���
				// �ݵ�� ù���ο� ��ġ

// this Ű���� : �ڽ��� ��ü�� ��Ī ,   �޼ҵ� ���ο��� ��� , ������ ���ο��� ���
// this ()   :   ������ ���ο����� ���.  �ڽ��� Ŭ������ �ٸ� �����ڸ� ȣ�� 
				// �ݵ�� ù���ο� ��ġ


class Aaa {
	Aaa(){
		System.out.println("Aaa ������");
	}
	
}

class Bbb extends Aaa{
	Bbb(){
		//super();
		System.out.println("Bbb������");
	}
}


class Ccc{
	Ccc(){}
	Ccc(int a){
		System.out.println("Ccc������ " + a);
	}
}

class Ddd extends Ccc{
	Ddd(){
		super();
	}
	Ddd(int a){
		super(3);
		System.out.println("Ddd �Ű������� ���� 1���� ������ " + a);
	}
}


public class SuperMethod_1 {

	public static void main(String[] args) {
		// 1. ��ü ����
		Aaa a = new Aaa();
		System.out.println("========================");
		
		Bbb bbb = new Bbb();
		System.out.println("======================");
		
		Ddd dd = new Ddd();    // ���� ����
		
		Ddd ddd = new Ddd(5);
		System.out.println("======================");
		
		
		
		
		
		
	}

}
