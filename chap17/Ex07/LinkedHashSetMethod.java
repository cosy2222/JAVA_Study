package chap17.Ex07;

// LinkedHashSet : 값의 정보에 내 앞과 값의 위치정보와 , 내 뒤의 값의 위치정보를 가진다 
	// HashSet과 공통점 : 모든 메소드가 동일 하다 , 중복된 값을 저장하지 않는다	, 방번호(index) 값을 가지지 않는다
	//					기본for문으로 출력할 수 없다 ,   iterator, 향상된for문으로 출력

	// HashSet과 다른점 : HashSet은 입력대로 출력되지 않는다 , LinkedHashSet은 입력대로 출력된다

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Set<E>: 인터페이스, 방번호 (index) 가 없다 , 중복된 값을 넣을 수 없다
	// -HashSet				: 중복된 값을 넣을 수 없다 , 값을 꺼내면 순서대로 꺼내지지 않는다
	// - LinkedHashSet		: 중복된 값을 넣을 수 없다 , 출력시 순서대로 출력
	// - TreeSet			: 저장될떄 같이 정렬이 되어서 저장 acscending(오름 차순 정령되어 저장됨)
						// 참고 : descending(내림차순 정렬)   

public class LinkedHashSetMethod {

	public static void main(String[] args) {
		
		Set<String> linkedhset1 = new LinkedHashSet();	   // Set은 인터페이스 이므로 티압으로만 저장
			// Set의 제너릭 타입변수로 wrapper 클래스를 사용할 경우 , equals(),hashCode(),toString()이 재정의 되어있다
		
		//1. add(E element) :추가
		linkedhset1.add("가");linkedhset1.add("나");linkedhset1.add("가");		// "가"를 중복저장 안됨
		System.out.println(linkedhset1);
		System.out.println(linkedhset1.toString());
		
		System.out.println("=====================");
		
		//2. addAll (다른 set 객체)
		Set <String> linkedhset2 = new LinkedHashSet();
		linkedhset2.add("나");linkedhset2.add("다");
		linkedhset2.addAll(linkedhset1);
		System.out.println(linkedhset2);
		
		//3. remove : 삭제
		linkedhset2.remove("나");
		System.out.println(linkedhset2);
		
		//4. clear()  : 모두삭제
		linkedhset2.clear();
		System.out.println(linkedhset2);
		
		//5 isEmpty() : 비어있으면 true , 비어있지 않으면 false
		System.out.println(linkedhset2.isEmpty());
		
		//6. contains (Object o ) : 값이 Set에 존재하면 true , 그렇지 않으면 false
		Set<String>linkedhset3 = new LinkedHashSet();
		linkedhset3.add("가");linkedhset3.add("나");linkedhset3.add("다");
		System.out.println(linkedhset3);
		System.out.println(linkedhset3.contains("나"));	//true
		System.out.println(linkedhset3.contains("라"));	//true
		
		//7. size() : Set에 포함된 값의 갯수
		System.out.println(linkedhset3.size());
		
		//8. iterator()  : Set은 index를 가지지 않는다 . for문은 방번호로 값을 출력 , enhanced for문은 사용가능
				// 순회자 , Set의 값들을 순회 하면서 출력
				// hashNext() : Set의 값이 존재 하면 true, 존재하지 않으면 false
				// next() : 현재 값을 출력하고 다음값으로 이동
		
		Iterator<String> iterator = linkedhset3.iterator();
		//  클래스 <E>	   참조객체 = Set객체.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		System.out.println("========향상된 for문을 사용해서 출력============");
		for(String k : linkedhset3) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		//9. toArray() : Set의 값들을 배열로 보낸다 . Object 타입으로 리턴 , 다운 캐스팅이 필요함
		Object [] objArray = linkedhset3.toArray();
		for (int i = 0 ; i < objArray.length ; i++) {
			System.out.print(objArray[i] + " ");
		}
		System.out.println();
		System.out.println("========================");
		for(Object k : objArray) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 10 . toArray(T[] t)
		String[] strArray1 = linkedhset3.toArray(new String[0]);	// 0 : 방의 크기를 지정 합니다
															// 방의 크기가 실제값보다 작을경우 컴파일러가 방의 크기만큼 지정
		System.out.println(Arrays.toString(strArray1));
		
		
		//11. 실제 Set의 값보다 방크기를 크게 설정 했을떄 
		String[] strArray2 = linkedhset3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2));

		System.out.println("===================================");

		

		
		
		
		
		
		
		
		
		
		
		
	}

}
