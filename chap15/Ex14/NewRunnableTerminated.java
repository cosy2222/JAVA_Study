package chap15.Ex14;

// 스레드 상태
  // 1.  new			:스레드 객체 생성후 .start() 메소드가 호출되기전 상태

  // 2. Runnable		: .start() 메소드가 호출되면 run() 메소드 내부의 코드가CPU에서 실행되고 있는 상태

  // 3. Terminate		: run()의 모든 코드가 싱행되면 스레드 종료

  // 4. Timed waite		: 특정시간동안만 대기상태 , Thread.sleep(1000); 
  //				      a.join(1000)  <=== 현재 자신의 스레드는 1초 대기상태에 있고 , a 객체를 실행 상태로 먼저 보냄 
  //					  특정 시간이 종료되면 실행상태로감 , 인터럽트가 발생되면 예외를 발생시키고 실행상태로 감

  // 5. Block			: 동기화 처리에서 lock이 걸려서 접근이 잠시 차단된상태, 키를 반납한 경우 키를 획득해서 실행상태로 감

  // 6. waite			: 무한정 대기상태 , 누가 꺠워줘야 실행으로 갈 수 있다  , 다른스레드가 꺠워줘야 함 


public class NewRunnableTerminated {

	public static void main(String[] args) {
		
		// 스레드의 상태를 저장해놓은 클래스다.   총 6개의 상태를 저장 할 수 있다
		Thread.State state;     // state 변수에는 6가지 상수만 
		
		
		// 1. 객체 생성 (NEW)
				// NEW : 스레드 객체 생성후 .start() 호출되기 전까지
		Thread mythread = new Thread() {
			@Override
			public void run() {
				for (long i = 0 ; i < 100000000L ; i ++) {}   // 0.5초 시간 지연
			}
		};
		
		state = mythread.getState();       // 스레드의 상태를 가지고 와서 state 변수에 담는다
		System.out.println("mythread state : " + state);
		
		// 2. myThread 시작
		mythread.start();
		state = mythread.getState();
		System.out.println("mythread state : " + state);
		
		// 3. mythread 종료 
		
			// mythread.join();  내 스레드(main)는 대기하고 , mythread를 처리하라
		try {mythread.join();} catch (InterruptedException e) {}
		state = mythread.getState();
		System.out.println("mythread state : " + state);
		
		

	}
}	
