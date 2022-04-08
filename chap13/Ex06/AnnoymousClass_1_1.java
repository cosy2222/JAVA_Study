package chap13.Ex06;

interface Aa{
	void cry();
	void fly();
}


class Bb  {
	
	Aa a = new C() ;
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class C implements Aa{

		@Override
		public void cry() {
			System.out.println("¸Û¸Û");
		}

		@Override
		public void fly() {
			System.out.println("³¯Áö¸øÇÑ´Ù");
		}
		
	}
	
}



public class AnnoymousClass_1_1 {

	public static void main(String[] args) {
		
		Bb b = new Bb();
		b.abc();

	}

}
