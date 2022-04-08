package chap15.Ex09;

// 메소드 동기화 : 메소드 전체를 동기화 하는것 
	// Key 값이 this 할당됨.



class MyData {	
	int data = 3;  
	public synchronized void pulsData () {    
		// 동기화 처리 메소드 : 하나의 스레드가 작업이 완료되면 다음 스레드가 작업 할 수 있다 
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
		System.out.println(getName() + "실행 결과 : " + mydata.data);
	}
}

public class Synchronizedmethod {

	public static void main(String[] args) {
		
		// 공유 객체 생성
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
