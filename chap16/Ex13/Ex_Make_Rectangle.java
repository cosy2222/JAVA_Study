package chap16.Ex13;

// �� ���� ��ǥ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ� �ϼ���.

class Point <T,V>{		// ������ ��ǥ�� ��� Ŭ���� 
	T x;	// ������ x��ǥ
	V y;
	
	Point ( T x , V y){		// ������.    setter��� �����ڸ� ���ؼ� ���� �Ҵ�
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
		// �ڵ��ۼ�
		
		double x1 = (double)p1.getX();
		double x2 =	(double)p2.getX(); 
		double y1 = (double)p1.getY();
		double y2 = (double)p2.getY();
		
		double width = x2 - x1;
		double height = y2 - y1;
		
		return  width * height;		// ���� * ����
	}
}

public class Ex_Make_Rectangle {

	public static void main(String[] args) {
		
		Point <Double , Double> p1 = new Point(1.0 , 2.0);
		Point <Double , Double> p2 = new Point(10.0 , 50.0);
		
		double rect = GenericMethod.<Double,Double>makeRectangle(p1, p2);
		System.out.println("������ ���̴� : " + rect + " �Դϴ�");

	}

}
