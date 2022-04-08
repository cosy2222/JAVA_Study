package chap15.Ex09;

// �޼ҵ� ����ȭ : �޼ҵ� ��ü�� ����ȭ �ϴ°� 
	// Key ���� this �Ҵ��.



class MyData {	
	int data = 3;  
	public synchronized void pulsData () {    
		// ����ȭ ó�� �޼ҵ� : �ϳ��� �����尡 �۾��� �Ϸ�Ǹ� ���� �����尡 �۾� �� �� �ִ� 
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

public class Synchronizedmethod {

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
