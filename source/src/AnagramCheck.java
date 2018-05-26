package src;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string of anagram");
		String str1= sc.nextLine();
		System.out.println("Enter second string of anagram");
		String str2= sc.nextLine();
//		String str1="java";
//		String str2="avaj";
		System.out.println(anagramcheck(str1,str2));
		

	}

	private static boolean anagramcheck(String str1, String str2) {
		char[] charstring1=str1.toCharArray();
		StringBuilder sb= new StringBuilder(str2);
		for (char c : charstring1) {
			int index = sb.indexOf(String.valueOf(c));
			if(index!=-1) {
				sb.deleteCharAt(index);
			}else {
				return false;
			}
				
		}
		return sb.length()==0;
	}
}
