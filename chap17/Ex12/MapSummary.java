package chap17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Map<K,V> ���� : Key�� �ߺ��� �� ����. Value�� �ߺ�����	
	// 1. HashMap		: Key�� �������� �����ϰ� ���,  �޼ҵ尡 ����ȭ���� ���� , �̱۽����忡�� ���
	// 2. HashTabel		: ���޼ҵ尡 ����ȭ���ִ� , ��Ƽ�����忡�� ��� 
	// 3. LinkedHashMap : �Է¼������ ���
	// 4. TreeMap		: �������� ���ĵǾ� �Է�, Comparable<E> , Comparator<E>



public class MapSummary {

	public static void main(String[] args) {
		
		//1. HashMap : �Է¼����� ��¼����� �ٸ���
		Map<String , Integer> hashMap = new HashMap();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashMap);
		
		//2. HashTable : �Է¼����� ��¼����� �ٸ��� , ����ȭ �Ǿ��ִ� , ��Ƽ������ȯ��
		Map<String , Integer> hashTable = new Hashtable();
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		hashTable.put("��", 60);
		System.out.println(hashTable);
		
		//3. LinkedHashMap : �Է¼����� ��¼����� ����
		Map<String , Integer> linkedhashMap = new LinkedHashMap();
		linkedhashMap.put("��", 30);
		linkedhashMap.put("��", 40);
		linkedhashMap.put("��", 50);
		linkedhashMap.put("��", 60);
		System.out.println(linkedhashMap);
		
		//4. TreeMap : �������� ���ĵǾ� ����
		TreeMap<String , Integer> tMap = new TreeMap();
		tMap.put("��", 30);
		tMap.put("��", 40);
		tMap.put("��", 50);
		tMap.put("��", 60);
		System.out.println(tMap);
		
		
		
		
		
		
		
		
		
		
		
	}

}
