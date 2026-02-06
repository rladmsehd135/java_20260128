package day8;

import java.util.Scanner;

public class Java99_문제풀이 {
	private void main() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i =0; i<arr.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력");
			arr[i] = s.nextInt();
			if(arr[i]<1) {
				System.out.println("1이상 숫자를 입력해주세요");
				i--;
				continue;
			}
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복된 값이 있습니다.");
					i--;
					break;
				}
				
			}
			
			
		}
	}
	
	
	
	
}
