package chap06_07.EX04;

/*   1.  this �� Ű����� ���Ǵ� ��� : this.m (�ʵ��� m) , this. init () ( �ڽ� ��ü�� �޼ҵ� init() )
 * 
 * 	 2.  this �޼ҵ�� ���Ǵ� ��� : 
 * 				this () ;    <==== ������ ������ �ٸ� �����ڸ� ȣ�� ���
 * 			                 <==== �ݵ�� ������ ������ ù �ٿ� �;��Ѵ�
 * 							 <==== �޼ҵ� ���ο����� ����ϸ� �ȵȴ� 
 * 
 * */

class Abc {
	
	Abc () {       // �������� �Ű��������� ���� ������
		System.out.println("ù���� ������ �Դϴ�");
	}
	
	Abc (int a) {
		this();            // �Ű������� ���� �����ڸ� ȣ��  ,   this();�� �ݵ�� �������� ù���ο� ��� �Ѵ� 
		System.out.println("�ι��� ������ �Դϴ�");
	}
	
	Abc( int a, String b){
		this (30);				
		System.out.println("������ ������ �Դϴ�");
		
	}
	
	/*     ���� �߻� 
	 void abc() {
		this();          // this();  �޼ҵ� �������� ��� �Ұ� 
		
	}
	
	*/
	
	
}

public class ThisMethod_1 {

	public static void main(String[] args) {
		Abc a = new Abc();
		System.out.println("=========================");
		
		
		Abc aa = new Abc(1);  
		System.out.println("========================");
		
		Abc aaa = new Abc(1 , " ");
				

	}

}
