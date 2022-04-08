package chap14.Ex09;

class MyAllException extends Exception {   // 일반예외 (checked Exception) - 구문 오류  (예외처리가 반드시 필요함)
	public MyAllException() {
		super();
	}
	public MyAllException(String a) {      // 예외 메세지 , e.getMessage()
		super(a);
	}
}




class A{
	// private : 캡슐화, 객체생성후 바로 접근하지 못하도록 설정
		// 생성자, setter <== 제어후 필드의 값을 할당
	private String season ;    // 봄,여름,가을,겨울  (예외발생 : 봄,여름,가을,겨울만 입력하세요
	private String week ; 	   // 월,화,수,목,금,토,일  ( 예외 발생 : 월,화,수,목,금,토,일 만 입력하세요)
	private int scoreKor;	   // 0~100값만 입력  (예외발생 : 0 ~ 100 까지 정수만 입력 하세요)
	private int scoreEng;      // 0~100값만 입력  (예외발생 : 0 ~ 100 까지 정수만 입력 하세요)
	private String userID;     // 12자이상 20자 사이의 문자 (예외 발생 : 12자이상 20자 사이의 문자만 넣으세요)
	
	// 하나의 메소드로 처리 
	void studentInfo(String a , String b , int c , int d , String e) throws MyAllException {
		if (a != "봄" && a != "여름" && a != "가을" && a != "겨울") {
			throw new MyAllException("봄 여름 가을 겨울만 입력해주세요");
		}else if(b != "월" && b != "화" && b != "수" && b != "목" && b != "금" && b != "토" && b != "일") {
			throw new MyAllException("월,화,수,목,금,토,일 만 입력해주세요");
		}else if(c <0 || c >100) {
			throw new MyAllException("예외발생 : 0 ~ 100 까지 정수만 입력 하세요");
		}else if(d <0 || d >100) {
			throw new MyAllException("예외발생 : 0 ~ 100 까지 정수만 입력 하세요");
		}else if(e.length() < 12  || e.length() > 20 ) {
			throw new MyAllException("예외발생 : 12자이상 20자 이하 문자만 입력 하세요");
		}else{
			System.out.println("값이 모두 정상적으로 입력되었습니다");
			season = a;
			week = b;
			scoreKor = c;
			scoreEng = d;
			userID = e;
		}
		System.out.printf(season + " " +week + " " + scoreKor + " " + scoreEng + "\n" + userID); 
	}
}




public class UserException_EX {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.studentInfo("봄", "월", 50, 60, "abcdabcd12345");
		} catch (MyAllException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("==================");
		
		try {
			a.studentInfo("d", "월", 50, 60, "abcdabcd12345");
		} catch (MyAllException e) {
			System.out.println(e.getMessage());
		}

	}

}
