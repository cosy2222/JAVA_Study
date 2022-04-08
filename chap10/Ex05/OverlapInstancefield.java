package chap10.Ex05;

class Aa {
	int m = 3;    // 인스턴스 필드
	void print() {
		System.out.println("class Aa");
	}
}

class Bb extends Aa{
	int m = 4;	  // 인스턴스 필드
	@Override
	void print() {
		System.out.println("class Bb");
	}
}

class Cc extends Aa{
	int m = 5;	  // 인스턴스 필드
	@Override
	void print() {
		System.out.println("class Cc");
	}
}


public class OverlapInstancefield {

	public static void main(String[] args) {
		//1. 객체 생성
		Aa aa = new Aa();
		Bb bb = new Bb();
		Cc cc = new Cc();
		
		Aa ab = new Bb();
		Aa ac = new Cc();
		
		//2. 인스턴스 필드 출력  : 인스턴스 필드는 오버라이딩 안됨
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(cc.m);
		System.out.println("====================");
		
		System.out.println(ab.m);
		ab.print();
		System.out.println(ac.m);
		ac.print();
		
		

	}

}
