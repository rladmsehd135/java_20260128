package day3;

import java.util.Random;
import java.util.Scanner;

public class Java7_랜덤구구단 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(9) + 1;
			
			System.out.println("[" + i + "번 문제]");
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt();

			if (x * y == answer) {
				
				System.out.println("정답");
				count++;

			} else  {
				System.out.println("오답");
			}
			

		}
		System.out.println("총맞춘 문제 "+ count);
	}// main

}// class
