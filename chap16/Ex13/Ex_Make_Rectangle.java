package chap16.Ex13;

// 두 점의 좌표값을 사용해서 넓이를 구하는 프로그램을 작성 하세요.

class Point <T,V>{		// 한점의 좌표를 담는 클래스 
	T x;	// 한점의 x좌표
	V y;
	
	Point ( T x , V y){		// 생성자.    setter대신 생성자를 통해서 값을 할당
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}

class GenericMethod{
	public static <T,V> double makeRectangle (Point<T,V> p1 , Point<T,V> p2) {
		// 코드작성
		
		double x1 = (double)p1.getX();
		double x2 =	(double)p2.getX(); 
		double y1 = (double)p1.getY();
		double y2 = (double)p2.getY();
		
		double width = x2 - x1;
		double height = y2 - y1;
		
		return  width * height;		// 가로 * 세로
	}
}

public class Ex_Make_Rectangle {

	public static void main(String[] args) {
		
		Point <Double , Double> p1 = new Point(1.0 , 2.0);
		Point <Double , Double> p2 = new Point(10.0 , 50.0);
		
		double rect = GenericMethod.<Double,Double>makeRectangle(p1, p2);
		System.out.println("두점의 넓이는 : " + rect + " 입니다");

	}

}
