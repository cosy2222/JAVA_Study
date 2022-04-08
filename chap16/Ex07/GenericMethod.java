package chap16.Ex07;

// 제너릭 클래스 : 클래스를 선언 할떄 타입변수를 선언  <T>  <<정의>> , 객체를 생성시 T에 적용할 타입을 지정

// 제너릭 메소드 : 일반클래스 내부에 메소드 선언시 제너릭 타입변수를 사용.

class GenericMethod1{   // 일반클래스
	
	public <T> T method1 (T t) {   // 제너릭 메소드 : 1개 
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) { 
		return t1.equals(t2);		// 두값을 비교 true , flase 리턴
									// 기본 자료형일떄는 값을 비교,   참조자료형일떄는 객체의 주소를 비교
									// String 일 경우 , 값을 비교 
	}
	
	public <K , V> void method3(K k , V v) {  // 제너릭 메소드 : 2개
		System.out.println(k + " : " + v);
	}
	
	
	
}




public class GenericMethod {

	public static void main(String[] args) {
		
		//1. 일반 클래스 객체 생성후 제너릭메소드 호출 
		GenericMethod1 gm = new GenericMethod1();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");     // 타입을 알수 있는 경우 생략 가능 (매개변수로 값이 들어갈떄 생략가능)
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("=======================");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.<Integer>method1(200);
		System.out.println(i);
		System.out.println(i2);
		
		System.out.println("======================");
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("====================");
		
		Boolean d1 = gm.<Double>method2(0.0 , 0.0);   //리턴받을 타입이 Boolean
		Boolean d2 = gm.<Double>method2(0.0 , 0.1);   //리턴받을 타입이 Boolean
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("=====================");
		
		gm.<String, Integer>method3("gg" , 12);
		gm.method3("dd", 55);				// 매개변수로 인풋 되는 데이터 타입을 추정할 수 있는 경우 생략 가능
		
		gm.<Integer , String> method3 (500, "서버 에러 입니다");
		gm.method3(404, "파일을 찾을 수 없습니다");
		
		System.out.println("===============================");
		
		
		

	}

}
