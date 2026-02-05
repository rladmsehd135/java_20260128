package day7;

public class Person {
	private String name;
	private int age;
	private String number;
	
	Person(String name, int age){
		this(name,age,"");
		//this.name = name;
//		this.age = age;
	}
	Person(String name, int age,String number){
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "의 나이는" + this.age + "살 입니다";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
