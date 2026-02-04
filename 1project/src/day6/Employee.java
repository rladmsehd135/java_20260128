package day6;

public class Employee extends Person {
	String empNo;
	
	public Employee(String name,int age,String addr,String empNO) {
		super(name,age,addr);
		this.empNo = empNO;
	}
	public Employee(String name,int age,String addr,String gender,String empNO) {
		super(name,age,addr,gender);
		this.empNo = empNO;
	}
}
