package chap14.Ex08;

// �޼ҵ��� throws �� ���� ,���� , ����main����
	// main ���� ���ܰ� ������ �Ȱ��� ������ ��� â�� ���� ���α׷� ����
	// main �޼ҵ�� ���� ó�� ���� �ʴ´� . 

class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException {
		int num  = Integer.parseInt("10A");    // NumberFormatException �߻�
	}
	
}


public class ExceptionMethod {

	public static void main(String[] args)  {
		
		AA aa = new AA();
		
		try {
			aa.abc();   // ���࿹�� (�����ϴܰ迡���� ���� ����)
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
				

	}

}
