package chap06_07.EX03;

class BB {
	String company;
	String model;
	String color;
	double maxSpeed;
	
	BB () {
		
		company = "����";      // �ʵ�(�ν��Ͻ��ʵ�) �� company �� �˷��ִ� this , Heap �޸𸮿� ����
		model = "�ҳ�Ÿ";             // �ν��Ͻ� : ��üȭ�� ������ ��� ������ �ʵ�
		color = "white";       // [�ʵ�� : �ʵ��� �� ] �� Heap ������ ����
		maxSpeed = 100 ;
		
	}
	
	BB (String company , String model , String color, double maxSpeed){
		this.company = company;              // this Ű�� ��ü�� �ʵ��� ������ ���Ѵ�
		this.model = model;                // 3���� ���� ��ΰ� ������ ��� ��ü�� �ʵ��� ������ �˷��ִ� ��Ȱ
		this.color = color;
		this.maxSpeed = maxSpeed ;
	}
	
	void work() {                 // �޼ҵ� (�ν��Ͻ� �޼ҵ� ) : Heap������ �޼ҵ��� �����͸� �����ϰ��ִ�
		System.out.println(company +" "+ model + " " + color + " " + maxSpeed);
	}
		
}




public class Q1 {

	public static void main(String[] args) {
		// �����ڸ� ���ؼ� �⺻���� �Ҵ� �� �޸��� ������ work() �޼ҵ带 ����Ἥ ���.
		
		BB a = new BB();
		a.work();
		
		BB aa = new BB("���" , "k5" , "black" , 100);
		aa.work();
		
		
		
	}

}
