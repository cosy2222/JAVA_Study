package Ex;

public class Ex_09 {

	public static void main(String[] args) {
		
		int [] array = new int [10];
		
		int value = 0;
		
		for( int j = 0 ; j < array.length ; j++ ) {
			int i = (int)(Math.random()*10+1 );
			array[j] = i ;
			value += array[j];
		}
		
		System.out.print("������ ������ : ");
		for(int k : array) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		System.out.println("���� " + (double)value/array.length);
		
		
		

	}

}
