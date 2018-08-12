package String;

public class SpecialCharacters {

	public static void main(String[] args) {
      
		String input1 = "This - word ! has \\ /allot # of % spe-cial % characters";
		input1 = input1.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println("First Occurence "+input1);
		 
		// remove all the special characters a part of alpha numeric characters and space
		String input2 = "This - word ! has \\ /allot # of % sp-ecial % characters";
		input2 = input2.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("Second Occurence "+input2);
		 
		// remove all the special characters a part of alpha numeric characters, space and hyphen.
		// Note down the blank space and hyphen just before the ]
		String input3 = "This - word ! has \\ /allot # of % special % characters";
		input3 = input3.replaceAll("[^a-zA-Z0-9 -]", "");
		System.out.println(input3);
  	}

}



// [^a-zA-Z0-9 ]