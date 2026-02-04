package day6;



public class Java4_업캐스팅 {
	static void fruitBoxing(Friut f) {
		if(f instanceof Apple) {
			System.out.println("토마토 서비스로 드립니다");
			
		}
		System.out.println(f.name + "를 포장한다!");
	}
//	static void appleBoxing(Apple a) {
//		System.out.println(a.name + "사과를 포장한다");
//	}
//	static void BananaBoxing(Banana b) {
//		System.out.println(b.name + "사과를 포장한다");
//	}
//	static void OrangeBoxing(Orange o) {
//		System.out.println(o.name + "사과를 포장한다");
//	}
	public static void main(String[] args) {
		//부모클래스 -> Fruit
		//자식클래스 -> Apple,Orange, Banana
		Apple apple = new Apple("청주사과", 1000);
		
		Banana banana = new Banana("맛있는 바나나", 500);
		Orange orange = new Orange("그냥오렌지",2000);
		fruitBoxing(apple);
		fruitBoxing(banana);
		fruitBoxing(orange);
		
		
	}
	
}
