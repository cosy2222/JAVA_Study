package chap14.Ex05;

// 직접 생성한 객체에서 AutoClose를 사용해보기 
	// try ( 객체생성구문 ) {} catch {} : 자동으로 close() 됨  // try(with resource) 
	// 1.Autocloseable 인터페이스의 close()를 오버라이딩 해야됨 

	// Java.lang.AutoCloseable : java.lang <=== import문을 사용하지 않아도 된다.
	// Java.lang.Object

	// 예외를 처리하는방법 
	//  1. try catch 를 사용해서 예외처리      : 자신이 직접 예외를 처리 하겠다
	//  2. throws 를 통해서 예외를 처리 		 : 예외를 자신이 처리하지 않고 호출하는곳에서 예외를 처리 하도록 미룬다
			// 예외 전가 .   메소드 예외 전가
		   // throw   : 예외를 강제로 발생시키다.


class A implements AutoCloseable{
	String resource ;		// resource = null 
	A ( String resource){	// 생성자의 매개변수로  String 값을 받아서 메모리로 로딩
		this.resource = resource;
	}
	@Override
	public void close() throws Exception {	// close() 가 자동으로 호출된다.
		System.out.println(resource);
		
		if (resource != null) {
			resource = null;
			System.out.println("resource가 해제되었습니다");
			System.out.println(resource);
		}
	}
}



public class TryWithResource_2 {

	public static void main(String[] args) {
		
		// 1. 자동 리소스 해제 사용 
		try( A a1 = new A ("특정 파일");){
			
		}catch(Exception e) {
			System.out.println("예외가 발생되었습니다.");
		}		// finally 블락에 a1.close() 를 호출하지 않더라도 자동으로 close() 호출 
		
		System.out.println("=========================");
		
		//2. 수동 리소스 해제 사용
		A a2 = null;
		
		try {
			a2 = new A("생성자 초기값 할당");
		}catch(Exception a){
			
		}finally {
			if (a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
