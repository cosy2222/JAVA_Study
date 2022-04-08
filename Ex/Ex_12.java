package Ex;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		
		String str[] = {"가위", "바위" , "보"};
		
		
		Scanner sca = new Scanner(System.in);
		String stop = "그만";
		
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			String name = sca.next();
			
			if(name.equals(stop)) {
				break;
			}
			
			for(int i =0 ; i < str.length ; i++) {
				if(str[i].equals(name)) {
					System.out.print("사용자 = " + name + " , ");
				}
				
			}
				switch(n) {
					case 0:
						if(str[0].equals("가위")) {
							System.out.print("컴퓨터 = " + "가위");
						if(str[n].equals(name)) {
							System.out.println("  비겼습니다");
						}
						if(name.equals("바위")) {
							System.out.println(" 이겼습니다");
						}
						if(name.equals("보")) {
							System.out.println("  패배 했습니다");
						}
							break;
						}
					case 1:
						if(str[1].equals("바위")) {
							System.out.print("컴퓨터 = " + "바위");
						}
						if(str[n].equals(name)) {
							System.out.println("  비겼습니다");
						}
						if(name.equals("보")) {
							System.out.println(" 이겼습니다");
						}
						if(name.equals("가위")) {
							System.out.println("  패배 했습니다");
						}
							break;
						
					case 2:
						if(str[2].equals("보")) {
							System.out.print("컴퓨터 = " + "보");
						}
						if(str[n].equals(name)) {
							System.out.println("  비겼습니다");
						}
						if(name.equals("가위")) {
							System.out.println(" 이겼습니다");
						}
						if(name.equals("바위")) {
							System.out.println("  패배 했습니다");
						}
							
							break;
				
				}
				
			}
				
				
						
					
		
		
		
		
		}

		
		
		
		
		
		
		
	}


