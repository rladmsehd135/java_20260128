package day7;

import java.util.Random;
import java.util.Scanner;

public class Java_312421412421 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		// 1. 사용자가 풀이하고 싶은 문제수를 직접 정하도록
		// 2. 문제풀이가 끝난 후 또다시 풀이할지 말지 사용자가 결정하도록
		int count = 0;
		for(;;) {
			System.out.print("풀이하고 싶은 문제수를 적어주세요");
			int num = s.nextInt();
			for(int i=1; i<=num; i++) {
				int x = ran.nextInt(8) + 2;
				int y = ran.nextInt(9) + 1;
				System.out.println("[" + i + "번 문제]");
				System.out.print(x + " * " + y + " = ");
				int answer = s.nextInt();
				if(x * y == answer) {
					System.out.println("정답");
					count++;
				}
				else {
					System.out.println("오답! " + "정답은 " + (x*y) +" 입니다.");
				}
				
			}
			System.out.println("총 "+ num +" 문제 중 "+ count + " 개 정답!");
			System.out.print("계속 하시려면 아무키를 입력해주세요. 종료는 0을 입력해주세요");
			int end = s.nextInt();
			if(end == 0) {
				break;
			}
		}

		
		}

	}


