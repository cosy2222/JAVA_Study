package chap06_07.Ex02;

public class Example_Car {

	public static void main(String[] args) {
		// Car class �� ��üȭ �ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ� �ؼ� ��� �غ�����.
		
		Car sonata = new Car();
		Car mornig = new Car();
		Car canival = new Car();
		Car grandger = new Car();
		Car avantte = new Car();
		
		// �� ������ ���� �Ҵ��ϰ� ����� ������
		
		//������ ���� ���� �Ҵ� , ��������� �ƴ�  �޸𸮿� ������ �ʴ� ���� ���� �Ҵ�
		//private ������ : ĸ��ȭ , ���� ������ ���� �Ҵ����� ���ϵ��� �Ѵ�
		//setter �� ���ؼ� ���� �ο� : ������ �ԷµǴ� ���� ���� �� �� �ִ� 
		sonata.company = "����";
		sonata.model = "�ҳ�Ÿ";
		sonata.color = "white";
		sonata.maxSpeed = 100;
		System.out.print(sonata.getCompany() + " ");
		System.out.print(sonata.getModel() + " ");
		System.out.print(sonata.getColor() + " ");
		System.out.print(sonata.getMaxSpeed() + " ");
		System.out.println();
		System.out.println("=================");
		
		mornig.setCompany("���");
		mornig.setModel("mornig");
		mornig.setColor("black");
		mornig.setMaxSpeed(90);
		System.out.print(mornig.getCompany() + " ");
		System.out.print(mornig.getColor() + " ");
		System.out.print(mornig.getMaxSpeed() + " ");
		System.out.print(mornig.getModel() + " ");
		System.out.println();
		System.out.println("=================");
		
		canival.setCompany("���");
		canival.setModel("carnival");
		canival.setColor("silver");
		canival.setMaxSpeed(80);
		System.out.print(canival.getCompany() + " ");
		System.out.print(canival.getModel()+ " ");
		System.out.print(canival.getColor() + " ");
		System.out.print(canival.getMaxSpeed() + " ");
		System.out.println();
		System.out.println("=================");
		
		grandger.setCompany("����");
		grandger.setModel("grandger");
		grandger.setColor("gray");
		grandger.setMaxSpeed(110);
		System.out.print(grandger.getCompany() + " ");
		System.out.print(grandger.getModel() + " ");
		System.out.print(grandger.getColor() + " ");
		System.out.print(grandger.getMaxSpeed() + " ");
		System.out.println();
		System.out.println("=================");
		
		avantte.setCompany("����");
		avantte.setModel("avantte");
		avantte.setColor("blue");
		avantte.setMaxSpeed(120);
		System.out.print(avantte.getCompany() + " ");
		System.out.print(avantte.getModel() + " ");
		System.out.print(avantte.getColor() + " ");
		System.out.print(avantte.getMaxSpeed() + " ");
		System.out.println();
		System.out.println("=================");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
