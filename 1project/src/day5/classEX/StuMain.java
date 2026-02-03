package day5.classEX;

public class StuMain {
	public static void main(String[] args) {
		
		Student hong = new Student("홍길동", 30, "1234");
//		hong.study();
//		hong.study("자바");
		hong.money = 100000;
		hong.money = hong.money - 30000;
		hong.money_708 = hong.money_708 - 50000;
		System.out.println(hong.money_708);
		
		
		Student kim = new Student("김청수", 20, "142234");
//		String stuNo = kim.getStuNo();
//		System.out.println(stuNo);
		kim.money = 50000;
		System.out.println(kim.money_708);
	}
}
