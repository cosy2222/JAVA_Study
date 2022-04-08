package chap16.Ex05;



class Apple {
	String name;
	int price; 
	
	Apple(String name , int price){
		this.name = name;
		this.price = price;
	}
	
	public void abc() {
		System.out.println("abc() 메소드 호출");
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
	
	public void bcd() {
		System.out.println("bcd() 메소드 출력");
	}
	
	@Override
	public String toString() {		// 객체자체를 출력시 객체의 주소 대신 출력하는 값 
		return "이름 : " + name + ", 가격 : " + price ;
	}
}

//제너릭을 사용해서 객체를 저장후 값 읽어오기

class Goods<T>{
	private T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class Object_Generic {

	public static void main(String[] args) {
		
		Goods<Apple> g1 = new Goods<Apple>();	// g1은 Apple 데이터 타입이다
		g1.setT(new Apple("사과" , 1000));
		System.out.println(g1.getT());  // 제네릭에서는 다운캐스팅을 할 필요가 없다 
		g1.getT().abc(); 	// 다운캐스팅 없이 Apple객체의 abc메소드 호출 
		
		Goods<Pancil> g2 = new Goods();
		g2.setT(new Pancil("연필", 2000));
		System.out.println(g2.getT());
		g2.getT().bcd();
		
		

	}

}
