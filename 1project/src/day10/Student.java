package day10;

import java.util.Scanner;

public class Student {
	static Scanner s = new Scanner(System.in);
	private String stuNO;
	private String name;
	private int age;

	private int java;
	private int oracle;
	private int html;

	public Student(String stuNo, String name, int age) {
		this.stuNO = stuNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String info = "(stuNo=" + this.stuNO + " , name=" + this.name + ", age=" + this.age + ", java=" + this.java
				+ ",oracle=" + this.oracle + ",html=" + this.html + ")";
		return info;
	}

	public String getStuNO() {
		return stuNO;
	}

	public void setStuNO(String stuNO) {
		this.stuNO = stuNO;
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

	public int getJava() {
		return java;
	}

	public void setJava(int java) {

		if (java < 0 || java > 100) {
			System.out.println("시험 점수 범위는 0~100입니다");
			return;
		}
		this.java = java;
	}

	public void setJava() {
		while (true) {
			System.out.println("자바 : ");
			int java = s.nextInt();
			if (java < 0 || java > 100) {
				System.out.println("시험 점수 범위는 0~100입니다");
			} else {
				this.java = java;
				break;
			}
			this.java = java;
		}
	}

	public int getOracle() {

		return oracle;
	}

	public void setOracle(int oracle) {
		if (oracle < 0 || oracle > 100) {
			System.out.println("시험 점수 범위는 0~100입니다");
			return;
		}
		this.oracle = oracle;
	}

	public void setOracle() {
		System.out.println("오라클 : ");
		int oracle = s.nextInt();
		if (oracle < 0 || oracle > 100) {
			System.out.println("시험 점수 범위는 0~100입니다");
		} else {
			this.oracle = oracle;
			return;
		}
		this.oracle = oracle;
	}



	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		if (html < 0 || html > 100) {
			System.out.println("시험 점수 범위는 0~100입니다");
			return;
		}
		this.html = html;
	}

	public void setHtml() {
		System.out.println("html : ");
		int html = s.nextInt();
		if (html < 0 || html > 100) {
			System.out.println("시험 점수 범위는 0~100입니다");
		} else {
			this.html = html;
			return;
		}
		this.html = html;
	}

}


