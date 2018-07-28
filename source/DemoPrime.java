/* Java Program Example - Check Prime or Not */

public class DemoPrime {
	public static void main(String args[]) {
		int[] array = { 303, 37, 229 , 353};
		for (int i = 0; i < array.length; i++) {
			boolean firstCheck = false;
			int numberToCheck = array[i];
			int numLength = String.valueOf(numberToCheck).length();
			firstCheck = DemoPrime.isPrime(numberToCheck);

			// Again we need to check if same number is again prime
            int number = numberToCheck;
			int originalNumber, quotient = 0;
			boolean secondCheck = false;
			if (firstCheck) {
				
				originalNumber = number;

				while (numLength > 1) {
					quotient = originalNumber / 10;
					secondCheck = DemoPrime.isPrime(quotient);
					if (secondCheck) {
						if (String.valueOf(quotient).length() == 1) {
							System.out.println("Yes");
							break;
						} else if (quotient != 0) {
							quotient = quotient / 10;
							numLength--;
							continue;
						}

					} else {
						System.out.println("No");
						break;
					}

				}

			} else {
				System.out.println("No");
			}
		}

	}

	public static boolean isPrime(int num) {
		int i, count = 0;

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {

			return true;
		} else {
			return false;
		}
	}
}