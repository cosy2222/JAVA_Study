package chap18.Ex08;

interface A{
	int [] abc (int len);
}

public class RefOfArrayConstructor {

	public static void main(String[] args) {
		
		A a1 = new A() {			// �迭����    
			@Override
			public int[] abc(int len) {			// ������ len ���� �޾Ƽ�
				return new int [len];			// ������ �޾Ƽ� �迭�� ���� ũ�⸦ ���ϵ�����
			}
		};
		
		// ���ٽ�
		A a2 = (int len) -> {return new int [len];};
		
		
		// �迭�� ������ ���� ǥ����
		A a3 = int [] :: new;
		
		//�迭 ���� ���� 
		// int [] array1 = new int [3];
		
		int [] array = a1.abc(3);
		System.out.println(array.length);

	}

}
