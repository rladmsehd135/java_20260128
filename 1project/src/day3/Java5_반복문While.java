package day3;

import java.util.Scanner;

public class Java5_반복문While {
	public static void main(String[] args) {
		// while 무한루프
		// 문제 입력되는 숫자를 모두 더하시오
		// 단 -1을 입력하면 더한 값을 출력하고 종료하시오
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int a = 1;
		while (true) {
			System.out.print(a+"번째숫자 입력 :");
			int num = s.nextInt();
			
			if(num != -1) {
				sum += num;
			}
			else {
				
				break;
			}
			a++;

		}
		System.out.println("모든숫자의합" + sum);
	}//main
}//class