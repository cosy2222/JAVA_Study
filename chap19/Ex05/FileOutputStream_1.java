package chap19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// InputStream : �߻�Ŭ����   <== FileInputStream �߻�Ŭ������ ������ Ŭ����		�о�Ë�
// OutputStream : �߻�ũ����  <== FileOutputSteam �߻�Ŭ������ ������ Ŭ���� 		����

// FileInputStream : byte() ���� ������ �б�.
// FileOutputStream : byte() ���� ������ ���� 

// windows �ܼ� , �޸��� enter�� ������ : \r\n
// MAC  : \n


public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
		
		//  1.  �Է� ���� ���� (������������)
		File outFile = new File("src/chap19/Ex05/FileOutput1.txt");
		
		// 2.  byte����
		OutputStream os1 = new FileOutputStream(outFile) ;
			// FileOutputStream�� �������� �ʴ� ������ ������ ����� ������
			// FileOutputStream ��ο� ������ �����ؾߵ� , ���ܹ߻�
		
		os1.write('J');				// wirte : IOException
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');	//13	<==��������
		os1.write('\n');	//10  ����
		
			// �߿� : write() �޼ҵ�� ����(RAM)�� ����  , ���۰� ������ ���Ͽ� ����
			// 		 flush() : ���ۿ� ����� ������ ���Ͽ� ������ ���� �ҋ� ���
		
		os1.flush();  // ���۰� ������ �ʴ��� ������ ���Ͽ� ���⸦ �Ѵ� <== ��������  wirte()�� ����ϸ� flush()�� ����ϱ⸦ ����
		os1.close();  // close() ȣ��� flush()���� �۵���
		
		
		// 3.  n-byte ���� ���� (byte[]�� offset���� length���� byte ������ ���� )
		OutputStream os2 = new FileOutputStream(outFile ) ;		// false :�����    true : �̾��	
								// FileOutputStream (File o , boolean)	// boolean �����ϸ� �⺻������ false
		byte [] arr1 = "Hello!".getBytes();
		
		os2.write(arr1);
		os2.write('\n'); 	//  \r�� ���� ���� ,  \n�� �־ windows���� enteró�� ����
		
		os2.flush();
		os2.close();
		
		
		// 4. n-byte ���� ���� ( byte[] �� offset���� length���� byte������ ����)
		OutputStream os3 = new FileOutputStream(outFile , true) ;	//�̾��
		byte [] arr2 = "better the last smile than the first laugther".getBytes();
		os3.write(arr2 , 7 , 8);
		
		os3.flush();
		os3.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
