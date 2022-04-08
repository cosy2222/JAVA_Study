package chap15.Ex16;

// Thread.sleep(1000)  ===>  TimedWaiting 상태로 이동 ===> 특정 시간 (1초)이 경과되면 Runnable 상태로 이동
													// ===>  인터럽트가 발생되면 예외를 발생시키고 Runnabel
// 인스턴스명(객체명).join(1000) ===>  TimedWaiting 상태로 이동 ==> 특정시간(1초)이 경과되면 Runnable 상태로 이동
//			a.join(1000)   : 자신의 스레드는 1초를 기다리고 a객체에게 cpu할당 

// 참고)   인스턴스명(객체명).join()   ===>  Waiting 상태로 이동 ==>
					// 자신의 스레드는 잠시 waiting 상태로 가고 a객체에게 cpu(Runnable) 사용하도록 할당
					// a객체가 모두 완료된 경우 자신의 스레드도 Runnable 


class MyThread extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);			// 3초동안 TimedWaiting 상태로 진입 , 3초후에 Runnable 상태로 이동
										// interrupt가 발생되면 예외를 발생 시키고 Runnable 상태로 이동 
		} catch (InterruptedException e) {
			System.out.println("---sleep() 진행중 Interrupt 발생");
			for(long i=0 ; i < 10000000L ; i++) {}     // 시간지연 0.5초
		}
	}
	
}

public class TimeWaiting_Sleep {

	public static void main(String[] args) {
		MyThread a = new MyThread();
		a.start();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}	
		System.out.println("MyThread state : " + a.getState());
		
		// 3초 이전에 인터럽트 발생
		a.interrupt();    // Timedwaiting 상태 
		try {Thread.sleep(1);} catch (InterruptedException e) {}	
		System.out.println("MyThread state2 : " + a.getState());
		
	}
	

}
