package day3;

import java.util.Scanner;

public class Java2_복습 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;) {
			System.out.print("숫자를 입력해주세요:");
			int input = s.nextInt();
			
			if(input%2==0) {
				System.out.println("짝수");		
			}//if
			else {
				System.out.println("홀수");
			}//else
			
		}
		
		
		
		
		
		
		
	}//main
}//class
