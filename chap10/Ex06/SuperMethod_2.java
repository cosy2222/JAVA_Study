package chap10.Ex06;

// this() 와 super() 의 혼용      < == 생성자 호출할떄 씀 , 생성자 내부에서 사용, 첫라인에 와야됨 
	// this() : 자신의 클래스의 생성자 호출
	// super() : 부모 객체의 생성자 호출 

class Q {
	Q(){
		this(3);
		System.out.println("Q 생성자 1");
	}
	Q(int a){
		System.out.println("Q 생성자 2");
	}
}

class W extends Q {
	W(){
		this(3);
		System.out.println("W 생성자 1");
	}
	W(int a){
		System.out.println("W 생성자 2");
	}
	
	
}




public class SuperMethod_2 {

	public static void main(String[] args) {
		// 1. 객체 생성
		Q q = new Q();
		System.out.println("=====================");
		
		Q q2 = new Q(3);
		System.out.println("====================");
		
		
		
		// 2. 자식의 객체 생성
		W w = new W();
		System.out.println("=====================");
		
		W w2 = new W(5);
		
		
		

	}

}









