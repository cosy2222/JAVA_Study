package chap17.Ex17;

import java.util.Stack;

// Stack 자료구조 : LIFO ( Last In First Out ) : 마지막에 저장한값이 제일처음 나온다.

public class StackMetohd {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		
		//1. E push (E element) : 스택에 값을 넣을떄 사용
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		
		//2. E peek() : 가져올 값을 위에서 쳐다봄
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println();
		
		//3. search(Object o) : 검색  , 값을 넣었을떄 index번호를 출력  !주의 : 방번호는 위에서부터 1번부터시작  
		System.out.println(stack.search(7));
		System.out.println(stack.search(3));
		System.out.println(stack.search(5));
		System.out.println(stack.search(2));
		System.out.println(stack.search(9)); // 값이 존재하지 않을경우 : -1을 리턴
		
		//4. E pop() : 스택의 값을 가져오기 , 제일 마지막에 넣은 값부터 꺼내온다
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		//5. boolean empty() : 비어있을떄 true , 아니면 false
		System.out.println(stack.empty());
		stack.push(3);
		System.out.println(stack.empty());
	}

}
