package BasicMaths;

import java.util.Scanner;

public class TempratureConversions {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Which temprature conversion you want");
		System.out.println("Enter Fahrenheit");
		double fh= sc.nextDouble();
		double celcius;
		celcius= (fh-32)*(5.0/9);
		System.out.println(celcius);
		

	}

}
