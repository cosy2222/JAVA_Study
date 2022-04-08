package chap14.Ex08;

// 1. Exception 을 상속 받는 사용자 예외 - 일반예외
		// 1-1 점수가 음수인 경우 예외
		// 1-2 점수에 100점을 초과하는 경우 예외


class MinusException extends Exception{		// 음수가 들어올 경우 강제 발생
	public MinusException() {
		super();	// 부모의 생성자 호출
	}
	public MinusException(String message) {   // 예외 메세지 출력 
		super(message);
	}
}

class OverException extends Exception{		// 100이상의 값이 들어올 경우 강제 발생
	public OverException() {
		super();	
	}
	public OverException(String message) {   // 예외 메세지 출력 
		super(message);
	}
}


class AAA{
	int score ;
	
	void ckeckScore(int a) throws MinusException , OverException{
		if(a < 0) {
			throw new MinusException("예외 발생 : 음수는 넣을수 없음");
		}else if(a>100) {
			throw new OverException("예외 발생 : 100이상의 값을 넣을수 없습니다");
		}else {
			System.out.println("정상입력 입니다");
			score = a;
			System.out.println("점수는 : " + score);
		}
	}
}




public class UserException {

	public static void main(String[] args) {
		
		AAA a = new AAA();
		
		try {
			a.ckeckScore(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========================");
		
		try {
			a.ckeckScore(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========================");
		try {
			a.ckeckScore(50);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}



	}

}
