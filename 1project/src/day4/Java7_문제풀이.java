package day4;

import java.util.Scanner;

public class Java7_문제풀이 {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력 : ");
//		int sum = s.nextInt();
//		for (int i = 1; i <= sum; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int arr[] = {3,5,2,4,1};
		for(int i = 0; i<=arr.length;i++) {
			for(int j=1; j<arr[i]; j++) {
				System.out.print("*");
		}
			System.out.println();
		}
		
	}//main
}//class
