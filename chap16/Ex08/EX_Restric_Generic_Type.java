package chap16.Ex08;

//���ʸ� Ŭ������ ���� �ؼ� , PancilŸ���� ������ �� ������ ���� 

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
		return "�̸� : " + name + ", ���� : " + price ;
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
		return "�̸� : " + name + ", ���� : " + price ;
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
		return "�̸� : " + name + ", ���� : " + price ;
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
		return "�̸� : " + name + ", ���� : " + price ;
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
		
	// ��ü ����
	F <Apple> e1 = new F <Apple>();
	F <Strawberry> e2 = new F <Strawberry>();
	F <Banana> e3 = new F <Banana>();
//	F <Pancil> e4 = new F <Pancil>();
	
	e1.setT(new Apple("���" , 1000));
	e2.setT(new Strawberry("����", 2000));
	e3.setT(new Banana("�ٳ���",3000));
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	


	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
