package day2;



public class Java20_중첩반복문 {
	public static void main(String[] args) {
		//구구단
		int num = 0;
		for(int i=1; i<=9; i++) {
			System.out.println("===="+i+"단=====");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
		
		
	}//main

}//class
