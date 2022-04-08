package chap15.Ex12;


/*
 * 		여러스레드가 공유된 필드에 접근할떄 동시성의 문제가 발생 ===> 동기화는 동시성 문제를 해결
 * 
 * 		동기화 : 여러 스레드가 공유된 필드를 접근할떄 하나의 스레드가 완료되면 다른스레드에서 접근이 가능
 * 			하나의 스레드가 사용중인 경우 lock을 걸고 작업이 완료되면 다른스레드가 접근이 가능하도록 lock를 해제
 * 
 * 			- 모든 동기화된 메소드는 this라는 키만 가진다
 * 			- 여러 메소드가 동기환된 메소드일 경우 : 하나의 스레드만 접근 가능 
 * 
 * */




class MyData{
	// 동기화된 메소드는 Key값이 모두 this가 자동으로 등록 , 수정이 불가함
	// 동기화된 메소드는 Key값이 모두 this가 들어간다
		// 하나의 스레드가 접근할떄 Key를 가지고 동기화된 메소드를 접근 가능하다 
		// Key는 객체를 키로 사용할 수 있다
		// 동기화 블락은 Key값을 임의로 할당 가능하다
	
	synchronized void abc() {		// 여러스레드가 접근할떄 동시성 문제를 방지하기 위해서 동기화 처리
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for (int i=0 ; i <3 ; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1초 딜레이
		}
	}
	
	synchronized void bcd() {		
		try {Thread.sleep(20);} catch (InterruptedException e) {}
		for (int i=0 ; i <3 ; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1초 딜레이
		}
	}
	
	void cde() {		
		synchronized (new Object()) {
			try {Thread.sleep(30);} catch (InterruptedException e) {}
				for (int i=0 ; i <3 ; i++) {
					System.out.println(i + "번쨰");
					try {Thread.sleep(1000);} catch (InterruptedException e) {}		// 1초 딜레이
				}
		}
	}
}


public class KeyObject_2 {

	public static void main(String[] args) {
		
		
		// 공유객체
		MyData mydata = new MyData();
		
		
		// 3개의 스레드가 각가의 메소드 호출
		new Thread() {					// 익명클레스 : 
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
