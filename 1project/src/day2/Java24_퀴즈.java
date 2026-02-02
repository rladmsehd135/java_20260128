package day2;

import java.util.Scanner;

public class Java24_퀴즈 {
	public static void main(String[] args) {
		// 1.사용자가 입력한 숫자의 구구단을 출력하시오
		// 2~9사이의 값이 아니면 다시 입력하도록 하시오
		Scanner s = new Scanner(System.in);

		for(;;) {
			
			System.out.print("숫자를 입력해주세요:");
			int num = s.nextInt();
			if(num<=9 && num>=2) {
				System.out.println("======" + num + "단 =======");
				for(int i=num;i<=9;i++) {
					for(int j=1; j<=9;j++) {
						System.out.println(num + "*" +j + "=" + (num*j));
						
						
					}//for num
					break;
					
				}//for j
				break;
				
				
			}//if
			else {
				
				System.out.println("2~9숫자를 입력해주세요!");
				
			}
			
			
			
		}

	}// main
}// class
