package arrays;

public class MulyidimensionalArrays {
	public static void main(String[] args) {
		
		double[][] myList= {{1,5,5.5,7,8,9,6.7},{1.9,4.5,5.8,7.9,6.8,4.9,7.7},{2.1,3.5,4.5,7,8,9.9,6.9}};
		printValueInArray(myList);
		sumAllValuesInArray(myList);
//		findMaxValue(myList);
	}

	private static void printValueInArray(double[][] myList) {
		
		for(int i=0;i<myList.length;i++) {
			for(int j=0;j<myList[i].length;j++) {
			System.out.println(myList[i][j]+"\n");
		}
		}
	}

	private static void sumAllValuesInArray(double[][] myList) {
		double sum=0;
		for(int i=0;i<myList.length;i++) {
			for(int j=0;j<myList[i].length;j++) {
				sum+=myList[i][j];
		}
		}
		System.out.println("The sum of array is "+ sum);
		
	}

//	private static void findMaxValue(double[][] myList) {
//		double maxValue=0;
//		for(double[] value:myList) {
//			if (value>maxValue) {
//				maxValue=value;
//			}
//			
//		}
//		System.out.println("The max value in array is "+ maxValue);
//		
//	}

	}

