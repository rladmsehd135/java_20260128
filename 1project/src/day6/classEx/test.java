package day6.classEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		1. 아래 조건에 맞게 변수 선언 및 초기화 하고 변수를 이용하여 결과를 출력하시오.
//		- 변수명 : name 	 , 값 : 홍길동
//		- 변수명 : age  	 , 값 : 30
//		- 변수명 : height , 값 : 170.9
//	출력 결과 : 홍길동의 나이는 30, 키는 170.9 입니다.
		String name = "홍길동";
		int age = 30;
		double height = 170.9;
		System.out.println(name + "의 나이는"+age+", 키는 "+170.9+" 입니다.");
		
//
//	2. 스캐너를 통해 숫자를 입력받은 후 
//	홀수일 경우 "홀수", 짝수일 경우 "짝수"를 출력하시오.
//	단, 0이하의 숫자나 11이상의 숫자일 경우 "계산할 수 없습니다." 를 출력하시오.
		Scanner s = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요:");
//		int input = s.nextInt();
//		if(input > 0 && input < 12) {
//			if(input%2==0) {
//				System.out.println("짝수");
//			}
//			else {
//				System.out.println("홀수");
//			}
//			
//		}
//		else {
//			System.out.println("계산할수 없습니다");
//		}
	
		
//
//	3. 스캐너를 통해 숫자를 하나 입력받고, 해당 숫자의 구구단을 역순으로 출력하시오.
//	(ex, 2입력시 2*9=18, 2*8=16, 2*7=14 ... 2*1=2 출력)
		System.out.print("숫자를 입력해주세요:");
//		int input = s.nextInt();
//		for(int i=9; i>0; i--) {
//			System.out.println(input + " * " + i + " = " + (input*i));
//		}

//	4. 구구단을 출력하시오. 
//	단, 5단과 8단은 제외하고 출력
//		for(int i = 1; i<=9; i++) {
//			if(i!=5 && i !=8) {
//				System.out.println("============"+i+" 단=========");
//				for(int j =1; j<=9; j++) {
//					System.out.println(i + " * " + j + " = " + (i*j));
//				}
//				
//			}
//			else {
//				continue;
//			}
//		}
//
//	[배열 공통 문제]
//	배열 : {3, 7, 10, 6, 15, 2}
//	5. 위 배열을 선언하고 배열 내에 있는 모든 숫자들의 합과 평균을 출력하시오.
//		int arr[] = {3, 7, 10, 6, 15, 2};
//		int sum =0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println((double)sum/arr.length);
//	6. 위 배열을 선언하고 배열 내에서 짝수 중 가장 큰 값의 위치를 출력하시오.
//		int arr[] = {3, 7, 10, 6, 15, 2};
//		int evenIndex =0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]%2==0) {
//				if(arr[evenIndex] < arr[i]) {
//					evenIndex = i;
//				}
//				
//			}
//		}
//		System.out.println(evenIndex);
		
		
//	7. 5개의 공간을 가지는 배열을 선언하고,
//	Random 클래스를 이용해 구한 랜덤한 숫자 1~30 사이의 숫자 5개를 배열에 넣으시오.
//	단, 홀수만 넣을 것.
		int arr[] = new int[5];
		Random ran = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(30)+1;
			if(arr[i]%2==0) {
				i--;
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
		
//
//	8. 아래 이미지를 참고하여 같은 결과가 나오도록 하시오.
//	 * 기본 절차 설명
//	  - 최초에는 메뉴 선택 텍스트 출력
//	  - 1을 입력할 경우 문제 풀이로 이동. 랜덤 구구단 문제 출제
//	  - 문제를 맞추거나 틀림에 따라 상황에 맞는 텍스트 출력
//	  - 정답에 0을 입력할 경우 메뉴 선택으로 이동
//	  - 2를 누를경우 그동안 풀이 했던 문제의 정답 및 오답 개수 출력 후 메뉴 선택으로 이동
//	  - 1~3외의 값을 입력할 경우 '1~3중 선택해 주세요' 텍스트 출력 후 메뉴 선택으로 이동
//	  - 3을 누르면 '종료되었습니다' 출력 후 종료
	}
	
}
