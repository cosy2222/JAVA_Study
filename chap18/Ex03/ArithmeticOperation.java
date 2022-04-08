package chap18.Ex03;

import java.util.Scanner;

//1. ��ĳ�ʸ� ����ؼ� double �� �μ��� ��ǲ �޽��ϴ�
//2. ���1 : ���ٽ��� ����ؼ� ��ǲ���� �ΰ��� + , - , * , \  �� �����ؼ� ���
//	 ���2 : �������̽��� ������ �ڽİ�ü ����ؼ� ��ǲ���� �ΰ��� + , - , * , \  �� �����ؼ� ���
//   ���3 : �͸��̳�Ŭ������ ����ؼ� ��ǲ���� �ΰ��� +,-,*,\  ��Ģ������ �����ؼ� ���



interface Arithmetic{
	void arithmetic(double a , double b);
}


// �ڽİ�ü
class A implements Arithmetic{
	@Override
	public void arithmetic(double a, double b) {
		System.out.println("���ϱ� : " +(a+b));
		System.out.println("���� : " +(a-b));
		System.out.println("���ϱ� : " +(a*b));
		if(b == 0) {
			throw new ArithmeticException ("0���� ������ ����");
		}else {
			System.out.println("������  : " +(a/b));
		}
	}
}



public class ArithmeticOperation {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("ù���� ���ڸ� �Է����ּ���");
		double first = sca.nextDouble();
		System.out.println("�ι��� ���ڸ� �Է����ּ���");
		double second = sca.nextDouble();
		
		// ���ٽ�
		System.out.println("=========���ٽ�==========");
		Arithmetic a1 = (a,b) ->  System.out.println("���ϱ� : " +(a+b));
		Arithmetic a2 = (a,b) ->  System.out.println("���� : " +(a-b));
		Arithmetic a3 = (a,b) ->  System.out.println("���ϱ� : " +(a*b));
		Arithmetic a4 = (a,b) ->  {
			if(b == 0) {
				throw new ArithmeticException ("0���� ������ ����");
			}else {
				System.out.println("������  : " +(a/b));
			}
		};
		
		a1.arithmetic(first, second);
		a2.arithmetic(first, second);
		a3.arithmetic(first, second);
		a4.arithmetic(first, second);
	
		// �ڽİ�ü ���
		System.out.println("=========�ڽİ�ü ���� ===========");
		Arithmetic aa = new A();
		aa.arithmetic(first, second);
		
		// �͸��̳�Ŭ����
		System.out.println("=======�͸� �̳�Ŭ����===========");
		Arithmetic aaa = new Arithmetic() {
			@Override
			public void arithmetic(double a, double b) {
				System.out.println("���ϱ� : " +(a+b));
				System.out.println("���� : " +(a-b));
				System.out.println("���ϱ� : " +(a*b));
				if(b == 0) {
					throw new ArithmeticException ("0���� ������ ����");
				}else {
					System.out.println("������  : " +(a/b));
				}
			}
		};
		aaa.arithmetic(first, second);
		
		
		
		
		
		
		
		
		
		

	}

}
