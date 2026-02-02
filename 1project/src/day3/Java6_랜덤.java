package day3;

import java.util.Random;
import java.util.Scanner;

public class Java6_랜덤 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		
		int a = ran.nextInt(8)+2;
		int b = ran.nextInt(9)+1;
		
		System.out.print(a + " * " + b + " = " );
		int c = s.nextInt();
		if(c == (a*b)) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
	}
}
