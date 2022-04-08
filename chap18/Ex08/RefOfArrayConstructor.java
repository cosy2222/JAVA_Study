package chap18.Ex08;

interface A{
	int [] abc (int len);
}

public class RefOfArrayConstructor {

	public static void main(String[] args) {
		
		A a1 = new A() {			// 배열선언    
			@Override
			public int[] abc(int len) {			// 정수로 len 값을 받아서
				return new int [len];			// 정수를 받아서 배열의 방의 크기를 리턴돌려줌
			}
		};
		
		// 람다식
		A a2 = (int len) -> {return new int [len];};
		
		
		// 배열의 생성자 참조 표현식
		A a3 = int [] :: new;
		
		//배열 선언 구문 
		// int [] array1 = new int [3];
		
		int [] array = a1.abc(3);
		System.out.println(array.length);

	}

}
