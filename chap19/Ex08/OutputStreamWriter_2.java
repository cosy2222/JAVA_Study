package chap19.Ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
	Reader / Writer : �߻�Ŭ���� , char�� ó�� , ���� O , �̹��� X , MP3 X
	FileReader / FileWriter : �ϼ��� Ŭ���� , Default charset �� ���
	InputStreamReader / InputStreamWriter : ������ ���ڵ�  �����ؼ� �б� , ���⵵ ���ڵ� �����ؼ� ���� 
	
	System.in : �ֿܼ��� �Է� ,  System.out : �ֿܼ� ���  <== Application���� �ѹ� close()�Ǹ� ���� �Ұ�
	
	
*/
public class OutputStreamWriter_2 {

	public static void main(String[] args) {
		
		// 1.  �ܼ� ��� (Default : MS949)
		
		try {
			OutputStreamWriter writer = new OutputStreamWriter(System.out , "MS949");
			
			writer.write("OutputStreamWriter ���� �����Դϴ�. \n".toCharArray());    // String�� char�迭�� ���� 
			writer.write("�ѱ۰� ������ ��� ����");  // String
			writer.write('\n');
			writer.write("Good bye !!!! \n\n");
			writer.flush();
			
		} catch (Exception e) {}
		
		System.out.println("========================= ");
		
		// 2. �ܼ�ó�� ( Default : MS949 ==> UTF-8 )
		
		try {
			OutputStreamWriter writer = new OutputStreamWriter(System.out , "UTF-8");
			
			writer.write("OutputStreamWriter ���� �����Դϴ�. \n".toCharArray());    // String�� char�迭�� ���� 
			writer.write("�ѱ۰� ������ ��� ����");  // String
			writer.write('\n');
			writer.write("Good bye !!!! \n\n");
			writer.flush();
			
		} catch (Exception e) {}
		
		
		
		
		
		
		
		

	}

}
