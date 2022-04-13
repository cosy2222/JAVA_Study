package chap19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

// InputstreamReader : byte ==> char   , charset �����ؼ� ������ �о�� �� �ִ� 
// OutputStreamWriter : byte ==> char  , charSet �����ؼ� ������ ������ �� �ִ� 

public class OutputStreamWriter_1 {

	public static void main(String[] args) {
		
		//1. FileWriter�� ���ؼ� ������ ���� ( default , MS949 )
		File osw1 = new File ("src\\chap19\\Ex08\\osw1.txt");   // MS949
		File osw2 = new File ("src\\chap19\\Ex08\\osw2.txt");	// UTF8
		
		try(Writer writer = new FileWriter(osw1); ){
			
			writer.write("OutputStreamWriter ���� �����Դϴ�. \n".toCharArray());    // String�� char�迭�� ���� 
			writer.write("�ѱ۰� ������ ��� ����");  // String
			writer.write('\n');
			writer.write("Good bye !!!! \n\n");
			writer.flush();
			
		} catch (IOException e) {}
			
		//2. FileWriter�� ����ؼ� ( default : MS949 === > UTF-8 ���� ���� )
		
		try(OutputStream os = new FileOutputStream(osw2);
			OutputStreamWriter osw = new OutputStreamWriter(os , "UTF-8"); ){
			
			osw.write("OutputStreamWriter ���� �����Դϴ�. \n".toCharArray());    // String�� char�迭�� ���� 
			osw.write("�ѱ۰� ������ ��� ����");  // String
			osw.write('\n');
			osw.write("Good bye !!!! \n\n");
			osw.flush();
			
		} catch (IOException e) {}
			
			
			
		

	}

}
