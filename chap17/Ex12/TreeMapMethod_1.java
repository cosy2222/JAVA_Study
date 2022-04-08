package chap17.Ex12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

// TreeMap : ����ÿ� Key�� �������� ���ĵǾ� ����� 
	// ��½ÿ� �������� ���ĵǾ� ���
	// Key�� �Ϲ� ��ü�� �����ҋ� Comparable<E>  compareTo()�� ������  <== ��ü���� �� ��������  
	//						 Comparator<E> compare() �� ������  <== ��ü���� X

// Map<K,V> <== SortedMap <K,V> (���ĸ޼ҵ� ����) <==  NavigableMap<K,V> (�˻��޼ҵ�����)  <== TreeMap<K,V>
	// TreeMap�� ����ҋ��� Ÿ���� TreeMap���� �����ؾ� �˻�,���� �޼ҵ� ��밡�� 


public class TreeMapMethod_1 {

	public static void main(String[] args) {
		// TreeMap<K,V> ��  Map<K,V>�޼ҵ带 ��� ��밡�� , �߰������� SortedMap , NavigableMap�� �߰����� �޼ҵ� ��밡��
		TreeMap<Integer , String> treeMap = new TreeMap();
		
		for (int i = 20 ; i >0 ; i -= 2) {
			treeMap.put(i, " "+ i + "���� ������");
		}
		System.out.println(treeMap);	// Key , Value : Key �� �������� �������� ���ĵ� 
		
		
		//1. firstKey() : ���� ù���� Ű�� ���
		System.out.println(treeMap.firstKey());
		
		//2. firstEntry() :  entry = key + value
		System.out.println(treeMap.firstEntry());
		
		//3. lastKey() : ������ Ű
		System.out.println(treeMap.lastKey());
		
		//4. lastEntry() : ������ Ű�� ��
		System.out.println(treeMap.lastEntry());
		
		//5. lowerKey(K key) : �Է� ����Ű�� ���� Ű�� ���
		System.out.println(treeMap.lowerKey(10));
		
		//6.higerKey(K key) : �Է¹���Ű�� ����Ű�� ��� 
		System.out.println(treeMap.higherKey(10));
		
		//7. pollFirstEntry() : ù���� Ű�� ���� �����´� 
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//8. pollLastEntry() : ������ Ű�� ���� �����´�
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		//9. SortedMap<K,V>  headMap(K tokey)  : ��ǲ���� key�� head������ ó��
		SortedMap<Integer , String> sMap = treeMap.headMap(8);
		System.out.println(sMap);
		
		//10. 
		NavigableMap<Integer, String> nMap = treeMap.headMap(10, true);  
		System.out.println(nMap);
		
		//11.										tail ���� ó��
		SortedMap<Integer , String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		//12.
		NavigableMap<Integer, String> nMap2 = treeMap.tailMap(14, false);
		System.out.println(nMap2);
		
		//13. SortedMap <k,V> subMap
		SortedMap<Integer, String> subMap = treeMap.subMap(6, 10);
		System.out.println(subMap);
		
		
		//14.  NavigableMap <k,V> subMap ( K fromkey , boolean , K tokey , boolean)
		NavigableMap<Integer, String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		//15. NavigableSet<K> descendingKeySet() : ���� Ű ������ �ݴ�� ���
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		//16. NabigableMap<K , V> descendingMap() : ���� ������ �ݴ��
		NavigableMap<Integer, String> nMap3 = treeMap.descendingMap();
		System.out.println(nMap3);
		System.out.println(nMap3.descendingMap());
		
		
		
		
		
		
		
		
		
		
	}

}
