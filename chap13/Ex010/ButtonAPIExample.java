package chap13.Ex010;

class Button{
	OnClicklistener ocl ;      // OnClicklistener : ��ü Ÿ��,    ocl : ���� ����   
								// ocl �⺻�� : null
	
	// setter �� ���ؼ� OnClicklistener �� �������� ocl�� ��ü �ּҸ� ��´�
	void setOnClicklistener(OnClicklistener ocl) {
		this.ocl = ocl ;
	}
	
	
	// �������̽��� �����ϰ� ������ �ڽ�Ŭ������ �������� �ʴ´�
	// ȣ���ϴ� ������ onClick() �޼ҵ带 ������ �ؼ� ȣ��
	interface OnClicklistener{    
		void onClick();		// �޼ҵ� ����ȵ�,  �������� �������̵� �ؼ� ������
	}
	
	void click() {			// ���������� ocl.onClick() ����
		ocl.onClick();		// ocl : �������� : null ==> setOnClicklistener(onclickListener ocl)
		System.out.println(ocl);
	}
	
}


public class ButtonAPIExample {

	public static void main(String[] args) {
		
		// ������1 : Ŭ���� ���� ���
		Button button1 = new Button();
		
		// A.B = new A.B() { �̳��������̽�B�� �޼ҵ带 ������ �ڵ� };
		// onClickListener ��üŸ������ ��ü ���� �Ű������� ����
		
		button1.setOnClicklistener(new Button.OnClicklistener() {
			@Override
			public void onClick() {
				System.out.println("������1 ���� ���");
			}
		});
		
		button1.click();
		System.out.println("========================");
		
		// ������ 2 : Ŭ���� ���̹� ����
		Button button2 = new Button();
		// setOnClicklistener �޼ҵ忡 �Ű������� OnClicklistener�� ���� �͸�ü�� ������ 
		button2.setOnClicklistener(new Button.OnClicklistener() {
			@Override
			public void onClick() {
				System.out.println("������ 2 Ŭ���� ���̹� ����");
			}
		});
		
		button2.click();
		

	}

}
