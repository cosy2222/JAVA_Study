package practice;

public class Practice02 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int[] array1 = new int[3];
		for (int d = 0 ; d <3 ; d++) {
			switch(d) {
			case 0:
				a = d;
			case 1:
				b = d;
			case 2:
				c = d;
			}
			
		}
		array1[0] = a;
		array1[1] = b;
		array1[2] = c;
		System.out.println(array1[0] + " "+ array1[1] + " " + array1[2]);

	}

}
