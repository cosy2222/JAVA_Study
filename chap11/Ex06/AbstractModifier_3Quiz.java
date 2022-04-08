package chap11.Ex06;

abstract class Animal{
	String name ;
	int age ;
	
	abstract void cry();
	abstract void run();
	
	public String toString() {
		return "�̸� : " + name + " ���� : " + age;
	}
}

class Cat extends Animal{
	
	Cat(String a , int b){
		name = a;
		age = b;
	}

	@Override
	void cry() {
		System.out.println("�߿�");
	}

	@Override
	void run() {
		System.out.println("�پ�ٴѴ�");
	}

}

class Tiger extends Animal{
	
	Tiger(String a , int b){
		name = a;
		age = b;
	}

	@Override
	void cry() {
		System.out.println("����");
	}

	@Override
	void run() {
		System.out.println("������ �پ�ٴѴ�");
	}
}

class Eagle extends Animal{
	
	Eagle(String a , int b){
		name = a;
		age = b;
	}

	@Override
	void cry() {
		System.out.println("�𸣰ڴ�");
	}

	@Override
	void run() {
		System.out.println("���ƴٴѴ�");
	}
	
	
}



public class AbstractModifier_3Quiz {

	public static void main(String[] args) {
		Animal a1 = new Cat("�����" , 10);
		Animal a2 = new Tiger("ȣ����" , 5);
		Animal a3 = new Eagle("������" , 15);
		
		
		//1. Animal �迭 ��ü�� ����
		Animal [] arr = { a1 , a2 , a3 };
		
		
		//2. for���� ����ؼ� ��ü�� ��½� �̸��� ���� ,  .cry() ,  .run()  ���
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
			arr[i].cry();
			arr[i].run();
			System.out.println("==========================");
		}
		
		
		//3. ���� for������ ���
		
		for(Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("=========================");
		}
		
		

	}

}
