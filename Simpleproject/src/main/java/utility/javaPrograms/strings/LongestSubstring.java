package utility.javaPrograms.strings;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "automation";
		String str3 = "testing";

		System.out.println("Longest substring without repeating characters in "+str1+": " +lenghtOfSubstring(str1));
		System.out.println("Longest substring without repeating characters in "+str2+": " +lenghtOfSubstring(str2));
		System.out.println("Longest substring without repeating characters in "+str3+": " +lenghtOfSubstring(str3));
	}

	static int lenghtOfSubstring(String str) {
		HashSet<Character> set = new HashSet<>();
		int maxLength = 0;
		int start = 0;
		int end=0;

		for(end=0;end<str.length();end++) { 
			while(set.contains(str.charAt(end))) {
				set.remove(str.charAt(start));
				start++;
			}
			set.add(str.charAt(end));
			maxLength = Math.max(maxLength, end-start+1);
		}
		System.out.println("substring: "+str.substring(start, end));
		return maxLength;
	}
}
