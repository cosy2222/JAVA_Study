package chap19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		
		// 1. ���� ���� 
		File rwfile = new File("src\\chap19\\Ex08\\Bufferedfile.txt");
		
		
		// 2. FileWriter�� �̿��� ���� ���� (MS949 ���)
		
		try(Writer writer = new FileWriter(rwfile);
			BufferedWriter bw = new BufferedWriter(writer);  ){
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("�ݰ����ϴ�" , 2, 3);
			bw.flush();
			
		}catch(Exception e) {}
		
		
		// 3. FileReader�� �̿��� ���Ͼ��� (MS949 ���)
		
		try(Reader reader = new FileReader(rwfile);
			BufferedReader br = new BufferedReader(reader);	 ){
			
			//BufferedReader �� �߰��� �׼ҵ� : String.readLine() , �Ѷ��ξ� �д´�    ������ �� = null
			// int read : �ѹ���Ʈ�� �д´� , �����ǳ� = -1
			
			String data ;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
		}catch(Exception e) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
