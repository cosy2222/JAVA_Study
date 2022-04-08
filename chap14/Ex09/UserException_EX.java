package chap14.Ex09;

class MyAllException extends Exception {   // �Ϲݿ��� (checked Exception) - ���� ����  (����ó���� �ݵ�� �ʿ���)
	public MyAllException() {
		super();
	}
	public MyAllException(String a) {      // ���� �޼��� , e.getMessage()
		super(a);
	}
}




class A{
	// private : ĸ��ȭ, ��ü������ �ٷ� �������� ���ϵ��� ����
		// ������, setter <== ������ �ʵ��� ���� �Ҵ�
	private String season ;    // ��,����,����,�ܿ�  (���ܹ߻� : ��,����,����,�ܿ︸ �Է��ϼ���
	private String week ; 	   // ��,ȭ,��,��,��,��,��  ( ���� �߻� : ��,ȭ,��,��,��,��,�� �� �Է��ϼ���)
	private int scoreKor;	   // 0~100���� �Է�  (���ܹ߻� : 0 ~ 100 ���� ������ �Է� �ϼ���)
	private int scoreEng;      // 0~100���� �Է�  (���ܹ߻� : 0 ~ 100 ���� ������ �Է� �ϼ���)
	private String userID;     // 12���̻� 20�� ������ ���� (���� �߻� : 12���̻� 20�� ������ ���ڸ� ��������)
	
	// �ϳ��� �޼ҵ�� ó�� 
	void studentInfo(String a , String b , int c , int d , String e) throws MyAllException {
		if (a != "��" && a != "����" && a != "����" && a != "�ܿ�") {
			throw new MyAllException("�� ���� ���� �ܿ︸ �Է����ּ���");
		}else if(b != "��" && b != "ȭ" && b != "��" && b != "��" && b != "��" && b != "��" && b != "��") {
			throw new MyAllException("��,ȭ,��,��,��,��,�� �� �Է����ּ���");
		}else if(c <0 || c >100) {
			throw new MyAllException("���ܹ߻� : 0 ~ 100 ���� ������ �Է� �ϼ���");
		}else if(d <0 || d >100) {
			throw new MyAllException("���ܹ߻� : 0 ~ 100 ���� ������ �Է� �ϼ���");
		}else if(e.length() < 12  || e.length() > 20 ) {
			throw new MyAllException("���ܹ߻� : 12���̻� 20�� ���� ���ڸ� �Է� �ϼ���");
		}else{
			System.out.println("���� ��� ���������� �ԷµǾ����ϴ�");
			season = a;
			week = b;
			scoreKor = c;
			scoreEng = d;
			userID = e;
		}
		System.out.printf(season + " " +week + " " + scoreKor + " " + scoreEng + "\n" + userID); 
	}
}




public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.studentInfo("��", "��", 50, 60, "abcdabcd12345");
		} catch (MyAllException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("==================");
		
		try {
			a.studentInfo("d", "��", 50, 60, "abcdabcd12345");
		} catch (MyAllException e) {
			System.out.println(e.getMessage());
		}

	}

}
