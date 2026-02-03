package day5.classEX;

public class Student {
	//변수(필드) + 메소드 
	String name;
	int age;
	private String stuNO;
	int money; //개인의돈
	static int money_708 = 200000; //708호 회비
	
	Student(String name,int age,String stuNo){
		this.name = name;
		this.age = age;
		this.stuNO = stuNo;
	}
	
	void  study() {
		System.out.println(this.name + "가(이) 공부를 한다.");
	}
	void study(String subject) {
		System.out.println(subject + "를 공부한다");
	}
	String getStuNo() {
		return this.stuNO;
	}
	
}
