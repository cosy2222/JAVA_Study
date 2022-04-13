package chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// �߰������ �����ϴ� ��Ʈ�� : ��ݽ�Ʈ���� �����ؾ� �Ѵ�

// BufferedInputStream : InputStream �� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ�� , �ܵ����� ����� �� ���� , ��ݽ�Ʈ���� �߰����
//BufferedOutputStream : OutputStream �� ���͸� �����ؼ� ���� ������ ���� ������ �� ��Ʈ�� , �ܵ����� ����� �� ���� , ��ݽ�Ʈ���� �߰����

public class BufferedInput_BufferedOutputStream {

	public static void main(String[] args) {

		// �������� ���� , Buffered�� ������� �ʰ� ó���ϴ� ��� , Bufferd�� ����ϴ°�� �ӵ�����
		
		File f = new File ("src\\chap19\\Ex07\\mycat_origin.jpg");   // ���� ����
		File cf1 = new File ("src\\chap19\\Ex07\\mycat_copy1.jpg");   // Buffered�� ������� �ʰ� ó���ϴ� ���
		File cf2 = new File ("src\\chap19\\Ex07\\mycat_copy2.jpg");   // Buffered�� ����� ��� 
		
		
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
