package day2;

import java.util.Scanner;

public class Jave12_조건문 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요:");
		int input = s.nextInt();
		
		if(input >= 90) {
			System.out.println("A학점");
		}
		else if(input >= 80) {
			System.out.println("B학점");
		}
		else if(input >= 70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
		
		

	}

}
