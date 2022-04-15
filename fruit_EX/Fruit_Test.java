package fruit_EX;

import java.util.ArrayList;
import java.util.Scanner;

// 		����� �ٷ�� ����





class Fruit{
	String fruitname ; 
	String color ;
	int large ;
	
	@Override
	public String toString() {
		return "������ �̸���  <" + fruitname + ">�̰� , ������ <" + color + ">�̰�, ũ��� <" + large + "> �Դϴ�";
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
			System.out.println("  1.��� | 2.������ | 3.�ٳ��� | 4. ��� | 5. ����");
			System.out.println("=============================================");		
			System.out.print("���� >>");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("���ϸ� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				String color = sc.next();
				
				System.out.print("ũ�� : ");
				int large = sc.nextInt();
				
				Apple a = new Apple(name , color , large);
				fruitlist.add(a);
				
			}else if(num ==2) {
				System.out.print("���ϸ� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				String color = sc.next();
				
				System.out.print("ũ�� : ");
				int large = sc.nextInt();
				
				Orange o = new Orange(name , color , large);
				fruitlist.add(o);
				
			}else if(num ==3) {
				System.out.print("���ϸ� : ");
				String name = sc.next();
				
				System.out.print("���� : ");
				String color = sc.next();
				
				System.out.print("ũ�� : ");
				int large = sc.nextInt();
				
				Banana b = new Banana(name , color , large);
				fruitlist.add(b);
				
			}else if(num == 4) {
				for(Fruit k : fruitlist) {
					System.out.println(k);
				}
				
			}else if(num ==5) {
				System.out.println("���α׷� ����");
				break;
			}
			
		}
		
		
		
	
		
		
		
		
		
		
		

	}

}
