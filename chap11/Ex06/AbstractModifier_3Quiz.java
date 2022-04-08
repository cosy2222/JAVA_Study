package chap11.Ex06;

abstract class Animal{
	String name ;
	int age ;
	
	abstract void cry();
	abstract void run();
	
	public String toString() {
		return "이름 : " + name + " 나이 : " + age;
	}
}

class Cat extends Animal{
	
	Cat(String a , int b){
		name = a;
		age = b;
	}

	@Override
	void cry() {
		System.out.println("야옹");
	}

	@Override
	void run() {
		System.out.println("뛰어다닌다");
	}

}

class Tiger extends Animal{
	
	Tiger(String a , int b){
		name = a;
		age = b;
	}

	@Override
	void cry() {
		System.out.println("어흥");
	}

	@Override
	void run() {
		System.out.println("빠르게 뛰어다닌다");
	}
}

class Eagle extends Animal{
	
	Eagle(String a , int b){
		name = a;
		age = b;
	}

	@Override
	void cry() {
		System.out.println("모르겠다");
	}

	@Override
	void run() {
		System.out.println("날아다닌다");
	}
	
	
}



public class AbstractModifier_3Quiz {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이" , 10);
		Animal a2 = new Tiger("호랑이" , 5);
		Animal a3 = new Eagle("독수리" , 15);
		
		
		//1. Animal 배열 객체에 저장
		Animal [] arr = { a1 , a2 , a3 };
		
		
		//2. for문을 사용해서 객체를 출력시 이름과 나이 ,  .cry() ,  .run()  출력
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(arr[i]);
			arr[i].cry();
			arr[i].run();
			System.out.println("==========================");
		}
		
		
		//3. 향상된 for문으로 출력
		
		for(Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("=========================");
		}
		
		

	}

}
