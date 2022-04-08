package chap05;

public class InirialValue_03 {

	public static void main(String[] args) {
		
		//1. 모메리의 초기값
		int value1;           //기본 자료형에 초기값을 할당하지 않았을떄
		//System.out.println(value1);
		int[] value2;         // 배열 : 참조 자료형
		//System.out.println(value2);
		
		int value3 = 0;       // 기본 자료형에 0값으로 초기값을 할당 
		System.out.println(value3);
		int [] value4 = null;     // 참조 자료형은 기봇 초기값으로 null : 알 수 없는 ,  비어있는 상태
		System.out.println(value4);
		
		
		// 2. Heap 메모리의 초기값 ( 강제 초기화) , Heap에는 참조 자료형의 값이 할당 
		// 기본 자료형 배열 일 경우?
		     // boolean: false  ,  int : 0   , double : 0.0
		
		boolean [] array1 = new boolean[3];            // boolean 은  false 가 기본값
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		System.out.println("================================");
		
		for (int i = 0 ; i<3 ; i++){
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();	
		System.out.println("객체의 메모리 주소 : " + array1);
		System.out.println("객체의 방의 갯수 를 출력 : " + array1.length);
		System.out.println("=======for 문 : array1.length ===========");
		
		for (int i = 0 ; i < array1.length ; i++) {
			System.out.println("array[" + i + "] 번쨰 방의 값은 : " + array1[i] );
		}
		System.out.println("==============================================");
		
		
		int [] array2 = new int[3];       // int는 0 이 기본값
		for(int i = 0 ; i < array2.length ; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		System.out.println("===========================================");
		
		double [] array3 = new double[3];       // double 는 0.0 이 기본값
		for( int i=0 ; i < array3.length ; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println();
		System.out.println("=================================");
		
		
		// 참조형 자료형 배열 일 경우는 기본 값으로  null 이 할당 
		String[] array4 = new String[3];          //null
		for( int i = 0 ; i < array4.length ; i++) {
			System.out.print( array4[i] + " ");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
