package chap15;

/*
 * 	 
 * 	1. Thread를 상속
 *  2. Runnabel 을 구현
 *  3,4  익명 내부클래스를 생성해서 구현
 *  
 *  각 값을 String 배열에 저장후 아래와 같이 출력 하세요 
 *  
 *   1		2		      
 *  이름		홍길동   이순신  신사임당
 *  나이 		40		50		60
 *  국어		100		90		80
 *  영어		70		60		100
 *  수학		50		70		80
 * 
 * */

// 첫번쨰 스레드
class First extends Thread{
	public void run() {
		
	String [] a = {"이름","나이","국어","영어","수학"};
	for(int i = 0 ; i < a.length ; i++) {
		System.out.print(a[i] + " ");
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
		}
	}
	}
}

// 두번쨰 스레드
class Second implements Runnable{

	@Override
	public void run() {
		String [] a = {"홍길동","40","95","70","50"};
		
		for(int i = 0 ; i <a.length ; i++) {
			System.out.print(a[i] + " ");
			if(i > 0) {
				System.out.print("  ");
			}
			try {
				Thread.sleep(1210);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Ex_CreateAndStartThread {

	public static void main(String[] args) {
		
		// 첫번쨰 스레드 객체
		Thread a1 = new First();
		a1.start();
		
		// 두번쨰 스레드 객체
		Runnable a2 = new Second();
		Thread s = new Thread(a2);
		s.start();
		
		// 세번쨰 스레드
		Thread a3 = new Thread(new Runnable() {
			@Override
			public void run() {
				String [] a = {"이순신","50","90","60","70"};
				for(int i = 0 ; i <a.length ; i++) {
					System.out.print(a[i] + " ");
					if(i > 0) {
						System.out.print("  ");
					}
					try {
						Thread.sleep(1220);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		a3.start();
		
		// 네번째 스레드
		Thread a4 = new Thread(new Runnable() {
			@Override
			public void run() {
				String [] a = {"신사임당","60","80","100","80"};
				for(int i = 0 ; i <a.length ; i++) {
					System.out.println(a[i]);
					try {
						Thread.sleep(1230);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		a4.start();

	}

}
