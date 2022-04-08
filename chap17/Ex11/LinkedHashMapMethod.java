package chap17.Ex11;




import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
			
		Map<Integer,String> lhmap1 = new LinkedHashMap();
				
		// 1. put( K key , V value)
		lhmap1.put(2, "���ٶ�");
		lhmap1.put(1, "������");
		lhmap1.put(3, "�ٶ�");
//		lhmap1.put(3, "������");	 // Key�� �ߺ��ؼ� ������ �� ���� , �������� ��� ������ ���� �����ȴ�
		
		System.out.println(lhmap1);
		
		//2. putAll(�ٸ��� ��ü ) 
		Map<Integer,String> lhmap2 = new LinkedHashMap();
		lhmap2.putAll(lhmap1);
		System.out.println(lhmap2);
		
		// 3. replace(K key , V value ) : key�� ����� ���� value�� ����
		lhmap2.replace(1, "������");
		lhmap2.replace(4, "����");	// key 4�� �������� �ʴ´�  �۵��ϵ�   ���ܹ߻�X
		System.out.println(lhmap2);
		
		//4. replace (K key, V oldValue , V newValue)  : odlValue �� newValue�� ����
		lhmap2.replace(1, "������" , "������");
		lhmap2.replace(2, "�ٴٴ�" , "����");		// �۵��ȵ�
		System.out.println(lhmap2);
		
		//5. get(Object key) : Map�� ���� �����Ë�  Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println(lhmap2.get(1));	// !����  1 index�� �ƴ϶� key
		System.out.println(lhmap2.get(2));
		System.out.println(lhmap2.get(3));
		
		//6. containsKey(Object Ket) : �ʿ� �ش�Ű�� �����ϴ��� Ȯ�� true false
		System.out.println(lhmap2.containsKey(1));
		System.out.println(lhmap2.containsKey(5));
		
		//7. containsValue(Object value) : �ʿ� �ش簪�� �����ϴ��� Ȯ�� true false
		System.out.println(lhmap2.containsValue("������"));
		System.out.println(lhmap2.containsValue("������"));
		
		//8. Set<K> KetSet() : Ű�� ����
		Set<Integer> keySet = lhmap2.keySet();   // lhmap2�� ����� Key���� ����
		System.out.println(keySet);
		
		//9. Set<Map.Entry<K,V>>  entrySet();  : key�� ���� ����
		Set<Map.Entry<Integer, String>> entrySet = lhmap2.entrySet();
		System.out.println(entrySet);
	
		//10. size() : ����
		System.out.println(lhmap2.size());
		
		//11. remove(Object key)  // Ű�� �־ value�� ���� 
		lhmap2.remove(1);
		lhmap2.remove(4);		// �۵��ȵ�
		System.out.println(lhmap2);
		
		//12. remove(Object key, Object value)  Ű�� ���� ��ġ�ҋ� ����
		lhmap2.remove(2, "���ٶ�");
		lhmap2.remove(3, "���ٶ�");		// �۵��ȵ�
		System.out.println(lhmap2);
		
		//13. clear() : ��λ���
		lhmap2.clear();
		System.out.println(lhmap2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
