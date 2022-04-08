package chap16.Ex;

// Object를 사용해서 4개의 객체를 저장하고 출력 해보기 

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
		return "이름 : " + name + ", id :"  + id + ", 비밀번호 :" + pass;
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
		return "이름 : " + name + ", 나이 : " + year + ", 메일 : " + email;
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
		return "이름 : " + name + " " + run;
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
		return "이름 : " + name + ", 색 :" + color + ", 가격 : " + price ;
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
		
		// 객체 생성
		Good o1 = new Good();
		Good o2 = new Good();
		Good o3 = new Good();
		Good o4 = new Good();
		
		// setter로 값 입력
		o1.setObj(new Student("강성민" , "1234" , 5678));
		o2.setObj(new Profeser("민성강" , 40 , "aaa@aaa.com"));
		o3.setObj(new Tiger("호랑이" , "달린다"));
		o4.setObj(new Banana("바나나" , "노랑" , 1000));
		
		// 출력
		System.out.println(o1.getObj());
		System.out.println(o2.getObj());
		System.out.println(o3.getObj());
		System.out.println(o4.getObj());
		
		
		System.out.println("=========<Generic 사용>===========");
		
		// Generic 사용
		Goods<Student> g1 = new Goods();
		Goods<Profeser> g2 = new Goods();
		Goods<Tiger> g3 = new Goods();
		Goods<Banana> g4 = new Goods();
		
		g1.setT(new Student("강성민" , "aaa" , 1234));
		g2.setT(new Profeser("민성강" , 40 , "aaa@aaa.com"));
		g3.setT(new Tiger("호랑이" , "달린다"));
		g4.setT(new Banana("바나나" , "노랑" , 1000));
		
		System.out.println(g1.getT());
		System.out.println(g2.getT());
		System.out.println(g3.getT());
		System.out.println(g4.getT());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
