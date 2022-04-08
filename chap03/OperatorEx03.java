package chap03;

public class OperatorEx03 {

	public static void main(String[] args) {
		/*
		 *  논리 연산자 ( &&, ||, ^, ! ) : 쇼트 서킷이 발생 ( 앞부분의 연산 결과를 인지할수 일을떄 뒷부분은 연산을 생략 )
		 *  비트 연산자 ( &, | , ^, ~)      : 쇼트 서킷이 발생되지 않는다 
		 */
		
		//1. 논리 연산자 AND (&&) : 둘다 true일때 true
		
		System.out.println(true && true); // true, 쇼트 서킷이 발생되지 않는다 
		System.out.println(true && false); // false, 쇼트서킷이 발생되지 않는다
		System.out.println(false && true);  // false, 쇼트서킷이 발생됨
		System.out.println(true && (5<3));   // false
		System.out.println((5<=5) && (7>2)); // true 
		System.out.println((3<2) && (8<10)); // flase  쇼트서킷이 발생됨 
		System.out.println();
		
		//OR (||) : 둘중 하나만 true여도 true
		
		System.out.println(true || true);  //true 쇼트서킷이 발생됨 
		System.out.println(false || (5<3));  // false 쇼트서킷이 발생되지 않음
		System.out.println();
		
		//XOR (^) : 두값이 같을떄 flase,   두값이 다를떄 true
		
		System.out.println(true ^ true);   // false
		System.out.println(false ^ false); //false
		System.out.println(true ^ false);  // true
		System.out.println(false ^ true);  //true
		System.out.println((5 <=5) ^ (7>2) ); //false
		System.out.println();
		
		//NOT (!) : true 이면 false  ,   false 이면 true
		
		System.out.println(!true);    //false
		System.out.println(!false);   //true
		System.out.println(false || !(5<3));  //true
		System.out.println();
		
		// 쇼트서킷 사용 여부 ( 논리연사자일떄 발생 , 비트연산자일떄는 발생되지 않음)
		int value2 = 3;
		System.out.println(false && ++value2 > 6);  // 쇼트 서킷이 발생됨
		System.out.println(value2);     //3   쇼트서킷이 발생되서 위에 ++value2 가 연산되지않음
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6); // 쇼트 서킷이 발생되지 않음
		System.out.println(value3);     //4    쇼트서킷이 발생되지 않아서 ++value3 가 연산됨
		
		int value4 = 3;
		System.out.println(true || ++value4 > 6); // true 쇼트서킷 발생
		System.out.println(value4);                // 3
		
		int value5 = 3;
		System.out.println(true | ++value5 > 6); //true  쇼트서킷 발생되지않음
		System.out.println(value5);                // 4
		
		
		
	}

}
