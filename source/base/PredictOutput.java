package base;

public class PredictOutput {

	public static void main(String[] args) {
		
		System.out.println(func(2));

	}
	
	static int func(int n) {
		if(n==4)
			return n;
		else
			return 2*func(n+1);
	}

}
