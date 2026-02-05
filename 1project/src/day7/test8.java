package day7;

import java.util.Random;
import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
//		기본조건
//		 - 메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력
//		 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력 시 안내 문구 후 다시 입력
//		 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력
//		 - 문제는 5문제 고정. 5문제 모두 푼 후 맞춘 개수 출력
//		 - 메인 메뉴에서 2번 선택 시 종료
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		int count = 0;
		for (;;) {
			System.out.print("1.구구단 풀기, 2.종료");
			int num = s.nextInt();
			if (num == 1) {
				System.out.print("1.쉬움(2~5단), 2.보통(6~9단), 3. 어려움(12~19단)");
				int set = s.nextInt();
				if (set == 1) {
					for (int i = 2; i <=6; i++) {
						int x = ran.nextInt(4)+2;
						int y = ran.nextInt(9)+1;
						System.out.print(x + " * " + y + " = ");

						int answer = s.nextInt();
						if (x * y == answer) {
							System.out.println("정답");
							count++;
						} else {
							System.out.println("오답! " + "정답은 " + (x * y) + " 입니다.");
						}
					}
					System.out.println("총" + count + " 개 정답!");
				}
				else if(set == 2) {
					for (int i = 2; i <=6; i++) {
						int x = ran.nextInt(4)+6;
						int y = ran.nextInt(9)+1;
						System.out.print(x + " * " + y + " = ");

						int answer = s.nextInt();
						if (x * y == answer) {
							System.out.println("정답");
							count++;
						} else {
							System.out.println("오답! " + "정답은 " + (x * y) + " 입니다.");
						}
					}
					System.out.println("총" + count + " 개 정답!");
				}
				else if(set == 3 ) {
					for (int i = 2; i <=6; i++) {
						int x = ran.nextInt(7)+13;
						int y = ran.nextInt(9)+1;
						System.out.print(x + " * " + y + " = ");

						int answer = s.nextInt();
						if (x * y == answer) {
							System.out.println("정답");
							count++;
						} else {
							System.out.println("오답! " + "정답은 " + (x * y) + " 입니다.");
						}
						
					}
					System.out.println("===총" + count + " 개 정답!===");
					
				}
				else {
					
					System.out.println("===1~3사이를 입력해주세요===");
					
					
				}
				
			}
			
			else if(num == 2) {
				
				System.out.println("===종료되었습니다===");
				break;
			}
			else {
				System.out.println("**1~2중에서 골라주세요**");
			}
			
			}
		
			
		}
}
