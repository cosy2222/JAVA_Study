package chap17.Ex07;

// LinkedHashSet : ���� ������ �� �հ� ���� ��ġ������ , �� ���� ���� ��ġ������ ������ 
	// HashSet�� ������ : ��� �޼ҵ尡 ���� �ϴ� , �ߺ��� ���� �������� �ʴ´�	, ���ȣ(index) ���� ������ �ʴ´�
	//					�⺻for������ ����� �� ���� ,   iterator, ����for������ ���

	// HashSet�� �ٸ��� : HashSet�� �Է´�� ��µ��� �ʴ´� , LinkedHashSet�� �Է´�� ��µȴ�

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Set<E>: �������̽�, ���ȣ (index) �� ���� , �ߺ��� ���� ���� �� ����
	// -HashSet				: �ߺ��� ���� ���� �� ���� , ���� ������ ������� �������� �ʴ´�
	// - LinkedHashSet		: �ߺ��� ���� ���� �� ���� , ��½� ������� ���
	// - TreeSet			: ����ɋ� ���� ������ �Ǿ ���� acscending(���� ���� ���ɵǾ� �����)
						// ���� : descending(�������� ����)   

public class LinkedHashSetMethod {

	public static void main(String[] args) {
		
		Set<String> linkedhset1 = new LinkedHashSet();	   // Set�� �������̽� �̹Ƿ� Ƽ�����θ� ����
			// Set�� ���ʸ� Ÿ�Ժ����� wrapper Ŭ������ ����� ��� , equals(),hashCode(),toString()�� ������ �Ǿ��ִ�
		
		//1. add(E element) :�߰�
		linkedhset1.add("��");linkedhset1.add("��");linkedhset1.add("��");		// "��"�� �ߺ����� �ȵ�
		System.out.println(linkedhset1);
		System.out.println(linkedhset1.toString());
		
		System.out.println("=====================");
		
		//2. addAll (�ٸ� set ��ü)
		Set <String> linkedhset2 = new LinkedHashSet();
		linkedhset2.add("��");linkedhset2.add("��");
		linkedhset2.addAll(linkedhset1);
		System.out.println(linkedhset2);
		
		//3. remove : ����
		linkedhset2.remove("��");
		System.out.println(linkedhset2);
		
		//4. clear()  : ��λ���
		linkedhset2.clear();
		System.out.println(linkedhset2);
		
		//5 isEmpty() : ��������� true , ������� ������ false
		System.out.println(linkedhset2.isEmpty());
		
		//6. contains (Object o ) : ���� Set�� �����ϸ� true , �׷��� ������ false
		Set<String>linkedhset3 = new LinkedHashSet();
		linkedhset3.add("��");linkedhset3.add("��");linkedhset3.add("��");
		System.out.println(linkedhset3);
		System.out.println(linkedhset3.contains("��"));	//true
		System.out.println(linkedhset3.contains("��"));	//true
		
		//7. size() : Set�� ���Ե� ���� ����
		System.out.println(linkedhset3.size());
		
		//8. iterator()  : Set�� index�� ������ �ʴ´� . for���� ���ȣ�� ���� ��� , enhanced for���� ��밡��
				// ��ȸ�� , Set�� ������ ��ȸ �ϸ鼭 ���
				// hashNext() : Set�� ���� ���� �ϸ� true, �������� ������ false
				// next() : ���� ���� ����ϰ� ���������� �̵�
		
		Iterator<String> iterator = linkedhset3.iterator();
		//  Ŭ���� <E>	   ������ü = Set��ü.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("========���� for���� ����ؼ� ���============");
		for(String k : linkedhset3) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		//9. toArray() : Set�� ������ �迭�� ������ . Object Ÿ������ ���� , �ٿ� ĳ������ �ʿ���
		Object [] objArray = linkedhset3.toArray();
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
		String[] strArray1 = linkedhset3.toArray(new String[0]);	// 0 : ���� ũ�⸦ ���� �մϴ�
															// ���� ũ�Ⱑ ���������� ������� �����Ϸ��� ���� ũ�⸸ŭ ����
		System.out.println(Arrays.toString(strArray1));
		
		
		//11. ���� Set�� ������ ��ũ�⸦ ũ�� ���� ������ 
		String[] strArray2 = linkedhset3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));

		System.out.println("===================================");

		

		
		
		
		
		
		
		
		
		
		
		
	}

}
