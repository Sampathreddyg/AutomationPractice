package utility.javaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();

		if(isPalindrome(number)) {
			System.out.println("The given number " +number+ " is a Palindrome");
		}else {
			System.out.println("The given number " +number+ " is Not a Palindrome");
		}
		sc.close();
	}

	public static boolean isPalindrome(int num) {
		int original = num;
		int reverse = 0;
		while(num>0) {
			int digit = num%10;
			reverse = reverse*10+digit;
			num/=10;
		}
		return original == reverse;
	}
}
