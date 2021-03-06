package chap05;

public class ReadArrayData_2D_Ex09 {

	public static void main(String[] args) {
		
		// 1.  2차원 배열의 데이터의 길이 
		int [] [] array1 = new int [2][3];
		System.out.println(array1.length);     // 2차원 배열인 경우 :  .length가 행의 갯수를 출력
		System.out.println(array1[0].length);    // 행 번호를 지정했을 경우 행의 열의갯수를 출력     
		System.out.println(array1[1].length);
		
		int [] array11 = new int [10];
		System.out.println(array11.length);    // 1차원 배열인 경우 :  .length가 열의 갯수를 출력
		System.out.println("=====================================");
		
		// 2차원 배열 출력 방법 1 
		int [] [] array2 = new int [][] { {1,2} , {3,4,5} };
		System.out.println(array2.length);            // 행의갯수
		System.out.println(array2[0].length);         // 0번행의 열의갯수
		System.out.println(array2[1].length);         // 1번행의 열의갯수
		System.out.println("=======================");
		
		// 배열의 index 번호로 출력하는 방법
		System.out.print(array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.print(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println();
		
		
		
		System.out.println("===========이중 for 문 =================");
		
		// 이중 for 문을 사용해서 출력 하는 방법
		
		for(int i = 0 ; i < array2.length ; i++) {            //바깥쪽 for문 : 행 을 루프 돌린다
			for(int j = 0 ;  j < array2[i].length ; j++) {    // 안쪽 for문 : 열 을 루프 돌린다 
				System.out.print(array2[i][j] + " " );
			}
			System.out.println();
		}
		
		System.out.println("==========이중 향상된 for문===============");
		
		// 이중 향상된 for문
		for (int[] array :array2 ) {          // 2처원 배열의 행의 값을  1차원 배열 변수에 담고 (array) 
			for (int k : array) {             // 배열의 값을 변수에 담아서 출력 
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
