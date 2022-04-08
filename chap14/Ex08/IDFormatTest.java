package chap14.Ex08;

//Id���� NULL�� ��� Exception �߻�
// userID : 8�� �̻� 20�� ���� �� �ƴ� ��� Exception

class IDFormatException extends Exception{   //2���� �����ڸ� ����
	public IDFormatException() {
		super();
	}
	
	public IDFormatException(String message) {	// ���� �߻��� ���� �޼��� ���
		super(message);
	}
}

public class IDFormatTest{
	private String userID ;			// üũ : null, 8���̻� 20�����ϰ� �ƴѰ�� Exception
		// userID ĸ��ȭ ��  private : �ܺ�Ÿ �ٸ� Ŭ�������� ���� ����
			// ������ , setter�� ����ؼ� ���� �Ҵ�
		// private �� ������ ��� : getter , setter�� ���
	
	public String getUserID () {	// �޼ҵ� ȣ��� �޸��� userID�� ������
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("���̵�� null�ϼ� �����ϴ�");
		}else if (userID.length() <8 || userID.length() >20 ) {
			throw new IDFormatException("���̵�� 8���̻� 20�� ���Ϸ� ��� �����մϴ�");
		}
		this.userID = userID;
		System.out.println("���������� �Է� �Ǿ����ϴ�");
	}


	public static void main(String[] args) {
		
		IDFormatTest a = new IDFormatTest();
		
		// 1. userID �� null �� ���
		String userID = null ;
		
		try {
			a.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}		
		System.out.println("======================");
		
		
		//2. userID�� 7�� �������
		userID = "qwerqwe";
		try {
			a.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=====================");
		
		//3. null�� �ƴϰ� 8�� �̻� 20�� �̸� : ����
		userID = "abcdef1234";
		try {
			a.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a.getUserID());

	}

}
