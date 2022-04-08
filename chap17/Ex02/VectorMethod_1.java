package chap17.Ex02;

// Vector : ArrayList와 모든메소드를 동일하게 사용
// 		Vector는 모든 메소드가 동기화 처리가 되어 있다 . 멀티스레드 환경에 사용되도록 되어있다

// 싱글 스레드 환경 : ArrayList
// 멀티 스레드 환경 : Vector



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod_1 {

	public static void main(String[] args) {
		
		// List의 Method : 13개 정도의 메소드 
			// 1. ArrayList
		 	// 2. Vector
			// 3. LinkedList
		
		List<Integer> vector1 = new Vector<Integer>();
		
		// 1. add(E element) : 마지막에 값을 추가 
		vector1.add(3);vector1.add(4);vector1.add(5);
		System.out.println(vector1);
		System.out.println(vector1.size());
		
		// 2. add (int index , E element)
		vector1.add(0 , 5); // 방번호 0번에 5를 추가 
		System.out.println(vector1);
		System.out.println(vector1.size());
		
		
		// 3. addAll (또다른 리스트의 객체를 복사해서 추가)
		List<Integer> vector2 = new Vector();
		vector2.add(1);vector2.add(2);
		
		vector2.addAll(vector2); // aList1에 저자된 값을 복사해서 aList2에 추가
		System.out.println(vector2);
		
		
		// 4. addAll(int index, 또다른 객체)
		List<Integer> vector3 = new Vector();
		vector3.add(1);vector3.add(2);
		
		vector3.addAll(1, vector3);
		System.out.println(vector3);
		
		//5. set(int index , E element) : 특정 방번호의 값을 수정
		vector3.set(1,5);
		System.out.println(vector3);
		
		
		//6. remove (int index) : 특정방번호의 값을 삭제
		vector3.remove(1);		// 1번방의 값을 삭제
		System.out.println(vector3);
		
		//7. remove (Object o) : 값으로 삭제 
		vector3.remove(new Integer(2));	// 값으로 삭제
		System.out.println(vector3);
		
		//8. clear() : 모두삭제
		vector3.clear();
		System.out.println(vector3);
		
		//9. isEmpty() : 값이 비어 있으면 True, 비어있지 않으면 False
		System.out.println(vector3.isEmpty());
		
		//10. size() : 방의 갯수 , 값의 갯수 
		System.out.println(vector3.size());
		vector3.add(1);vector3.add(2);vector3.add(3);
		System.out.println(vector3.size());
		
		//11. get(int index) : 방번호의 값을 출력
		System.out.println(vector3.get(0));
		System.out.println(vector3.get(1));
		System.out.println(vector3.get(2));
		
		//12. toArray() : List(리스트) ---> Array (배열)로 변환
		Object [] object = vector3.toArray();	// 기본적으로 toArray()메소드는 Object타입으로 리턴됨
			// 다운캐스팅이 필요함
		System.out.println(Arrays.toString(object));
		
		// 13-1.  toArray(T[] t)   ===> t[]  : Inter로 바로 캐스팅
		Integer [] integer1 = vector3.toArray(new Integer[0]);
			// 0의 의미 : 리스트에 저장된 값보다 작을 경우 리스트에 저장된 값만 가지고 온다 
		System.out.println(Arrays.toString(integer1));
		
		// 13-2.  toArray(T[] t)   ===> t[]  : Inter로 바로 캐스팅
		Integer [] integer2 = vector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
