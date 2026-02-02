package day3;

import java.util.Scanner;

public class Jave백준여늡 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		for (;;) {
			System.out.print("숫자를 입력해주세요:");
			int num = s.nextInt();
			if (num >= 2 && num <= 9) {
				for (int i = num; i <= 9; i++) {
					System.out.println("===========" + num + "단==========");
					for (int j = 1; j <= 9; j++) {

						System.out.println(num + "*" + j + "=" + (num * j));
					}
					
				}
				break;
			} // if
			else {
				System.out.println("2~9사이 숫자를 입력해주세요");
			}
		}

	}//main
}//class