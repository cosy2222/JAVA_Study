package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java.lang 패키지의 클래스들은 import 가 필요 하지 않다 

/*
 	
 	컬렉션 : 동일한 자료형을 저장. 방의 크기가 동적으로 변화.
 	배열 	 : 동일한 자료형을 저장 .  방의 크기가 고정되어 있다 .  배열 생성시 방의 크기를 지정 
 		   방의 크기는 수정 불가 .
  
  
 	List<E> : 인터페이스, 제너릭 인터페이스 : 다양한 데이터 타입을 사용 가능
 	 	: 인덱스를 가지고 있다.   방의 크기는 동적으로 변화한다 
 	 	
 	 	
 		- ArrayList<E> : 싱글 스레드 환경에서 사용. 검색은 빠르나 값을 추가하거나 삭제할떄 느림 
 		- Vactor<E>	   : 멀티 스레드 환경에서 사용. 모든메소드가 동기화 되어 있다.
 		- LinkedList<E>	: 검색은 느리나 값을 추가나 삭제시 빠르다.
 
*/
public class ArrayList_1 {

	public static void main(String[] args) {
		
		//1. 배열
		String[] array = new String [] { "가" , "나" , "다", "라","마","바","사"};
		System.out.println(array.length);
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);
		
		// Arrays.toString (배열변수)
		System.out.println(Arrays.toString(array));
		
		// for문을 사용해서 출력
		for(int i = 0 ; i < array.length ; i++) {
			if(i == array.length-1) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + " , ");
			}
		}
		
		// 향상된 for문
		for(String k : array) {
			System.out.print(k + " , ");
		}
		System.out.println();
		System.out.println("==========================");
		
		
		//2. List : 인터페이스,  객체생성불가 , 타입은 지정가능
		
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList<>();
		
		// List에서 방의 갯수 출력 : .size();  
		System.out.println(aList.size());
		
		// List에 값을 할당 하기 : .add(값);
		aList.add("가");aList.add("나");aList.add("다");aList.add("라");
		aList.add("마");aList.add("바");aList.add("사");
		
		//List에 저장된 데이터의 갯수 구하기
		System.out.println(aList.size());
		
		// List에 저장된 값을 제거 : .remove(삭제할 내용)
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size());	// List는 값을 제거하면 방의크기가 줄어든다 
		
		// List는 index를 가지고 있다 .  for문 출력
		for(int i = 0 ; i < aList.size() ; i ++) {
			System.out.print(aList.get(i) + " "); // List는 .get()으로 값을 불러온다
		}
		
		System.out.println();
		//향상된 for문 출력
		for(String k : aList) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// 객체에 .toString 을 호출해서 출력
		System.out.println(aList);  // List는 toString 메소드가 재정의 되어있다
		System.out.println(aList.toString());
		
		
		
		
		
		

	}

}
