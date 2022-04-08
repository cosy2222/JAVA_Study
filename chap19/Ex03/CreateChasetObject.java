package chap19.Ex03;

import java.nio.charset.Charset;  // Charset Ŭ����

public class CreateChasetObject {

	public static void main(String[] args) {
		
		// ���� ���ڵ� ������ �����ϴ� ���  
		//1. Charset.defaultCharset()  <== �ý����� �⺻������ �ε� (���ڵ� Ÿ��)
		
		Charset cs1 = Charset.defaultCharset(); // ���� �޼ҵ� , �ý����� �⺻ ������ charset�� �ε�
		
		System.out.println(cs1); 	//MS949 --> x-windwos949 (MS949�� Ȯ��)
									// UTF-8
		
		//2. Charset.forName("MS949")  <== �����Ҵ��ؼ� ���
		Charset cs2 = Charset.forName("MS949");
		System.out.println(cs2);

	}

}
