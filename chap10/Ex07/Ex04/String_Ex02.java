package chap10.Ex07.Ex04;

class Aa{
	String name;
	Aa(String name){
		this.name = name;
	}
}

class Bb{
	String name;
	Bb(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {   // 패키지명.클래스명@해쉬코드 ==> name 필드의 값을 리턴
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb)obj).name ) {
			return true;
		}
		else {
			return false;
		}
	}
}



public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String("안녕");
		String s2 = "안녕";
		
		System.out.println(s1);    // String클래스는 toString()가 재정의 되어있다.
		System.out.println(s1.equals(s2));   // String 클래스는 equals()가 재정의 되어있다
		
		Aa a = new Aa("안녕");
		Aa a1 = new Aa("안녕");
		System.out.println(a);
		System.out.println(a.equals(a1));    // 주소를 비교하기 떄문에 false
		System.out.println("=========================");
		
		Bb bb1 = new Bb("안녕");
		Bb bb2 = new Bb("안녕");
		System.out.println(bb1);
		System.out.println(bb1.equals(bb2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
