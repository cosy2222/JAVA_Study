package chap16.Ex08;

//제너릭 클래스를 생성 해서 , Pancil타입은 접근할 수 없도록 설정 

abstract class Fluit{
	public abstract void print();
}

class Apple extends E{
	String name;
	int price;
	Apple (String name , int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price ;
	} 
}

class Strawberry extends E{
	String name;
	int price;
	Strawberry (String name , int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price ;
	} 
}

class Banana extends E{
	String name;
	int price;
	Banana (String name , int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price ;
	} 
}

class Pancil{
	String name;
	int price;
	Pancil (String name , int price){
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price ;
	} 
}

class E{
	
}

class F <T extends E >{
	private T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return t.toString();
	}
}


public class EX_Restric_Generic_Type {

	public static void main(String[] args) {
		
	// 객체 생성
	F <Apple> e1 = new F <Apple>();
	F <Strawberry> e2 = new F <Strawberry>();
	F <Banana> e3 = new F <Banana>();
//	F <Pancil> e4 = new F <Pancil>();
	
	e1.setT(new Apple("사과" , 1000));
	e2.setT(new Strawberry("딸기", 2000));
	e3.setT(new Banana("바나나",3000));
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	


	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
