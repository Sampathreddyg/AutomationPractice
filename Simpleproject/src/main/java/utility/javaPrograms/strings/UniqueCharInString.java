package utility.javaPrograms.strings;

import java.util.Scanner;

public class UniqueCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String ");
		String input = sc.nextLine().toLowerCase();
		sc.close();
		System.out.println("Unique characters in given string are: ");
		printUniqueCharacters(input);
	}

	static void printUniqueCharacters(String str) {
		boolean[] unique = new boolean[128];
		for(char ch : str.toCharArray()) {
			if(!unique[ch]) {
				unique[ch] = true;
				System.out.print(ch+ " ");
			}
		}
	}
}
