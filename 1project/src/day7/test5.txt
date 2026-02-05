package day7;

public class test5 {
	public static void main(String[] args) {
//		2단부터 9단까지 구구단 출력
//		단, 짝수(2,4,6,8)단만 출력
		for(int i=1; i<=9; i++) {
			if(i%2==0) {
				System.out.println("=========" + i + "단======");
				for(int j=1; j<=9; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		}
		
	}

}
