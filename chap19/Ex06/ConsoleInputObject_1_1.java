package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
	System.in : console���� ��ǲ�� �޴� ��ü  , InputStream
	System.out : console�� ����� �ϴ� ��ü , outputStream
*/
public class ConsoleInputObject_1_1 {

	public static void main(String[] args) throws IOException {
		
		// 1. console ���� ��ǲ �ޱ����� ��ü ����
		InputStream is1 = System.in;    // is1�� �ֿܼ��� ��ǲ �޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ��� >>>");
		
		int data;
		
		while((data = is1.read()) != '\n') {
			System.out.print( (char)data );
		}
		
		System.out.println(data);			// 13  <==  \r
		System.out.println(is1.read());		// 10  <==  \n
		
		
		

	}

}
