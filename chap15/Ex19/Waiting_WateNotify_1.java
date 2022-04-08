package chap15.Ex19;

//Waiting:
//				a.join(): �ڽ��� ������� Waiting �����̰�a��ü���� Cpu
			// a ��ü�� ������ �Ϸ�Ǹ� �ڽ��� �����尡 Runnable�� �̵�
			//  �ڽŽ������� ó���� ������ �ٸ��������� ����� �޾Ƽ� ó���ؾ� �� ���
	// waite(), notify() , notifyAll()  <== ����ȭ ��������� ����
	// -wait() : ����ȭ �������� wait() �޼ҵ带 ������ Waiting ���·� ����
	// -notify(), notifyAll()�� wait() �޼ҵ带 �ƿ��� <== �ݵ�� �ٸ� �����忡�� �ƿ��ټ� �ִ�

class DataBox{
	int data ;
	synchronized void inputData (int data) {     // ����ȭ ������
		this.data = data;
		System.out.println("�Է� ������ " + data);			// data : �Ű����� ������ ���� ������
	}
	synchronized void outputData(){						// ����ȭ �޼ҵ�
		System.out.println("��� ������" + data);			// data : �޸��� data , this �����Ǿ� ����
	}
}

public class Waiting_WateNotify_1 {

	public static void main(String[] args) {
		
		//ù���� ������ : ���� ��ü�� ���� �ִ� ������
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {    // �͸� ���� Ŭ����
			public void run() {
				for (int i = 1 ; i <9 ; i++) {
					dataBox.inputData(i);
				}
			};
		};
		
		//�ι��� ������ : ������ü�� ���� ���� �о���� �޼ҵ�
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 1 ; i<9 ; i++) {
					dataBox.outputData();
				}
			}
		};
		
		t1.start();	
		t2.start();
		
	

		
		
		
		
		
		
		
		
		
		
	}

}
