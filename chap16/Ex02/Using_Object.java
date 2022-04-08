package chap16.Ex02;


// Object는 모든 객체를 저장 할 수 있다
// 상품을 저장하는 클래스에 Objecet 타입으로 저장하면 모든 객체를 담을 수 있다
// Object 의 장점 : 모든 객체를 담을 수 있다 (casting)
//			단점 : 매번 다운캐스팅을 해서 출력해야 한다 
//				  약한타입 체크: 실행시 ClassCastException 이 발생될 수 있다. 

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
	
	@Override
	public String toString() {		// 객체자체를 출력시 객체의 주소 대신 출력하는 값 
		return "이름 : " + name + ", 가격 : " + price ;
	}
}

// Object를 사용해서 모든 상품을 저장할 수 있다  
class Goods{  

	private Object object = new Object();	//Object : 모든 클래스는 Object 타입으로 변환가능

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {  // Object타입으로 업캐스팅됨.
		this.object = object;
	}
	
	
}


public class Using_Object {

	public static void main(String[] args) {
		
		//1. Apple을 저장후 출력
		Goods g1 = new Goods();
		g1.setObject(new Apple("사과3" , 4000));  // Setter로 값을 할당 
		System.out.println(g1.getObject());		// Getter로 객체를 출력 : Object => Apple
		
		//2. Pancil을 저장후 출력
		Goods g2 = new Goods();
		g2.setObject(new Pancil("연필3" , 5000));
		System.out.println(g2.getObject());
		
		//3. 잘못된 캐스팅을 할 수 있다 (약한 타입 체크): Object의 문제점.
		Goods g3 = new Goods();
		g3.setObject(new Apple("사과4" , 6000));
		System.out.println((Pancil)g3.getObject());		//약한 타입 체크 : 실행시 오류
		
		
		
		
	}

}
