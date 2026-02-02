package day3;

import java.util.Random;
import java.util.Scanner;

public class Java8_랜덤구구단 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		// 1. 사용자가 풀이하고 싶은 문제수를 직접 정하도록
		// 2. 문제풀이가 끝난 후 또다시 풀이할지 말지 사용자가 결정하도록
		int count = 0;
		
		
		for (;;) {
			System.out.println("===랜덤 구구단===");
			System.out.print("[ (1)구구단 시작 (2) 종료 ] 입력해주세요:");
			int set = s.nextInt();
			if(set == 1) {
				System.out.print("풀이하고 싶은 문제수를 입력하시오:");
				int num = s.nextInt();
				for (int i = 1; i <= num; i++) {

					int x = ran.nextInt(8) + 2;
					int y = ran.nextInt(9) + 1;

					System.out.println("[" + i + "번 문제]");
					System.out.print(x + " * " + y + " = ");
					int answer = s.nextInt();

					if (x * y == answer) {

						System.out.println("정답");
						count++;

					} else {
						System.out.println("오답");
					}

				}
				System.out.println("총맞춘 문제 " + count);
				
				
			}
			else if(set == 2) {
				System.out.println("종료되었습니다");
				break;
				
			}
			else {
				System.out.println("1과 2중 선택해주세요!!");
			}
			}
			
	}// main

}// class
