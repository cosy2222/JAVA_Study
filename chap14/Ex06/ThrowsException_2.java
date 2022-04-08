package chap14.Ex06;

// 일반 예외 (checked Exception) : 컴파일 단계에서 예외
		// 1. 직접처리
		// 2. throws 전가 (미룬다)

		// main메소드에 throws를 전가 시키는 경우 ,


public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// 정상적으로 파일이 존재 합니다. ClassNotFoundException 이 발생되지 않는다
		Class cls = Class.forName("java.lang.Object");
		
		// 정상적으로 파일이 존재하지 않는다 ClassNotFoundException 이 발생된다
		Class cls2 = Class.forName("java.lang.Object00");
		

	}

}
