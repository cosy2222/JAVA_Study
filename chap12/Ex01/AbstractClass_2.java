package chap12.Ex01;


//2. 추상클래스를 객체화 해서 출력하는 방법 2   : 자식 클래스 생성없이 익명 객체를 활용하는 방법
// 일회용 , 이벤트 처리
// 장점 : 자식 클래스 생성을 하지 않는다 , 임시적으로 사용할 경우 유용
// 단점 : 여려개의 객체를 생성해야 할 경우 코드가 길어짐 

abstract class Aaa{
	abstract void abc();
}



public class AbstractClass_2 {

	public static void main(String[] args) {
		
		Aaa a = new Aaa() {   // 익명 객체를 활용한 추상메소드를 자식클래스 생성없이 구현 
			void abc() {
				System.out.println("방법 2");
			}
		};
		
		a.abc();

	}

}
