package chap4;

public class Break_Ex04 {

	public static void main(String[] args) {
		// 1 . ���� loop �� ����� ������ break 
		for(int i = 0 ; i <10 ; i++) {
			break ;      // break �� ������ �ش� ������ ���� ���´�.
		} // 0
		System.out.println();
		
		// 2 . for�� ������ if ������ ����ҋ� break�־ �ش� ������ ���� ���´�.
		
		for ( int i = 0 ; i <10 ; i++) {
			if(i ==5) {
				break;          // i �� 5�ϋ� for���� ���� ���´� 
			}
			System.out.print( i + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		// 3 . ���� loop ���ϋ� break (�ϳ��� �ݺ����� ���� ���´�.) 
		
		for(int i = 0 ; i <5 ; i++) {
			for( int j= 0 ; j <5 ; j++ ) {
				if( i == 2) {
					break;
				}
				System.out.println(i + " , " + j);
				
			}
		}
		System.out.println("=================");

		// 4 . ���� Loop (�ݺ���) ���� �Ѳ����� Ż��  << 1, ���̸��� �̿��ؼ� Ż��  
		
POS1:	for( int i = 0 ; i < 5 ; i++) {
			for( int j = 0 ; j < 5 ; j++) {
				if( i == 2) {
					break POS1;
				}
				System.out.println( i + " , " + j);
			}
				
		}
		System.out.println("======================");

		// 4 .���� Loop (�ݺ���) ���� �Ѳ����� Ż�� << 2, ������ ������ false �� ���� ��������
		for ( int i = 0 ; i <5 ;i ++) {
			for( int j = 0 ; j < 5 ; j++) {
				if(i == 2) {
					i = 100;
					break;
				}
				System.out.println( i + " , " + j);
			}
		}
		
		
		
		
		
		
		
		

	}

}
