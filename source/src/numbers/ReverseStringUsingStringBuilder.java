package src.numbers;

import java.util.Scanner;
// Reverse string using StringBuilder
public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str1= sc.nextLine();
		StringBuilder input1=new StringBuilder();
		input1.append(str1);
		input1=input1.reverse();
		System.out.println("Reverse String is "+ input1);
		
	}

}
