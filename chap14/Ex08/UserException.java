package chap14.Ex08;

// 1. Exception �� ��� �޴� ����� ���� - �Ϲݿ���
		// 1-1 ������ ������ ��� ����
		// 1-2 ������ 100���� �ʰ��ϴ� ��� ����


class MinusException extends Exception{		// ������ ���� ��� ���� �߻�
	public MinusException() {
		super();	// �θ��� ������ ȣ��
	}
	public MinusException(String message) {   // ���� �޼��� ��� 
		super(message);
	}
}

class OverException extends Exception{		// 100�̻��� ���� ���� ��� ���� �߻�
	public OverException() {
		super();	
	}
	public OverException(String message) {   // ���� �޼��� ��� 
		super(message);
	}
}


class AAA{
	int score ;
	
	void ckeckScore(int a) throws MinusException , OverException{
		if(a < 0) {
			throw new MinusException("���� �߻� : ������ ������ ����");
		}else if(a>100) {
			throw new OverException("���� �߻� : 100�̻��� ���� ������ �����ϴ�");
		}else {
			System.out.println("�����Է� �Դϴ�");
			score = a;
			System.out.println("������ : " + score);
		}
	}
}




public class UserException {

	public static void main(String[] args) {
		
		AAA a = new AAA();
		
		try {
			a.ckeckScore(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========================");
		
		try {
			a.ckeckScore(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========================");
		try {
			a.ckeckScore(50);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}



	}

}
