package day2;

public class Jave6_증감연산자 {

	public static void main(String[] args) {
		// 
		int a = 10;
		int b = 5;
		// 증강연산자가 앞에 있으면 증감을 먼저하고 값을 넣는다
		int d = ++b;
		// 증강연산자가 뒤에 있으면 먼저 값을 넣고 증감이 된다.
		int c = a++;
		
		System.out.println(a);
		System.out.println(d);
		
		
		int e = b--;
		System.out.println(e);
		
	}//main

}//class
