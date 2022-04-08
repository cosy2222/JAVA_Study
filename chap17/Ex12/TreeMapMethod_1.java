package chap17.Ex12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

// TreeMap : 저장시에 Key를 기준을로 정렬되어 저장됨 
	// 출력시에 오름차순 정렬되어 출력
	// Key에 일반 객체를 저장할떄 Comparable<E>  compareTo()를 재정의  <== 객체수정 및 재컴파일  
	//						 Comparator<E> compare() 를 재정의  <== 객체수정 X

// Map<K,V> <== SortedMap <K,V> (정렬메소드 정의) <==  NavigableMap<K,V> (검색메소드정의)  <== TreeMap<K,V>
	// TreeMap을 사용할떄는 타입을 TreeMap으로 지정해야 검색,정렬 메소드 사용가능 


public class TreeMapMethod_1 {

	public static void main(String[] args) {
		// TreeMap<K,V> 는  Map<K,V>메소드를 모드 사용가능 , 추가적으로 SortedMap , NavigableMap의 추가적인 메소드 사용가능
		TreeMap<Integer , String> treeMap = new TreeMap();
		
		for (int i = 20 ; i >0 ; i -= 2) {
			treeMap.put(i, " "+ i + "번쨰 데이터");
		}
		System.out.println(treeMap);	// Key , Value : Key 를 기준으로 오름차순 정렬됨 
		
		
		//1. firstKey() : 제일 첫번쨰 키를 출력
		System.out.println(treeMap.firstKey());
		
		//2. firstEntry() :  entry = key + value
		System.out.println(treeMap.firstEntry());
		
		//3. lastKey() : 마지막 키
		System.out.println(treeMap.lastKey());
		
		//4. lastEntry() : 마지막 키와 값
		System.out.println(treeMap.lastEntry());
		
		//5. lowerKey(K key) : 입력 받은키의 낮은 키값 출력
		System.out.println(treeMap.lowerKey(10));
		
		//6.higerKey(K key) : 입력받은키의 높은키값 출력 
		System.out.println(treeMap.higherKey(10));
		
		//7. pollFirstEntry() : 첫번쨰 키와 값을 꺼내온다 
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//8. pollLastEntry() : 마지막 키와 값을 꺼내온다
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		//9. SortedMap<K,V>  headMap(K tokey)  : 인풋받은 key의 head쪽으로 처리
		SortedMap<Integer , String> sMap = treeMap.headMap(8);
		System.out.println(sMap);
		
		//10. 
		NavigableMap<Integer, String> nMap = treeMap.headMap(10, true);  
		System.out.println(nMap);
		
		//11.										tail 부터 처리
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
		
		//15. NavigableSet<K> descendingKeySet() : 현재 키 정렬을 반대로 출력
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		//16. NabigableMap<K , V> descendingMap() : 현재 정렬을 반대로
		NavigableMap<Integer, String> nMap3 = treeMap.descendingMap();
		System.out.println(nMap3);
		System.out.println(nMap3.descendingMap());
		
		
		
		
		
		
		
		
		
		
	}

}
