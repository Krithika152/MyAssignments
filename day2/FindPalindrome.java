package week1.day2;

public class FindPalindrome {

	public static void main(String[] args) {
			String s= "madam";
			String rev= "";
			
	 char[] s1 = s.toCharArray();		
	 for (int i = s1.length-1; i>=0; i--) {
		 rev=rev+s1[i];
	 }
		 
		 if(s.equalsIgnoreCase(rev)) {
			 System.out.print("It is palindrome");
			 
		 }
		 else {
			 System.out.print("It is not a palindrome");
		 }
		
	}
}
