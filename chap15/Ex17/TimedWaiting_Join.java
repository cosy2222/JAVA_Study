package chap15.Ex17;

// a.join(1000) : a ��ü���� CPU�� �Ҵ��ϰ� �ڽ��� TimeWaiting ���·� ���

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(long i = 0 ; i < 100000000L ; i++) {}    // �ð����� 0.5��
	}
}

class MyThread2 extends Thread{
	MyThread1 a;       // Ŭ����Ÿ��  �������� 
	public MyThread2 (MyThread1 myThread1) {
		a = myThread1;
	}
	
	@Override
	public void run() {
		try {
			a.join(3000);
		} catch (InterruptedException e) {
			System.out.println("---join(...) ������ ���ͷ�Ʈ �߻�");
			for(long i = 0 ; i < 100000000L ; i++) {}
		}
	}
}


public class TimedWaiting_Join {

	public static void main(String[] args) {
		
		// 1. ��ü ����
		MyThread1 a = new MyThread1();
		MyThread2 b = new MyThread2(a);
		a.start();
		b.start();
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread state1 : " + a.getState());     // Runnabel
		System.out.println("MyThread state2 : " + b.getState());	 // Timed_Waiting

		
		b.interrupt();    //3�� ����� ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable�� �̵���
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread state1 : " + a.getState());     // Runnabel
		System.out.println("MyThread state2 : " + b.getState());	 // Runnabel
	}

}
