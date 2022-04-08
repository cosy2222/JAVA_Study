package chap18.Ex03;

import java.util.Scanner;

//1. 스캐너를 사용해서 double 의 두수를 인풋 받습니다
//2. 방법1 : 람다식을 사용해서 인풋받은 두값을 + , - , * , \  를 구현해서 출력
//	 방법2 : 인터페이스를 구현한 자식객체 사용해서 인풋받은 두값을 + , - , * , \  를 구현해서 출력
//   방법3 : 익명이너클래스를 사용해서 인풋받은 두값을 +,-,*,\  사칙연산을 구현해서 출력



interface Arithmetic{
	void arithmetic(double a , double b);
}


// 자식객체
class A implements Arithmetic{
	@Override
	public void arithmetic(double a, double b) {
		System.out.println("더하기 : " +(a+b));
		System.out.println("뺴기 : " +(a-b));
		System.out.println("곱하기 : " +(a*b));
		if(b == 0) {
			throw new ArithmeticException ("0으로 나눌수 없다");
		}else {
			System.out.println("나누기  : " +(a/b));
		}
	}
}



public class ArithmeticOperation {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("첫번쨰 숫자를 입력해주세요");
		double first = sca.nextDouble();
		System.out.println("두번쨰 숫자를 입력해주세요");
		double second = sca.nextDouble();
		
		// 람다식
		System.out.println("=========람다식==========");
		Arithmetic a1 = (a,b) ->  System.out.println("더하기 : " +(a+b));
		Arithmetic a2 = (a,b) ->  System.out.println("뺴기 : " +(a-b));
		Arithmetic a3 = (a,b) ->  System.out.println("곱하기 : " +(a*b));
		Arithmetic a4 = (a,b) ->  {
			if(b == 0) {
				throw new ArithmeticException ("0으로 나눌수 없다");
			}else {
				System.out.println("나누기  : " +(a/b));
			}
		};
		
		a1.arithmetic(first, second);
		a2.arithmetic(first, second);
		a3.arithmetic(first, second);
		a4.arithmetic(first, second);
	
		// 자식객체 사용
		System.out.println("=========자식객체 구현 ===========");
		Arithmetic aa = new A();
		aa.arithmetic(first, second);
		
		// 익명이너클래스
		System.out.println("=======익명 이너클래스===========");
		Arithmetic aaa = new Arithmetic() {
			@Override
			public void arithmetic(double a, double b) {
				System.out.println("더하기 : " +(a+b));
				System.out.println("뺴기 : " +(a-b));
				System.out.println("곱하기 : " +(a*b));
				if(b == 0) {
					throw new ArithmeticException ("0으로 나눌수 없다");
				}else {
					System.out.println("나누기  : " +(a/b));
				}
			}
		};
		aaa.arithmetic(first, second);
		
		
		
		
		
		
		
		
		
		

	}

}
