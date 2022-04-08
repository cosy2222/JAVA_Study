package chap17.Ex10;

// Map<K,V> : K <== key ,  V <== value 형식으로 데이터를 저장
//		Key는 중복 될 수 없다	<== Set으로 관리		index가 아니다,  index는 0부터 할당   JVM이 할당
//   	value는 중복된 값을 넣을 수 있다 

//		Hashtable: 출력이 랜덤하게 출력 . 단일ㄹ 쓰레드 환경에 적합 . 모든메소드가 동기화 되어있지 않다
//		HashTable : 메든메소드가 동기화 되어 있다 . 멀티쓰레드 환경에 적합하다
//					모든 메소드는 Hashtable과 동일


import java.util.Hashtable;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {

	public static void main(String[] args) {
			
		Map<Integer,String> htable1 = new Hashtable();
				
		// 1. put( K key , V value)
		htable1.put(2, "나다라");
		htable1.put(1, "가나다");
		htable1.put(3, "다라마");
//		htable1.put(3, "가가가");	 // Key는 중복해서 저장할 수 없다 , 값을넣을 경우 기존의 값이 수정된다
		
		System.out.println(htable1);
		
		//2. putAll(다른맵 객체 ) 
		Map<Integer,String> htable2 = new Hashtable();
		htable2.putAll(htable1);
		System.out.println(htable2);
		
		// 3. replace(K key , V value ) : key에 저장된 값을 value로 수정
		htable2.replace(1, "가가가");
		htable2.replace(4, "라라라");	// key 4는 존재하지 않는다  작동완됨   예외발생X
		System.out.println(htable2);
		
		//4. replace (K key, V oldValue , V newValue)  : odlValue 를 newValue로 수정
		htable2.replace(1, "가가가" , "나나나");
		htable2.replace(2, "다다다" , "라라라");		// 작동안됨
		System.out.println(htable2);
		
		//5. get(Object key) : Map의 값을 가져올떄  Key를 넣어줘야 Key에 할당된 Value를 출력
		System.out.println(htable2.get(1));	// !주의  1 index가 아니라 key
		System.out.println(htable2.get(2));
		System.out.println(htable2.get(3));
		
		//6. containsKey(Object Ket) : 맵에 해당키가 존재하는지 확인 true false
		System.out.println(htable2.containsKey(1));
		System.out.println(htable2.containsKey(5));
		
		//7. containsValue(Object value) : 맵에 해당값이 존재하는지 확인 true false
		System.out.println(htable2.containsValue("나나나"));
		System.out.println(htable2.containsValue("하하하"));
		
		//8. Set<K> KetSet() : 키만 추출
		Set<Integer> keySet = htable2.keySet();   // htable2에 저장된 Key값을 추출
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>>  entrySet();  : key와 값을 추출
		Set<Map.Entry<Integer, String>> entrySet = htable2.entrySet();
		System.out.println(entrySet);
	
		//10. size() : 갯수
		System.out.println(htable2.size());
		
		//11. remove(Object key)  // 키를 넣어서 value를 삭제 
		htable2.remove(1);
		htable2.remove(4);		// 작동안됨
		System.out.println(htable2);
		
		//12. remove(Object key, Object value)  키와 값이 일치할떄 삭제
		htable2.remove(2, "나다라");
		htable2.remove(3, "나다라");		// 작동안됨
		System.out.println(htable2);
		
		//13. clear() : 모두삭제
		htable2.clear();
		System.out.println(htable2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
