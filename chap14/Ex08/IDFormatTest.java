package chap14.Ex08;

//Id값이 NULL일 경우 Exception 발생
// userID : 8자 이상 20자 이하 가 아닌 경우 Exception

class IDFormatException extends Exception{   //2개의 생성자만 구성
	public IDFormatException() {
		super();
	}
	
	public IDFormatException(String message) {	// 예외 발생시 예외 메세지 출력
		super(message);
	}
}

public class IDFormatTest{
	private String userID ;			// 체크 : null, 8자이상 20자이하가 아닌경우 Exception
		// userID 캡슐화 됨  private : 외부타 다른 클래스에서 접근 차단
			// 생성자 , setter를 사용해서 값을 할당
		// private 로 설정된 경우 : getter , setter를 사용
	
	public String getUserID () {	// 메소드 호출시 메모리의 userID를 던져줌
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null일수 없습니다");
		}else if (userID.length() <8 || userID.length() >20 ) {
			throw new IDFormatException("아이디는 8자이상 20자 이하로 사용 가능합니다");
		}
		this.userID = userID;
		System.out.println("정상적으로 입력 되었습니다");
	}


	public static void main(String[] args) {
		
		IDFormatTest a = new IDFormatTest();
		
		// 1. userID 가 null 일 경우
		String userID = null ;
		
		try {
			a.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}		
		System.out.println("======================");
		
		
		//2. userID가 7자 넣은경우
		userID = "qwerqwe";
		try {
			a.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=====================");
		
		//3. null이 아니고 8자 이상 20자 미만 : 정상
		userID = "abcdef1234";
		try {
			a.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a.getUserID());

	}

}
