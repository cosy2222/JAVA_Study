package chap19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

// PrintStream : Filter Stream ( �߰������ �����ϴ� Stream ) , ��� ��Ʈ���� �ʿ� 
	// �پ��� ������� ��¿� Ưȭ�� ��Ʈ���̴�.  flush()�� ȣ������ �ʾƵ� �ڵ����� flush()
	// println() , print() , printf()
	// ���� ��� ,  �ܼ� ��� , ....

public class PrintStreamExample {

	public static void main(String[] args) {
		
		// ���� ��ü ����
		File f1 = new File("src\\chap19\\Ex07\\printStream1.txt");
		File f2 = new File("src\\chap19\\Ex07\\printStream2.txt");
		
		//2. printStream (FileOutputStream(File))
		
		try(OutputStream os1 = new FileOutputStream(f1);
			PrintStream ps = new PrintStream(os1);) {	// Filter��Ʈ��(�߰������ ����) ,  ��ݽ�Ʈ���� �ʿ�
			
			ps.println(5.8);	// double ���
			ps.print(3 + "�ȳ�" + 12345 + "\n");
			ps.printf("%d �� ȣ��Ǿ����ϴ�", 7);     // %d  : int���� ȣ�� 
			ps.printf("%s %f" , "�ȳ�" , 5.8);	  // %s : String   , %f : double
			
			//ps.flush()   <== �ڵ�ȣ��
		} catch (IOException e) {}
		
		// 3. printStream(File)
		
		try (PrintStream ps = new PrintStream(f2);){
			
			ps.println(5.8);	// double ���
			ps.print(3 + "�ȳ�" + 12345 + "\n");
			ps.printf("%d �� ȣ��Ǿ����ϴ�", 7);     // %d  : int���� ȣ�� 
			ps.printf("%s %f" , "�ȳ�" , 5.8);	  // %s : String   , %f : double
			
		} catch (FileNotFoundException e) {}
		
		// 4. �ֿܼ� ��� 1
		try(OutputStream os2 = System.out;
			PrintStream ps = new PrintStream(os2);){
			
			ps.println(5.8);	// double ���
			ps.print(3 + "�ȳ�" + 12345 + "\n");
			ps.printf("%d �� ȣ��Ǿ����ϴ�", 7);     // %d  : int���� ȣ�� 
			ps.printf("%s %f" , "�ȳ�" , 5.8);	  // %s : String   , %f : double
			
		}catch(Exception e) {}
		
		System.out.println("=========================");
		
		// 5. �ֿܼ� ��� 2
		try( PrintStream ps = System.out;){
			
			ps.println(5.8);	// double ���
			ps.print(3 + "�ȳ�" + 12345 + "\n");
			ps.printf("%d �� ȣ��Ǿ����ϴ�", 7);     // %d  : int���� ȣ�� 
			ps.printf("%s %f" , "�ȳ�" , 5.8);	  // %s : String   , %f : double
			
		}catch(Exception e) {}
		
		
		

	}

}
