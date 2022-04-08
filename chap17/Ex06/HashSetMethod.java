package chap17.Ex06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set<E>: �������̽�, ���ȣ (index) �� ���� , �ߺ��� ���� ���� �� ����
	// -HashSet				: �ߺ��� ���� ���� �� ���� , ���� ������ ������� �������� �ʴ´�
	// - LinkedHashSet		: �ߺ��� ���� ���� �� ���� , ��½� ������� ���
	// - TreeSet			: ����ɋ� ���� ������ �Ǿ ���� acscending(���� ���� ���ɵǾ� �����)
						// ���� : descending(�������� ����)   

public class HashSetMethod {

	public static void main(String[] args) {
		
		Set<String> hset1 = new HashSet();	   // Set�� �������̽� �̹Ƿ� Ƽ�����θ� ����
		
		//1. add(E element) :�߰�
		hset1.add("��");hset1.add("��");hset1.add("��");		// "��"�� �ߺ����� �ȵ�
		System.out.println(hset1);
		System.out.println(hset1.toString());
		
		//2. addAll (�ٸ� set ��ü)
		Set <String> hset2 = new HashSet();
		hset2.add("��");hset2.add("��");
		hset2.addAll(hset1);
		System.out.println(hset2);
		
		//3. remove : ����
		hset2.remove("��");
		System.out.println(hset2);
		
		//4. clear()  : ��λ���
		hset2.clear();
		System.out.println(hset2);
		
		//5 isEmpty() : ��������� true , ������� ������ false
		System.out.println(hset2.isEmpty());
		
		//6. contains (Object o ) : ���� Set�� �����ϸ� true , �׷��� ������ false
		Set<String>hset3 = new HashSet();
		hset3.add("��");hset3.add("��");hset3.add("��");
		System.out.println(hset3);
		System.out.println(hset3.contains("��"));	//true
		System.out.println(hset3.contains("��"));	//true
		
		//7. size() : Set�� ���Ե� ���� ����
		System.out.println(hset3.size());
		
		//8. iterator()  : Set�� index�� ������ �ʴ´� . for���� ���ȣ�� ���� ��� , enhanced for���� ��밡��
				// ��ȸ�� , Set�� ������ ��ȸ �ϸ鼭 ���
				// hashNext() : Set�� ���� ���� �ϸ� true, �������� ������ false
				// next() : ���� ���� ����ϰ� ���������� �̵�
		
		Iterator<String> iterator = hset3.iterator();
		//  Ŭ���� <E>	   ������ü = Set��ü.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("========���� for���� ����ؼ� ���============");
		for(String k : hset3) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		//9. toArray() : Set�� ������ �迭�� ������ . Object Ÿ������ ���� , �ٿ� ĳ������ �ʿ���
		Object [] objArray = hset3.toArray();
		for (int i = 0 ; i < objArray.length ; i++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		System.out.println("========================");
		for(Object k : objArray) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 10 . toArray(T[] t)
		String[] strArray1 = hset3.toArray(new String[0]);	// 0 : ���� ũ�⸦ ���� �մϴ�
															// ���� ũ�Ⱑ ���������� ������� �����Ϸ��� ���� ũ�⸸ŭ ����
		System.out.println(Arrays.toString(strArray1));
		
		
		//11. ���� Set�� ������ ��ũ�⸦ ũ�� ���� ������ 
		String[] strArray2 = hset3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));

		System.out.println("===================================");

		
		// ����
		
		Set<Integer> intSet1 = new HashSet();
		intSet1.add(30);intSet1.add(50);intSet1.add(100);intSet1.add(10);
		//iterator ��� , ���� for�� ��� 
		
		// Iterator 
		Iterator<Integer> iterator1 = intSet1.iterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+" ");
		}
		System.out.println();
		
		//����for��
		for(int k : intSet1) {
			System.out.print(k + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
