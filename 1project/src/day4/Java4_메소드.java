package day4;

public class Java4_메소드 {
	
	static void method1() {
		//리턴이 없는 메소드.(메소드는 단순히 호출하고 끝나는 형태)
		System.out.println("첫번째 메소드 호출!!");
		
		
	}
	static int method2() {
		//리턴이 있는 메소드.(결과를 되돌려주는 형태)
		return 100;
		
	}
	static int sum(int a,int b) {
		
		return a+b;
	}
	static double sum(double a,double b) {
		
		return a+b;
	}
	
	
	public static void main(String[] args) {
	
		
		method1(); //method1호풀
		int value = method2(); //100을 되돌려 받는다
		System.out.println(value);
		
		double result = sum(3.4, 5.4); //괄호안에 있는 2개숫자를 더해서 리턴 받고 싶다!
		System.out.println(result);
		
		
	}

}
