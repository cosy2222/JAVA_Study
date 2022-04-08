package chap13.Ex08;

//  메소드의 매개 변수로 전단
//    1 : 객체 생성후 매개변수로 전달  (클래스명 o , + 참조변수 o )
//    2 : 객채 생성무 매개변수로 전달  (클래스명 o  +  참조변수 x )


interface Aa{
	void cry();
	void fly();
}


class Bb implements Aa{

	@Override
	public void cry() {
		System.out.println("멍멍 : 매개변수 전달");
	}

	@Override
	public void fly() {
		System.out.println("날지못합니다 : 매개변수 전달");
	}
}

class Cc{    // Cc 객체의 abc메소드 호출시 Aa타입을 매개변수로 받는다
	void abc(Aa a) {	// 하위 자식 클래스가 매개변수로 들어올 경우 Aa 타입으로 자동으로 업캐스팅 된다
		a.cry();
		a.fly();
	}
}


public class AnnoymousClass_3_1 {

	public static void main(String[] args) {
		// 1  (클래스명 o , + 참조변수 o )
		Cc c = new Cc();
		Aa a = new Bb();
		
		c.abc(a);
		
		
		// 2  (클래스명 o , + 참조변수 x )
		
		c.abc(new Bb());

	}

}
