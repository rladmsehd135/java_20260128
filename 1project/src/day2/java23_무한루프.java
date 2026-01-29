package day2;

import java.util.Scanner;

public class java23_무한루프 {
		public static void main(String[] args) {
// for문 무한루프 ;;사용
			
//			int a = 1;
//			for(;;) {
//				System.out.println(a++);
//				if( a== 20) {
//					break;
//				}
//			}
			Scanner s = new Scanner(System.in);
			
			
			for(;;) {
				System.out.print("숫자를 입력해주세요: ");
				int number = s.nextInt();			
				if(number > 100 || number < 1){
					System.out.println("1부터 100사이의 값을 입력해주세요");
				}
				else if(number%2 == 0) {
					System.out.println("짝수");
					break;
				}
				else {
					System.out.println("홀수");
					break;
				}
				
			}
			
			
		}//main

}//class
