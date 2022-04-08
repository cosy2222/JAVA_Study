package chap13.Ex010.Ex2;

class Abc{			// 1. 객체 생성후 필드에 직접 값을 할당
					// 2. 생성자를 통해서 값 할당
					// 3. setter를 통해서 값을 할당
	
	Def d;
	
	Abc () {};
	
	Abc (Def d){
		this.d = d;
	}
	
	
	
	public void setDef(Def d) {
		this.d = d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
	
	
}



public class InnerInterface_1_2 {

	public static void main(String[] args) {
		
		// 1. 객체 생성후 필드에 직접 값을 할당 (d1)
		Abc d1 = new Abc();
		
		d1.d = (Abc.Def) new Abc.Def() {

			@Override
			public void run() {
				System.out.println("뛰어다닙니다1");
			}

			@Override
			public void fly() {
				System.out.println("날아다닙니다1");
			}
		};
		d1.ghi();
		System.out.println("====================");
		
		//2 생성자를 통해서 값 할당
		
		Abc d2 = new Abc(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("뛰어다닙니다2");
			}
			
			@Override
			public void fly() {
				System.out.println("날아다닙니다2");
			}
		});
		d2.ghi();
		
		System.out.println("======================");
		//3. setter를 통해서 값을 할당
		
		Abc d3 = new Abc();
		
		d3.setDef(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("뛰어다닙니다3");
			}
			
			@Override
			public void fly() {
				System.out.println("날아다닙니다3");
			}
		});
		d3.ghi();		
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
