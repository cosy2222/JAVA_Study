package chap19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/*
	1. �ֿܼ��� �ѱ��� �о 
		C:\Temp\a\aaa.txt  (MS949)
		C:\Temp\b\bbb.txt  (UTF-8)
		���Ͽ� ������ 
		
	
	2. �� ���Ͽ��� ���� ������ �ֿܼ� �������� ��� �ϼ���


 */


public class EX_Reader_Writer {

	public static void main(String[] args) {
		
		File a = new File("C:\\Temp\\a");
		File b = new File("C:\\Temp\\b");
		a.mkdir();
		b.mkdir();
		
		File f1 = new File("C:\\Temp\\a\\aaa.txt");
		File f2 = new File("C:\\Temp\\b\\bbb.txt");
		
		System.out.println("�ѱ��� �Է��ϼ���");
		
		// ���� �Է�
		try {
			OutputStream os1 = new FileOutputStream(f1);
			OutputStream os2 = new FileOutputStream(f2);
			OutputStreamWriter ms = new OutputStreamWriter(os1 , "MS949");
			OutputStreamWriter ut = new OutputStreamWriter(os2 , "UTF-8");
			InputStreamReader is = new InputStreamReader(System.in);
			int data;
			while((data = is.read()) != '\n') {
				ms.write(data);
				ut.write(data);
				
				ms.flush();
				ut.flush();
			}
		}catch(Exception e) {}
		
		
		// �ֿܼ� ��� 
		
		// MS949
		try (Reader reader = new FileReader(f1);){
			
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) {}
		
		System.out.println("============================");
		
		// UTF-8
		try(InputStream is = new FileInputStream(f2);
			InputStreamReader isr = new InputStreamReader(is , "UTF-8");){
			
			int data;
			while((data= isr.read()) != -1) {
				System.out.print((char)data);
			}
			
		} catch (Exception e) {}
		
		
		
		
		
		
		
		
		
		
		

	}

}
