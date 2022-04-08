package chap15.Ex12;


/*
 * 		���������尡 ������ �ʵ忡 �����ҋ� ���ü��� ������ �߻� ===> ����ȭ�� ���ü� ������ �ذ�
 * 
 * 		����ȭ : ���� �����尡 ������ �ʵ带 �����ҋ� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ������忡�� ������ ����
 * 			�ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ������尡 ������ �����ϵ��� lock�� ����
 * 
 * 			- ��� ����ȭ�� �޼ҵ�� this��� Ű�� ������
 * 			- ���� �޼ҵ尡 ����ȯ�� �޼ҵ��� ��� : �ϳ��� �����常 ���� ���� 
 * 
 * */




class MyData{
	// ����ȭ�� �޼ҵ�� Key���� ��� this�� �ڵ����� ��� , ������ �Ұ���
	// ����ȭ�� �޼ҵ�� Key���� ��� this�� ����
		// �ϳ��� �����尡 �����ҋ� Key�� ������ ����ȭ�� �޼ҵ带 ���� �����ϴ� 
		// Key�� ��ü�� Ű�� ����� �� �ִ�
		// ����ȭ ����� Key���� ���Ƿ� �Ҵ� �����ϴ�
	
	synchronized void abc() {		// ���������尡 �����ҋ� ���ü� ������ �����ϱ� ���ؼ� ����ȭ ó��
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for (int i=0 ; i <3 ; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1�� ������
		}
	}
	
	synchronized void bcd() {		
		try {Thread.sleep(20);} catch (InterruptedException e) {}
		for (int i=0 ; i <3 ; i++) {
			System.out.println(i + "��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1�� ������
		}
	}
	
	void cde() {		
		synchronized (new Object()) {
			try {Thread.sleep(30);} catch (InterruptedException e) {}
				for (int i=0 ; i <3 ; i++) {
					System.out.println(i + "����");
					try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1�� ������
				}
		}
	}
}


public class KeyObject_2 {

	public static void main(String[] args) {
		
		
		// ������ü
		MyData mydata = new MyData();
		
		
		// 3���� �����尡 ������ �޼ҵ� ȣ��
		new Thread() {					// �͸�Ŭ���� : 
			public void run() {
				mydata.abc();
			}
		}.start();
		
		new Thread() {
			public void run() {
				mydata.bcd();
			}
		}.start();
		
		new Thread() {
			public void run() {
				mydata.cde();
			}
		}.start();
		

	}

}
