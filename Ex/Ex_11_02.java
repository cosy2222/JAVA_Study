package Ex;

import java.util.Scanner;

public class Ex_11_02 {

	public static void main(String[] args) {
		String course[] = { "Java" , "C++" , "HTML5" , "��ǻ�ͱ���" , "�ȵ���̵�"};
		int score[]  = {95, 88 ,76 , 62, 55};
		Scanner sca = new Scanner(System.in);
		
		String name =null;
		int i = 0;
		
		while(true) {
			System.out.print("���� �̸� >>>");
			name = sca.next();
			
			if (name.equals("�׸�")) {
				break;
			}
			
			for ( i = 0 ; i <course.length ; i++) {
				if ( course[i].equals(name)) {
					System.out.println(course[i] + " �� ������ :" + score[i]);
					break;
				}
				if(i == course.length -1) {           
					System.out.println("���� ���� �Դϴ�");
				}
			}
			
		}
		
		sca.close();
		System.out.println("���α׷��� ���� �մϴ�.");

	}

}
