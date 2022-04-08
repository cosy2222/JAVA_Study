package chap19.Ex03;

import java.io.UnsupportedEncodingException;

// EUC-KR : �ѱ� ǥ��, �ѱ�ǥ������   ��ü�� ǥ�� �����Ѱ͸� �����Ǿ� ���� . �� 11,000�� ---> 2200�� �� ǥ��
	// ���� : 1byte
	// �ѱ� : 2byte
	// ���������� ��� �ҋ� 

// MS-949 : ����ũ�μ���Ʈ ���� ������ �ѱ� ǥ���� 11,000�� ��� ǥ�Ⱑ�� windows OS
	// ���� : 1byte
	// �ѱ� : 2byte

// UTF-8 : ��缭��  , git , Mac , linux    <���� ����>
	// ���� : 1byte
	// �ѱ� : 3byte

// UTF-16 :		<���� ����> 
    // ���� : 2byte
	// �ѱ� : 2byte

// ���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ��� , �ش� ���ڵ� Ÿ������ ������ �ؾ� �ƾ����� �ʴ´� 

// ��Ŭ�������� ���ڵ� Ÿ�� ���� 3����.
	// 1. ���� ���� :
	// 2. ������Ʈ���� ���� : 
	// 3. ���Ͽ��� ���� : 
	
	// �켱���� 		���� > ������Ʈ > ��������

public class EUCKR_VS_MS949 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		
		// EUCKR_VS_MS949 
		
		//1. �����ڸ� byte�� �������� String���� ��ȯ 
		byte [] b1 = "a".getBytes("EUC-KR"); // ���ڸ� byte�� ��ȯ ==> ��Ʈ��ũ�� ���ڸ� byte��Ʈ������ ��ȯ�ؼ� ����. 
			// ���ܰ� �߻���. UnsupportedEncodingException <== ��Ÿ�� �߻��Ұ�� ���ڵ� �Ұ� ����
		byte [] b2 = "a".getBytes("MS949");  // ���ڿ� ==> byte[]
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1, "EUC-KR"));	// byte[] ==> ���ڿ��� �ٲ� 
		System.out.println(new String(b2, "MS949"));
		
		System.out.println();
		
		
		// 2. �ѱ��� byte�� �������� String ���� ��������
		byte [] b3 = "��".getBytes("EUC-KR");
		byte [] b4 = "��".getBytes("MS949");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b3, "EUC-KR"));	// byte[] ==> ���ڿ��� �ٲ� 
		System.out.println(new String(b4, "MS949"));
		
		
		//3.	EUC-KR : ���� ��� ������ �͸� ǥ��  �� 2000��
		// 		MS949  : 11000�� ��� ǥ�� 
		byte [] b5 = "��".getBytes("EUC-KR");
		byte [] b6 = "��".getBytes("MS949");
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC-KR"));	// byte[] ==> ���ڿ��� �ٲ� 
		System.out.println(new String(b6, "MS949"));
		
		
		
		
		
		
		
		
		
		
		

	}

}
