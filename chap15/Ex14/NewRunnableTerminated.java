package chap15.Ex14;

// ������ ����
  // 1.  new			:������ ��ü ������ .start() �޼ҵ尡 ȣ��Ǳ��� ����

  // 2. Runnable		: .start() �޼ҵ尡 ȣ��Ǹ� run() �޼ҵ� ������ �ڵ尡CPU���� ����ǰ� �ִ� ����

  // 3. Terminate		: run()�� ��� �ڵ尡 ����Ǹ� ������ ����

  // 4. Timed waite		: Ư���ð����ȸ� ������ , Thread.sleep(1000); 
  //				      a.join(1000)  <=== ���� �ڽ��� ������� 1�� �����¿� �ְ� , a ��ü�� ���� ���·� ���� ���� 
  //					  Ư�� �ð��� ����Ǹ� ������·ΰ� , ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� ������·� ��

  // 5. Block			: ����ȭ ó������ lock�� �ɷ��� ������ ��� ���ܵȻ���, Ű�� �ݳ��� ��� Ű�� ȹ���ؼ� ������·� ��

  // 6. waite			: ������ ������ , ���� �ƿ���� �������� �� �� �ִ�  , �ٸ������尡 �ƿ���� �� 


public class NewRunnableTerminated {

	public static void main(String[] args) {
		
		// �������� ���¸� �����س��� Ŭ������.   �� 6���� ���¸� ���� �� �� �ִ�
		Thread.State state;     // state �������� 6���� ����� 
		
		
		// 1. ��ü ���� (NEW)
				// NEW : ������ ��ü ������ .start() ȣ��Ǳ� ������
		Thread mythread = new Thread() {
			@Override
			public void run() {
				for (long i = 0 ; i < 100000000L ; i ++) {}   // 0.5�� �ð� ����
			}
		};
		
		state = mythread.getState();       // �������� ���¸� ������ �ͼ� state ������ ��´�
		System.out.println("mythread state : " + state);
		
		// 2. myThread ����
		mythread.start();
		state = mythread.getState();
		System.out.println("mythread state : " + state);
		
		// 3. mythread ���� 
		
			// mythread.join();  �� ������(main)�� ����ϰ� , mythread�� ó���϶�
		try {mythread.join();} catch (InterruptedException e) {}
		state = mythread.getState();
		System.out.println("mythread state : " + state);
		
		

	}
}	
