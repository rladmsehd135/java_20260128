package day3;

public class Java1_복습 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a / b);
		double c =3 ;
		System.out.println(a / c);
		
		System.out.println((double)a / b);
		
		String name = "홍길동";
		int age = 30;
		System.out.println(name + "의 나이는" + age);
		
		int num = 10;
		num += 3;
		System.out.println(num);
		
		int x = 10;
		int y = x++;
		int z = --x;
		
		System.out.println(x > y);
		
		System.out.println(x == z);
		System.out.println(x != z);
		
		System.out.println(x>5 && y > 8);
		System.out.println(x > 16 || y >8);
		
	}

}
