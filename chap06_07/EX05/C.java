package chap06_07.EX05;

public class C {     //�ٸ� ��Ű������ import ��
	
	// �ʵ忡 �ο� �Ǵ� ���� ������
	private String company = "�����ڵ���";   
	String model ;
	protected String color ;
	public int maxSpeed ;
	


	public  void setModel(String a) {
		model = a;
	}


	public void setcolor(String a) {
		color = a;
	}



	public void print() {
		System.out.println("company : " + company );
		System.out.println("model : " + model );
		System.out.println("color : " + color );
		System.out.println("maxSpeed : " + maxSpeed );
	}
	
	

}
