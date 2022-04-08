package chap10.Ex07.Ex04;

class A{
	String a ;
	
	A(String a){
		this.a = a;
	}
	
	@Override
	public String toString() {
		return this.a;
	}
}

public class String_Ex {

	public static void main(String[] args) {
		
		String s0 = new String("안녕");
		
		String s1 = "안녕";     // String 은 참조변수
		
		System.out.println(s0);  // String은 객체를 출력 할떄 toString()가 재정의 되어있다.
		System.out.println(s1);
		
		A a = new A("안녕");
		System.out.println(a);

	}

}
