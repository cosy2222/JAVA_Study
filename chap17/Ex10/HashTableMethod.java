package chap17.Ex10;

// Map<K,V> : K <== key ,  V <== value �������� �����͸� ����
//		Key�� �ߺ� �� �� ����	<== Set���� ����		index�� �ƴϴ�,  index�� 0���� �Ҵ�   JVM�� �Ҵ�
//   	value�� �ߺ��� ���� ���� �� �ִ� 

//		Hashtable: ����� �����ϰ� ��� . ���Ϥ� ������ ȯ�濡 ���� . ���޼ҵ尡 ����ȭ �Ǿ����� �ʴ�
//		HashTable : �޵�޼ҵ尡 ����ȭ �Ǿ� �ִ� . ��Ƽ������ ȯ�濡 �����ϴ�
//					��� �޼ҵ�� Hashtable�� ����


import java.util.Hashtable;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {

	public static void main(String[] args) {
			
		Map<Integer,String> htable1 = new Hashtable();
				
		// 1. put( K key , V value)
		htable1.put(2, "���ٶ�");
		htable1.put(1, "������");
		htable1.put(3, "�ٶ�");
//		htable1.put(3, "������");	 // Key�� �ߺ��ؼ� ������ �� ���� , �������� ��� ������ ���� �����ȴ�
		
		System.out.println(htable1);
		
		//2. putAll(�ٸ��� ��ü ) 
		Map<Integer,String> htable2 = new Hashtable();
		htable2.putAll(htable1);
		System.out.println(htable2);
		
		// 3. replace(K key , V value ) : key�� ����� ���� value�� ����
		htable2.replace(1, "������");
		htable2.replace(4, "����");	// key 4�� �������� �ʴ´�  �۵��ϵ�   ���ܹ߻�X
		System.out.println(htable2);
		
		//4. replace (K key, V oldValue , V newValue)  : odlValue �� newValue�� ����
		htable2.replace(1, "������" , "������");
		htable2.replace(2, "�ٴٴ�" , "����");		// �۵��ȵ�
		System.out.println(htable2);
		
		//5. get(Object key) : Map�� ���� �����Ë�  Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println(htable2.get(1));	// !����  1 index�� �ƴ϶� key
		System.out.println(htable2.get(2));
		System.out.println(htable2.get(3));
		
		//6. containsKey(Object Ket) : �ʿ� �ش�Ű�� �����ϴ��� Ȯ�� true false
		System.out.println(htable2.containsKey(1));
		System.out.println(htable2.containsKey(5));
		
		//7. containsValue(Object value) : �ʿ� �ش簪�� �����ϴ��� Ȯ�� true false
		System.out.println(htable2.containsValue("������"));
		System.out.println(htable2.containsValue("������"));
		
		//8. Set<K> KetSet() : Ű�� ����
		Set<Integer> keySet = htable2.keySet();   // htable2�� ����� Key���� ����
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>>  entrySet();  : key�� ���� ����
		Set<Map.Entry<Integer, String>> entrySet = htable2.entrySet();
		System.out.println(entrySet);
	
		//10. size() : ����
		System.out.println(htable2.size());
		
		//11. remove(Object key)  // Ű�� �־ value�� ���� 
		htable2.remove(1);
		htable2.remove(4);		// �۵��ȵ�
		System.out.println(htable2);
		
		//12. remove(Object key, Object value)  Ű�� ���� ��ġ�ҋ� ����
		htable2.remove(2, "���ٶ�");
		htable2.remove(3, "���ٶ�");		// �۵��ȵ�
		System.out.println(htable2);
		
		//13. clear() : ��λ���
		htable2.clear();
		System.out.println(htable2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
