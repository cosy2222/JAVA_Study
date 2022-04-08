package chap17.Ex03;




import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// Vector : ArrayList�� ���޼ҵ带 �����ϰ� ���
// 		Vector�� ��� �޼ҵ尡 ����ȭ ó���� �Ǿ� �ִ� . ��Ƽ������ ȯ�濡 ���ǵ��� �Ǿ��ִ�

// �̱� ������ ȯ�� : ArrayList
// ��Ƽ ������ ȯ�� : Vector




public class LinkedListMethod_1 {

	public static void main(String[] args) {
		
		// List�� Method : 13�� ������ �޼ҵ� 
			// 1. ArrayList
		 	// 2. Vector
			// 3. LinkedList
		
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		
		// 1. add(E element) : �������� ���� �߰� 
		linkedList1.add(3);linkedList1.add(4);linkedList1.add(5);
		System.out.println(linkedList1);
		System.out.println(linkedList1.size());
		
		// 2. add (int index , E element)
		linkedList1.add(0 , 5); // ���ȣ 0���� 5�� �߰� 
		System.out.println(linkedList1);
		System.out.println(linkedList1.size());
		
		
		// 3. addAll (�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		LinkedList<Integer> linkedList2 = new LinkedList();
		linkedList2.add(1);linkedList2.add(2);
		
		linkedList2.addAll(linkedList2); // aList1�� ���ڵ� ���� �����ؼ� aList2�� �߰�
		System.out.println(linkedList2);
		
		
		// 4. addAll(int index, �Ǵٸ� ��ü)
		LinkedList<Integer> linkedList3 = new LinkedList();
		linkedList3.add(1);linkedList3.add(2);
		
		linkedList3.addAll(1, linkedList3);
		System.out.println(linkedList3);
		
		//5. set(int index , E element) : Ư�� ���ȣ�� ���� ����
		linkedList3.set(1,5);
		System.out.println(linkedList3);
		
		
		//6. remove (int index) : Ư�����ȣ�� ���� ����
		linkedList3.remove(1);		// 1������ ���� ����
		System.out.println(linkedList3);
		
		//7. remove (Object o) : ������ ���� 
		linkedList3.remove(new Integer(2));	// ������ ����
		System.out.println(linkedList3);
		
		//8. clear() : ��λ���
		linkedList3.clear();
		System.out.println(linkedList3);
		
		//9. isEmpty() : ���� ��� ������ True, ������� ������ False
		System.out.println(linkedList3.isEmpty());
		
		//10. size() : ���� ���� , ���� ���� 
		System.out.println(linkedList3.size());
		linkedList3.add(1);linkedList3.add(2);linkedList3.add(3);
		System.out.println(linkedList3.size());
		
		//11. get(int index) : ���ȣ�� ���� ���
		System.out.println(linkedList3.get(0));
		System.out.println(linkedList3.get(1));
		System.out.println(linkedList3.get(2));
		
		//12. toArray() : List(����Ʈ) ---> Array (�迭)�� ��ȯ
		Object [] object = linkedList3.toArray();	// �⺻������ toArray()�޼ҵ�� ObjectŸ������ ���ϵ�
			// �ٿ�ĳ������ �ʿ���
		System.out.println(Arrays.toString(object));
		
		// 13-1.  toArray(T[] t)   ===> t[]  : Inter�� �ٷ� ĳ����
		Integer [] integer1 = linkedList3.toArray(new Integer[0]);
			// 0�� �ǹ� : ����Ʈ�� ����� ������ ���� ��� ����Ʈ�� ����� ���� ������ �´� 
		System.out.println(Arrays.toString(integer1));
		
		// 13-2.  toArray(T[] t)   ===> t[]  : Inter�� �ٷ� ĳ����
		Integer [] integer2 = linkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
