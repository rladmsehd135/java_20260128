package day4.classEX;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class class실습2 {

	public static void main(String[] args) {
		
		Human hong = new Human("홍길동", 30, 170.5 ,true);
		System.out.println(hong.name);
		String intro = hong.intro();
		System.out.println(intro);
//		hong.eat();
		Human kim = new Human("홍길동", 24 , 190.5 ,true);
		String outro = kim.outro();
		System.out.println(outro);
		
		
	}
}
