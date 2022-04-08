package chap17.Ex09;

// Map<K,V> : K <== key ,  V <== value �������� �����͸� ����
//		Key�� �ߺ� �� �� ����	<== Set���� ����		index�� �ƴϴ�,  index�� 0���� �Ҵ�   JVM�� �Ҵ�
//   	value�� �ߺ��� ���� ���� �� �ִ� 


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
			
		Map<Integer,String> hmap1 = new HashMap();
				
		// 1. put( K key , V value)
		hmap1.put(2, "���ٶ�");
		hmap1.put(1, "������");
		hmap1.put(3, "�ٶ�");
//		hmap1.put(3, "������");	 // Key�� �ߺ��ؼ� ������ �� ���� , �������� ��� ������ ���� �����ȴ�
		
		System.out.println(hmap1);
		
		//2. putAll(�ٸ��� ��ü ) 
		Map<Integer,String> hmap2 = new HashMap();
		hmap2.putAll(hmap1);
		System.out.println(hmap2);
		
		// 3. replace(K key , V value ) : key�� ����� ���� value�� ����
		hmap2.replace(1, "������");
		hmap2.replace(4, "����");	// key 4�� �������� �ʴ´�  �۵��ϵ�   ���ܹ߻�X
		System.out.println(hmap2);
		
		//4. replace (K key, V oldValue , V newValue)  : odlValue �� newValue�� ����
		hmap2.replace(1, "������" , "������");
		hmap2.replace(2, "�ٴٴ�" , "����");		// �۵��ȵ�
		System.out.println(hmap2);
		
		//5. get(Object key) : Map�� ���� �����Ë�  Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println(hmap2.get(1));	// !����  1 index�� �ƴ϶� key
		System.out.println(hmap2.get(2));
		System.out.println(hmap2.get(3));
		
		//6. containsKey(Object Ket) : �ʿ� �ش�Ű�� �����ϴ��� Ȯ�� true false
		System.out.println(hmap2.containsKey(1));
		System.out.println(hmap2.containsKey(5));
		
		//7. containsValue(Object value) : �ʿ� �ش簪�� �����ϴ��� Ȯ�� true false
		System.out.println(hmap2.containsValue("������"));
		System.out.println(hmap2.containsValue("������"));
		
		//8. Set<K> KetSet() : Ű�� ����
		Set<Integer> keySet = hmap2.keySet();   // hmap2�� ����� Key���� ����
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>>  entrySet();  : key�� ���� ����
		Set<Map.Entry<Integer, String>> entrySet = hmap2.entrySet();
		System.out.println(entrySet);
	
		//10. size() : ����
		System.out.println(hmap2.size());
		
		//11. remove(Object key)  // Ű�� �־ value�� ���� 
		hmap2.remove(1);
		hmap2.remove(4);		// �۵��ȵ�
		System.out.println(hmap2);
		
		//12. remove(Object key, Object value)  Ű�� ���� ��ġ�ҋ� ����
		hmap2.remove(2, "���ٶ�");
		hmap2.remove(3, "���ٶ�");		// �۵��ȵ�
		System.out.println(hmap2);
		
		//13. clear() : ��λ���
		hmap2.clear();
		System.out.println(hmap2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
