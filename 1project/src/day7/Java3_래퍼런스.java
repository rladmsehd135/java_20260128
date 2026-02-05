package day7;

import java.util.Arrays;

public class Java3_래퍼런스 {
	static void varMethod(int x) {
		x  += 10000;
	}
	static void refMethod(Person p) {
		p.setNumber("1234-4567");
		
	}
	
	public static void main(String[] args) {
		int a =10;
		varMethod(a);
		System.out.println(a);
		
		int b = 30;
		int c = b;
		b = 10000;
		System.out.println(c);
		
		int arr1[] = {1,2,3,4,5};
		int arr2[]=arr1;
		arr1[0] = 10000;
		System.out.println(arr2[0]);
		
		Person p = new Person("홍길동",30);
		refMethod(p);
		System.out.println(p.getNumber());
		
		int arr[] = {3,4,2,5,1};
		System.out.println(Arrays.toString(arr));
	}
}
