package Ex;

public class Ex_10_01 {

	public static void main(String[] args) {
		int a, b;
		
		for (int i = 1 ; i < 100 ; i++) {
			a = i/10;         // ½ÊÀÇÀÚ¸®
			b = i%10;         // ÀÏÀÇÀÚ¸®
			if( (a == 3 || a==6 || a==9) && (b == 3 || b == 6 || b ==9)) {
				System.out.println( i + " ¹Ú¼ö Â¦Â¦");
			}
			else if(b==3 || b == 6 || b ==9) {
				System.out.println(i + "¹Ú¼ö Â¦");
			}
			else if((a==3 || a == 6 || a==9) && (b !=3 || b!=6 || b!=9)) {
				System.out.println(i + "¹Ú¼ö Â¦");
			}
				
			
		}

	}

}
