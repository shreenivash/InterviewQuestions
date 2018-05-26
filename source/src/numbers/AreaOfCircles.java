package src.numbers;

import java.util.Scanner;

public class AreaOfCircles {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Radius");
		double radius;
		double area;
		
		radius= sc.nextInt();
		area= radius*radius* Math.PI;
		System.out.println(area);
	//shree
	}
	

}
