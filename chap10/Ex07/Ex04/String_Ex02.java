package chap10.Ex07.Ex04;

class Aa{
	String name;
	Aa(String name){
		this.name = name;
	}
}

class Bb{
	String name;
	Bb(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {   // ��Ű����.Ŭ������@�ؽ��ڵ� ==> name �ʵ��� ���� ����
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb)obj).name ) {
			return true;
		}
		else {
			return false;
		}
	}
}



public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String("�ȳ�");
		String s2 = "�ȳ�";
		
		System.out.println(s1);    // StringŬ������ toString()�� ������ �Ǿ��ִ�.
		System.out.println(s1.equals(s2));   // String Ŭ������ equals()�� ������ �Ǿ��ִ�
		
		Aa a = new Aa("�ȳ�");
		Aa a1 = new Aa("�ȳ�");
		System.out.println(a);
		System.out.println(a.equals(a1));    // �ּҸ� ���ϱ� ������ false
		System.out.println("=========================");
		
		Bb bb1 = new Bb("�ȳ�");
		Bb bb2 = new Bb("�ȳ�");
		System.out.println(bb1);
		System.out.println(bb1.equals(bb2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
