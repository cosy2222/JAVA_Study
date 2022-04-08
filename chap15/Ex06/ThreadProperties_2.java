package chap15.Ex06;

// 스레드 우선 순위
class MyThread extends Thread{
	@Override
	public void run() {
		for (long i = 0 ; i < 100000 ; i++) {} // 시간지연용
		System.out.println(getName() + " 우선순위 " + getPriority());
			
	}
}


public class ThreadProperties_2 {

	public static void main(String[] args) {
		
		// 1. 참고 : CPU core 확인 하기
		System.out.println("코어수 : " + Runtime.getRuntime().availableProcessors());
		
		//2. 기본(default : 5) 우선 순위
			//(낮음) 0 ~ 5 (default)~ 10 (높음)
		for (int i = 0 ; i < 3 ; i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName() + "\t");
			System.out.println(thread.getPriority());
			thread.start();
		}
		// 1초 지연
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		// 3. 우선순위 직접지정
		for ( int i = 0 ; i < 10 ; i++) {	// 0 ~8 : 우선순위 5 ,  9 : 우선순위10
			Thread thread = new MyThread();
			thread.setName(i + " 번쨰 스레드");
			if(i == 9 ) {		// 마지막 스레드의 우선순위를 10으로 할당
				thread.setPriority(10);
			}
			thread.start();
//			System.out.print(thread.getName() + "\t");
//			System.out.println(thread.getPriority());
		}
		
		
	}

}
