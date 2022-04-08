package chap15.Ex08;

// ����ȭ ( Synchronized ) : ���� �����尡 �ϳ��� ������ �ʵ带 �����Ұ��
	// 					   ���۾��� ������ �Ϸ��� �����۾��� ó�� �ϵ��� ����
	// 					   ���� �۾��Ҷ� lock�� �ɰ� �۾��� ��ġ�� lock�� �����Ѵ�

// 1. ����ȭ�� ó�� ���� �ʾ����� ����

class MyData {	// �����尡 �����ϴ� ��ü �ʵ� ����
	int data = 3;  
	void pulsData () {
		int mydata = data;
		try {Thread.sleep(2000);}catch(InterruptedException e) {}
		data = mydata + 1;
	}
}

class PlusThread extends Thread{
	MyData mydata;
	public PlusThread(MyData mydata) {
		this.mydata = mydata;
	}
	@Override
	public void run() {
		mydata.pulsData();
		System.out.println(getName() + "���� ��� : " + mydata.data);
	}
}


public class TheNeedsForSynchronized {

	public static void main(String[] args) {
		// ���� ��ü ����
		MyData mydata = new MyData();
		
		// 1. plusThread 1
		Thread plusThread1 = new PlusThread(mydata);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}

		// 2. plusThread 2
		Thread plusThread2 = new PlusThread(mydata);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		

	}

}
