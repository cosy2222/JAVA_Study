package chap19.Ex04;

/*
 *  ASCII �ڵ尪 ��� : 1byte = 8bit , ���� ó����Ʈ�� ��ȣ ��Ʈ   7bit�� ��밡��
 *  	1 ~ 32 ��Ʈ ������ : ����� �Ҽ����� Ư���� �ڵ尡 ���ִ�.   ��) null , ����ǽ��� , �����(7) , ����(10)
 *  	127 : delete
 *  	
 *  	���� ��� ������ 33����Ʈ ~ 126����Ʈ
 *  	���� , ���� , Ư������ 
 *  
 *  	���
 *  	=====================================
 *  	ASCII	  ����		ASCII		����
 *  	=====================================
 *  	33  	   !		  34		&
 * 
 */



public class Ascii_Code_Print {

	public static void main(String[] args) {
		
		System.out.println("=====================================");
		System.out.println("ASCII	 ����	      ASCII	 ����");
		System.out.println("=====================================");
		
		for(int i = 33 ; i < 127 ; i++) {
			if( i %2 != 0) {
				System.out.print(i + "        " + (char)i + "            ");
			}
			if( i %2 ==0) {
				System.out.println(i + "       " + (char)i);
			}
		}
	}

}
