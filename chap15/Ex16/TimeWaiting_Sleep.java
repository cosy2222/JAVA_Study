package chap15.Ex16;

// Thread.sleep(1000)  ===>  TimedWaiting ���·� �̵� ===> Ư�� �ð� (1��)�� ����Ǹ� Runnable ���·� �̵�
													// ===>  ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnabel
// �ν��Ͻ���(��ü��).join(1000) ===>  TimedWaiting ���·� �̵� ==> Ư���ð�(1��)�� ����Ǹ� Runnable ���·� �̵�
//			a.join(1000)   : �ڽ��� ������� 1�ʸ� ��ٸ��� a��ü���� cpu�Ҵ� 

// ����)   �ν��Ͻ���(��ü��).join()   ===>  Waiting ���·� �̵� ==>
					// �ڽ��� ������� ��� waiting ���·� ���� a��ü���� cpu(Runnable) ����ϵ��� �Ҵ�
					// a��ü�� ��� �Ϸ�� ��� �ڽ��� �����嵵 Runnable 


class MyThread extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);			// 3�ʵ��� TimedWaiting ���·� ���� , 3���Ŀ� Runnable ���·� �̵�
										// interrupt�� �߻��Ǹ� ���ܸ� �߻� ��Ű�� Runnable ���·� �̵� 
		} catch (InterruptedException e) {
			System.out.println("---sleep() ������ Interrupt �߻�");
			for(long i=0 ; i < 10000000L ; i++) {}     // �ð����� 0.5��
		}
	}
	
}

public class TimeWaiting_Sleep {

	public static void main(String[] args) {
		MyThread a = new MyThread();
		a.start();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}	
		System.out.println("MyThread state : " + a.getState());
		
		// 3�� ������ ���ͷ�Ʈ �߻�
		a.interrupt();    // Timedwaiting ���� 
		try {Thread.sleep(1);} catch (InterruptedException e) {}	
		System.out.println("MyThread state2 : " + a.getState());
		
	}
	

}
