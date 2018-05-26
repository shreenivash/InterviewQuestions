package src;


public class PrintTriangle {

	public static void main(String[] args) {
		
		int n=10;
		printTriangle(n);
		
	}
	
	public static void printTriangle(int n) {
		int k = 2*n - 2;//   // number of spaces  
		for (int i=0; i<n; i++) { 
        for (int j=0; j<k; j++) { 
        	System.out.print(" ");{
        		k=k-1;
        		for (int j1=0; j<=i; j++ ) {
        			System.out.print("*");
        				}
        		System.out.println();
        	}
        }
	}

	}
}

