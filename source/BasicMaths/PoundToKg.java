package BasicMaths;

import java.util.Scanner;

public class PoundToKg {
	    public static void main(String[] args){
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the no of pounds you want to get converted");
	        double pounds = sc.nextDouble();
	        double kilograms= .45*pounds;
	        System.out.println(pounds+"pounds is "+ kilograms+"kilograms");
	    }

	}

