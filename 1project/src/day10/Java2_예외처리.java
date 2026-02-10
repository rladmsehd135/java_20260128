package day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java2_예외처리 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = 10;
		
		try {
			System.out.println("나누는 수를 입력 : " );
			int divisor = s.nextInt();
			System.out.println(number / divisor);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나누지 마셈");
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("숫자 입력해라");
			System.out.println(e.getMessage());
		}
		
	}

}
