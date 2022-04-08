package Ex;

public class Ex_06_01 {

	public static void main(String[] args) {
		// 최소값 구하기
		int [] array = {4,5,1,2,3};
		int max = 0;
		int min = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if(max < array[i]) {
				max = array[i];
				min = max;
			}
			for(int j = 0 ; j < array.length ; j++) {
				if(min > array[i]) {
					min = array[i];
				}
			}
		}
		System.out.println(min);
		
	}

}
