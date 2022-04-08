package chap15.Ex08;

// 동기화 ( Synchronized ) : 여러 스레드가 하나의 공유된 필드를 접근할경우
	// 					   한작업을 완전히 완료후 다음작업을 처리 하도록 설정
	// 					   내가 작업할때 lock을 걸고 작업을 마치면 lock를 해제한다

// 1. 동기화를 처리 하지 않았을때 에문

class MyData {	// 스레드가 공유하는 객체 필드 생성
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
		System.out.println(getName() + "실행 결과 : " + mydata.data);
	}
}


public class TheNeedsForSynchronized {

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
