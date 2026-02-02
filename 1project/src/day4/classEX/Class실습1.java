package day4.classEX;

public class Class실습1 {
	public static void main(String[] args) {
		
		//hong 객체
		Human hong = new Human();
		hong.age = 10;
		hong.isMarried = true;
		hong.name = "홍길동";
		System.out.println(hong.name + hong.age);		
		hong.eat();
		String txt = hong.intro();
		System.out.println(txt);
		//kim 객체
		Human kim = new Human();
		kim.name = "김밥";
		kim.eat();
		kim.age = 30;
		String txt2 = kim.intro();
		System.out.println(txt2);
	}
}
