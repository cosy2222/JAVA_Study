package chap11.Ex04;

// �߻� Ŭ������ ������� �ʴ� ��� :
	//�ڽ�Ŭ�������� �޼ҵ� �������̵��� �������̵��� ��Ÿ�� ���� �� �� ���� �� �� �ִ�

class Animal {
	void cry () {}    // ������ cry() �������ְ� ������ �������� ����.
}

class Cat extends Animal{
	void cRy() {						// �������̵��� �ƴ� �ڽ�Ŭ�������� ���ο� �޼ҵ� 
		System.out.println("����");
	}
}

class Dog extends Animal{
	void Cry() {						// �������̵��� �ƴ� �ڽ�Ŭ�������� ���ο� �޼ҵ�
		System.out.println("����");
	}
}

public class AbstractModifier_2 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		Animal c = new Cat();
		Animal d = new Dog();
		
		//2. �޼ҵ�ȣ��
		c.cry();
		d.cry();

	}

}
