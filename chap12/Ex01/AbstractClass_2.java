package chap12.Ex01;


//2. �߻�Ŭ������ ��üȭ �ؼ� ����ϴ� ��� 2   : �ڽ� Ŭ���� �������� �͸� ��ü�� Ȱ���ϴ� ���
// ��ȸ�� , �̺�Ʈ ó��
// ���� : �ڽ� Ŭ���� ������ ���� �ʴ´� , �ӽ������� ����� ��� ����
// ���� : �������� ��ü�� �����ؾ� �� ��� �ڵ尡 ����� 

abstract class Aaa{
	abstract void abc();
}



public class AbstractClass_2 {

	public static void main(String[] args) {
		
		Aaa a = new Aaa() {   // �͸� ��ü�� Ȱ���� �߻�޼ҵ带 �ڽ�Ŭ���� �������� ���� 
			void abc() {
				System.out.println("��� 2");
			}
		};
		
		a.abc();

	}

}
