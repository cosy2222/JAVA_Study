package chap10.Ex06;
// super 키워드 : 부모클래스를 지칭 , 메소드 내부 에서 사용  , 생성자 내부에서 사용
// super ()  :   생성자 내부에서만 사용.  부모생성자를 호출할떄 사용
				// 반드시 첫라인에 위치

// this 키워드 : 자신의 객체를 지칭 ,   메소드 내부에서 사용 , 생성자 내부에서 사용
// this ()   :   생성자 내부에서만 사용.  자신의 클래스의 다른 생성자를 호출 
				// 반드시 첫라인에 위치


class Aaa {
	Aaa(){
		System.out.println("Aaa 생성자");
	}
	
}

class Bbb extends Aaa{
	Bbb(){
		//super();
		System.out.println("Bbb생성자");
	}
}


class Ccc{
	Ccc(){}
	Ccc(int a){
		System.out.println("Ccc생성자 " + a);
	}
}

class Ddd extends Ccc{
	Ddd(){
		super();
	}
	Ddd(int a){
		super(3);
		System.out.println("Ddd 매개변수가 정수 1개인 생성자 " + a);
	}
}


public class SuperMethod_1 {

	public static void main(String[] args) {
		// 1. 객체 생성
		Aaa a = new Aaa();
		System.out.println("========================");
		
		Bbb bbb = new Bbb();
		System.out.println("======================");
		
		Ddd dd = new Ddd();    // 값이 없음
		
		Ddd ddd = new Ddd(5);
		System.out.println("======================");
		
		
		
		
		
		
	}

}
