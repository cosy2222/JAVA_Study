package Ex;

public class Ex_11_01 {

	public static void main(String[] args) {
		
		// String �� ���� �Ҵ� �ҋ� �����ڸ� ���ؼ� �Ҵ�.  // ������ �޸� ������ ������.
		String aa = new String("�ȳ�");
		String bb = new String("�ȳ�");
		System.out.println(aa);
		System.out.println(bb);
		
		//  �⺻ �ڷ����ϋ� : ==  ������
		//  ���� �ڷ����ϋ� : ==  �����ϴ� �ּ��� ������ �� 
		//  ���� �ڷ����ϋ� ���� �� : aa.equals(bb)     <== �������� aa ���� str2�� �� �ִ� ���� �� 
		
		
		if ( aa == bb) {              // �޸��� �ּ� ���� �� ( aa, bb�� �ٸ� �޸� �ּҸ� ���´� )
			System.out.println(true);
		}
		else {
			System.out.println(false);          // �ּҰ��� �޶� false
		}
		System.out.println("======================");
		
		if(aa.equals(bb)) {                // �޸��� ���� ��
			System.out.println(true);      // ���� �Ȱ��Ƽ� true
		}
		else {
			System.out.println(false);
		}
		System.out.println("=========================");
		System.out.println("=========================");

		// String �� ���� ���ͷ� ���� �ٷ� �Ҵ�.   // �޸� ������ ���� �Ѵ�.
		String a = "�ȳ�";
		String b = "�ȳ�";
		
		if( a == b) {                        // ���� �ڷ������� "==" �� : �޸��� �ּҸ� �� 
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
