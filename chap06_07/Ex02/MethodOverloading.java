package chap06_07.Ex02;

class B{
	static String name = "BTS";     // static 키가 할당이 되면 객체 생성없이 호출 
	
	static void print () {
		System.out.println(name);
		System.out.println("static이 붙은 메소드 입니다 ");
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		//메소드 오버로딩 : 하나의 메소드명에 매개변수타입,  갯수에 따라서 각각 다른 메소드가 호출됨 (Java)
		//메소드 오버라이딩 : 상속에서 부모 클래스의 메소드를 재정의 해서 사용
		
		//static : 객체 생성 없이 바로 호출해서 사용가능하도록 할 수 있는 키워드 
			//객체이름이 아니라 클래스 이름으로 호출해서 사용가능
		
		System.out.println(B.name);  // 객체이름이 아닌 클래스 이름으로 호출 
		B.print();
		System.out.println("======================");
		
		print1();       //static이 들어가 있고 동일한 클래스에 생선된 메소드는 바로 호출 가능 
		print1(5);		// 매개변수가 1개이고 정수타입의 메소드를 호출
		print1(4.3);    // 매개변수가 1개이고 double타입의 메소드를 호출
		print1(4 , 5);  // 매개변수가 2개이고 정수타입의 메소드를 호출 
		
		
		
		

	}

	// 메소드 오버라이딩 : 메소드 이름은 동일 , 매게변수타입, 매게변수 갯수에 따라 해당 메소드를 호출
		// JVM이 동일한 메소드 이름의 데이터타입이나 갯수에 따라서 해당 메소드를 작동
	
		// 주의 : 동일한 매개변수타입과 갯수가 같으면 오류발생
	
	public static void print1() {        // 메소드 아름 앞에 static : 
		System.out.println("데이터가 없습니다");
	}
	
	public static void print1(int a) {
		System.out.println("정수 : " + a);
	}
	
	public static void print1(double a) {
		System.out.println("double : " + a);
	}
	
//  오류발생 : 데이터 타입 , 갯수가 동일한 메소드가 존재 	
//	public static void print1(double k ) {     //매개변수가 1개 , 데이터 타입이 double 
//		System.out.println(k);
//	}

	public static void print1(int a , int b) {
		System.out.println("a : " + a +" , "+ " b : " + b);
	}
	
	public static void print1(int c , double d) {
		System.out.println( c + d );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
