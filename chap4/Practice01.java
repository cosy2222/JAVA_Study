package chap4;

public class Practice01 {

	public static void main(String[] args) {
	
	// 문제 1
		int result1;
     	for(int i = 1 ; i<20 ; i++) {
			for(int j = 1 ; j<20 ; j++) {
				if(i %2 ==0) {
					continue ;
				}
				result1 = i * j;
				System.out.println(i + "*" + j + "=" + result1);
			}
			System.out.println("========================");
		}

     System.out.println( "==========<문제 2>================");
	
     
     	// 문제 2
     	int result2;
        for(int i = 1 ; i<20 ; i++) {
     		for( int j = 1; j<20 ; j++) {
     			if(i %3 == 1 ^ i %3 ==2 ) {
     				continue ;
     			}
     			result2= i*j;
     			System.out.println(i + "*" + j + "=" + result2);
     		}
     		System.out.println("==================================");
     	}
		

	

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     


	}

}
