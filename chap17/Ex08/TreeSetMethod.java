package chap17.Ex08;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// TreeSet : ��½� ���ĵǾ ��� ( �������� ����[ascending] : 1 --> 9   , a --> z , �� -- ��
//			 ��½� �˻��� �޼ҵ� ����
//			 ������ ���� ������ Set�� ���ĵǾ ���� , ��½ÿ� ������������ ���ĵǾ ��� , ��½ÿ� ������������ ���ĵǾ ���
//			 Set <= sortedSet(���ĸ޼ҵ� ����) <=  NavigableSet(�˻��޼ҵ� ���� ) <= TreeSet
//			 TreeSet<String> treeset = new TreeSet<String>();  Ÿ���� TreeSet���� �����ؾ� ���İ� �˻���� ��밡��
//			 Set �������̽��� ��� �޼ҵ� ��� , �߰������� ���ĸ޼ҵ� / �˻��޼ҵ� ��밡��

public class TreeSetMethod {

	public static void main(String[] args) {
		// TreeSet�� Set�� ��� �޼ҵ� ���. 
		// TreeSet�� ���� �־��� ��� �������� ���ĵǾ� ���� Set�� ���� ,  ��½� �������� ���ķ� ���
		TreeSet<Integer> treeSet = new TreeSet();	// Type�� TreeSet���� �����ؾ� ����(Sort)�� �˻��� ����� �� �ִ� . 
		for ( int i = 50 ; i >0 ; i-=2) {  // 50 , 48 , 46 , 44 ....... 
			treeSet.add(i);		
		}
		System.out.println(treeSet);	
		
		
		// TreeSet������ ��� ������ �޼ҵ� (1 ~ 15)
		
		System.out.println("=======������ �˻�===========");
		
		// 1. first() 	: ���� ó������ ����
		System.out.println(treeSet.first());	//2
		// 2. last()  	: ���� ��������   			//50
		System.out.println(treeSet.last());
		// 3. lower(E element)   : element ���� �������� ���
		System.out.println(treeSet.lower(26));
		// 4. higer(E element)   : element ���� ū���� ���
		System.out.println(treeSet.higher(26));
		// 5. floor (E element)  : ���� ������ ���������   ������ �״�� ���
		System.out.println(treeSet.floor(25));
		System.out.println(treeSet.floor(26));
		// 6. ceilling(E element) : ���� ������ ū�� ���   ������ �״�� ���
		System.out.println(treeSet.ceiling(25));
		System.out.println(treeSet.ceiling(26));
		
		System.out.println("======������ ������ ===========");
		
		//7. pollFirst() : ���� ó������ ������
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		for (int i = 0 ; i < treeSetSize ; i ++) {
			System.out.println(treeSet.pollFirst());
		}
		System.out.println(treeSet.size());
		
		//8. pollLast() : ���� �������� ��������
		for ( int i = 50 ; i > 0 ; i -=2) {
			treeSet.add(i);		// ������������ ���ĵǾ� ����
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		System.out.println(treeSet);
		
		for(int i = 0 ; i < treeSetSize ; i ++) {
			System.out.println(treeSet.pollLast());
		}
		System.out.println(treeSet.size());
		
		System.out.println("============����============");
		
		//9. SortedSet <E> headSet(E element) : ������ ����ϱ� ���ؼ� SortedSet <E> ��ü�� ����
		//		SortedSet<E> : ���ĵ� �����͸� �����ϴ� Set
		//		headSet(E element) : element�� Head�������� ���� ����	,  element ���� ������ 
		//		headSet : ����      tailSet : ���۰�
		
		for (int i = 50 ; i > 0 ; i -=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);	// headSet(20)�� SortedSet���� ���ϰ��� ������
//		Set<Integer> sSet1 = treeSet.headSet(20);     Ÿ�� Set���� ���൵ �� 
		System.out.println(sSet);
		
		//10 . NavigableSet<E> headSet(E element, boolean inclusive) 
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);    // true: element �� ����  , false: element�� ������
//		Set<Integer> nSet = treeSet.headSet(20, true); 
		System.out.println(nSet);
		
		//11. sortedSet<E>  tailSet(E element) 
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);// ���۰��� ������ �⺻ , ������ �������� �⺻  <<== ������ ������ ����
//		Set<Integer> sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		//12. NavigableSet<E> tailSet (E element, boolean inclusive) : 
		NavigableSet nSet2= treeSet.tailSet(20, false);
//		Set nSet2 = treeSet.tailSet(20,false);
		System.out.println(nSet2);
		
		System.out.println("==========================================");
		
		//13. SortedSet<E> subSet (E element , E element)  : Ư�� ������ ���� set���� ������ 
		SortedSet sSet3 = treeSet.subSet(10, 20);		// 10���� 20 ������ ��
		System.out.println(sSet3);						// ���۰��� ����  ������ ������ <== ��� ���α׷����� �⺻
		
		//14. NavigableSet<E> subSet(E element , boolean inclusive , E element , boolean inclusive)
		NavigableSet<Integer> nSet3 = treeSet.subSet(10, false, 20, true);
//		Set<Integer> nSet3 = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet3);
		
		System.out.println("==========================================");
		
		//15. NavigableSet<E> descendingSet() : ���� ������ �������� �ݴ�� ���� �Ѵ�     descending <�������� ����>
		System.out.println(treeSet);
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		
		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
		
		
		
		
		
		
	}

}
