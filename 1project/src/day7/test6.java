package day7;

import java.util.Arrays;
import java.util.Scanner;

public class test6 {
	//크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
	//단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것 
		//=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= new int [5];
		for(int i =0; i<arr.length; i++) {		
			System.out.print("숫자를 입력해주세요 :");
			int num = s.nextInt();
			if(num>0) {
				arr[i] = num;
			}
			else {
				i--;
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
