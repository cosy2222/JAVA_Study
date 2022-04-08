package chap16.Ex01;

// Generic ����� ������ - ��ǰ�� ������ Ŭ������ �Ź� ����� ��� �Ѵ� 
// ��ü�� ���� Ŭ������ ���� ��� , �Ź� ��ü�� �����ҋ����� �װ�ü�� ���� Ŭ������ ����� ��� �Ѵ� . 
// ��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ� .<== ���ο� ��ǰ�� �߰� �ɋ� ����
//												 �� ��ǰ�� ���� Ŭ������ ������ ��� �Ѵ� 
//  �ڵ尡 ������ ���� ������ 

class Apple {
	String name;
	int price; 
	
	Apple(String name , int price){
		this.name = name;
		this.price = price;
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

//1. Apple �� ���� �� �ִ� Ŭ���� ����
class Goods1{  // ��ǰ�� ����� ���� Ŭ����
	private Apple apple = new Apple("���" , 1000);

	public Apple getApple() {  // getter : ��ü �ʵ��� ������ ����ϴ� �޼ҵ� 
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}

//2. Pancil�� ���� �� �ִ� Ŭ���� ����
class Goods2{  
	private Pancil pancil = new Pancil("����" , 2000);

	public Pancil getPancil() {
		return pancil;
	}

	public void setPancil(Pancil pancil) {
		this.pancil = pancil;
	}
}

public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1�� ��ǰ�� ����Ǿ� �ִ� .  Apple ��ü �߰� �� ��������
		Goods1 g1 = new Goods1();
		g1.setApple(new Apple("���2" , 2000));
		System.out.println(g1.getApple());
		
		//2. Goods2
		Goods2 g2 = new Goods2();
		g2.setPancil(new Pancil("����2" , 3000));
		System.out.println(g2.getPancil());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
