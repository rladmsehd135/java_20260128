package day3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Java4_반복문while {
	public static void main(String[] args) {
		//while(조건) , 선언은 밖, 증감은 안
		int i=1;
		while(i<=9) {
			System.out.println("========"+i+"단==========");	
			int j=1;
			while(j<=9) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
				
			}
			i++;
		}
	}
	

}
