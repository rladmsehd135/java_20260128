package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Java8_복습 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		//숫자를 입력받아서 6개 저장
		//숫자의 범위는 1~30 사이. 그외 값 입력시 다시 입력하도록
		Scanner s = new Scanner(System.in);
		for(int i=0; i<6; i++) {
			
				System.out.println((i+1) + "번째 숫자를 입력: ");
				int num = s.nextInt();
				if(num<1 || num >30) {
					System.out.println("1~30다시입력해주세요");
					i--;
					continue;
				}
				else {
					list.add(num);
					
				}
				
			
		}
		System.out.println(list);
		ArrayList<Integer> oddList = new ArrayList<>();
		for(int i=0; i<6; i++) {
			if(list.get(i)%2==1) {
				oddList.add(list.get(i));
			}
		}
		System.out.println(oddList);
	}
}
