package chap10.Ex07.Ex01;

class Aa{
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}

class Bb{
	int a = 5;
	int b = 6;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}

class Cc{
	int a = 7;
	int b = 8;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}


public class Object_Type {

	public static void main(String[] args) {
		// �ڹ��� ��� ��ü�� ObjectŸ������ ����ȯ ����
		Object aa = new Aa();
		Object bb = new Bb();
		Object cc = new Cc();
		
		// Object �迭�� ��ü ����
		Object [] arr1 = { aa , bb , cc };
		for(int i = 0 ; i < arr1.length ; i ++) {
			System.out.println(arr1[i].toString());  // Object �� toString�� ȣ�� �� ��� 
													 // �������̵� �Ǿ��ֱ� ������ �ڽ��� toString �޼ҵ� ȣ��
		}
		
		System.out.println("==========================");
		
		for(Object k : arr1) {
			System.out.println(k);       // ��ü ��ü�� ����� ��� toString() �� ���
		}
		
	}

}
