package utility.javaPrograms.strings;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String input = sc.nextLine();
		sc.close();
		reverseEachWordOfString(input);
	}
	
	static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");
		String reverseString = "";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String newString = "";
			char ch;
			for(int j=0;j<word.length();j++) {
				ch = word.charAt(j);
				newString = ch + newString;
			}
			reverseString = reverseString + newString + " ";
		}
		System.out.println("String after each word reversed: " +reverseString);
	}

}
