package chap03;

public class OperatorEx04 {

	public static void main(String[] args) {
		/*
		 * 대입 연산자 ( = , +=, -=, *=, /=, >>=, <<= , >>>= ), 수식에서 우선순위가 제일 낮다
		 *  a = b;    <== b변수의 값을 a변수에 할당하라는 의미,  == (같다) 
		 *  a += b;   <== a = a + b
		 *  a -= b;   <== a = a - b
		 *  a *= b;   <== a = a * b
		 *  a /= b;   <== a = a / b
		 *  a &= b;   <== a = a & b
		 *  a |= b;   <== a = a | b
		 *  a <<= b;  <== a = a << b            	
		 */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		// 기본형 자료형인 경우 변수의 값을 넣지 않을 경우 기본값으로 0이 할당
		// 참조자료 형일 경울 변수의 값을 할당 하지 않을 경우 기본값으로 NULL 할당 
		// 축양 표현 
		int value2;     
		value2 = 5;		
		System.out.println(value2 +=2);   // value2 = value2 + 2
		System.out.println(value2 -=2);   // 위에서 value +=2 로 인해 value2=7 
		System.out.println(value2 /= 2);
		
		value2 = 5;
		System.out.println(value2 %= 2);
		
		value2 = 5;
		System.out.println(value2 |= 2); 
		value2 = 5;
		System.out.println(value2 &= 2);
		System.out.println();
		
		value2 = 5;
		System.out.println(value2 <<= 2);
		value2 = 5;
		System.out.println(value2 >>= 2);
		value2 = 5;
		System.out.println(value2 >>>= 2);
		
		byte value3;
		value3 = -128;  System.out.println(value3 >>>= 2);
				
		

	}

}
