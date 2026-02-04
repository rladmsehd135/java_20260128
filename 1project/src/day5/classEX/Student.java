package day5.classEX;

import day5.Human;

public class Student extends Human{
	//변수(필드) + 메소드 
	String name;
	int age;
	public String stuNO;
	int money; //개인의돈
	public String stuNo;
	static int money_708 = 200000; //708호 회비
	
	public Student(String name,int age,String stuNo){
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
	public String getStuNo() {
		return this.stuNO;
	}

	public void setStuNo1(String stuNo) {
		this.stuNo = stuNo;
	}

	public void setStuNo(String stuNo) {
		// TODO Auto-generated method stub
		
	}

	
	 
	
}
