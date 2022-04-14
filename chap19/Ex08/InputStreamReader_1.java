package chap19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader : byte �����͸� char �������� ��ȯ�ϴ� ��ü 
		//byte ������ ���ڵ��� �� �����ؾ� �Ѵ�
		// char �������� �ٲٸ� ���ڵ� Ÿ���� �Ű澵 �ʿ䰡 ����
		// ������ 1 . FileReader : default charset�� ��밡���Ͽ��� , ���� default charset MS949 ������ �ܺ� ������ UTF-8�� �о�� ���
		// ������ 2. ��Ʈ��ũ���� ���۵Ǵ� ��Ʈ���� UTF-8 , MS949 byte => char�� ��ȯ�ؼ� ó��


public class InputStreamReader_1 {

	public static void main(String[] args) {
		
		// 1. ���� ��ü ����
		File isr = new File("src\\chap19\\Ex08\\isr.txt");  // isr.txt �� UTF-8�� ����Ǿ��ִ�
		
		try (Reader reader = new FileReader(isr);){		// FileReader�� ���ڵ� ������ �ȵ� default ���ڵ��� ��� 
			
			int data;
			
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) { }
		
		
		// 2. FileInputStream + InputStreamReader �� �̿��� �����б�
		try(InputStream is = new FileInputStream(isr);
			InputStreamReader isr1 = new InputStreamReader(is , "UTF-8")	) { // isr1 : char��ȯ�� 
			
			int data;
			while((data = isr1.read()) != -1) {
				System.out.print((char)data);
			}
			
			System.out.println();
			System.out.println(isr1.getEncoding());
		} catch (Exception e) {
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
