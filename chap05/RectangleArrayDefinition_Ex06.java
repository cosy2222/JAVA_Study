package chap05;

public class RectangleArrayDefinition_Ex06 {

	public static void main(String[] args) {
		
		// 2차원 배열 선언하기 1 
		
			//2차원 배열 선언과 동시에 방갯수 할당
		int [] [] array1 = new int [3][4];     // 행의갯수 : 3   ,  열의갯수 : 4
		
			//2차원 배열 선언후 방의 갠수 할당
		int [] [] array2 ;
		array2 = new int [3][4];
		
		
		// 참조변수의 초기값 :  int:0
		System.out.println( array1[0][0] );
		System.out.println( array1 [0][1]);
		
		
		// 2차원 배열 선언하기 2
		int array3[][] = new int [3][4];      // 선언과 동시에 방크기 방지정
		int array4[][];                       // 선언 후 방크기 지정
		array4 = new int [3][4];
		
		// 2차원 배열 선언하기 3  :   잘쓰지않는 방식  알아두면 좋음
		int [] array5[] = new int [3] [4];
		int [] array6[];
		array6 = new int [3] [4];
		
		//4. 다양한 자료형의 배열 선언 (기본 자료형 배열 , 참조 자료형 배열 )
		boolean [] [] array7 = new boolean [3][4];        // false
		int [][] array8 = new int [2] [4] ;			      // 0
		double [] [] array9 = new double [3] [5] ;        // 0.0
		String [][] array10 = new String [2] [6] ;    // 참조 자료형 : null 이 기본값 
		
		
		
		
		
		
		
		
		
	}

}
