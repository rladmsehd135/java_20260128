package day4.classEX;

public class Calculator {
	double pi = 3.141592;

	Calculator() {
		System.out.println("계산기 생성!");
	}

	void intro() {
		System.err.println("아주아주좋은 계산기 입니다!");
	}

	int abs(int x) {
		System.out.println("절대값을 되돌려 드립니다!");
		return x < 0 ? -x : x;
	}

	int sum(int a, int b) {
		System.out.println("두정수를 더해드립니다!");
		return a + b;
	}
	int sum(int a, int b, int c) {
		return a+b+c;
	}
	double sum(double a, double b) {
		return a+b;
	}
	

}
