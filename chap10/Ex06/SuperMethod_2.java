package chap10.Ex06;

// this() �� super() �� ȥ��      < == ������ ȣ���ҋ� �� , ������ ���ο��� ���, ù���ο� �;ߵ� 
	// this() : �ڽ��� Ŭ������ ������ ȣ��
	// super() : �θ� ��ü�� ������ ȣ�� 

class Q {
	Q(){
		this(3);
		System.out.println("Q ������ 1");
	}
	Q(int a){
		System.out.println("Q ������ 2");
	}
}

class W extends Q {
	W(){
		this(3);
		System.out.println("W ������ 1");
	}
	W(int a){
		System.out.println("W ������ 2");
	}
	
	
}




public class SuperMethod_2 {

	public static void main(String[] args) {
		// 1. ��ü ����
		Q q = new Q();
		System.out.println("=====================");
		
		Q q2 = new Q(3);
		System.out.println("====================");
		
		
		
		// 2. �ڽ��� ��ü ����
		W w = new W();
		System.out.println("=====================");
		
		W w2 = new W(5);
		
		
		

	}

}









