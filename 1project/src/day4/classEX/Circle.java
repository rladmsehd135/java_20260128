package day4.classEX;

public class Circle {
	int radius;
	String name;
	
	Circle(){}
	Circle(String name, int radius){
		this.name = name;
		this.radius = radius;
	}
	
	//생성자는 생략 가능
	double getArea() {
		return 3.14 * radius * radius;
	}
}
