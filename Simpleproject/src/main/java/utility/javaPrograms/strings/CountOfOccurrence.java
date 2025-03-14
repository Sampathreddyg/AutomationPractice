package utility.javaPrograms.strings;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfOccurrence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String ");
		String input = sc.nextLine();
		sc.close();
		characterCount(input);
		wordCount(input);
	}

	static void characterCount(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		for(char c : inputString.toCharArray()) {
			if(c!=' ') {
				charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
			}
		}
		System.out.println("Character count " +charCountMap);
	}

	static void wordCount(String inputString) {
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		for(String word : inputString.split(" ")) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+1);
		}
		System.out.println("Word count " +wordCountMap);
	}
}
