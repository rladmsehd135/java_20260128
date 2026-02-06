package day8;

import java.util.Random;
import java.util.Scanner;

public class Java98_문제풀이 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
			System.out.println("[1.구구단 풀기 , 2. 종료] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				while(true) {
					System.out.println("[1. 쉬움(2~5), 2. 보통(6~9), 3.어려움(12~19)]");
					menu = s.nextInt();
					if(menu >= 1 && menu <=3) {
						int count = 0;
						for(int i=1; i<=5; i++) {
							int x;
							if(menu ==1) {
								x = ran.nextInt(4)+2;
							}
							else if(menu == 2) {
								x = ran.nextInt(4)+6;
							}
							else {
								x = ran.nextInt(8)+12;
							}
							int y = ran.nextInt(9)+1;
							System.out.println(i + "번" + x + "*" + y + "=");
							int answer = s.nextInt();
							if(answer == x*y) {
								System.out.println("정답");
								count++;
							}
							else {
								System.out.println("땡 정답은" + (x*y) + "입니다");
							}
							
							}
						System.out.println("총 "+count+" 개 맞추셨습니다");
						break;
					}
					
					else {
						System.out.println("1~3중에서 선택");
					}
				}
				
				
			}
			else if(menu == 2) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("1~2중 선택");
				
			}
			
		}
	}
}
