package chap10.Ex01;

class Dog_sub extends Dog {
	int dog_sub;
	
	void dog_sub() {
		System.out.println("Dog �� �ڽ� Ŭ���� �Դϴ�");
	}
}

class Tiger extends Animal {
	int leg;
	
	void tigereat() {
		System.out.println("ȣ���̴� �ٸ� ������ ��� �Խ��ϴ�");
	}
}

class Dog extends Animal {
	int dog;
	
	void dogeat() {
		System.out.println("���� ��ļ� �̴� ");
	}
}

class Eagle extends Animal {
	int eagle ; 
	void eagleFly() {
		System.out.println("�������� ���� �ִ� ");
	}
}


public class Animal {
	String name ; 
	int age;
	String color;
	
	void eat() {
		System.out.println("��� ������ ������ �Խ��ϴ�");
	}
	void sleep() {
		System.out.println("��� ������ ���� ��ϴ�");
	}

	public static void main(String[] args) {
		
		// ��ĳ������ ���������� ó���ϱ� ������ ȿ�������� ���α׷��� ó�� 
			// ������ : �������̵��� �̿��ؼ� ��ӿ��� �ϳ��� �޼ҵ�� ���� ������ ó�� 

		// 1. Animal Ŭ���� ��üȭ
		Animal a1 = new Animal ();  // �ڽ��� �ʵ�� �޼ҵ常 ����
		
		
		// 2. Dog Ŭ������ Dog Ÿ������ ��üȭ
		Dog d1 = new Dog();        // Animal , Dog�� �ʵ�� �޼ҵ� ����
		
		// 3. Dog �� Animal Ÿ������ ��ĳ����
		Animal a2 = new Dog();       // Dog �� Animal , Dog �� �����ϰ� �ְ� , Animal �� �ʵ�� �޼ҵ常 ���� 
		
		// 4. Dog_sub�� Animla Ÿ������ ��ĳ����
		Animal a3 = new Dog_sub();    // Dog_sub �� Animal, Dog , Dog_sub�� �����ϰ� �ְ� ,  Animal �� �ʵ�� �޼ҵ常 ����
		
		// 5 .Dog_sub �� Dog Ÿ������ ��ĳ����
		Dog d2 = new Dog_sub();     // Dog_sub �� Animal, Dog , Dog_sub�� �����ϰ� �ְ� ,  Animal�� Dog �� �ʵ�� �޼ҵ常 ����
			d2.name= "��";
			d2.dog = 5;
		//	d2.dog_sub = 3;    // Dog_sub �� ���� �� �� ���� 
		
		
		
		// 6, Dog_sub �� Dog_sub Ÿ������ ��üȭ
		Dog_sub ds1 = new Dog_sub();
			ds1.name = "������";     // Animal
			ds1.age = 4;			// Animal
			ds1.dog = 3;			// Dog
			ds1.dog_sub = 2;		// Dog_sub
			
		// ��ĳ���� : �ڽ�Ÿ���� ������ Ÿ�Կ��� �θ� ������ Ÿ������ ��ȯ
				// �θ�Ÿ���� �ʵ�� �޼ҵ常 ����
				// ���� Ÿ�� ��ȯ���� �ڵ����� ��ĳ���õ�
				// ds1 �� Dog_sub�� ������ Ÿ���� ������ �ִ�.
			
			Dog ds1_c1 = ds1;  // ��ĳ���� : Dog_sub ===> Dog Ÿ������ ��ĳ���� 
			Animal ds1_c2 = ds1;   // ��ĳ���� : Dog_sub ===> Animal Ÿ������ ��ĳ����
			
		// �ٿ� ĳ���� : �θ� ������ Ÿ���� �ٽ� �ڽ� ������ Ÿ������ ��ȯ
			// ������ Ÿ�� ��ȯ�� �ʿ���.
			// a3�� Animal, Dog , Dog_sub �� Animal Ÿ�Ը� ����ϵ��� ��ĳ���� �Ǿ��ִ�
			
			Dog a3_down1 = (Dog) a3;
			Dog_sub a3_down2 = (Dog_sub) a3;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
