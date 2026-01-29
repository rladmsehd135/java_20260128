package day2;

import java.util.Scanner;

public class Java11_조건문 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요:");
		int input = s.nextInt();
		int a = 10;
		
		if(input>a) {
			System.out.println("입력한 값이 a보다 큽니다.");
		}
		else if(input==a) {
			System.out.println("입력한 값이 a랑같습니다.");
		}
		else {
			System.out.println("입력한 값이 a보다 작습니다");
		}
		
	}
}
