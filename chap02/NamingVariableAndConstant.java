package chap02;

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		//변수명
		boolean aBcD;   //변수명은 첫자는 소문자롤 시작, 단어를 연결한 경우 첫단에는 대문자로
		byte 가나다라;   // 변수명은 한글을 넣을 수 있다. (권장하지 않음)
		short _abcd;    //면수명에 특수문자 _ 사용
		char $ab_cd;    // 변수명에 $, _ 사용할 수 있다
		// char ab cd;     // 공백이나 다른 특수문자는 넣을 수 없다.
		long abcd3;      //변수명에 숫자를 넣을 수 있다. 단 첫번쨰 단어에 숫자가 오면 오류발생
	//	long 3abcd;      첫글자에 숫자오면 오류발생
		double main;  
	//	double class;    // 자바에서 사용하는 예약어들은 변수명으로 사용 할 수 없다
		int ABCD;       // 변수명은 대문자로 사용가능 (권장하지 않음), 상수는 상수명을 전체 대문자로 사용
		
		// 상수 : 값을 변경 할 수 없다.  final 키워드를 사용 한다 , 대문자를 사용.
		final double FI;
		final int MY_DATA;
		final float my_data;   // 권장하지 않음
		
		FI = 3.141957;
		System.out.println(FI);
		
		// FI = 134.4567;   상수에는 값을 재할당 할 수 없다.
		abcd3 = 1234L;    //정수 데이터 타입 long 변수에 값을 할당 할떄 ㅣ,L을 명시해 줘야 한다
		
		System.out.println(abcd3);
		abcd3 = 56789l;   //변수에 값을 재할당
		System.out.println(abcd3);
		
		aBcD = true;       // boolean은 true, false 만 넣을수 있다
		
		가나다라 = 127;       // byte : 1byte ( -128 ~  127 )
		System.out.println(가나다라);
		
		// 가나다라 = 128;
	}

}
