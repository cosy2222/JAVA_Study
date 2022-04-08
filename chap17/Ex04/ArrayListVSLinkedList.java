package chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//  ArrayList VS LinkedList
//  ArrayList : 값에 대해서 index값을 가지고 있다 .  검색속도가 빠름
		// 단점: 중간에서 값을 추가,삭제 할떄 부하가 굉장히 많이 걸린다 
// LinkedList : 각 각의 값은 앞뒤의 연결고리만 가지고 있다 . 검색시에 index번호가 할당된다 
//				검색이 ArrayList에 비해서 느리다 
//			장점 : 중간에 값을 추가,삭제 할떄 부하가 걸리지 않는다 

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		
		//1. 데이터 추가시간 비교
		List<Integer> alist = new ArrayList();
		List<Integer> linkedlist =  new LinkedList();
		long startTime = 0 , endTime = 0;
		
		//1-1 ArrayList에서 데이터 추가시간
		startTime = System.nanoTime();
		for (int i = 0 ; i < 100000 ; i++) {
			alist.add(0, i);	// 0번방에 10만번쨰 까지 
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가 시간 : " + (endTime-startTime) + "ns");
		
		//1-2 LinkedList 에서 데이터 추가 시간
		startTime = System.nanoTime();
		for(int i = 0 ; i <100000 ; i++) {
			linkedlist.add(0 , i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 추가 시간 : " + (endTime-startTime) + "ns");
		
		System.out.println("===============================");
		
		
		//2. 검색할떄 속도비교
		// ArrayList
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			alist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 검색시간 : " + (endTime-startTime) + "ns");
		
		// LinkedList
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 검색시간 : " + (endTime-startTime) + "ns");
		
		System.out.println("========================");
		
		// 3. 데이터 삭제시 시간 비교
		// ArrayList
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			alist.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 삭제시간 : " + (endTime-startTime) + "ns");
		
		// LinkedList
		startTime = System.nanoTime();
		for ( int i = 0 ; i < 100000 ; i++) {
			linkedlist.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 삭제시간 : " + (endTime-startTime) + "ns");
		
		
		
		
		
		
		
		
	}

}
