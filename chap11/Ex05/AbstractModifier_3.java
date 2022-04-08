package chap11.Ex05;

// �߻� Ŭ������ ����ؼ� ��� ���� �ϴ� ���
abstract class Animal{
	abstract void cry() ;              // �߻� �޼ҵ� : ���� �Ǿ��ְ� �����ΰ� ���� �޼ҵ�
}


class Cat extends Animal{

	@Override
	void cry() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal{

	@Override
	void cry() {
		System.out.println("��");
	}
	
}





public class AbstractModifier_3 {

	public static void main(String[] args) {
		
		Animal c = new Cat();     // �߻� Ŭ������ Ÿ�����δ� ���� �� �� �ִ�.
		Animal d = new Dog();
		
		c.cry();
		d.cry();
		
		//�߻�Ŭ������ ��üȭ �� �� ����
	//	Animal a = new Animal();
		
	}

}
