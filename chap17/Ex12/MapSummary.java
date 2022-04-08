package chap17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Map<K,V> 정리 : Key는 중복될 수 없다. Value는 중복가능	
	// 1. HashMap		: Key를 기준으로 랜덤하게 출력,  메소드가 동기화되지 않음 , 싱글스레드에서 사용
	// 2. HashTabel		: 모든메소드가 동기화되있다 , 멀티스레드에서 사용 
	// 3. LinkedHashMap : 입력순서대로 출력
	// 4. TreeMap		: 오름차순 정렬되어 입력, Comparable<E> , Comparator<E>



public class MapSummary {

	public static void main(String[] args) {
		
		//1. HashMap : 입력순서와 출력순서가 다르다
		Map<String , Integer> hashMap = new HashMap();
		hashMap.put("다", 30);
		hashMap.put("마", 40);
		hashMap.put("나", 50);
		hashMap.put("가", 60);
		System.out.println(hashMap);
		
		//2. HashTable : 입력순서와 출력순서가 다르다 , 동기화 되어있다 , 멀티스레드환경
		Map<String , Integer> hashTable = new Hashtable();
		hashTable.put("다", 30);
		hashTable.put("마", 40);
		hashTable.put("나", 50);
		hashTable.put("가", 60);
		System.out.println(hashTable);
		
		//3. LinkedHashMap : 입력순서와 출력순서가 같다
		Map<String , Integer> linkedhashMap = new LinkedHashMap();
		linkedhashMap.put("다", 30);
		linkedhashMap.put("마", 40);
		linkedhashMap.put("나", 50);
		linkedhashMap.put("가", 60);
		System.out.println(linkedhashMap);
		
		//4. TreeMap : 오름차순 정렬되어 저장
		TreeMap<String , Integer> tMap = new TreeMap();
		tMap.put("다", 30);
		tMap.put("마", 40);
		tMap.put("나", 50);
		tMap.put("가", 60);
		System.out.println(tMap);
		
		
		
		
		
		
		
		
		
		
		
	}

}
