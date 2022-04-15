package fruit_EX;

import java.util.ArrayList;
import java.util.Scanner;

// 		상속을 다루는 문제





class Fruit{
	String fruitname ; 
	String color ;
	int large ;
	
	@Override
	public String toString() {
		return "과일의 이름은  <" + fruitname + ">이고 , 색깔은 <" + color + ">이고, 크기는 <" + large + "> 입니다";
	}
	
	Fruit(String a , String b ,int c){
		fruitname = a;
		color = b;
		large =c;
	}
}

class Apple extends Fruit{
	Apple (String a , String b ,int c){
		super(a,b,c);
	}
}

class Orange extends Fruit{
	Orange(String a , String b ,int c){
		super(a,b,c);
	}
}

class Banana extends Fruit{
	Banana(String a , String b ,int c){
		super(a,b,c);
	}
}




public class Fruit_Test {

	public static void main(String[] args) {
		
		ArrayList<Fruit> fruitlist = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("  1.사과 | 2.오렌지 | 3.바나나 | 4. 출력 | 5. 종료");
			System.out.println("=============================================");		
			System.out.print("선택 >>");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("과일명 : ");
				String name = sc.next();
				
				System.out.print("색깔 : ");
				String color = sc.next();
				
				System.out.print("크기 : ");
				int large = sc.nextInt();
				
				Apple a = new Apple(name , color , large);
				fruitlist.add(a);
				
			}else if(num ==2) {
				System.out.print("과일명 : ");
				String name = sc.next();
				
				System.out.print("색깔 : ");
				String color = sc.next();
				
				System.out.print("크기 : ");
				int large = sc.nextInt();
				
				Orange o = new Orange(name , color , large);
				fruitlist.add(o);
				
			}else if(num ==3) {
				System.out.print("과일명 : ");
				String name = sc.next();
				
				System.out.print("색깔 : ");
				String color = sc.next();
				
				System.out.print("크기 : ");
				int large = sc.nextInt();
				
				Banana b = new Banana(name , color , large);
				fruitlist.add(b);
				
			}else if(num == 4) {
				for(Fruit k : fruitlist) {
					System.out.println(k);
				}
				
			}else if(num ==5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
		
	
		
		
		
		
		
		
		

	}

}
