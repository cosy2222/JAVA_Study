package chap10.Ex07.Ex04;

class A{
	String a ;
	
	A(String a){
		this.a = a;
	}
	
	@Override
	public String toString() {
		return this.a;
	}
}

public class String_Ex {

	public static void main(String[] args) {
		
		String s0 = new String("�ȳ�");
		
		String s1 = "�ȳ�";     // String �� ��������
		
		System.out.println(s0);  // String�� ��ü�� ��� �ҋ� toString()�� ������ �Ǿ��ִ�.
		System.out.println(s1);
		
		A a = new A("�ȳ�");
		System.out.println(a);

	}

}
