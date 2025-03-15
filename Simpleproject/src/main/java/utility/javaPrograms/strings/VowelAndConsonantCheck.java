package utility.javaPrograms.strings;

import java.util.Scanner;

public class VowelAndConsonantCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String ");
		String input = sc.nextLine().toLowerCase();
		sc.close();
		vowelConsonantCount(input);
	}

	static void vowelConsonantCount(String str) {
		str = str.toLowerCase();
		int vowels = 0, consonants = 0;
		for(char c : str.toCharArray()) {
			if(c>='a' && c<='z') {
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		System.out.println("In given string No of Vowels: "+vowels+ " and No of Consonants: "+consonants);
	}
}
