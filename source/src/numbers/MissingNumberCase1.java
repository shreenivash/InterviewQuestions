package src.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberCase1 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array");
//		int array = sc.nextInt();
		int [] array= {1,2,3,4,6};
		int missingNumber=getMissingNumber(array,6);
		int size=array.length;
		System.out.println(missingNumber);
		System.out.printf("Missing number in array %s is %d %n",Arrays.toString(array),missingNumber);
		

}

	private static int getMissingNumber(int[] array, int i) {
		int missingNumber = 0;
		int totalCountAvailable=0;
		totalCountAvailable= i*(i+1)/2;
		System.out.println(totalCountAvailable);
		int expectedCount=0;
		
		for(int j:array) {
			expectedCount=j+expectedCount;
				
		}
		missingNumber= totalCountAvailable-expectedCount;
		
		return missingNumber;
	}
}
