package day3;

import java.util.Random;
import java.util.Scanner;

public class Java9_UpAndDwon {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int random =ran.nextInt(100)+1;
		int count = 1;
		while(true) {
			System.out.print(count + "번째 시도 :");
			
			int answer = s.nextInt();
			if(!(1<=answer && answer<=100)) {
				System.out.println("1~100 사이 값을 입력해주세요.");
				
			}
			else if(random > answer) {
				System.out.println("UP!");
				count++;
			}
			else if(random < answer) {
				System.out.println("DOWN!");
				count++;
			}
			else {
				System.out.println("정답입니다!!" + count + "번째 시도만에");
				break;
			}
			
			
		}
		
	}
	
}
