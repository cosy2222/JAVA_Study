package chap15.Ex15;

// Thread.yield() : 스레드의 실행상태(Runnable) 에 있는 특정 스레드에게 자신의 스레드는 일시 양보
		// 실행상태 내부에서 다른 쓰레드를 먼저 실행 하도록 양보
		// 동기화해서 key를 서로 점유하는 현상이 발생되는데..... key를 양보해서 균등하게 처리하도록 할떄 사용

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {			// 무한루프
			if(yieldFlag) {		// yieldFlag가 True 일떄 스레드를 양보 해줌
				Thread.yield();		// 스레드를 양보해줌
			}else {   //yieldFlag가 false 일떄 스레드 정보를 출력해줌
				System.out.println(getName()+ "실행");
				for (long i = 0 ; i < 10000000L ; i++) {}   // 0.5초 시간지연
			}
		}
	}
}


public class YieldInRunnableState {

	public static void main(String[] args) {
		MyThread a = new MyThread();
		a.setName("thread1");
		a.yieldFlag = false;       // false일떄 스레드 정보 출력
		a.setDaemon(true);		   // 마지막 스레드가 종료될떄 같이종료
		a.start();
		
		MyThread a2 = new MyThread();
		a2.setName("thread2");
		a2.yieldFlag = true;       // false일떄 스레드 정보 출력
		a2.setDaemon(true);		   // 마지막 스레드가 종료될떄 같이종료
		a2.start();
		
		// 스레드 6초 지연 ( 1초 마다 한번씩 양보)
		for (int i = 0 ; i < 6 ; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {}
			a.yieldFlag =! a.yieldFlag;		  // ! 참일떄 거짓 , 거짓일떄 참 
			a2.yieldFlag =! a2.yieldFlag;
		}
	}

}
