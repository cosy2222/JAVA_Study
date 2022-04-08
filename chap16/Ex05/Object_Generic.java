package chap16.Ex05;



class Apple {
	String name;
	int price; 
	
	Apple(String name , int price){
		this.name = name;
		this.price = price;
	}
	
	public void abc() {
		System.out.println("abc() �޼ҵ� ȣ��");
	}
	
	@Override
	public String toString() {		// ��ü��ü�� ��½� ��ü�� �ּ� ��� ����ϴ� �� 
		return "�̸� : " + name + ", ���� : " + price ;
	}
}

class Pancil{
	String name ;
	int price ;
	
	Pancil(String name , int price){	// �����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.name = name ;
		this.price = price ;
	}
	
	public void bcd() {
		System.out.println("bcd() �޼ҵ� ���");
	}
	
	@Override
	public String toString() {		// ��ü��ü�� ��½� ��ü�� �ּ� ��� ����ϴ� �� 
		return "�̸� : " + name + ", ���� : " + price ;
	}
}

//���ʸ��� ����ؼ� ��ü�� ������ �� �о����

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
		
		Goods<Apple> g1 = new Goods<Apple>();	// g1�� Apple ������ Ÿ���̴�
		g1.setT(new Apple("���" , 1000));
		System.out.println(g1.getT());  // ���׸������� �ٿ�ĳ������ �� �ʿ䰡 ���� 
		g1.getT().abc(); 	// �ٿ�ĳ���� ���� Apple��ü�� abc�޼ҵ� ȣ�� 
		
		Goods<Pancil> g2 = new Goods();
		g2.setT(new Pancil("����", 2000));
		System.out.println(g2.getT());
		g2.getT().bcd();
		
		

	}

}
