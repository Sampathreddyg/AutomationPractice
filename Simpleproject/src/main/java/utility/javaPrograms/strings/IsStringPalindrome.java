package utility.javaPrograms.strings;

import java.util.Scanner;

public class IsStringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String ");
		String input = sc.nextLine().toLowerCase();
		sc.close();
		System.out.println("Given string "+input+" is Palindrome: "+isStringPalindrome(input));
	}

	static boolean isStringPalindrome(String inputString) {
		
		int start = 0, end = inputString.length()-1;
		
		while(start<end) {
			if(inputString.charAt(start)!=inputString.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
