package day8;

public class Java1_업케스팅 {
	
//	static void test1(ColorPoint p) {
//		System.out.println(cp.getX() * cp.getX());
//	}
//	static void test1(Point3D p3) {
//		System.out.println(p3.getX() * p3.getX());
//	}
//	static void test1(PositivePoint pp) {
//		System.out.println(pp.getX() * pp.getX());
//	}
	static void test1(Point p) {
		if(p instanceof Point3D) {
			System.out.println("point3D로 만든 객체");
		}
		System.out.println(p.getX() * p.getX());
	}
	
	
	public static void main(String[] args) {
		Point point = new Point(1,2);
//		ColorPoint colorPoint = new ColorPoint();
		Point3D point3D = new Point3D(1,2,3);
		PositivePoint positivePoint = new PositivePoint(5,10);
		
//		test1(colorPoint);
		test1(point3D);
	}
}
