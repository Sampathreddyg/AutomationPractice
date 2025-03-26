package utility.javaPrograms.strings;

import java.util.Scanner;

public class ChangeCaseInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		sc.close();
		System.out.println("Character to uppercase: "+eachCharToUpper(input));

		System.out.println("only lowercase to uppercase : "+convertLowercaseOnly(input));

		System.out.println("Convert characters viceversa: "+convertCaseViseversa(input));

	}

	public static String eachCharToUpper(String input) {
		char[] charArray = input.toCharArray(); // Convert string to char array      
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLowerCase(charArray[i])) {
				charArray[i] = Character.toUpperCase(charArray[i]); // Modify in place
			}
		}
		return new String(charArray);
	}

	public static StringBuilder convertLowercaseOnly(String input) {
		StringBuilder output = new StringBuilder();
		for(char c : input.toCharArray()) {
			if(Character.isLowerCase(c)) {
				output.append(Character.toUpperCase(c));
			}else {
				output.append(c);
			}
		}
		return output;
	}

	public static StringBuilder convertCaseViseversa(String input) {
		StringBuilder output = new StringBuilder();
		for(char c : input.toCharArray()) {
			if(Character.isLowerCase(c)) {
				output.append(Character.toUpperCase(c));
			}else {
				output.append(Character.toLowerCase(c));
			}
		}
		return output;
	}
}
