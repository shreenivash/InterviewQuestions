package arrays;

public class LargestNumber {
public static void main(String[] args) {
	
	double[] myList= {1,5,5.5,7,8,9,6.7};
	printValueInArray(myList);
	sumAllValuesInArray(myList);
	findMaxValue(myList);
}

private static void printValueInArray(double[] myList) {
	
	for(int i=0;i<myList.length;i++) {
		System.out.println(myList[i]);
	}
}

private static void sumAllValuesInArray(double[] myList) {
	double sum=0;
	for(int i=0;i<myList.length;i++) {
		sum+=myList[i];
	}
	System.out.println("The sum of array is "+ sum);
	
}

private static void findMaxValue(double[] myList) {
	double maxValue=0;
	for(double value:myList) {
		if (value>maxValue) {
			maxValue=value;
		}
		
	}
	System.out.println("The max value in array is "+ maxValue);
	
}

}
