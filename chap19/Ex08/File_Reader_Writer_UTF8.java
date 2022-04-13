package chap19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
	Reader / Writer  : char ���� �����	, ���ڸ� ó��
		// byte : 1byte
		// char : 2byte , UTF-16 (�����ڵ�)�� ó�� ,  ���� 2byte , �ѱ۵�2byte , �������� , ������ ���� ó�� 
		  
		FileReader : charSet ���� �ɼ��� ����  , default charset ���
		FIleWriter : charSet ���� �ɼ��� ����  , default charset ���
		 
	
*/

public class File_Reader_Writer_UTF8 {

	public static void main(String[] args) {
		
		//1. ���ϰ�ü ����
		File rwfile = new File ("src\\chap19\\Ex08\\rwfile.txt");
		
		try (Writer writer = new FileWriter(rwfile);){  // Writer : �߻�Ŭ���� , FileWriter : Writer �� ������ �ڽ�Ŭ����
			// OutputStream : byte ���� ��� , �߻�Ŭ���� , FileOutputStream   ,  ����,������,MP3,AVG .... ���ó�� 
			// Writer       : char ���� ��� , �߻�Ŭ���� , FileWriter  ,   ����Ưȭ�ؼ� ó��
			
			writer.write("�ȳ��ϼ���\n".toCharArray());  // String ==> char�迭�� ����
			writer.write("hello");   //String
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("�ݰ����ϴ�" , 2, 3);
			writer.flush();
			
		} catch (IOException e) {}
		
		
		// 2.FileReader�� �̿��� ���� �б� (Default MS949)   <=== charactorSet ���� �ɼ��� ���� 
		
		try (Reader reader = new FileReader(rwfile);){
			
			int data;
			while((data=reader.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) {}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
