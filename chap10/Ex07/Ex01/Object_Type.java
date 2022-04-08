package chap10.Ex07.Ex01;

class Aa{
	int a = 3;
	int b = 4;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}

class Bb{
	int a = 5;
	int b = 6;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}

class Cc{
	int a = 7;
	int b = 8;
	
	@Override
	public String toString() {
		return "a : " + a + " b : " + b;
	}
}


public class Object_Type {

	public static void main(String[] args) {
		// 자바의 모든 객체는 Object타입으로 형변환 가능
		Object aa = new Aa();
		Object bb = new Bb();
		Object cc = new Cc();
		
		// Object 배열에 객체 저장
		Object [] arr1 = { aa , bb , cc };
		for(int i = 0 ; i < arr1.length ; i ++) {
			System.out.println(arr1[i].toString());  // Object 의 toString을 호출 할 경우 
													 // 오버라이딩 되어있기 떄문에 자식의 toString 메소드 호출
		}
		
		System.out.println("==========================");
		
		for(Object k : arr1) {
			System.out.println(k);       // 객체 자체를 출력할 경우 toString() 이 출력
		}
		
	}

}
