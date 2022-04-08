package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_1 {

	public static void main(String[] args) {
		
		// List�� Method : 13�� ������ �޼ҵ� 
			// 1. ArrayList
		 	// 2. Vetor
			// 3. LinkedList
		
		List<Integer> aList1 = new ArrayList();
		
		// 1. add(E element) : �������� ���� �߰� 
		aList1.add(3);aList1.add(4);aList1.add(5);
		System.out.println(aList1);
		System.out.println(aList1.size());
		
		// 2. add (int index , E element)
		aList1.add(0 , 5); // ���ȣ 0���� 5�� �߰� 
		System.out.println(aList1);
		System.out.println(aList1.size());
		
		
		// 3. addAll (�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer> aList2 = new ArrayList();
		aList2.add(1);aList2.add(2);
		
		aList2.addAll(aList1); // aList1�� ���ڵ� ���� �����ؼ� aList2�� �߰�
		System.out.println(aList2);
		
		
		// 4. addAll(int index, �Ǵٸ� ��ü)
		List<Integer> aList3 = new ArrayList();
		aList3.add(1);aList3.add(2);
		
		aList3.addAll(1, aList3);
		System.out.println(aList3);
		
		//5. set(int index , E element) : Ư�� ���ȣ�� ���� ����
		aList3.set(1,5);
		System.out.println(aList3);
		
		
		//6. remove (int index) : Ư�����ȣ�� ���� ����
		aList3.remove(1);		// 1������ ���� ����
		System.out.println(aList3);
		
		//7. remove (Object o) : ������ ���� 
		aList3.remove(new Integer(2));	// ������ ����
		System.out.println(aList3);
		
		//8. clear() : ��λ���
		aList3.clear();
		System.out.println(aList3);
		
		//9. isEmpty() : ���� ��� ������ True, ������� ������ False
		System.out.println(aList3.isEmpty());
		
		//10. size() : ���� ���� , ���� ���� 
		System.out.println(aList3.size());
		aList3.add(1);aList3.add(2);aList3.add(3);
		System.out.println(aList3.size());
		
		//11. get(int index) : ���ȣ�� ���� ���
		System.out.println(aList3.get(0));
		System.out.println(aList3.get(1));
		System.out.println(aList3.get(2));
		
		//12. toArray() : List(����Ʈ) ---> Array (�迭)�� ��ȯ
		Object [] object = aList3.toArray();	// �⺻������ toArray()�޼ҵ�� ObjectŸ������ ���ϵ�
			// �ٿ�ĳ������ �ʿ���
		System.out.println(Arrays.toString(object));
		
		// 13-1.  toArray(T[] t)   ===> t[]  : Inter�� �ٷ� ĳ����
		Integer [] integer1 = aList3.toArray(new Integer[0]);
			// 0�� �ǹ� : ����Ʈ�� ����� ������ ���� ��� ����Ʈ�� ����� ���� ������ �´� 
		System.out.println(Arrays.toString(integer1));
		
		// 13-2.  toArray(T[] t)   ===> t[]  : Inter�� �ٷ� ĳ����
		Integer [] integer2 = aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
