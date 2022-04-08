package Ex;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex_11 {

	public static void main(String[] args) {
		
		String course[] = { "Java" , "C++" , "HTML5" , "컴퓨터구조" , "안드로이드"};
		int score[]  = {95, 88 ,76 , 62, 55};
		
		
		String name ;
		Scanner sca = new Scanner(System.in);
		String stop = "그만";
		
		while(true) {
			System.out.println( "과목 이름 >> ");
			name = sca.next();
			
			if(name.equals(stop)) {
				break;
			}
			
			for(int i = 0 ; i < course.length ; i++) {
				
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println( name + " 의 점수는 " + n);
					break;
					
				}
				if (i == 4){
					System.out.println("없는 과목 입니다");
				
				}
				
			}
			
			
			
		}
		
		
		sca.close();
		

   }
}