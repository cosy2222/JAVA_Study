package chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

// Queue : FIFO ( First In First Out ) : 처음들어간 값이 처음으로 나온다

public class QueueMethod {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		//1. 예외처리 미포함 메소드 add() , element() , remove()
		//  add()  : 값을 추가할떄
//		System.out.println(q1.element());   // q1에 값이 없으면 실행시 오류
		q1.add(3);
		q1.add(4);
		q1.add(5);
		System.out.println(q1);
		
		// element()
		System.out.println(q1.element());  // 제일 처음값 출력  꺼내지않고 확인만
		
		// remove()	: 처음 값을 꺼낼떄 사용
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
//		System.out.println(q1.remove());  q1에 값이없을떄 오류 
		
		System.out.println("===========================");
		
		//2. 예외처리 포함 메소드  offer() , peek() , poll()  <== 권장사항
		Queue<Integer> q2 = new LinkedList<Integer>();
		
		System.out.println(q2.peek());  // q2에 값이 없어도 오류발생 안됨
		
		// offer(E item) : 값을 추가할떄
		q2.offer(3);
		q2.offer(4);
		q2.offer(5);
		System.out.println(q2);
		
		// peek() : 제일처음값 출력   꺼내지않고 확인만
		System.out.println(q2.peek());
		
		// poll()  : 처음 값을 꺼낼때 사용
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());  // q2에 값이 없어도 오류발생 안됨

	}

}
