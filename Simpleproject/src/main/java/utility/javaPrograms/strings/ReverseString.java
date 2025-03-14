package utility.javaPrograms.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String input = sc.nextLine();
		
		char ch;
		String nstr = "";
		
		for(int i = 0; i<input.length();i++) {
			ch = input.charAt(i);
			nstr = ch+nstr;
		}
		System.out.println("String after Reverse: "+nstr);
		sc.close();
	}

}
