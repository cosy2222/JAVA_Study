package chap12.Ex09;

public class Apple implements PhoneInterface {

	//�������̽����� ������ �޼ҵ带 ������
	@Override
	public void sendCall() {
		System.out.println("�층");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ��");
	}
	
	// �߰����� Apple ���� ����� �߰�
	public void flash() {
		System.out.println("�� ����");
	}

}
