package chap15.Ex17;

// a.join(1000) : a 객체에게 CPU를 할당하고 자신은 TimeWaiting 상태로 대기

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(long i = 0 ; i < 100000000L ; i++) {}    // 시간지연 0.5초
	}
}

class MyThread2 extends Thread{
	MyThread1 a;       // 클래스타입  참조변수 
	public MyThread2 (MyThread1 myThread1) {
		a = myThread1;
	}
	
	@Override
	public void run() {
		try {
			a.join(3000);
		} catch (InterruptedException e) {
			System.out.println("---join(...) 진행중 인터럽트 발생");
			for(long i = 0 ; i < 100000000L ; i++) {}
		}
	}
}


public class TimedWaiting_Join {

	public static void main(String[] args) {
		
		// 1. 객체 생성
		MyThread1 a = new MyThread1();
		MyThread2 b = new MyThread2(a);
		a.start();
		b.start();
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread state1 : " + a.getState());     // Runnabel
		System.out.println("MyThread state2 : " + b.getState());	 // Timed_Waiting

		
		b.interrupt();    //3초 대기중 인터럽트가 발생되면 예외를 발생시키고 Runnable로 이동함
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread state1 : " + a.getState());     // Runnabel
		System.out.println("MyThread state2 : " + b.getState());	 // Runnabel
	}

}
