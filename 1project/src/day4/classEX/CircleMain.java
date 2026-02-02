package day4.classEX;

public class CircleMain {
	public static void main(String[] args) {
		
		Circle pizza = new Circle();
		
		pizza.name = "피자";
		pizza.radius = 10;
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle();
		donut.name = "도넛";
		donut.radius = 2;
		System.out.println(donut.getArea());
		
	}
}
