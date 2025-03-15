package utility.javaPrograms.strings;

import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String ");
		String str1 = sc.nextLine();
		System.out.println("Enter second String ");
		String str2 = sc.nextLine();
		sc.close();
		System.out.println("Given strings are Anagrams: "+areAnagrams(str1, str2));
	}

	static boolean areAnagrams(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()) {
			return false;
		}
		int charCount[] = new int[256];
		for(int i=0; i<str1.length();i++) {
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}
		for(int count : charCount) {
			if(count!=0)
				return false;
		}
		return true;
	}
}
