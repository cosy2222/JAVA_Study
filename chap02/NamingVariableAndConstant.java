package chap02;

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		//������
		boolean aBcD;   //�������� ù�ڴ� �ҹ��ڷ� ����, �ܾ ������ ��� ù�ܿ��� �빮�ڷ�
		byte �����ٶ�;   // �������� �ѱ��� ���� �� �ִ�. (�������� ����)
		short _abcd;    //����� Ư������ _ ���
		char $ab_cd;    // ������ $, _ ����� �� �ִ�
		// char ab cd;     // �����̳� �ٸ� Ư�����ڴ� ���� �� ����.
		long abcd3;      //������ ���ڸ� ���� �� �ִ�. �� ù���� �ܾ ���ڰ� ���� �����߻�
	//	long 3abcd;      ù���ڿ� ���ڿ��� �����߻�
		double main;  
	//	double class;    // �ڹٿ��� ����ϴ� �������� ���������� ��� �� �� ����
		int ABCD;       // �������� �빮�ڷ� ��밡�� (�������� ����), ����� ������� ��ü �빮�ڷ� ���
		
		// ��� : ���� ���� �� �� ����.  final Ű���带 ��� �Ѵ� , �빮�ڸ� ���.
		final double FI;
		final int MY_DATA;
		final float my_data;   // �������� ����
		
		FI = 3.141957;
		System.out.println(FI);
		
		// FI = 134.4567;   ������� ���� ���Ҵ� �� �� ����.
		abcd3 = 1234L;    //���� ������ Ÿ�� long ������ ���� �Ҵ� �ҋ� ��,L�� ����� ��� �Ѵ�
		
		System.out.println(abcd3);
		abcd3 = 56789l;   //������ ���� ���Ҵ�
		System.out.println(abcd3);
		
		aBcD = true;       // boolean�� true, false �� ������ �ִ�
		
		�����ٶ� = 127;       // byte : 1byte ( -128 ~  127 )
		System.out.println(�����ٶ�);
		
		// �����ٶ� = 128;
	}

}
