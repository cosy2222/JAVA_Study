package chap15.Ex10;

// 동기화 : 여러 스레드가 공유된 필드에 접근할떄 하나의 스레드 작업시 다른스레드가 접근하지 못하도록 설정
	// 메소드 동기화 , 블락동기화

// 블락 동기화 : 메소드 내부의 일부분만 동기화 한다		!주의: 메소드 내부에서 사용  
//    - 구문형식 : synchronized (임의의 객체){ }
//						 this : 자신의 객체    new : 임의의 객체 

class MyData {	
	int data = 3;  
	public  void pulsData () {    
		synchronized (this) {	
			// 블락 동기화 : 메소드 일부분만 동기화  this : 자신의 객체
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
		System.out.println(getName() + "실행 결과 : " + mydata.data);
	}
}


public class SynchronizedBlock {

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
