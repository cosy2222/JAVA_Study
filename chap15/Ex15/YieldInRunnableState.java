package chap15.Ex15;

// Thread.yield() : �������� �������(Runnable) �� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸
		// ������� ���ο��� �ٸ� �����带 ���� ���� �ϵ��� �纸
		// ����ȭ�ؼ� key�� ���� �����ϴ� ������ �߻��Ǵµ�..... key�� �纸�ؼ� �յ��ϰ� ó���ϵ��� �ҋ� ���

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {			// ���ѷ���
			if(yieldFlag) {		// yieldFlag�� True �ϋ� �����带 �纸 ����
				Thread.yield();		// �����带 �纸����
			}else {   //yieldFlag�� false �ϋ� ������ ������ �������
				System.out.println(getName()+ "����");
				for (long i = 0 ; i < 10000000L ; i++) {}   // 0.5�� �ð�����
			}
		}
	}
}


public class YieldInRunnableState {

	public static void main(String[] args) {
		MyThread a = new MyThread();
		a.setName("thread1");
		a.yieldFlag = false;       // false�ϋ� ������ ���� ���
		a.setDaemon(true);		   // ������ �����尡 ����ɋ� ��������
		a.start();
		
		MyThread a2 = new MyThread();
		a2.setName("thread2");
		a2.yieldFlag = true;       // false�ϋ� ������ ���� ���
		a2.setDaemon(true);		   // ������ �����尡 ����ɋ� ��������
		a2.start();
		
		// ������ 6�� ���� ( 1�� ���� �ѹ��� �纸)
		for (int i = 0 ; i < 6 ; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {}
			a.yieldFlag =! a.yieldFlag;		  // ! ���ϋ� ���� , �����ϋ� �� 
			a2.yieldFlag =! a2.yieldFlag;
		}
	}

}
