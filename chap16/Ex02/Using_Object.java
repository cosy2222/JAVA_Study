package chap16.Ex02;


// Object�� ��� ��ü�� ���� �� �� �ִ�
// ��ǰ�� �����ϴ� Ŭ������ Objecet Ÿ������ �����ϸ� ��� ��ü�� ���� �� �ִ�
// Object �� ���� : ��� ��ü�� ���� �� �ִ� (casting)
//			���� : �Ź� �ٿ�ĳ������ �ؼ� ����ؾ� �Ѵ� 
//				  ����Ÿ�� üũ: ����� ClassCastException �� �߻��� �� �ִ�. 

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
	
	@Override
	public String toString() {		// ��ü��ü�� ��½� ��ü�� �ּ� ��� ����ϴ� �� 
		return "�̸� : " + name + ", ���� : " + price ;
	}
}

// Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�  
class Goods{  

	private Object object = new Object();	//Object : ��� Ŭ������ Object Ÿ������ ��ȯ����

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {  // ObjectŸ������ ��ĳ���õ�.
		this.object = object;
	}
	
	
}


public class Using_Object {

	public static void main(String[] args) {
		
		//1. Apple�� ������ ���
		Goods g1 = new Goods();
		g1.setObject(new Apple("���3" , 4000));  // Setter�� ���� �Ҵ� 
		System.out.println(g1.getObject());		// Getter�� ��ü�� ��� : Object => Apple
		
		//2. Pancil�� ������ ���
		Goods g2 = new Goods();
		g2.setObject(new Pancil("����3" , 5000));
		System.out.println(g2.getObject());
		
		//3. �߸��� ĳ������ �� �� �ִ� (���� Ÿ�� üũ): Object�� ������.
		Goods g3 = new Goods();
		g3.setObject(new Apple("���4" , 6000));
		System.out.println((Pancil)g3.getObject());		//���� Ÿ�� üũ : ����� ����
		
		
		
		
	}

}
