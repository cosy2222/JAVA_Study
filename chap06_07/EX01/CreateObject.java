package chap06_07.EX01;

class AA{
	String name;       // �ʵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ����� ����    (Heap ������ ���� ����)
	int age;
	String email;

	AA(){	}   // �⺻ ������, ������ �����ϴ�     �ٸ� �����ڰ� ������ ��� �⺻�����ڸ� ������ ��� ����
	
	
	public String getName() {     //�޼ҵ�   (���)  : �ν��Ͻ�ȭ ���Ѿ� ����� ����
		return name;              // Heap ������ �ּҸ� ����,      Ŭ������������ �޼ҵ念���� ����
								  // return : �޼ҵ带 ȣ���ϴ� ������ ������ ���� �����ִ� 
	}
	public void setName(String name) {         // void : ���ϰ��� ���ٸ�  �˷��ִ� �ĺ���
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}


public class CreateObject{
	
	public static void main(String[] args) {
		
		AA aa = new AA();          // AAŬ����(���赵) �� aa(��ü)�� ����
		// AA : Ŭ���� �̸� ,   aa : ��ü�� (�ν��Ͻ���) , new : Heap ������ �ʵ�� �޼ҵ�
		// AA() : ������ : ��ü�� �ʵ尪�� �ʱ�ȭ , �����ڵ� �ϳ��� �޼ҵ�
						// 1 . ������ �̸��� Ŭ���� �̸��� ���� �޼ҵ�
						// 2 . ����Ÿ���� ����
		       			// 3 . �������� �Ű������� ���� �����ڸ� �⺻ ������
						// 4 . �⺻�����ڴ� ������ �����ϴ�
						// 5 . ��ü�� ���� �ҋ� �ݵ�� �����ڸ� ȣ�� 
	
		
		//��ü�� �޼ҵ� ȣ��
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("====================");
		
		//��ü�� �ʵ� ȣ��
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		System.out.println("====================");
		// =================================================
		
		// �޼ҵ� ȣ��
		
		// setters : ��ü�� �޸𸮿� ���� �Ҵ� �ҋ� 
		aa.setName("������");        // ��ü�� ������ ���� �Ҵ�
		aa.setAge(25);
		aa.setEmail("cosy2222@naver.com");
		
		// getters : ��ü�� �޸��� ���� ������ �Ë�
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("=======================");
		
		AA bb = new AA();
		bb.setName("�μ���");
		bb.setAge(52);
		bb.setEmail("cosy3333@gmail.com");
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("========================");
		
		AA cc = new AA();
		cc.setName("���̸�");
		cc.setAge(12);
		cc.setEmail("myname@naer.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
