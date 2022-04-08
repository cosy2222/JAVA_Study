package chap17.Ex11;




import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
			
		Map<Integer,String> lhmap1 = new LinkedHashMap();
				
		// 1. put( K key , V value)
		lhmap1.put(2, "나다라");
		lhmap1.put(1, "가나다");
		lhmap1.put(3, "다라마");
//		lhmap1.put(3, "가가가");	 // Key는 중복해서 저장할 수 없다 , 값을넣을 경우 기존의 값이 수정된다
		
		System.out.println(lhmap1);
		
		//2. putAll(다른맵 객체 ) 
		Map<Integer,String> lhmap2 = new LinkedHashMap();
		lhmap2.putAll(lhmap1);
		System.out.println(lhmap2);
		
		// 3. replace(K key , V value ) : key에 저장된 값을 value로 수정
		lhmap2.replace(1, "가가가");
		lhmap2.replace(4, "라라라");	// key 4는 존재하지 않는다  작동완됨   예외발생X
		System.out.println(lhmap2);
		
		//4. replace (K key, V oldValue , V newValue)  : odlValue 를 newValue로 수정
		lhmap2.replace(1, "가가가" , "나나나");
		lhmap2.replace(2, "다다다" , "라라라");		// 작동안됨
		System.out.println(lhmap2);
		
		//5. get(Object key) : Map의 값을 가져올떄  Key를 넣어줘야 Key에 할당된 Value를 출력
		System.out.println(lhmap2.get(1));	// !주의  1 index가 아니라 key
		System.out.println(lhmap2.get(2));
		System.out.println(lhmap2.get(3));
		
		//6. containsKey(Object Ket) : 맵에 해당키가 존재하는지 확인 true false
		System.out.println(lhmap2.containsKey(1));
		System.out.println(lhmap2.containsKey(5));
		
		//7. containsValue(Object value) : 맵에 해당값이 존재하는지 확인 true false
		System.out.println(lhmap2.containsValue("나나나"));
		System.out.println(lhmap2.containsValue("하하하"));
		
		//8. Set<K> KetSet() : 키만 추출
		Set<Integer> keySet = lhmap2.keySet();   // lhmap2에 저장된 Key값을 추출
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>>  entrySet();  : key와 값을 추출
		Set<Map.Entry<Integer, String>> entrySet = lhmap2.entrySet();
		System.out.println(entrySet);
	
		//10. size() : 갯수
		System.out.println(lhmap2.size());
		
		//11. remove(Object key)  // 키를 넣어서 value를 삭제 
		lhmap2.remove(1);
		lhmap2.remove(4);		// 작동안됨
		System.out.println(lhmap2);
		
		//12. remove(Object key, Object value)  키와 값이 일치할떄 삭제
		lhmap2.remove(2, "나다라");
		lhmap2.remove(3, "나다라");		// 작동안됨
		System.out.println(lhmap2);
		
		//13. clear() : 모두삭제
		lhmap2.clear();
		System.out.println(lhmap2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
