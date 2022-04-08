package Ex;

public class Ex_11_01 {

	public static void main(String[] args) {
		
		// String 에 값을 할당 할떄 생성자를 통해서 할당.  // 별도의 메모리 공간을 가진다.
		String aa = new String("안녕");
		String bb = new String("안녕");
		System.out.println(aa);
		System.out.println(bb);
		
		//  기본 자료형일떄 : ==  값을비교
		//  참조 자료형일떄 : ==  참조하는 주소의 번지를 비교 
		//  참조 자료형일떄 값을 비교 : aa.equals(bb)     <== 참조변수 aa 값과 str2에 들어가 있는 값을 비교 
		
		
		if ( aa == bb) {              // 메모리의 주소 값을 비교 ( aa, bb는 다른 메모리 주소를 갖는다 )
			System.out.println(true);
		}
		else {
			System.out.println(false);          // 주소값이 달라서 false
		}
		System.out.println("======================");
		
		if(aa.equals(bb)) {                // 메모리의 값을 비교
			System.out.println(true);      // 값이 똑같아서 true
		}
		else {
			System.out.println(false);
		}
		System.out.println("=========================");
		System.out.println("=========================");

		// String 에 값을 리터럴 값을 바로 할당.   // 메모리 공간을 공유 한다.
		String a = "안녕";
		String b = "안녕";
		
		if( a == b) {                        // 참조 자료형에서 "==" 는 : 메모리의 주소를 비교 
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
