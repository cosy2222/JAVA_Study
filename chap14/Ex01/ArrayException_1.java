package chap14.Ex01;

public class ArrayException_1 {

	public static void main(String[] args) {
		
		int [] arr = new int [5];  // arr �迭�� �� ���� 5�� ����
		
		try {
			
		for (int i = 0 ; i <=4 ; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();  // ���ܿ� ���� ������ ���
			System.out.println("5������ �����ϴ�");
		}finally {
			System.out.println("finally �� �ݵ�� ���");
		}
		System.out.println("���α׷� ���� ");
		
		
		

	}

}
