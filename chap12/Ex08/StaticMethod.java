package chap12.Ex08;
// �������̽� ���ο� static Ű�� �� �޼ҵ� : ���� �ڽĿ��� ���� ���� �ٷ� ȣ��

/*
 *   �������̽� ���� ���� ���    [  ]  : �������� 
 *    �ʵ� : [public static final]
 *    �޼ҵ� : [public abstract]     << �߻�޼ҵ� , �����ΰ� ���� �޼ҵ�
 *    		 [public] default       << �����ΰ� �ִ� �޼ҵ�
 *    		 [public] static        << �����ΰ� �ְ� , ��ü�������� ȣ��
 *   
 * 
 * 
 * */



interface A{
	static void abc() {		// Java 1.8 �̻󿡼� ���Ӱ� �߰��� ���
		System.out.println("A �������̽��� ���� �޼ҵ� abc()");
	}
	
}



public class StaticMethod {

	public static void main(String[] args) {
		
		//1. static �޼ҵ� ȣ�� 
		A.abc();

	}

}
