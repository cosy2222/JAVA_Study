package chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//  ArrayList VS LinkedList
//  ArrayList : ���� ���ؼ� index���� ������ �ִ� .  �˻��ӵ��� ����
		// ����: �߰����� ���� �߰�,���� �ҋ� ���ϰ� ������ ���� �ɸ��� 
// LinkedList : �� ���� ���� �յ��� ������� ������ �ִ� . �˻��ÿ� index��ȣ�� �Ҵ�ȴ� 
//				�˻��� ArrayList�� ���ؼ� ������ 
//			���� : �߰��� ���� �߰�,���� �ҋ� ���ϰ� �ɸ��� �ʴ´� 

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		
		//1. ������ �߰��ð� ��
		List<Integer> alist = new ArrayList();
		List<Integer> linkedlist =  new LinkedList();
		long startTime = 0 , endTime = 0;
		
		//1-1 ArrayList���� ������ �߰��ð�
		startTime = System.nanoTime();
		for (int i = 0 ; i < 100000 ; i++) {
			alist.add(0, i);	// 0���濡 10������ ���� 
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �߰� �ð� : " + (endTime-startTime) + "ns");
		
		//1-2 LinkedList ���� ������ �߰� �ð�
		startTime = System.nanoTime();
		for(int i = 0 ; i <100000 ; i++) {
			linkedlist.add(0 , i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ �߰� �ð� : " + (endTime-startTime) + "ns");
		
		System.out.println("===============================");
		
		
		//2. �˻��ҋ� �ӵ���
		// ArrayList
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			alist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� �˻��ð� : " + (endTime-startTime) + "ns");
		
		// LinkedList
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� �˻��ð� : " + (endTime-startTime) + "ns");
		
		System.out.println("========================");
		
		// 3. ������ ������ �ð� ��
		// ArrayList
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			alist.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� �����ð� : " + (endTime-startTime) + "ns");
		
		// LinkedList
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			linkedlist.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� �����ð� : " + (endTime-startTime) + "ns");
		
		
		
		
		
		
		
		
	}

}
