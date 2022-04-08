package chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

// Queue : FIFO ( First In First Out ) : ó���� ���� ó������ ���´�

public class QueueMethod {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		//1. ����ó�� ������ �޼ҵ� add() , element() , remove()
		//  add()  : ���� �߰��ҋ�
//		System.out.println(q1.element());   // q1�� ���� ������ ����� ����
		q1.add(3);
		q1.add(4);
		q1.add(5);
		System.out.println(q1);
		
		// element()
		System.out.println(q1.element());  // ���� ó���� ���  �������ʰ� Ȯ�θ�
		
		// remove()	: ó�� ���� ������ ���
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
//		System.out.println(q1.remove());  q1�� ���̾����� ���� 
		
		System.out.println("===========================");
		
		//2. ����ó�� ���� �޼ҵ�  offer() , peek() , poll()  <== �������
		Queue<Integer> q2 = new LinkedList<Integer>();
		
		System.out.println(q2.peek());  // q2�� ���� ��� �����߻� �ȵ�
		
		// offer(E item) : ���� �߰��ҋ�
		q2.offer(3);
		q2.offer(4);
		q2.offer(5);
		System.out.println(q2);
		
		// peek() : ����ó���� ���   �������ʰ� Ȯ�θ�
		System.out.println(q2.peek());
		
		// poll()  : ó�� ���� ������ ���
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());  // q2�� ���� ��� �����߻� �ȵ�

	}

}
