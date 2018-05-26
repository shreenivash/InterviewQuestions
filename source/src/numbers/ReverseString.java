package src.numbers;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String reverse="";
		System.out.println("Enter the first string that needs to be reversed");
		String str1=sc.nextLine();
		for(int i=str1.length()-1;i>=0;i--) {
			reverse=reverse+str1.charAt(i);
		}
		
		System.out.println("Reverse of string " + str1+ " " + reverse);
		
	
	}
}
