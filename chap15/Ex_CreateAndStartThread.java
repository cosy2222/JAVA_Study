package chap15;

/*
 * 	 
 * 	1. Thread�� ���
 *  2. Runnabel �� ����
 *  3,4  �͸� ����Ŭ������ �����ؼ� ����
 *  
 *  �� ���� String �迭�� ������ �Ʒ��� ���� ��� �ϼ��� 
 *  
 *   1		2		      
 *  �̸�		ȫ�浿   �̼���  �Ż��Ӵ�
 *  ���� 		40		50		60
 *  ����		100		90		80
 *  ����		70		60		100
 *  ����		50		70		80
 * 
 * */

// ù���� ������
class First extends Thread{
	public void run() {
		
	String [] a = {"�̸�","����","����","����","����"};
	for(int i = 0 ; i < a.length ; i++) {
		System.out.print(a[i] + " ");
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
		}
	}
	}
}

// �ι��� ������
class Second implements Runnable{

	@Override
	public void run() {
		String [] a = {"ȫ�浿","40","95","70","50"};
		
		for(int i = 0 ; i <a.length ; i++) {
			System.out.print(a[i] + " ");
			if(i > 0) {
				System.out.print("  ");
			}
			try {
				Thread.sleep(1210);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Ex_CreateAndStartThread {

	public static void main(String[] args) {
		
		// ù���� ������ ��ü
		Thread a1 = new First();
		a1.start();
		
		// �ι��� ������ ��ü
		Runnable a2 = new Second();
		Thread s = new Thread(a2);
		s.start();
		
		// ������ ������
		Thread a3 = new Thread(new Runnable() {
			@Override
			public void run() {
				String [] a = {"�̼���","50","90","60","70"};
				for(int i = 0 ; i <a.length ; i++) {
					System.out.print(a[i] + " ");
					if(i > 0) {
						System.out.print("  ");
					}
					try {
						Thread.sleep(1220);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		a3.start();
		
		// �׹�° ������
		Thread a4 = new Thread(new Runnable() {
			@Override
			public void run() {
				String [] a = {"�Ż��Ӵ�","60","80","100","80"};
				for(int i = 0 ; i <a.length ; i++) {
					System.out.println(a[i]);
					try {
						Thread.sleep(1230);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		a4.start();

	}

}
