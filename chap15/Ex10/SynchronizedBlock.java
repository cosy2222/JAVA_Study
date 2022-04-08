package chap15.Ex10;

// ����ȭ : ���� �����尡 ������ �ʵ忡 �����ҋ� �ϳ��� ������ �۾��� �ٸ������尡 �������� ���ϵ��� ����
	// �޼ҵ� ����ȭ , �������ȭ

// ��� ����ȭ : �޼ҵ� ������ �Ϻκи� ����ȭ �Ѵ�		!����: �޼ҵ� ���ο��� ���  
//    - �������� : synchronized (������ ��ü){ }
//						 this : �ڽ��� ��ü    new : ������ ��ü 

class MyData {	
	int data = 3;  
	public  void pulsData () {    
		synchronized (this) {	
			// ��� ����ȭ : �޼ҵ� �Ϻκи� ����ȭ  this : �ڽ��� ��ü
			int mydata = data;
			try {Thread.sleep(2000);}catch(InterruptedException e) {}
			data = mydata + 1;
		}
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


public class SynchronizedBlock {

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
