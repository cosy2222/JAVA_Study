package Ex;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		
		String str[] = {"����", "����" , "��"};
		
		
		Scanner sca = new Scanner(System.in);
		String stop = "�׸�";
		
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			String name = sca.next();
			
			if(name.equals(stop)) {
				break;
			}
			
			for(int i =0 ; i < str.length ; i++) {
				if(str[i].equals(name)) {
					System.out.print("����� = " + name + " , ");
				}
				
			}
				switch(n) {
					case 0:
						if(str[0].equals("����")) {
							System.out.print("��ǻ�� = " + "����");
						if(str[n].equals(name)) {
							System.out.println("  �����ϴ�");
						}
						if(name.equals("����")) {
							System.out.println(" �̰���ϴ�");
						}
						if(name.equals("��")) {
							System.out.println("  �й� �߽��ϴ�");
						}
							break;
						}
					case 1:
						if(str[1].equals("����")) {
							System.out.print("��ǻ�� = " + "����");
						}
						if(str[n].equals(name)) {
							System.out.println("  �����ϴ�");
						}
						if(name.equals("��")) {
							System.out.println(" �̰���ϴ�");
						}
						if(name.equals("����")) {
							System.out.println("  �й� �߽��ϴ�");
						}
							break;
						
					case 2:
						if(str[2].equals("��")) {
							System.out.print("��ǻ�� = " + "��");
						}
						if(str[n].equals(name)) {
							System.out.println("  �����ϴ�");
						}
						if(name.equals("����")) {
							System.out.println(" �̰���ϴ�");
						}
						if(name.equals("����")) {
							System.out.println("  �й� �߽��ϴ�");
						}
							
							break;
				
				}
				
			}
				
				
						
					
		
		
		
		
		}

		
		
		
		
		
		
		
	}


