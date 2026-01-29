package day2;

import java.util.Scanner;

public class Java16_중첩if {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("100이상의 숫자를 적어주세요:");
		int num = s.nextInt();
		
		if(num>=100) {
			if(num%2 == 0) {
				
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
			}
			
			
		}
		else {
			System.out.println("100이상의 숫자를 적어주세요");
		}

	}

}
