package chap14.Ex05;

// ���� ������ ��ü���� AutoClose�� ����غ��� 
	// try ( ��ü�������� ) {} catch {} : �ڵ����� close() ��  // try(with resource) 
	// 1.Autocloseable �������̽��� close()�� �������̵� �ؾߵ� 

	// Java.lang.AutoCloseable : java.lang <=== import���� ������� �ʾƵ� �ȴ�.
	// Java.lang.Object

	// ���ܸ� ó���ϴ¹�� 
	//  1. try catch �� ����ؼ� ����ó��      : �ڽ��� ���� ���ܸ� ó�� �ϰڴ�
	//  2. throws �� ���ؼ� ���ܸ� ó�� 		 : ���ܸ� �ڽ��� ó������ �ʰ� ȣ���ϴ°����� ���ܸ� ó�� �ϵ��� �̷��
			// ���� ���� .   �޼ҵ� ���� ����
		   // throw   : ���ܸ� ������ �߻���Ű��.


class A implements AutoCloseable{
	String resource ;		// resource = null 
	A ( String resource){	// �������� �Ű�������  String ���� �޾Ƽ� �޸𸮷� �ε�
		this.resource = resource;
	}
	@Override
	public void close() throws Exception {	// close() �� �ڵ����� ȣ��ȴ�.
		System.out.println(resource);
		
		if (resource != null) {
			resource = null;
			System.out.println("resource�� �����Ǿ����ϴ�");
			System.out.println(resource);
		}
	}
}



public class TryWithResource_2 {

	public static void main(String[] args) {
		
		// 1. �ڵ� ���ҽ� ���� ��� 
		try( A a1 = new A ("Ư�� ����");){
			
		}catch(Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}		// finally ����� a1.close() �� ȣ������ �ʴ��� �ڵ����� close() ȣ�� 
		
		System.out.println("=========================");
		
		//2. ���� ���ҽ� ���� ���
		A a2 = null;
		
		try {
			a2 = new A("������ �ʱⰪ �Ҵ�");
		}catch(Exception a){
			
		}finally {
			if (a2.resource != null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
