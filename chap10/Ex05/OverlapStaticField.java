package chap10.Ex05;

class Aaa {             // static 필드는 오버라이딩 안됨 
	static int m = 3;
	

}

class Bbb extends Aaa {
	static int m = 4;
	
}




public class OverlapStaticField {

	public static void main(String[] args) {
		// 1. 객체 생성 없이 호출 ( 클래스 명으로 호출 )  <===  static 권장사항 
		System.out.println(Aaa.m);
		System.out.println(Bbb.m);
		System.out.println("====================");
		
		
		// 2. 객체 생성후 호출
		Aaa a = new Aaa();
		Bbb b = new Bbb();
		System.out.println(a.m);
		System.out.println(b.m);
		System.out.println("===========================");
		
		Aaa ab = new Bbb();
		System.out.println(ab.m);
		
		

	}

}
