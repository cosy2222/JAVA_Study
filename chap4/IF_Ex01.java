package chap4;

public class IF_Ex01 {

	public static void main(String[] args) {
		
		// If�� :
		/*
		 *  if (����) {
		 *    ������ ���ϋ� ����� �ڵ� ;
		 *  }  
		 */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("����1 : ������ ���ϋ� ����");
		}
		
		/*
		 * if (����) {
		 *        ������ ���ϋ� ������ ���� ; 
		 *  }
		 * else {
		 *    ������ �����ϋ� ������ ���� ;
		 *  }
		 */
		
		boolean bol1 = true;
		boolean bol2 = false;
		
		if (bol1) {
			System.out.println("����2");
		}
		else {
			System.out.println("����3");
		}
		
		if (bol2) {
			System.out.println("����4");
		}
		else {
			System.out.println("����5");
		}
		System.out.println("======================");
		
		System.out.println( (bol1) ? "����6" : "����7");
		System.out.println( (bol2) ? "����8" : "����9");
		
		
		/*
		 * if�� ������ ���� ���ϋ� ?
		 * 
		 * if (����1) {
		 *  	����1�� ���ϋ� ���� �ڵ� ;
		 * }
		 * else if (����2) {
		 * 		����2�� ���ϋ� ���� �ڵ� ;
		 * }
		 * else if (����3) {
		 * 		���� 3�� ���ϋ� �����ڵ�; 
		 * } 
		 * else {
		 *		��� ������ �����ϋ� �����ڵ� ;
		 * }  
		 */
		
		int value3 = 85;
		
		if (value3 >= 90) {
			System.out.println("A ����, ���� :" + value3);
		}
		else if (value3 >= 80) {
			System.out.println("B ����, ���� : " + value3);
		}
		else if (value3 >= 70 ) {
			System.out.println("C ����, ���� : " + value3);
		}
		else {
			System.out.println("F ����, ���� :" + value3);
		}
		System.out.println();
		
		
		/*
		 * IF ������ ������ ������ �ٲ�� ���� ���
		 */
		
		if (value3 >= 90) {
			System.out.println("A ����, ���� :" + value3);
		}
		else if (value3 >= 70 ) {
			System.out.println("C ����, ���� : " + value3);      // �����Ŀ� if ���� ���� ���´�
		}
		else if (value3 >= 80) {
			System.out.println("B ����, ���� : " + value3);
		}
		else {
			System.out.println("F ����, ���� :" + value3);
		}
		System.out.println();
		
		/*
		 * ������ �ο� �ҋ� ���� �ϰ� ����
		 * 
		 */
		value3 = 85;
		if ( value3 <=100 && value3 >= 90) {
			System.out.println(" A ���� �Դϴ�");
		}
		else if ( value3 <80 && value3 >=70) {
			System.out.println(" C ���� �Դϴ�");
		}
		else if ( value3 <90 && value3 >=80) {
			System.out.println(" B ���� �Դϴ�");
		}
		else {
			System.out.println(" F ���� �Դϴ�");
		}
		System.out.println("============================");
		/*
		 * if ������ ���๮�� �ϳ��ϋ� �� {}�� ���� �� �� �ִ� 
		 */
		
		if ( 3 < 5 )
			System.out.println("�ȳ��ϼ���");    // if���� {} �� ������ ���
		System.out.println("============================");
		
		if ( 3 > 5 )
			System.out.println("�ȳ��ϼ��� 2");
		    System.out.println(" �ݰ����ϴ�.");
		
		
		
		

	}

}
