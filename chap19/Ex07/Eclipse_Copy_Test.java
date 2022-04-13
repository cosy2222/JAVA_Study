package chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		
		File f = new File ("C:\\temp\\eclipse_origin.exe");   // ���� ����
		File cf1 = new File ("C:\\temp\\eclipse_copy1.exe");   // Buffered�� ������� �ʰ� ó���ϴ� ���
		File cf2 = new File ("C:\\temp\\eclipse_copy2.exe");   // Buffered�� ����� ��� 
		
		
		// ���� ������ �ϱ����� ���� ����
		
		long start , end , time1, time2;     // time1 : Buffered X    time2: Buffered O
		
		
		// 1. Buffered �� ��������ʰ� ó���ϴ� ��� 
		start = System.nanoTime();     //���۽ð�
		
		try (
				InputStream is = new FileInputStream(f);
				OutputStream os = new FileOutputStream(cf1)	  // Auto close()
				){
			// ������ ���� �ڵ� ����
			int data;
			while((data=is.read()) != -1) {
				os.write(data);
			}
			
			
		} catch (IOException e) {}
		
		end = System.nanoTime();
		
		time1 = end - start;
		System.out.println("with out BufferedxxxStream : " + time1);	//���� �̻��
		
		
		//2. Buffered�� ����ϸ鼭 ó���ϴ� ��� ( BufferedInputStream , BufferedOutputStream)
		
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(cf2);		
			BufferedOutputStream bos = new BufferedOutputStream(os);
				) {
			// ������ �ڵ� ���� 
			int data;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		
		time2 = end - start;
		System.out.println("with BufferedxxxStream : " + time2);	// ���� ���
		
		
		//   time1 : ���� �̻��   ,   time2 : ���� ���
		System.out.println(time1/time2);

	}

}
