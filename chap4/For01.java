package chap4;

public class For01 {

	public static void main(String[] args) {
		
		double a = 0;
		int s = 0;
		for (int d = 1 ; d <=1000 ; d++) {
			if(d % 4 == 0) {
				a += d;
				s++;
				
			}
		}
		System.out.println("ÇÕÀº : " + a);
		System.out.println("Æò±ÕÀº : " + a / s);
		
		
	}

}
