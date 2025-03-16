package utility.javaPrograms.strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String input = sc.nextLine();
		sc.close();
		firstNonRepeatCharacter(input);
	}

	static void firstNonRepeatCharacter(String str) {
		int [] charCount = new int[256];
		
		for(int i=0; i<str.length();i++) {
			charCount[str.charAt(i)]++;
		}
		for(int i=0; i<str.length();i++) {
			if(charCount[str.charAt(i)]==1) {
			System.out.println("First Non Repeating Character: "+str.charAt(i));
			break;
			}
		}
	}
}
