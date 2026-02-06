package day8;

import java.util.Scanner;

public class subString1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("문자를 입력 :");
		String input = s.next();
		
		
		for(int i=0; i<input.length(); i++) {
			input = input.substring(1)+ input.substring(0, 1);
			System.out.println(input);
			
			
			
			
		}
		
	}
}
