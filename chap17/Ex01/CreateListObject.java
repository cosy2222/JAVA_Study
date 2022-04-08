package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		
		// 1. List 구현 클래스의 생성자를 사용하여 객체 생성
		// List는 인터페이스 이므로 new 키 뒤에 올수없다.  타입으로 지정은 가능 
		// capacity : 메모리의 방의 크기를 할당 , 기본값은 10
		// size() : 방에 저장된 값의 갯수 
		
		List<Integer> aList1 = new ArrayList<>();	// capacity = 0
		List<Integer> aList2 = new ArrayList<>(30);  // capacity = 30
		
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(30);
		
		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30);  LinkedList는 저장공간 할당불가
		
		
		// 2. Arrays 클래스의 정적 메소드를 이용 하는 방법 : 데이터 크기를 바꿀수 없다 .
				//  요일 , 계정 , 하루  <== 고정된 값을 저장 할때 사용
		
		List<Integer> aList7 = Arrays.asList(1,2,3,4); // 고정된 값을 저장
		List<String> aList8 = Arrays.asList("월","화","수","목","금","토","일"); // 고정된 값을 저장
		aList7.set(1, 7);   // set() : 기존의 값을 수정할때 사용  , index 1에 7을 할당하겠다
//		aList7.add(5);		// 오류발생 실행시 오류  데이터크기 바꿀수없음
		
		aList8.set(0, "일");
		
		System.out.println(aList7);
		System.out.println(aList8);
		
		
		
		
		
		
	}

}
