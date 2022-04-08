package chap06_07.EX01;

/* Ŭ����(class): ���࿡ �־ ���ȭ�� ���� ���µ� �ʿ��� ��Ǫ��
   ��ü(object): �ٸ� ���� �ν��Ͻ���� �θ�. ��Ǫ���� Ŭ������ ������ �� ���������, RAM���� �۵��Ǵ� �����ڵ�. �����嵵 �ǰ� ��ġ�� �ǰ� ���� �ǰ�.
                ���� ����������� �����ؼ� ���� ������� �� ������Ʈ�� �����ؼ� ���α׷��� ����. 
   ��üȭ(�ν��Ͻ�ȭ): ��üȭ��Ų��. Ŭ������ ��ü�� �������� �޸𸮿� �ε��Ų��. Ʋ�� ���縦 �� �̸� â�� �����صд�.
   				ex) A a = new A();

*/


class A{ // �ܺ� Ŭ���� // �ܺ� Ŭ������ �������� Ŭ������ �� �� ����. �׷��� �ۺ� Ŭ������ ���� �ϳ��� �� �� ����.
	int m = 3; // ���⼭ m�� ���� �˰� �ִ� �����ε�, �ٸ� �޽�� ���� �ƴ� Ŭ���� ������� �����. �̸� ���� ����
	          //  �ʵ��� Ī��. �ʵ�� �޸��� �� ������ �����Ǹ�, �ν��Ͻ�ȭ ���Ѿ� ����� �����ϴ�.
	void print() { // �޼ҵ� : ������������ �Լ�, ��ü������� �Լ��� �޼ҵ��� ȣĪ��
		System.out.println("��ü ���� �� Ȱ��"); // ���� 
	}
}

class B{ // �ܺ�Ŭ����
	String name = "ȫ�浿";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName () {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
	
}

public class CreateObjectAndUsingOfMember { // 

	public static void main(String[] args) {
		A a = new A(); // Class A�� ��üȭ(�ν��Ͻ�ȭ)��Ų��. (RAM�� �ε��Ų��)
		System.out.println(a.m);
		a.print();
		
		System.out.println("====================");
		
		A b = new A(); // Class A�� ��üȭ (�ν��Ͻ�ȭ)���Ѽ� �޸𸮿� �ε���ѳ���.
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("====================");
		
		B bb = new B(); // B Class�� bb��� �̸����� ��üȭ��Ų��.
		bb.printName();
		bb.printAge();
		bb.printPhone();
		
		System.out.println("====================");
		
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
	}

}
