package src.numbers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
//		int rollno=sc.nextInt();
		String str=sc.nextLine();
		String refinedString=removeDuplicate(str);
		System.out.println(refinedString);
		
	}
	
	public static String removeDuplicate(String str) {
		Set<Character> set=new HashSet<>();
		StringBuffer sf =new StringBuffer();
		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		
		
		return sf.toString();
		
	}
}
