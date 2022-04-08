package chap16.Ex04;

// 제너릭 클래스 : 매개변수 (Argument : 2개 )
class KeyValue<K,V>{
	private K key;
	private V value;
	
	// getter , setter
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}


public class TwoGenericArguments {

	public static void main(String[] args) {
		
		KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		//KeyValue<String, Integer> kv1 = new KeyValue();  생성자에서는 생략가능
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		System.out.println("==================");
		
		KeyValue<Integer, String> kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("Not Found");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		System.out.println("==============");
		
		KeyValue<String, Double> kv3 = new KeyValue();
		kv3.setKey("평군값");
		kv3.setValue(55.55);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		System.out.println("====================");
		
		// 특정 타입을 사용하지 않을 경우 void 키를 사용합니다  !주의 Void: V 대문자 사용해야됨
		KeyValue<String , Void> kv4 = new KeyValue();
		kv4.setKey("키값만 사용");
//		kv4.setValue(111111);  사용불가 
		
		System.out.println(kv4.getKey());
		
		
		
		

	}

}
