package day5;

public class Java10_상속 {
	public static void main(String[] args) {
		
		Student hong = new Student("홍길동", 30, "123");
		hong.eat("치킨");
		hong.study();
		hong.setAddr("울산");
		System.out.println(hong.getAddr());
	}
}
