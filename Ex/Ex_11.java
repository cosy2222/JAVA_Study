package Ex;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex_11 {

	public static void main(String[] args) {
		
		String course[] = { "Java" , "C++" , "HTML5" , "��ǻ�ͱ���" , "�ȵ���̵�"};
		int score[]  = {95, 88 ,76 , 62, 55};
		
		
		String name ;
		Scanner sca = new Scanner(System.in);
		String stop = "�׸�";
		
		while(true) {
			System.out.println( "���� �̸� >> ");
			name = sca.next();
			
			if(name.equals(stop)) {
				break;
			}
			
			for(int i = 0 ; i < course.length ; i++) {
				
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println( name + " �� ������ " + n);
					break;
					
				}
				if (i == 4){
					System.out.println("���� ���� �Դϴ�");
				
				}
				
			}
			
			
			
		}
		
		
		sca.close();
		

   }
}