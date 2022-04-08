package chap15.Ex03;

// 1번쨰 스레드 
class SMIFileThread extends Thread{  // 자막파일 처리하는 스레드
	@Override
	public void run() {
		// 자막번호 출력
		String [] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		
		for (int i = 0 ; i < strArray.length ; i++) {
			System.out.println("(자막 번호) " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

// 2번쨰 스레드
class VideoFileThread extends Thread{  // 비디오 프레임을 처리하는 스레드 
	@Override
	public void run() {
		// 비디오 프레임 출력
		 int [] intArray = {1,2,3,4,5};
		 for(int i = 0 ; i < intArray.length ; i++) {
			 System.out.print("(비디오프레임) " + intArray[i]);
			 try {Thread.sleep(200);}catch (InterruptedException e) {}
		 }
		
	}
}

public class CreateAndThread_2 {

//1. main 스레드	
	public static void main(String[] args) {
		// SMIfileThread 객체 시작
		Thread a = new SMIFileThread();
		a.start();
		
		// VideoFileThread 객체 시작
		Thread b = new VideoFileThread();
		b.start();		

	}

}








