package chap15.Ex03;

// 1���� ������ 
class SMIFileThread extends Thread{  // �ڸ����� ó���ϴ� ������
	@Override
	public void run() {
		// �ڸ���ȣ ���
		String [] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(10);} catch (InterruptedException e1) {}
		
		for (int i = 0 ; i < strArray.length ; i++) {
			System.out.println("(�ڸ� ��ȣ) " + strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

// 2���� ������
class VideoFileThread extends Thread{  // ���� �������� ó���ϴ� ������ 
	@Override
	public void run() {
		// ���� ������ ���
		 int [] intArray = {1,2,3,4,5};
		 for(int i = 0 ; i < intArray.length ; i++) {
			 System.out.print("(����������) " + intArray[i]);
			 try {Thread.sleep(200);}catch (InterruptedException e) {}
		 }
		
	}
}

public class CreateAndThread_2 {

//1. main ������	
	public static void main(String[] args) {
		// SMIfileThread ��ü ����
		Thread a = new SMIFileThread();
		a.start();
		
		// VideoFileThread ��ü ����
		Thread b = new VideoFileThread();
		b.start();		

	}

}








