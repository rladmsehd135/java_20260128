package day2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day10.Student;

public class Java4_성적관리1 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		//3명의 학생을 list에 추가
		//학번,이름,나이를 입력받아서 Student 객체로 만들고 list에 추가
		try {
			for(int i=0; i<3; i++) {
				System.out.println("학번을 입력하세요 : ");
				String stuNo = s.next();
				System.out.println("이름을 입력하세요 : ");
				String name = s.next();
				System.out.println("나이를 입력하세요 : ");
				int age = s.nextInt();
				
				Student stu = new Student(stuNo, name, age);
				list.add(stu);
			}
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("나이는 숫자만");
			s.next();
		}	
		System.out.println(list);
	}
}
