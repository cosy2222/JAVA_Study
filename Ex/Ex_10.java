package Ex;

public class Ex_10 {

	public static void main(String[] args) {
		
		for( int j = 0; j < 100 ; j++) {
			if ( (j %10 == 3 || j %10 ==6 || j %10 ==9) && ( j/10==3 || j/10==6 || j/10==9 ) ) {
				System.out.println( j + " ¹Ú¼ö Â¦Â¦");
			}
			
			else if ( j %10 ==3 || j%10==6 || j%10==9 && ( j/10 !=3 || j/10 !=6 || j/10 !=9 ) ) {
				System.out.println( j + "¹Ú¼ö Â¦");
			}
			else if ( j/10 == 3 || j/10 ==6 || j/10==9) {
				System.out.println(j + "¹Ú¼ö Â¦");
			}
		}
		
		
		
			
			
				
	}
		
				
				

	

}
