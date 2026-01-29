package day2;

import java.util.Scanner;

public class Jave13_조건문퀴즈 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int number = s.nextInt();
		
		if(number > 100 || number < 1){
			System.out.println("1부터 100사이의 값을 입력해주세요");
		}
		else if(number%2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}

		
		
		
		
	}

}
