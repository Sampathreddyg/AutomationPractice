package utility.javaPrograms.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String input = sc.nextLine();
		sc.close();
		duplicateCharCount(input);
	}

	static void duplicateCharCount(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] chArr = inputString.toCharArray();
		for(char c : chArr) {
			if(c!=' ') { // ignoring spaces
				charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
			}
		}
		System.out.println("Duplicate Characters in: "+inputString);
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " : "+entry.getValue());
			}
		}
	}
}
