package day4.classEX;

public class CalcMain {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.intro();
		int abs = calc.abs(-10);
		System.out.println(abs);
		
		double sum = calc.sum(10.5, 42);
		System.out.println(sum);
	}

}
