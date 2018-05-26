package src;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.println("Please enter the number");
		int input =  scan.nextInt();
		int inputBreak = (input + 1)/2;
		int i, j, n;
//		for (i = 0; i <=9; i++) {
//			for (j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (i = 10; i >= 0; i--) {
//			for (j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(i=0;i<inputBreak;++i) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		for(i=inputBreak-2;i>=0;--i) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		} 

	}

}

/*
 * i=0 , j=0 * i=1 , j=0,j=1 **
 * 
 *
 */