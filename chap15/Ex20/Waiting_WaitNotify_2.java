package chap15.Ex20;


class DataBox{
	boolean isEmpty = true;   // �⺻�� ����
	
	int data ;
	
	synchronized void inputData (int data) {     // ����ȭ ������
		if(!isEmpty) {	//false �϶�  wait(); ����ȭ ���̳� ����ȭ �޼ҵ忡�� Waiting ���·� ��ȯ
						// data �ʵ��� ���� ������� ������ ��� ��� t2 �����尡 ó���ϵ��� 
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty = false; // data�ʵ��� ���� �ְ� t2�� ���� ���� �� �ֵ��� false�� �⺻����
		
		this.data = data;
		System.out.println("�Է� ������" + data);			// data : �Ű����� ������ ���� ������
		notify();
	}
	
	synchronized void outputData(){						// ����ȭ �޼ҵ�
		if(isEmpty) {
			try {wait();} catch (InterruptedException e) {}
		}
		isEmpty = true;
		System.out.println("��� ������" + data);			// data : �޸��� data , this �����Ǿ� ����
		notify();			// inputData() �޼ҵ��� wait()�� �����带 �����ش� 
	}
}


public class Waiting_WaitNotify_2 {

	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
		//ù���� ������ : ���� ��ü�� ���� �ִ� ������
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
