package chap10.Ex06;

class Aa{
	int m ; 
	
	void abc() {
		System.out.println("class Aa �� abc()");
	}
}

class Bb extends Aa{
	void abc() {
		System.out.println("BbŬ������ abc");
	}
	void bcd() {
		super.m = 300;
		System.out.println(m);
		super.abc();    
	}
}

public class Superkeyword {

	public static void main(String[] args) {
		Bb b = new Bb();
		b.abc();
		System.out.println("============================");
		b.bcd();
	}

}
