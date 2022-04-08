package chap14.Ex01;

public class ArrayException_1 {

	public static void main(String[] args) {
		
		int [] arr = new int [5];  // arr 배열에 방 갯수 5개 생성
		
		try {
			
		for (int i = 0 ; i <=4 ; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();  // 예외에 대한 정보를 출력
			System.out.println("5번방은 없습니다");
		}finally {
			System.out.println("finally 는 반드시 출력");
		}
		System.out.println("프로그램 종료 ");
		
		
		

	}

}
