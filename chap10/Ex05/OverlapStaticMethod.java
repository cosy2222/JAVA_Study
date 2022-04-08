package chap10.Ex05;

class Aaaa{               // Static 메소드 : 오버라이딩 되지 않는다.
	static void print () {
		System.out.println("Aaaa 클래스");
	}
}

class Bbbb extends Aaaa{
	static void print() {
		System.out.println("Bbbb 클래스");
	}
}


public class OverlapStaticMethod {

	public static void main(String[] args) {
		Aaaa.print();
		Bbbb.print();
		
		Aaaa a = new Bbbb();
		a.print();
		

	}

}
