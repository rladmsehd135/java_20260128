package day5;

public class Student extends Human{
	String StuNO;
	
	Student(String name, int age, String stuNO){
		this.name=name;
		this.age=age;
		this.StuNO=stuNO;
		
	}
	
	void study() {
		System.out.println(this.name + "가 공부를 합니다.");
	}
}
