package arrays;

public class PrintReverseArray {
	
	public static void main(String[] args) {
		
		Integer [] intarray= {1,5,8,16};
		
		reverseArray(intarray);
		}
	
	private static void reverseArray(Integer[] intarray) {
		
		for(int i=intarray.length;i>=0;i--) {
			System.out.println(intarray[i]);
		}
		
	}

}
