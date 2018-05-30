package String;

public class ReverseString {

	public static void main(String[] args) {
		String s="Enter your name";
		
		String reverseString= reverseMe(s);
		System.out.println(reverseString);
		
		String reverseString1= reverseMe1(s);
		System.out.println(reverseString1);
		
	}

	
	static String reverseMe(String s) {
		   StringBuilder sb = new StringBuilder();
		   for(int i = s.length() - 1; i >= 0; --i)
		     sb.append(s.charAt(i));
		   return sb.toString();
		 }
	
	static String reverseMe1(String s) {
		   if(s.length() == 0)
		     return "";
		   return s.charAt(s.length() - 1) + reverseMe1(s.substring(0,s.length()-1));
		 }
}
