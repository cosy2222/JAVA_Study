package chap16.Ex01;

// Generic 사용전 문제점 - 상품을 저장할 클래스를 매번 만들어 줘야 한다 
// 객체를 담을 클래스를 만들 경우 , 매번 객체를 생성할떄마다 그객체를 담을 클래스를 만들어 줘야 한다 . 
// 객체를 저장할 클래스를 생성해서 객체 정보를 담을 수 있다 .<== 새로운 상품이 추가 될떄 마다
//												 그 상품을 담을 클래스를 생성해 줘야 한다 
//  코드가 굉장히 복잡 해진다 

class Apple {
	String name;
	int price; 
	
	Apple(String name , int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		// 객체자체를 출력시 객체의 주소 대신 출력하는 값 
		return "이름 : " + name + ", 가격 : " + price ;
	}
}

class Pancil{
	String name ;
	int price ;
	
	Pancil(String name , int price){	// 생성자를 통해서 필드의 값 할당
		this.name = name ;
		this.price = price ;
	}
	
	@Override
	public String toString() {		// 객체자체를 출력시 객체의 주소 대신 출력하는 값 
		return "이름 : " + name + ", 가격 : " + price ;
	}
}

//1. Apple 을 담을 수 있는 클래스 생성
class Goods1{  // 상품에 사과를 담은 클래스
	private Apple apple = new Apple("사과" , 1000);

	public Apple getApple() {  // getter : 객체 필드의 정보를 출력하는 메소드 
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

//2. Pancil을 담을 수 있는 클래스 생성
class Goods2{  
	private Pancil pancil = new Pancil("연필" , 2000);

	public Pancil getPancil() {
		return pancil;
	}

	public void setPancil(Pancil pancil) {
		this.pancil = pancil;
	}
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1에 상품이 저장되어 있다 .  Apple 객체 추가 및 가져오기
		Goods1 g1 = new Goods1();
		g1.setApple(new Apple("사과2" , 2000));
		System.out.println(g1.getApple());
		
		//2. Goods2
		Goods2 g2 = new Goods2();
		g2.setPancil(new Pancil("연필2" , 3000));
		System.out.println(g2.getPancil());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
