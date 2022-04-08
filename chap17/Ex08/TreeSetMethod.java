package chap17.Ex08;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// TreeSet : 출력시 정렬되어서 출력 ( 오름차순 정렬[ascending] : 1 --> 9   , a --> z , 가 -- 하
//			 출력시 검색의 메소드 지원
//			 임의의 값을 넣으면 Set에 정렬되어서 저장 , 출력시에 오름차순으로 정렬되어서 출력 , 출력시에 오름차순으로 정렬되어서 출력
//			 Set <= sortedSet(정렬메소드 정의) <=  NavigableSet(검색메소드 정의 ) <= TreeSet
//			 TreeSet<String> treeset = new TreeSet<String>();  타입을 TreeSet으로 지정해야 정렬과 검색기능 사용가능
//			 Set 인터페이스의 모든 메소드 사용 , 추가적으로 정렬메소드 / 검색메소드 사용가능

public class TreeSetMethod {

	public static void main(String[] args) {
		// TreeSet은 Set의 모든 메소드 사용. 
		// TreeSet에 값을 넣었을 경우 오름차순 정렬되어 값이 Set에 저장 ,  출력시 오름차순 정렬로 출력
		TreeSet<Integer> treeSet = new TreeSet();	// Type을 TreeSet으로 지정해야 정렬(Sort)과 검색을 사용할 수 있다 . 
		for ( int i = 50 ; i >0 ; i-=2) {  // 50 , 48 , 46 , 44 ....... 
			treeSet.add(i);		
		}
		System.out.println(treeSet);	
		
		
		// TreeSet에서만 사용 가능한 메소드 (1 ~ 15)
		
		System.out.println("=======데이터 검색===========");
		
		// 1. first() 	: 제일 처음값을 리턴
		System.out.println(treeSet.first());	//2
		// 2. last()  	: 제일 마지막값   			//50
		System.out.println(treeSet.last());
		// 3. lower(E element)   : element 보다 작은값을 출력
		System.out.println(treeSet.lower(26));
		// 4. higer(E element)   : element 보다 큰값을 출력
		System.out.println(treeSet.higher(26));
		// 5. floor (E element)  : 값이 없으면 작은값출력   있으면 그대로 출력
		System.out.println(treeSet.floor(25));
		System.out.println(treeSet.floor(26));
		// 6. ceilling(E element) : 값이 없으면 큰값 출력   있으면 그대로 출력
		System.out.println(treeSet.ceiling(25));
		System.out.println(treeSet.ceiling(26));
		
		System.out.println("======데이터 꺼내기 ===========");
		
		//7. pollFirst() : 제임 처음값을 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		for (int i = 0 ; i < treeSetSize ; i ++) {
			System.out.println(treeSet.pollFirst());
		}
		System.out.println(treeSet.size());
		
		//8. pollLast() : 제일 마지막값 꺼내오기
		for ( int i = 50 ; i > 0 ; i -=2) {
			treeSet.add(i);		// 오름차순으로 정렬되어 저장
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);
		System.out.println(treeSet);
		
		for(int i = 0 ; i < treeSetSize ; i ++) {
			System.out.println(treeSet.pollLast());
		}
		System.out.println(treeSet.size());
		
		System.out.println("============정렬============");
		
		//9. SortedSet <E> headSet(E element) : 정렬을 사용하기 위해서 SortedSet <E> 객체를 생성
		//		SortedSet<E> : 정렬된 데이터를 저장하는 Set
		//		headSet(E element) : element의 Head쪽으로의 값을 저장	,  element 값은 미포함 
		//		headSet : 끝값      tailSet : 시작값
		
		for (int i = 50 ; i > 0 ; i -=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);	// headSet(20)은 SortedSet으로 리턴값을 돌려줌
//		Set<Integer> sSet1 = treeSet.headSet(20);     타입 Set으로 해줘도 됨 
		System.out.println(sSet);
		
		//10 . NavigableSet<E> headSet(E element, boolean inclusive) 
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);    // true: element 값 포함  , false: element값 미포함
//		Set<Integer> nSet = treeSet.headSet(20, true); 
		System.out.println(nSet);
		
		//11. sortedSet<E>  tailSet(E element) 
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);// 시작값은 포함이 기본 , 끝값은 미포함이 기본  <<== 모든언어에서 동일한 내용
//		Set<Integer> sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		//12. NavigableSet<E> tailSet (E element, boolean inclusive) : 
		NavigableSet nSet2= treeSet.tailSet(20, false);
//		Set nSet2 = treeSet.tailSet(20,false);
		System.out.println(nSet2);
		
		System.out.println("==========================================");
		
		//13. SortedSet<E> subSet (E element , E element)  : 특정 범위의 값을 set으로 담을떄 
		SortedSet sSet3 = treeSet.subSet(10, 20);		// 10부터 20 사이의 값
		System.out.println(sSet3);						// 시작값은 포함  끝값은 미포함 <== 모든 프로그램에서 기본
		
		//14. NavigableSet<E> subSet(E element , boolean inclusive , E element , boolean inclusive)
		NavigableSet<Integer> nSet3 = treeSet.subSet(10, false, 20, true);
//		Set<Integer> nSet3 = treeSet.subSet(10, false, 20, true);
		System.out.println(nSet3);
		
		System.out.println("==========================================");
		
		//15. NavigableSet<E> descendingSet() : 현재 정렬을 기준으로 반대로 정렬 한다     descending <내림차순 정렬>
		System.out.println(treeSet);
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		
		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
		
		
		
		
		
		
	}

}
