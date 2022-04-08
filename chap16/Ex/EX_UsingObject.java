package chap16.Ex;

// Object�� ����ؼ� 4���� ��ü�� �����ϰ� ��� �غ��� 

class Student{
	String name;
	String id;
	int pass ; 
	
	Student(String a , String b , int c){
		name = a;
		id = b;
		pass = c;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", id :"  + id + ", ��й�ȣ :" + pass;
	}
}

class Profeser{
	String name;
	int year ; 
	String email;
	
	Profeser(String a , int b , String c){
		name = a;
		year = b;
		email = c;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + year + ", ���� : " + email;
	}
}

class Tiger{
	String name;
	String run;
	
	Tiger(String a , String b){
		name = a;
		run = b;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " " + run;
	}
}

class Banana{
	String name;
	String color;
	int price;
	
	Banana(String a , String b , int c){
		name = a;
		color = b;
		price = c;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + ", �� :" + color + ", ���� : " + price ;
	}
}


class Good {
	private Object obj = new Object();

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}


// Generic
class Goods<T>{
	private T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}


public class EX_UsingObject {

	public static void main(String[] args) {
		
		// ��ü ����
		Good o1 = new Good();
		Good o2 = new Good();
		Good o3 = new Good();
		Good o4 = new Good();
		
		// setter�� �� �Է�
		o1.setObj(new Student("������" , "1234" , 5678));
		o2.setObj(new Profeser("�μ���" , 40 , "aaa@aaa.com"));
		o3.setObj(new Tiger("ȣ����" , "�޸���"));
		o4.setObj(new Banana("�ٳ���" , "���" , 1000));
		
		// ���
		System.out.println(o1.getObj());
		System.out.println(o2.getObj());
		System.out.println(o3.getObj());
		System.out.println(o4.getObj());
		
		
		System.out.println("=========<Generic ���>===========");
		
		// Generic ���
		Goods<Student> g1 = new Goods();
		Goods<Profeser> g2 = new Goods();
		Goods<Tiger> g3 = new Goods();
		Goods<Banana> g4 = new Goods();
		
		g1.setT(new Student("������" , "aaa" , 1234));
		g2.setT(new Profeser("�μ���" , 40 , "aaa@aaa.com"));
		g3.setT(new Tiger("ȣ����" , "�޸���"));
		g4.setT(new Banana("�ٳ���" , "���" , 1000));
		
		System.out.println(g1.getT());
		System.out.println(g2.getT());
		System.out.println(g3.getT());
		System.out.println(g4.getT());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
