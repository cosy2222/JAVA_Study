package practice;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		String course[] = { "Java" , "C++" , "HTML5" , "컴퓨터구조" , "안드로이드"};
		int score[]  = {95, 88 ,76 , 62, 55};
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
	    String name;
POS1:	    while(true) {
	    	name = scan.next();
	    	for(i = 0; i < course.length; i++) {
	    		if (course[i].equals(name)) {
	    			System.out.println("귀하의 " + name + " 점수는 " + score[i] +"점입니다.");
	    			continue POS1;
	    		}
	    	}
	    	if(name.equals("그만")){
	    		System.out.println("입력을 종료합니다.");
	    		break;
	    	}else{
	    		System.out.println("'" + name + "'" + "은(는) 식별 불가능한 과목명입니다. 대소문자를 구분하여 올바른 과목명을 입력하세요.");
	    	}
	    	
	    }
	}



		
	}


